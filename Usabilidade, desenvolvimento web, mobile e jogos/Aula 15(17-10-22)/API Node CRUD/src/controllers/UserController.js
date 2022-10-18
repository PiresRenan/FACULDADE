import Utils from '../models/Utils.js'
import User from '../models/User.js'

class UserController {
    async create(req, res) {
        try {
            const { name, email, password } = req.body

            if (!name || !email || !password){
                res.status(400).send({ error: 'Preencha todos os campos.' })
                return
            }

            const exists = await User.findOne({ where: { email } })

            if (exists) {
                res.status(400).send({ error: 'Usuário já cadastrado.' })
                return
            }

            const user = await User.create({ name, email, password: await Utils.createHash(password) })
            user.password = undefined

            res.send(user)
        } catch (error) {
            console.log(error)
        }
    }

    async destroy(req, res) {
        try {
            const { id } = req.params

            if(!id){
                res.status(400).send({ error: 'ID não encontrado.'})
                return
            }

            await User.destroy({ where: { id } })
            res.send('Usuário removido.')
        } catch (error) {
            console.log(error)
        }
    }

    async authenticate(req, res) {
        const { email, password } = req.body

        if (!email || !password) {
            res.status(400).send({ error: 'Preecha todos os campos.' })
            return
        }

        const exists = await User.findOne({ where: { email } })

        if (!exists) {
            res.status(400).send({ error: 'Usuário não encontrado.'})
            return
        }

        if (!await Utils.compareHash(password, exists.password)) {
            res.status(400).send({ error: 'Falha na autenticação'})
            return
        }

        res.send({ message: 'Login efetivado com sucesso.' })
    }
}

export default new UserController

import Product from '../models/Product.js'

class ProductController {
    async create(req, res) {
        try {
            const { name, description, price } = req.body

            if (!name || !description || !price) {
                res.status(400).send({ error: 'Preencha todos os campos.' })
                return
            }

            const product = await Product.create({ name, description, price })
            res.send(product)
        } catch (error) {
            console.log(error)
        }
    }

    async read(req, res) {
        try {
            const products = await Product.findAll()
            res.send(products)
        } catch (error) {
            console.log(error)
        }
    }

    async findById(req, res) {
        try {
            const { id } = req.params
            const product = await Product.findOne({ where: { id } })

            res.send(product)
        } catch (error) {
            console.log(error)
        }
    }

    async update(req, res) {
        try {
            const { id } = req.params
            await Product.update({ ...req.body }, { where: { id } })
            res.send('Produto atualizado.')
        } catch (error) {
            console.log(error)
        }
    }

    async destroy(req, res) {
        try {
            const { id } = req.params
            await Product.destroy({ where: { id } })
            res.send('Produto removido.')
        } catch (error) {
            console.log(error)
        }
    }
}

export default new ProductController
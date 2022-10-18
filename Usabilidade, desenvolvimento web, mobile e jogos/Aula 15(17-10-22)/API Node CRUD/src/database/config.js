import Sequelize from 'sequelize'

const sequelize = new Sequelize({
    host: 'localhost',
    port: 3306,
    username: 'root',
    database: 'node_api',
    password: '13579Rock',
    dialect: 'mysql'
})

sequelize.authenticate()
    .then(() => console.log('Banco de dados conectado.'))
    .catch(() => console.log('Conexão com o banco de dados falhou.'))

export default sequelize
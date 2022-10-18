import express from 'express'
import cors from 'cors'

import './database/config.js'
import routes from './routes.js'

const server = express()

server.use(cors())
server.use(express.json())
server.use(express.urlencoded({ extended: false }))
server.use(routes)

server.listen(3333, () => console.log('Servidor Conectado'))

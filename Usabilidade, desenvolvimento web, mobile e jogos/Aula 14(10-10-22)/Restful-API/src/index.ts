import express from 'express'
import cors from 'cors'

import routes from './routes'

const app = express()
app.use(cors())
app.use(express.json())
app.use(express.urlencoded({ extended: false }))
app.use(routes)

app.listen(3333, () => console.log('Servidor ouvindo a porta: 3333'))

//URL da API: http://localhost:3333/products/
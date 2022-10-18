import { Router } from 'express'

import ProductController from './controllers/ProductController.js'
import UserController from './controllers/UserController.js'

const routes = Router()

// products
routes.post('/products', ProductController.create)
routes.get('/products', ProductController.read)
routes.get('/products/:id', ProductController.findById)
routes.put('/products/:id', ProductController.update)
routes.delete('products/:id', ProductController.destroy)

// User
routes.post('/users', UserController.create)
routes.delete('/users/:id', UserController.destroy)
routes.post('/auth', UserController.authenticate)

export default routes
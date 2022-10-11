import { Router } from 'express'

import ProductsController from './controllers/products-controller'

const routes = Router()

routes.get('/products', ProductsController.find)
routes.get('/products/:id', ProductsController.findById)
routes.post('/products', ProductsController.create)
routes.put('/products/:id', ProductsController.update)
routes.delete('/products/:id', ProductsController.delete)

export default routes
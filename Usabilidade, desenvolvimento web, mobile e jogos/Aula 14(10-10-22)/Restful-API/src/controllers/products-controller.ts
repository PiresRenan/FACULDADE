import { Request, Response } from 'express'

import products from '../data/products'

class ProductsController {
    find(req: Request, res: Response): void {
        res.json(products)
    }

    findById(req: Request, res: Response): void {
        const id = +req.params.id

        const product = products.find(p => p.id === id)

        if (!product) {
            res.status(404).json({ erro: 'Produto não encontrado' })
            return
        }

        res.json(product)
    }

    create(req: Request, res: Response): void {
        const { name, price } = req.body
        const id = products.length + 1

        products.push({ id, name, price })

        res.status(201).send('Produto adicionado')
    }

    update(req: Request, res: Response): void {
        const id = +req.params.id
        const { name, price } = req.body

        const product = products.find(p => p.id === id)

        if (!product) {
            res.status(404).json({ erro: 'Produto não encontrado' })
            return
        }

        products[id - 1] = { id, name, price }

        res.send('Produto atualizado')
    }

    delete(req: Request, res: Response): void {
        const id = +req.params.id

        const { name, price } = req.body

        const product = products.find(p => p.id === id)

        if (!product) {
            res.status(404).json({ erro: 'Produto não encontrado' })
            return
        }

        products.splice(id - 1, 1)
        products.forEach(p => p.id = products.indexOf(p) + 1)

        res.send('Produto removido')
    }
}

export default new ProductsController
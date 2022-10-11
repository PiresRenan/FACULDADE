interface IProduct {
    id?: number
    name: string
    price: number
}

const products: IProduct[] = [
    { id: 1, name: 'Nintendo Switch', price: 2159 },
    { id: 2, name: 'Playstation 4', price: 2000 },
    { id: 3, name: 'XBox One', price: 1800 },
    { id: 4, name: 'Nintendo 3DS', price: 1500 },
]

export default products
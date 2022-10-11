import { Component } from '@angular/core';

interface IProduct {
  id? : number
  name : string
  price : number
}

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public url = 'http://localhost:3333/products'
  public products: IProduct[] = []
  public id : number
  public name : string
  public price : number

  constructor() {
    this.buscar()
  }

  async buscar(): Promise<void> {
    const resposta = await fetch(this.url)
    this.products = await resposta.json()
  }

  async buscarPorId(id: number): Promise<void> {
    const resposta = await fetch(`${this.url}/${id}`);
    const product: IProduct = await resposta.json();

    this.name = product.name;
    this.price = product.price;
  }

  async salvar(): Promise<void> {
    const novo = {
      name: this.name,
      price: this.price
    }
    console.log(Object.keys(novo))
    const body = Object.keys(novo)
    .map(k => `${encodeURIComponent(k)}=${encodeURIComponent(novo[k])}`)
    .join(`&`)

    await fetch(this.url, { method:'POST', body: new URLSearchParams(body) })
    this.buscar()
  }

  async atualizar(id: number): Promise<void> {
    const produtoAtualizado = {
      name: this.name,
      price: this.price
    }
    console.log(Object.keys(produtoAtualizado))
    const body = Object.keys(produtoAtualizado)
    .map(k => `${encodeURIComponent(k)}=${encodeURIComponent(produtoAtualizado[k])}`)
    .join(`&`)

    await fetch(this.url, { method:'PUT', body: new URLSearchParams(body) })
    this.buscar()
  }
  
  async remover(id: number): Promise<void> {
    await fetch(`${this.url}/${id}`, {method: 'DELETE'})
    this.buscar()
  }

}

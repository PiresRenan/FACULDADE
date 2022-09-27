import { Injectable } from '@angular/core';

import IPessoa from './interfaces/ipessoa';

@Injectable({
  providedIn: 'root'
})
export class DadosService {

  public pessoas: IPessoa[] = [
    {id: 1, nome: 'Renan PIres', telefone: '(11)9 93597029', detalhes: 'trabalho'}
  ]
  constructor() { }

  buscarDados(): IPessoa[]{
    return this.pessoas
  }
}

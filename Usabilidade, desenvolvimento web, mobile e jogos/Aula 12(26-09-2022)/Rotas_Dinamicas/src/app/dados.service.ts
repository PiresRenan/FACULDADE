import { Injectable } from '@angular/core';

import IPessoa from './interfaces/ipessoa';

@Injectable({
  providedIn: 'root'
})
export class DadosService {

  public pessoas: IPessoa[] = [
    {id: 1, nome: 'Renan Pires', telefone: '(11)9 93597029', detalhes: 'trabalho'},
    {id: 2, nome: 'Amanda Trujillo', telefone: '(11)9 95000000', detalhes: 'casa'}
  ]
  constructor() { }

  buscarDados(): IPessoa[]{
    return this.pessoas
  }
}

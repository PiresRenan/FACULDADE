import { Component, OnInit } from '@angular/core';

import IPessoa from '../interfaces/ipessoa';
import { DadosService } from '../dados.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-detalhes',
  templateUrl: './detalhes.page.html',
  styleUrls: ['./detalhes.page.scss'],
})
export class DetalhesPage implements OnInit {

  public rota: ActivatedRoute;
  public id: number;
  public dados: IPessoa[];
  public pessoa: IPessoa;
  private servico: DadosService;

  //conexao atraves de injecao de dependecia
  constructor(route: ActivatedRoute, dadosServico: DadosService) { 
    this.rota = route
    this.servico = dadosServico;
    this.dados = this.dados.buscarDados();
  }

  ngOnInit() {
    //recuperacao do id
    this.id = Number(this.rota.snapshot.paramMap.get('id'))

    this.pessoa = this.dados.find(p=> p.id === this.id)
  }

}

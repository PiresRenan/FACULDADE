import { Component } from '@angular/core';
import IPessoa from '../interfaces/ipessoa';
import { DadosService } from '../dados.service';
import { ModalController } from '@ionic/angular';
import { FormularioComponent } from '../formulario/formulario.component';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})

export class HomePage {

  public dados: IPessoa[];
  private servico: DadosService;
  public modalController: ModalController;

  constructor(dadosServico: DadosService, controller: ModalController) {
    this.servico = dadosServico;
    this.dados = this.servico.buscarDados();
  }

  async exibirModal(): Promise < void > {
    const modal = await this.modalController.create({
      component: FormularioComponent
    })
    modal.present();
  }

}

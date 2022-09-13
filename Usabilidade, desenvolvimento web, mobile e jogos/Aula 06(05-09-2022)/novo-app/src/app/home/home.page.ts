/*Importação do decorator que será utilizado para criar componentes.
Este decorator faz parte do núcleo do Angular.*/
import { Component } from '@angular/core';

interface IPessoa {
  nome: string;
  sobrenome: string;
}


//Decorator do Angular responsável por criar componentes.
@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})

//Criação da classe que serve de base para o nosso componente "Home".
export class HomePage {

  //Propriedade utilizado no primeiro exemplo de interpolação.
  public texto = 'Boa noite pessoal, segue então nosso ex. de interpolação!'

    //Propriedade que implementa a interface "IPessoa". O conteúdo é exibido na "Toolbar".
    public pessoa: IPessoa = {
      nome: 'Yuri',
      sobrenome: 'Yowtuber'
    };
  
    public cor = 'green'

    public currentValue = ''

    public switch = true;

    public valorNumerico = 0;

    aumentar(): void {
      if (this.valorNumerico < 10) this.valorNumerico++;
    }
    diminuir(): void {
      if (this.valorNumerico > 0) this.valorNumerico--;
    }
    resetar(): void {
      this.valorNumerico = 0;
    }
}

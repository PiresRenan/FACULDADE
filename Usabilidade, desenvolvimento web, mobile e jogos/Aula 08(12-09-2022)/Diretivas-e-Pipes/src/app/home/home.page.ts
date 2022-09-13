/* eslint-disable @typescript-eslint/naming-convention */
/* eslint-disable max-len */
import { Component } from '@angular/core';
import { CheckboxControlValueAccessor } from '@angular/forms';

// 2- Interface criada para modelar o array "produtose seus elementos".
interface IProduto {
  nome: string;
  preco: number;
}

// 3.a- interface criada para modelar o objeto "entrega".
interface IEntrega {
  status: Status;
}
// 3.b- Tipo criado para garantir que o atributo/propriedade da interface "IEntrega" só possa conter um dos três valores declarados pelo tipo.
type Status = 'preparando' | 'emRota' | 'finalizada';

// 6- Interface criada para modelar o array "lista", usada na aplicação criada para listar tarefas. Este array armazena as tarefas e sua prorpiedade "length"(comprimento) preenche/atualiza a propriedade "tarefasTotais".
interface ITarefa {
  nome: string;
  concluido: boolean;
}

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})

export class HomePage {

  // 1- propriedade criada para representar a nota exibida no exemplo da diretiva *ngIf presente na camada de apresentação. Ela é exibida usando o bind de interpolação.
  public nota = 10;

  // 2- Propriedade do tipo array de produtos que implementa a interface "IProduto", usada no exemplo da diretiva "*ngFor" para exibir a listagem de consoles presentes no Array.
  public produtos: IProduto[] = [
    // {nome: "PlayStation 5", preco: 4500},
    // {nome: "Xbox Series X", preco: 3500},
    // {nome: "Nintendo Switch", preco: 1850},
    {nome: 'Switch Oled', preco: 2500}
  ];

  // 3- Propriedade é um objeto usado para exemplificar a aplicação da diretiva "*ngSwitch", que tinha como exemplo um sistema de status de entrega.
  public entrega: IEntrega = {
    status: 'emRota'
  };

  // 4- Propriedade usada no exemplo da diretiva "[style]".
  public isBlue = false;

  // 5- Propriedade usada no exemplo da diretiva "[class]". O exemplo faz uso da classe "texto-vermelho" que está no arquivo "home.page.scss"
  public isRed = true;

  // 6- Esta propriedade, juntamente com "input", "tarefasConcluidas" e "tarefasTotais"; foram usadas na aplicação de listagem de tarefas.
  public lista: ITarefa[] = [];

  public input = '';

  public tarefasConcluidas = 0;

  public tarefasTotais = 0;

  // 7- Propriedade usada no exemplo de "pipes". Este pipe deixa o texto em caixa alta. 
  public meuTexto = 'texto para teste';

  // 8- Propriedade usada no pipe responsavel por deixar o numero no estilo moeda.
  public dinheiro = 5000; 

  // Exercicio
  // 6.a- Método de inserção de tarefas. O método é chamado no evento "click" do botão "inserir".
  inserir(tarefa: string): void {
    // 6.b- Verifica de o parametro tarefa é do tipo string e se não está vazia.
    if (tarefa === '') {
      return;
    }
    // 6.c- Cria um objeto que armazena os dados da tarefa que será inserida no array "lista".
    const novaTarefa: ITarefa = {
      nome: tarefa,
      concluido: false
    };

    // 6.d- Uso do método de array "push", que insere um elemento no fim da fila(no caso, a fila é o array "lista").
    this.lista.push(novaTarefa);
    // 6.e- Após a tarefa ser criada, o valor do input passa a ser uma string vazia para limpar o input com o texto da tarefa, que está vinculado através de um binding feito com a diretiva "[(ngModel)]", caracterizando um "two way data bind" assunto da aula passada.
    this.input = '';
    // 6.f- Propriedade que recebe o comprimento do array "lista", assim ele mapeia a quantidade de tarefas presentes no Array.
    this.tarefasTotais = this.lista.length;
  }
  // 6.g- Método criado para alterar o status de "concluido" da tarefa. O método é chamada no evento "change" do CheckboxControlValueAccessor.
  concluir(): void {
    // 6.h- Cria um novo array chamado "concluidas", que recebe apenas as tarefas que tem o atributo "concluido" com o valor true. O filtro é feito com o método de array chamado "filter". Ele retorna um novo array filtrado. O parametro "t" representa os elementos dentro do array lista. Na sequencia, digo que o novo array deve conter apenas elementos com o atributo "concluido" como true.
    const concluidas = this.lista.filter(t => t.concluido === true);
    this.tarefasConcluidas = concluidas.length;
  }

  limpar_tarefas(): void {
    this.lista = [];
  }


}

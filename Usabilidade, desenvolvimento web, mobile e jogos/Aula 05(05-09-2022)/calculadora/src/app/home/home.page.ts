import { Component } from '@angular/core';
import { concat } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public show = "0"
  public total = 0;
  public preserve_n = 0;
  public preserve_op = "";

  one(): void {
    if (this.show != "0")
    this.show = this.show.concat("1");
    else
    this.show = "1"
  }
  two(): void {
    if (this.show != "0")
    this.show = this.show.concat("2");
    else
    this.show = "2"
  }
  three(): void {
    if (this.show != "0")
    this.show = this.show.concat("3");
    else
    this.show = "3"
  }
  four(): void {
    if (this.show != "0")
    this.show = this.show.concat("4");
    else
    this.show = "4"
  }
  five(): void {
    if (this.show != "0")
    this.show = this.show.concat("5");
    else
    this.show = "5"
  }
  six(): void {
    if (this.show != "0")
    this.show = this.show.concat("6");
    else
    this.show = "6"
  }
  seven(): void {
    if (this.show != "0")
    this.show = this.show.concat("7");
    else
    this.show = "7"
  }
  eight(): void {
    if (this.show != "0")
    this.show = this.show.concat("8");
    else
    this.show = "8"
  }
  nine(): void {
    if (this.show != "0")
    this.show = this.show.concat("9");
    else
    this.show = "9"
  }
  zero(): void {
    if (this.show != "0")
    this.show = this.show.concat("0");
  }
  plus(): void {
    this.total = Number(this.show)
    this.preserve_op = "plus"
    this.show = "0"
  }
  less(): void {
    this.total = Number(this.show)
    this.preserve_op = "less"
    this.show = "0"
  }
  mul(): void {
    this.total = Number(this.show)
    this.preserve_op = "mul"
    this.show = "0"
  }
  divide(): void {
    this.total = Number(this.show)
    this.preserve_op = "divide"
    this.show = "0"
  }
  nothing(): void {
    this.show = "0";
    this.total = 0;
  }
  equals(): void {
    if (this.preserve_op === "plus") this.total = this.total + Number(this.show);
    else if (this.preserve_op === "less") this.total = this.total - Number(this.show);
    else if (this.preserve_op === "mul") this.total = this.total * Number(this.show);
    else if (this.preserve_op === "divide") this.total = this.total / Number(this.show);
    else this.show = "ERROR"
    this.show = String(this.total);
  }

}

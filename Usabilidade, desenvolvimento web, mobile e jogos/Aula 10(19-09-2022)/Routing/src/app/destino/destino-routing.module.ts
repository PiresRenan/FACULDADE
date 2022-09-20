import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DestinoPage } from './destino.page';

const routes: Routes = [
  {
    path: '',
    component: DestinoPage
  },
  {
    path: 'about',
    loadChildren: () => import('../about/about.module').then( m => m.AboutPageModule)
  },
  {
    path: 'news',
    loadChildren: () => import('../news/news.module').then( m => m.NewsPageModule)
  },
  {
    path: 'teste',
    loadChildren: () => import('../teste/teste.module').then( m => m.TestePageModule)
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DestinoPageRoutingModule {}

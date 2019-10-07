import { NgModule } from '@angular/core';
// import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { HerosListComponent } 
         from '../app/heros-list/heros-list.component';

         // Listado de vinculaciones entre URL y Component
const routes: Routes = [
  { path: "heroes", component: HerosListComponent }
];

@NgModule({
  declarations: [],
  imports: [
   // CommonModule
   RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }

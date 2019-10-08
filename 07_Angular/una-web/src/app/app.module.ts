
//// Modulos Angular
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

//// Modulos Routing
import { AppRoutingModule } from './app-routing.module';

//// Componentes
import { AppComponent } from './app.component';
import { MiControlComponent } from './mi-control/mi-control.component';
import { HerosListComponent } from './heros-list/heros-list.component';
import { HeroDetailComponent } from './hero-detail/hero-detail.component';
import { MessagesComponent } from './messages/messages.component';
import { NewHeroComponent } from './new-hero/new-hero.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HeroRestComponent } from './hero-rest/hero-rest.component';

@NgModule({
  declarations: [
    AppComponent,
    MiControlComponent,
    HerosListComponent,
    HeroDetailComponent,
    MessagesComponent,
    NewHeroComponent,
    DashboardComponent,
    HeroRestComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { Component, OnInit } from '@angular/core';
import { HeroRestService } from '../hero-rest.service';
import { Hero } from '../model/hero';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-hero-rest',
  template: `<h2>Listado heroes REST: </h2> <ul>
<li *ngFor = "let hero of heroesRecibidos">
    {{ hero.id }} - {{ hero.name }} </li>
</ul>`
})
export class HeroRestComponent implements OnInit {
  heroesRecibidos: Hero[];
  constructor(private heroRestSrv: HeroRestService) { }

  ngOnInit() {
    console.log(" 1 - Empezamos a pedir los datos");
    let observArrayHeroes: Observable<Hero[]>;
    observArrayHeroes = this.heroRestSrv.getHeroes();
    // La ejecución continúa hasta que el array es recibido. 
    // Para recibirlo asincronamente nos suscribimos al Observable
    let funcionAvisameCuandoLoTengas = (heroesRec) => {
      this.heroesRecibidos = heroesRec;
      console.log("3 - Hemos recibido los heroes");
    };
    observArrayHeroes.subscribe( funcionAvisameCuandoLoTengas );
    console.log("2 - Nos hemos suscrito");
    // En una sola línea se puede hacer todo:
    /*this.heroRestSrv.getHeroes().subscribe( 
                heroesRec => this.heroesRecibidos = heroesRec );*/
    
  }
}

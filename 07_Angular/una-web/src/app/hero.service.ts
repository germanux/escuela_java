import { Injectable } from '@angular/core';
import { Hero } from './model/hero';
import { HEROES } from './model/array-heros';
import { MessageService } from './message.service';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  arrayHeroes: Hero[];

  constructor(private messageSrv: MessageService) { 
    this.arrayHeroes = HEROES;
  }

  getHeroes() : Hero[] {
    this.messageSrv.add("HeroService: capturando heroes");
    return this.arrayHeroes;
  }
  add(newHero: Hero): void {
    this.arrayHeroes.push(newHero);
  }
}

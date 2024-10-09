package org.example;

public class Persoana {
   Gen gen;

   public Persoana(Gen gen) {
       this.gen = gen;
   }

    public void setGen(Gen gen) {
        this.gen = gen;
    }

    public Gen getGen() {
        return gen;
    }

    public void afiseazaGen(){
        System.out.println("Persoana este de gen "+this.gen);
    }
}


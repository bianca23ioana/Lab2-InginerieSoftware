package org.example;

public class Lectie <T>{

    T temp; //asa declaram un membru intr o clasa generica

    public Lectie (T temp) { //constructor cu parametru generic
        this.temp=temp;
    }

    public void start() {
        System.out.println("Este de clasa " + temp.getClass()); //afisam clasa obiectului instantiat
    }                                                       // (ptc putem instantia cu mai multe, fiind generic)

}
//tot o clasa dar care are in denumire
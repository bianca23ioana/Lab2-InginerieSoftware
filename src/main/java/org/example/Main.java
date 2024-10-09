package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persoana p=new Persoana(Gen.Feminin); //folosire enum
        p.afiseazaGen();
        Student s=new Student(Gen.Masculin);
        s.afiseazaGen();

        //instantieri generice
        Lectie <Persoana> l1=new Lectie<>(p);
        l1.start();
        Lectie <Student> l2=new Lectie<>(s);
        l2.start();

       // Lectie <int> l3=new Lectie<int>(nr);  //nu merge, trb cu Integer
        Integer nr=1;
        Lectie <Integer> l3=new Lectie<>(nr);
        l3.start();

        Lectie <Object> l4=new Lectie<>("wow");
        l4.start();

        System.out.println("=============================");
        List<Persoana> pers=new LinkedList<>(); //List este o clasa predefinita genrica din java; merge si cu ArrayList
        pers.add(p);
        pers.add(s);
        Persoana pp=new Persoana(Gen.Altul);
        pers.add(pp);
        for(Persoana i: pers){
            i.afiseazaGen();
        }

    }
}
//ArrayList tine tot ce punem in lista intr un array; functioneaza foarte repede ptc are elementele indexate
//LinkedList inlantuie elementele si le acceseaza cu pointeri => acces mai lent, dar memorie mai putina fata de Array
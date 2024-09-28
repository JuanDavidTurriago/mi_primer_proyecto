import java.util.ArrayList;
import java.util.Scanner;

import animales.mamiferos.Canino;
import animales.mamiferos.Perro;
import enums.Raza;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Perro perro1 = new Perro("2","axel",Raza.DOBERMAN,"cuadrupedo", 38.1f);
        System.out.println(perro1);
        perro1.aullar();
        //perro1 = null;
        //System.gc();
        Scanner scanner = new Scanner(System.in);
        Canino canino1 = new Canino("solo", 38.1f);
        //canino1.alimentacion;
        Canino canino2 = new Perro ("dogshow","lucas",Raza.DOBERMAN,"parchado", 38.1f);
        ArrayList<Canino> lista = new ArrayList<Canino>();
        lista.add(canino1);
        lista.add(canino2);
        lista.add(perro1);
        

        for (Canino caninito: lista) {
            if (caninito.getClass()== Perro.class) {
                Perro perro = (Perro) caninito;
                perro.aullar();


            }
        }
    }
}

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Peces pez = new Peces("adelante", (short) 100); // No se puede instanciar una clase abstracta

        Tilapia tilapia = new Tilapia("ciruclos", (short) 120);
        Salmon salmon1 = new Salmon("adelante", (short) 100);
        Tilapia tilapia2 = new Tilapia("al reves", (short) 100);

        System.out.println("Se han creado " + Peces.pecesCreados + " peces");

        Gallina gallina = new Gallina();
        ArrayList <Mascotas> listaMascotas = new ArrayList<Mascotas>();
        listaMascotas.add(tilapia);
        listaMascotas.add(gallina);

        for (Mascotas mascota : listaMascotas) {
            System.out.println("Nombre: " + mascota.getNombre());
            System.out.println("Dueño: " + mascota.getDueño());
            System.out.println("Valor: " + mascota.getValor());
            System.out.println(" ");
        }

        System.out.println(Peces.porDondeRespiran());
        System.out.println("¿Puedo acariciar las mascotas? " + Mascotas.PUEDO_ACARICIAR);
        JOptionPane.showMessageDialog(null, "Hola", "Saludo", JOptionPane.QUESTION_MESSAGE);
    }
}

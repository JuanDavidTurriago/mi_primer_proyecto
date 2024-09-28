
//import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Gato gato1 = new Gato( (byte) 6, Genero.HEMBRA, "plastico", (byte) 10, true);
        gato1.genero= Genero.MACHO; 
        gato1.setVidas((byte)5);
        System.out.println(gato1);

        String arreglo [] = {"hola", "adios", "???"};

        for (String palabra :arreglo) {
            System.out.println(palabra);
        }

        Gato gatoa = new Gato( (byte) 1, Genero.HEMBRA, "plastico", (byte) 4, false);

        Gato gatob = new Gato( (byte) 5, Genero.MACHO, "metal", (byte) 9, true);

        Gato gatoc = new Gato( (byte) 3, Genero.HEMBRA, "plastico", (byte) 3, true);

        Perro perrito = new Perro("Steven", Raza.BULLDOG);

        Object arreglo2 [] = {gatoa, gatob, gatoc, perrito};

        for (Object object  : arreglo2) {
            if (object.getClass()==Gato.class) {
                Gato gato = (Gato) object;
            if (gato.getvidas() <= 3) {
                System.out.println(gato);
            }
         
        }else{
            Perro perro = (Perro) object;
            System.out.println(perro);

        }

    }
}









    }



       /*  System.out.println("Hello, World!");
        System.out.println("Bye, bitchs!");
        double altura = 1.80; // es el doble de los flotantes
        float peso = 80.0f;  
        char sexo = 'M';
        String  nombre = "andres";
        System.out.println("mi altura es  es " + altura + " mi peso es  " + peso + " mi sexo es " + sexo + " mi nombre es " + nombre);

        byte: 8 bits 256
        short: 16 bits 65536
        int: 32 bits 4294967296
        long: 64 bits 18446744073709551616
         
        //int mes = 11; // ocupa mucho espacio en memoria ya que este almacena 2^32 valores

        //byte mes = 130000; // no se le puede dar valores grandes por que este almacena menos 
        //int mes = 130000; // para valores grandes ahi si vale el int 
s
        byte mes2 = 11; // ocupa menos espacio en memoria ya que este almacena 2^8 valores
        byte dia = 25;
        int año = mes2 * dia;
        System.out.println("mes de mi cumpleaños "+ año); 
        
        */

        // *********************Condicionales***********************
/* 
        if (0 == 1) {
            System.out.println("es verdad");
        } else if (1 == 1) {
            System.out.println("esta claro que si ");
        } else {
            System.out.println("es falso");
        // Remove the extra closing brace

        byte edad = 30;

        switch (edad) {
            case 10:
                System.out.println("eres un niño");
                break;
            case 30:
                System.out.println("eres un adulto");
                break;
        
            default:
            System.out.println("no estas en ninguno de los casos");
                break;
        } */
        // *********************arreglos***********************
        /*byte [] lista =  new byte [5]; 
        lista[0] = 10;
        System.out.println(lista[0]);

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        int arreglo [] = {1,2,3,4,5,6};
        for (int i = 0; i < arreglo.length; i++) {

            if (i == 3) {
               //break; para el ciclo 
                continue; // saltar al siguiente ciclo
            }
            System.out.println(arreglo[i]);
        }
        byte numero = 4;
        while (numero!=0) {
            System.out.println(numero);
            numero = (byte) (numero - 1);

        }
        byte numero = 4;
        {
            System.out.println(":)");

        }while(numero!=0);// do while
        */

         // *********************Arraylist***********************
         // el Arraylist es una lista de tamaño variable
        /* 
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("adios");
        lista.add(1, "mitad"); // agregar por posicion

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }*/ 

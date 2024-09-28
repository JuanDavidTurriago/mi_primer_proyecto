package animales.mamiferos;

import enums.Raza;

public class Perro extends Canino {
     String nombre;
     Raza raza;
     String pedigree;
     String alimentacion; 


    public Perro (String pedigree,String nombre,Raza raza,String formaDeAndar, float temperatura){
        super(formaDeAndar, temperatura);
        this.pedigree=pedigree;
        this.nombre=nombre;
        this.raza=raza;
        alimentacion = "verduras";
    }
     @Override // sirve para dar una etiqueta informativa 
    public void aullar(){
        System.out.println("woof");
        super.aullar(); // llama al metodo de la clase padre
    }

    public void finalize() {
        System.out.println("Se esta eliminando el objeto perro");
    }
}

public class Tilapia extends Peces implements Mascotas {
    
    public Tilapia(String formaNadar, short numeroDeHuevos) {
        super(formaNadar, numeroDeHuevos);
        
    }

    @Override
    public String ruidoAlRespirar() {
        return "glup glup glup";
    }

    @Override
    public String getDueño() {
        return "Juan";
    }

    @Override
    public String getNombre() {
        return "Nemo";
       
    }

    @Override
    public int getValor() {
        return 7000;
    }
}

public class Salmon extends Peces {

    public Salmon(String formaNadar, short numeroDeHuevos) {
        super(formaNadar, numeroDeHuevos);
        
    }


    @Override
    public String ruidoAlRespirar() {
        return "mua mua mua";
    }
    
}

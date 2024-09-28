public abstract class Peces {
    public final boolean respiranBajoElAgua = true;
    private String formaNadar;
    private short numeroDeHuevos;
    public static int pecesCreados = 0;


    public Peces(String formaNadar, short numeroDeHuevos) {
        this.formaNadar = formaNadar;
        this.numeroDeHuevos = numeroDeHuevos;
        pecesCreados++; // Incrementa el contador de peces creados
    }

    public String getFormaNadar() {
        return formaNadar;
    }

    public void setFormaNadar(String formaNadar) {
        this.formaNadar = formaNadar;
    }

    public short getNumeroDeHuevos() {
        return numeroDeHuevos;
    }

    public void setNumeroDeHuevos(short numeroDeHuevos) {
        this.numeroDeHuevos = numeroDeHuevos;
    }

   public abstract String ruidoAlRespirar();

   public static String porDondeRespiran(){ // Método estático, no necesita una instancia de la clase para ser llamado
    return "Por las branquias";
   }
    
}

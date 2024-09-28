public class Gato {

    byte vidas = 7;
    Genero genero;
    Arenero arenero;
    Juguete juguete;

    public Gato(byte vidas, Genero genero, String material,byte tamaño, boolean drogas) { 
        this.vidas = vidas;
        this.genero = genero;
        this.arenero = new Arenero(material);
        this.juguete = new Juguete(tamaño,drogas);


        
    }
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    private class Arenero{
        String material;

        @Override
        public String toString() {
            return "Arenero [material=" + material + "]";
        }

        public Arenero(String material) {
            this.material = material;
        }

    }





@Override
    public String toString() {
        return "Gato [vidas=" + vidas + ", genero=" + genero + ", arenero=" + arenero + ", juguete=" + juguete + "]";
    }

public  byte getvidas() {
        return vidas;
    }

    public void setVidas(byte vidas) {
        this.vidas = vidas;
    }   

    private class Juguete {
        byte tamaño;
        boolean drogas;

        @Override
        public String toString() {
            return "Juguete [tamaño=" + tamaño + ", drogas=" + drogas + "]";
        }

        public Juguete(byte tamaño, boolean drogas) {
            this.tamaño = tamaño;
            this.drogas = drogas;
    
    }
    
    
}
}
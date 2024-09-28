package animales.mamiferos;
public class Canino {

    private boolean sePersiguenLaCola = true;
    private String formaDeAndar;
    private float temperatura;
    protected String alimentacion;

    


    public Canino(String formaDeAndar, float temperatura) {
        this.formaDeAndar = formaDeAndar;
        this.temperatura = temperatura;

    }




    public void aullar() {
        System.out.println("woffffff");
    }
}

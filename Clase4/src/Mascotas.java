
public interface Mascotas { // En las interfaces solo se pueden declarar constantes y métodos abstractos
    // la clase que herede de esta interfaz deberá implementar estos métodos obligatoriamente
    public String getDueño();
    public String getNombre();
    public int getValor();
    public static final boolean PUEDO_ACARICIAR = true; // Constante de clase que no se puede modificar
    
}

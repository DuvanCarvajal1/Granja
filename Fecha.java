
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha() {
       
    }
    
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int calcularEdad() {
        int añoActual = 2024; 
        int edad = añoActual - año;
        return edad;
    }
}


public class Animal {
    private int id;
    private String nombre;
    private double peso;
    private String tipo;
    private Fecha fechaNacimiento;
    
    public Animal(){
        
    }

    public Animal(int id, String nombre, double peso, String tipo, Fecha fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        return fechaNacimiento.calcularEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}

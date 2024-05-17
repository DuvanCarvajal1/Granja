public class Cerdo extends Animal {
    private int grasa;
    
    public Cerdo(){
        
    }

    public Cerdo(int id, String nombre, double peso, Fecha fechaNacimiento, int grasa) {
        super(id, nombre, peso, "Cerdo", fechaNacimiento);
        this.grasa = grasa;
    }

    public int getGrasa() {
        return grasa;
    }
}

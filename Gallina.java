public class Gallina extends Animal {
    private int numHuevos;
    
    public Gallina(){
        
    }

    public Gallina(int id, String nombre, double peso, Fecha fechaNacimiento, int numHuevos) {
        super(id, nombre, peso, "Gallina", fechaNacimiento);
        this.numHuevos = numHuevos;
    }

    public int getNumHuevos() {
        return numHuevos;
    }
}


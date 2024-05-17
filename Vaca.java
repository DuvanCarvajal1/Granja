public class Vaca extends Animal {
    private double ltsLeche;
    
    public Vaca(){
        
    }

    public Vaca(int id, String nombre, double peso, Fecha fechaNacimiento, double litrosLeche) {
        super(id, nombre, peso,"Vaca", fechaNacimiento);
        this.ltsLeche = ltsLeche;
    }

    public double getLtsLeche() {
        return ltsLeche;
    }
    
}


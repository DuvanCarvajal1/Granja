import java.util.ArrayList;

public class Granja {
    
    public Granja(){
        
    }
    
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public int contarAnimalesTipo(String tipo) {
        int cont = 0;
        for (Animal animal : animales) {
            if (animal.getTipo().equalsIgnoreCase(tipo)) {
                cont++;
            }
        }
        return cont;
    }

}

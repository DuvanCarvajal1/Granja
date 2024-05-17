
import java.util.ArrayList;

public class Control {

    public static void main(String[] args) {
        Granja granja = new Granja();
        Fecha fechaNacimiento = new Fecha(1, 1, 2023);
        
        
        granja.agregarAnimal(gallina);
        granja.agregarAnimal(vaca);
        granja.agregarAnimal(cerdo);


        mostrarInformacionAnimales(granja);
    }
        
    public static void mostrarInformacionAnimales(Granja granja) {
        ArrayList<Animal> animales = granja.getAnimales();
        System.out.println("Información de los animales en la granja:");
        
        for (Animal animal : animales) {
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("Tipo: " + animal.getTipo());
            System.out.println("Edad: " + animal.calcularEdad() + " años");
            
            if (animal instanceof Gallina) {
                Gallina gallina = (Gallina) animal;
                System.out.println("Número de huevos: " + gallina.getNumHuevos());
            } else if (animal instanceof Vaca) {
                Vaca vaca = (Vaca) animal;
                System.out.println("Litros de leche: " + vaca.getLtsLeche());
            } else if (animal instanceof Cerdo) {
                Cerdo cerdo = (Cerdo) animal;
                System.out.println("Grasa: " + cerdo.getGrasa() + " kg");
            }
            
            System.out.println();
        }
    int numGallinas = granja.contarAnimalesTipo("Gallina");
    int numVacas = granja.contarAnimalesTipo("Vaca");
    int numCerdos = granja.contarAnimalesTipo("Cerdo");

    System.out.println("Número de gallinas en la granja: " + numGallinas);
    System.out.println("Número de vacas en la granja: " + numVacas);
    System.out.println("Número de cerdos en la granja: " + numCerdos);
    }
}

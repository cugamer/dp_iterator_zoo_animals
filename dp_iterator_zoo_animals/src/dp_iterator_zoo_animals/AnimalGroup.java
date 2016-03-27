package dp_iterator_zoo_animals;
import java.util.Iterator;

public interface AnimalGroup {
	public void addAnimal(String name, String latinName, String description, int age, double weight);
	public Iterator<Animal> createIterator();
}

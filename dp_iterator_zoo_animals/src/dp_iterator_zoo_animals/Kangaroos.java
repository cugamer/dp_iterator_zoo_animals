package dp_iterator_zoo_animals;
import java.util.Iterator;


public class Kangaroos implements AnimalGroup {
	private static final int MAX_ANIMALS = 5;
	private int numberOfAnimals = 0;
	Animal[] animals = new Animal[MAX_ANIMALS];
	
	public Kangaroos(){}

	public void addAnimal(String name, String latinName, String description, int age, double weight){
		if(numberOfAnimals >= MAX_ANIMALS){
			System.out.println("No additional animals can be added.");
		}else{
			Animal animal = new Animal(name, latinName, description, age, weight);
			animals[numberOfAnimals] = animal;
			numberOfAnimals += 1;
		}
	}
	
	public Iterator<Animal> createIterator(){
		return new KangarooIterator(animals);
	}
}

package dp_iterator_zoo_animals;

import java.util.HashMap;
import java.util.Iterator;

public class PolarBears implements AnimalGroup {

	HashMap<String, Animal> animals = new HashMap<>();
	
	public PolarBears(){}
	
	public void addAnimal(String name, String latinName, String description, int age, double weight){
		Animal animal = new Animal(name, latinName, description, age, weight);
		animals.put(animal.name, animal);
	}
	
	public Iterator createIterator(){
		return animals.values().iterator();
	}
}

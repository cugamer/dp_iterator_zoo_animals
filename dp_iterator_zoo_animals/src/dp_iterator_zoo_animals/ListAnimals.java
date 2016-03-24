package dp_iterator_zoo_animals;

import java.util.LinkedList;

public class ListAnimals {
	LinkedList<Animal> animals = new LinkedList<>();
	
	public ListAnimals(){}
	
	public void addAnimal(String name, String latinName, String description, int age, double weight){
		Animal animal = new Animal(name, latinName, description, age, weight);
		animals.add(animal);
	}
	
	public Iterator createIterator(){
		return new SeaAnimalIterator(animals);
	}
}

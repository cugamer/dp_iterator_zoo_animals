package dp_iterator_zoo_animals;

import java.util.LinkedList;

public class SeaAnimals {
	LinkedList<Animal> animals = new LinkedList<>();
	
	public SeaAnimals(){}
	
	public void addAnimal(String name, String latinName, String description, int age, double weight){
		Animal animal = new Animal(name, latinName, description, age, weight);
		animals.add(animal);
	}
	
	public LinkedList<Animal> getAnimals(){
		return animals;
	}
}

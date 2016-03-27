package dp_iterator_zoo_animals;

import java.util.Iterator;

public class AnimalListing {
	private Otters otters;
	private Kangaroos kangaroos;
	
	public AnimalListing() {
		otters = new Otters();
		otters.addAnimal("Bob", "Enhydra lutris", "Senior otter", 42, 27.8);
		otters.addAnimal("Gene", "Enhydra lutris", "Fart noises!", 39, 21.5);
		otters.addAnimal("Linda", "Enhydra lutris", "Okay Bobby!", 11, 25.8);
		otters.addAnimal("Tina", "Enhydra lutris", "Likes boys", 13, 21.8);
		otters.addAnimal("Louise", "Enhydra lutris", "Don't turn your back", 8, 10.9);
		
		kangaroos = new Kangaroos();
		kangaroos.addAnimal("Sterling", "Macropus fuliginosus", "Super spy", 35, 100);
		kangaroos.addAnimal("Cheryl", "Macropus fuliginosus", "Secretary", 25, 45);
		kangaroos.addAnimal("Lana", "Macropus fuliginosus", "Archer, get over here!", 32, 55);
		kangaroos.addAnimal("Pam", "Macropus fuliginosus", "Dolphin girl", 35, 100);
		kangaroos.addAnimal("Krieger", "Macropus fuliginosus", "Why do you speak Portuguese?", 35, 85);
		kangaroos.addAnimal("Krieger", "Macropus fuliginosus", "Not gonna fit", 35, 85);
	}
	
	public void listAnimals(){
		Iterator<Animal> otterIterator = otters.createIterator();
		Iterator<Animal> kangarooIterator = kangaroos.createIterator();
		System.out.println("Here are the Otters:");
		listAnimals(otterIterator);
		System.out.println("Here are the Kangaroos:");
		listAnimals(kangarooIterator);
	}
	
	private void listAnimals(Iterator iterator){
		while(iterator.hasNext()){
			Animal animal = (Animal)iterator.next();
			System.out.println(animal.name + ", " + animal.latinName + ", " + animal.weight + " years old, " + animal.weight + " kilograms.");
		}
	}
}

package dp_iterator_zoo_animals;

public class ListAnimals {
	public static void main(String[] args){
		
		Otters otters = new Otters();
		otters.addAnimal("Bob", "Enhydra lutris", "Senior otter", 42, 27.8);
		otters.addAnimal("Gene", "Enhydra lutris", "Fart noises!", 39, 21.5);
		otters.addAnimal("Linda", "Enhydra lutris", "Okay Bobby!", 11, 25.8);
		otters.addAnimal("Tina", "Enhydra lutris", "Likes boys", 13, 21.8);
		otters.addAnimal("Louise", "Enhydra lutris", "Don't turn your back", 8, 10.9);

		Iterator ottersIterator = otters.createIterator();
		
		Kangaroos kangaroos = new Kangaroos();
		kangaroos.addAnimal("Sterling", "Macropus fuliginosus", "Super spy", 35, 100);
		kangaroos.addAnimal("Cheryl", "Macropus fuliginosus", "Secretary", 25, 45);
		kangaroos.addAnimal("Lana", "Macropus fuliginosus", "Archer, get over here!", 32, 55);
		kangaroos.addAnimal("Pam", "Macropus fuliginosus", "Dolphin girl", 35, 100);
		kangaroos.addAnimal("Krieger", "Macropus fuliginosus", "Why do you speak Portuguese?", 35, 85);
		kangaroos.addAnimal("Krieger", "Macropus fuliginosus", "Not gonna fit", 35, 85);
		
		Iterator kangaroosIterator = kangaroos.createIterator();
		
		
		System.out.println("Here are our animals");
		System.out.println("--------------------------------------");
		System.out.println("------------ Our Otters --------------");
		printAnimals(ottersIterator);
		System.out.println("---------- Our Kangaroos -------------");
		printAnimals(kangaroosIterator);
	}
	
	private static void printAnimals(Iterator iterator){
		while(iterator.hasNext()){
			Animal animal = iterator.next();
			System.out.println("Name:" + animal.name);
			System.out.println("Scientific name: " + animal.latinName);
			System.out.println("Description: " + animal.description);
			System.out.println("Age: " + animal.age);
			System.out.println("Weight: " + animal.weight);
		}
	}
}

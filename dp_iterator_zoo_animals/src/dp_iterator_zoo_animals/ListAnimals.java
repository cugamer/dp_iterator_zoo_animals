package dp_iterator_zoo_animals;

public class ListAnimals {
	public static void main(String[] args){
		System.out.println("Visiting the zoo!");
		
		Otters seaAnimals = new Otters();
		
		seaAnimals.addAnimal("Bob", "Enhydra lutris", "Senior otter", 42, 27.8);
		seaAnimals.addAnimal("Gene", "Enhydra lutris", "Fart noises!", 39, 21.5);
		seaAnimals.addAnimal("Linda", "Enhydra lutris", "Okay Bobby!", 11, 25.8);
		seaAnimals.addAnimal("Tina", "Enhydra lutris", "Likes boys", 13, 21.8);
		seaAnimals.addAnimal("Louise", "Enhydra lutris", "Don't turn your back", 8, 10.9);

		Iterator seaAnimalsIterator = seaAnimals.createIterator();
		
		printAnimals(seaAnimalsIterator);
	}
	
	private static void printAnimals(Iterator iterator){
		while(iterator.hasNext()){
			Animal animal = iterator.next();
			System.out.println(animal.name);
			System.out.println(animal.latinName);
			System.out.println(animal.description);
			System.out.println(animal.age);
			System.out.println(animal.weight);
		}
	}
}

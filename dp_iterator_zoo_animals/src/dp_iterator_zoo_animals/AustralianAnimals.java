package dp_iterator_zoo_animals;

public class AustralianAnimals {
	static final int MAX_ANIMALS = 5;
	int numberOfAnimals = 0;
	Animal[] animals;
	
	public AustralianAnimals(){}

	public void addAnimal(String name, String latinName, String description, int age, double weight){
		if(numberOfAnimals >= MAX_ANIMALS){
			System.out.println("No additional animals can be added.");
		}else{
			Animal animal = new Animal(name, latinName, description, age, weight);
			animals[numberOfAnimals] = animal;
			numberOfAnimals += 1;
		}
	}
	
	public Animal[] getAnimals(){
		return animals;
	}
}

package dp_iterator_zoo_animals;

public class AustralianAnimalIterator implements Iterator {
	Animal[] animals;
	int position = 0;
	
	public AustralianAnimalIterator(Animal[] animals){
		this.animals = animals;
	}

	public boolean hasNext() {
		if(position >= animals.length || animals[position] == null){
			return false;
		}else{
			return true;
		}
	}

	public Animal next() {
		Animal animal = animals[position];
		position = position + 1;
		return animal;
	}

}

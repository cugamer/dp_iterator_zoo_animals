package dp_iterator_zoo_animals;

import java.util.LinkedList;

public class SeaAnimalIterator implements Iterator {
	LinkedList<Animal> animals;
	int position = 0;
	
	public SeaAnimalIterator(LinkedList<Animal> animals){
		this.animals = animals;
	}
	
	public boolean hasNext() {
		if(position >= animals.size()){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Animal next() {
		Animal animal = animals.get(position);
		position = position + 1;
		return animal;
	}

}

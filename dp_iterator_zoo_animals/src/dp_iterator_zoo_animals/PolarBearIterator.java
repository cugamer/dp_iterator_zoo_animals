package dp_iterator_zoo_animals;

import java.util.HashMap;

public class PolarBearIterator implements Iterator {
	private int position = 0;
	private HashMap<String, Animal> animals;
	
	public PolarBearIterator(HashMap<String, Animal> animals){
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

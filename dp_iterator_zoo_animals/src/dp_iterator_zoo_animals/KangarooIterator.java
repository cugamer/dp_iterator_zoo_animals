package dp_iterator_zoo_animals;

public class KangarooIterator implements Iterator {
	Animal[] animals;
	int position = 0;
	
	public KangarooIterator(Animal[] animals){
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

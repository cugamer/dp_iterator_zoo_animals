package dp_iterator_zoo_animals;
import java.util.Iterator;

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

	public void remove(){
		if(position <= 0) {
			throw new IllegalStateException("You can't remove an item until you've odne at least one next()");
		}
		if (animals[position - 1] != null) {
			for (int i = (position - 1); i < animals.length - 1; i++){
				animals[i] = animals[i + 1];
			}
			animals[animals.length - 1] = null;
		}
	}
}

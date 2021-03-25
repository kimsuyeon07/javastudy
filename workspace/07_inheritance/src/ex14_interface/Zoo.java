package ex14_interface;

public class Zoo {

	// field
	private Animal[] animals;
	private int idx;
	
	// constructor
	public Zoo(int animalCount) {
		animals = new Animal[animalCount];
	}
	
	// method : addAnimal : 배열의 데이터값 생성
	public void addAnimal(Animal animal) {
		if (idx < animals.length) {
			animals[idx++] = animal;
		}
	}
	
	// method : info()
	public void info() {
		for (Animal animal : animals) {
			if (animal != null) {
				animal.move();
			}
		}
	}
				
	
	
	
	
	
	
	
}

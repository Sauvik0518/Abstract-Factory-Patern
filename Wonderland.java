package iit.du.ac.bd;

public class Wonderland {
	public Wonderland(AnimalFactory factory) {
		Animal animal = factory.createAnimal();
		animal.breathe();
	}
}

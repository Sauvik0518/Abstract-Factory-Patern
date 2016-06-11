package iit.du.ac.bd;

public class LandFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Elephant();
	}

}

package iit.du.ac.bd;

public class SeaFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Shark();
	}

}

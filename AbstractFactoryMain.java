package iit.du.ac.bd;

public class AbstractFactoryMain {
	public static void main(String args[]){
		new Wonderland(createAnimalFactory("water"));
	}

	public static AnimalFactory createAnimalFactory(String type){
		if("water".equals(type))
			return new SeaFactory();
		else
			return new LandFactory();
	}
}

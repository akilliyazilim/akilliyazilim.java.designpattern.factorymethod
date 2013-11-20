
public class FactoryPatternDemo {
	
	public static void main(String[] args)
	{
		AnimalFactory animal_factory = new AnimalFactory();
		
		Animal animal1 = animal_factory.getAnimal("DOG");
		Animal animal2 = animal_factory.getAnimal("CAT");
		Animal animal3 = animal_factory.getAnimal("FOX");
		
		animal1.goes();
		animal2.goes();
		animal3.goes();
	}

}

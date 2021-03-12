package q43;

public class Test {

	public static void main(String[] args) {
        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" + 
                            dog2.getName() + ":" + dog2.getBreed());
    }
	

}

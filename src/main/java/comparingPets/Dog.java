package comparingPets;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
               '}';
    }


}

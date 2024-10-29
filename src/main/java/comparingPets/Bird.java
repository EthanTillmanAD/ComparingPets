package comparingPets;

public class Bird extends Pet{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Chirp Chirp");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + getName() + '\'' +
                '}';
    }
}

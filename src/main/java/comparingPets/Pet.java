package comparingPets;

public abstract class Pet implements Comparable<Pet>{
    private String name;

    public Pet(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public abstract void makeNoise();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pet o) {
        return this.name.compareTo(o.getName());
    }
}

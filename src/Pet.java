
public class Pet {
    private int petId;
    private String name;
    private String breed;
    private int age;

    // Constructors, getters, setters, and other methods
    public Pet(int petId, String name, String breed, int age) {
        this.petId = petId;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

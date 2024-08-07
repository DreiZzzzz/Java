public class Dog extends Pet{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getInfo() {
        return this.name + this.age;
    }

    @Override
    public void makeSound() {
        System.out.println("arf arf");
    }

    @Override
    public void eatFood() {
        System.out.println("yum yum yum");
    }
}

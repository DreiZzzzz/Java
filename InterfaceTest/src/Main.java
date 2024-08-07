public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Aspin", 12);

        System.out.println(dog1.getAge());
        System.out.println(dog1.getName());
        System.out.println(dog1.getInfo());

        dog1.makeSound();
        dog1.eatFood();
    }
}
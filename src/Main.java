public class Main {
    public static void main(String[] args) {

        Person<Cat> catPerson = new Person<>(new Cat());
        Person<Dog> dogPerson = new Person<>(new Dog());
        Person<Fish> fishPerson = new Person<>(new Fish());

        fishPerson.animal.sound();





    }
}

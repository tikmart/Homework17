public class Person<T extends Animal>{
    T animal;

    public Person(T animal) {
        this.animal = animal;
    }
}

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void SayHello() {
        System.out.println("Hello, " + name + "!");
    }
}

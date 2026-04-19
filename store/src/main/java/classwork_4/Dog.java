package classwork_4;

class Dog {
    String name;
    int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void bark() {
        System.out.println("Woof! I'm " + name);
    }
}
package classwork_10;

class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void bark() {
        System.out.println(name + " says: Woof!");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}

public class Person {
    public String name = "Bob";
    public int age;

    public void getName() {
        System.out.println(name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

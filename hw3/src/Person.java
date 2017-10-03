public class Person {
    private String name = "Bob";
    private int age;

    public void getName() {
        System.out.println(name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this && obj instanceof Person;
    }
}

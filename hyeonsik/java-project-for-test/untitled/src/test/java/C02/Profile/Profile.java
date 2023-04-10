package C02.Profile;

public class Profile {
    private String name;
    private int age;

    public void setName(String str) {
        name = str;
    }
    public void setAge(int val) {
        age = val;
    }
    public void printName() {
        System.out.println("My name is " + name);
    }
    public void printAge() {
        System.out.println("My age is " + age);
    }
}

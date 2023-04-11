package C04.ProfilePrint;

public class ProfilePrint {
    private byte age;
    private String name;
    private boolean isMarried;

    public void setAge(byte age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarried(boolean flag) {
        isMarried = flag;
    }

    public byte getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public boolean getMarried() {
        return isMarried;
    }
}

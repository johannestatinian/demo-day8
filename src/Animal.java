public class Animal {
    private int age;
    private String name;
    private String type;

    public Animal(int age, String name, String type) {
        this.age = age;
        this.name = name;
        this.type = type;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String area;
    private String gender;

    public Animal(String name, int age, int weight, String area, String gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.area = area;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void eat(int foodWeight) {
        this.weight += foodWeight;
        System.out.println(getName() + " ate. New weight: " + this.weight + " kg");
    }

    public void move(String newArea) {
        String oldArea = this.area;
        this.area = newArea;
        System.out.println(getName() + " is changing area from " + oldArea + " to " + this.area);
    }

    public void grow() {
        this.age += 1;
        System.out.println("Today " + getName() + " is " + this.age + " years old");
    }
}


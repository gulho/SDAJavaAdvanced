package week1;

public class Dog {
    private String name;
    private int age;
    private char gender;
    private String race;
    private double weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 ) {
            this.age = age;
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public Dog(String name, int age, char gender, String race, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(char gender, String race) {
        this("Unknown", 0, gender, race, 0);
    }

    public static void main(String[] args) {
        Dog someDog = new Dog("Test dog", 5, 'M', "sheepherd", 10);

        someDog.setAge(6);
        someDog.setWeight(17);
        System.out.println("Dog age:" + someDog.getAge());
        System.out.println("Dog weight:" + someDog.getWeight());
    }
}

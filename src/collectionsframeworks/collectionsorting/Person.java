package collectionsframeworks.collectionsorting;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String dob;

    public Person(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
       // return name.compareTo(o.getName()); // provide ascending order
        // if you want in descending order
        if (this.getAge() < o.getAge()) return +1;
        if (this.getAge()== o.getAge())return 0;
        else return -1;

    }
}

package javagenerics;

public class BoundGenerics {

    public <T extends Comparable<T>> T calculateMin(T num1,T num2){
        if (num1.compareTo(num2)<0){
            return num1;
        }
        return num2;
    }

    public <T extends Number> double addTwoNumber(T num1,T num2){
        return num1.doubleValue()+num2.doubleValue();
    }


}

/**
 * for compare,  we need to implement Comparable<Person>>
 *     */
class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age,String name){
        this.name=name;
        this.age=age;
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



    @Override
    public int compareTo(Person o) {
        return Integer.compare(age,o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

package javagenerics;

public class GenericMethods {

    public <T> void printValue(T t){
        System.out.println("Value is "+t.toString());
    }

    public <N> N returnValue(N number){
        return number;
    }
}

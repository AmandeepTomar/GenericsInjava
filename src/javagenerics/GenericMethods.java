package javagenerics;

public class GenericMethods {

    public <T> void printValue(T t){
        System.out.println("Value is "+t.toString());
    }

    public <N> N returnValue(N number){
        return number;
    }

    public <T, V> void printValues(T t ,V v){
        System.out.println("Values is "+t);
        System.out.println("Value of V is "+v);
    }

    public <T> void printValuesAsArray(T[] items){
        for (T t:items) {
            System.out.println(t.toString());
        }
    }
}

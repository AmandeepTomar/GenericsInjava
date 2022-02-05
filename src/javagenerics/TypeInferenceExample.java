package javagenerics;

import java.util.List;

public class TypeInferenceExample {

    public static <T> void addStore(T item, List<Bucket<T>> list){
        Bucket<T> bucket=new Bucket<>(item);
        list.add(bucket);
        System.out.println("Bucket has been added to list "+bucket);
    }
}

class Bucket<T>{
    private T item;

    public Bucket(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "item=" + item +
                '}';
    }
}

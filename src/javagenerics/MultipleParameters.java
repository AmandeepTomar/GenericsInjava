package javagenerics;

public class MultipleParameters<K,V,E> {
    private K key;
    private V value;
    private E entity;

    public MultipleParameters(K key, V value, E entity ){
        this.key=key;
        this.value=value;
        this.entity=entity;
    }


    public static void getMultipleGenericsExample(){
        Item<String> item=new Item<>();
        item.setItem("It's Items Value");
        MultipleParameters<String,Integer,Item<String>> itemMulti=new MultipleParameters<>("MultipleParams",1,item);
        System.out.println(itemMulti);
    }


    @Override
    public String toString() {
        return "MultipleParameters{" +
                "key=" + key +
                ", value=" + value +
                ", entity=" + entity +
                '}';
    }
}

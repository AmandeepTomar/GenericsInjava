package javagenerics;

public class Example1 {

    public void checkExample1(){

        Item<Integer> intItem=new Item<>();
        // if we want to put String or Double then it will throw compile time error.
        intItem.setItem(100);
        Integer updatedItem=intItem.getItem();
        System.out.println("javagenerics.Item as Integer"+updatedItem);

        // String
        Item<String> stringItem=new Item<>();
        stringItem.setItem("Hey i am Generic String");
        String updatedItemString=stringItem.getItem();
        System.out.println("javagenerics.Item as String"+updatedItemString);

        // Double
        Item<Double> doubleItem=new Item<>();
        doubleItem.setItem(34.09877);
        Double updatedItemDouble=doubleItem.getItem();
        System.out.println("javagenerics.Item as Double"+updatedItemDouble);

        // Long
        Item<Long> longItem=new Item<>();
        longItem.setItem(12L);
        Long updatedItemLong=longItem.getItem();
        System.out.println("javagenerics.Item as Long"+updatedItemLong);

    }
}

class Item<T>{
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    private T item;

}

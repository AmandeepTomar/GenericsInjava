package collectionsframeworks.collectionsorting.lamda;

import collectionsframeworks.collectionsorting.CollectionsSortExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        exampleWithlamda();
    }

    private static void exampleWithlamda() {
        List<Item> items=new ArrayList<>();
        items.add(new Item(10,"Aman",100000));
        items.add(new Item(8,"Abid",898989));
        items.add(new Item(25,"Amandeep",999999999));
        items.add(new Item(8,"Karan",10));
        items.add(new Item(10,"Karan",10));
        items.add(new Item(6,"Karan",10));

        CollectionsSortExample.printAllItem(items);

        System.out.println("Apply sorting on Names");
        Collections.sort(items, Comparator.comparing(Item::getName));
        CollectionsSortExample.printAllItem(items);

        System.out.println("Apply sorting on Names on reverse Order");
        Collections.sort(items, Comparator.comparing(Item::getName).reversed());
        CollectionsSortExample.printAllItem(items);

        System.out.println("Apply sorting on count");
        Collections.sort(items, Comparator.comparing(Item::getCount));
        CollectionsSortExample.printAllItem(items);

        System.out.println("Apply sorting on count on reverse Order");
        Collections.sort(items, Comparator.comparing(Item::getCount).reversed());
        CollectionsSortExample.printAllItem(items);

        System.out.println("Apply sorting on name then count");
        Collections.sort(items, Comparator.comparing(Item::getName).thenComparing(Item::getCount));
        CollectionsSortExample.printAllItem(items);

    }
}

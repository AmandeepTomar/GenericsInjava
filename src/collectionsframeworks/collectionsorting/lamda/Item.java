package collectionsframeworks.collectionsorting.lamda;

public class Item {
    private int count;
    private String name;
    private int price;

    public Item(int count, String name, int price) {
        this.count = count;
        this.name = name;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "count=" + count +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

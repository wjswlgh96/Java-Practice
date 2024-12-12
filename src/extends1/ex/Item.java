package extends1.ex;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected String getName() {
        return name;
    }

    protected int getPrice() {
        return price;
    }

    protected void print() {
        System.out.println("이름 : " + name + ", 가격 : " + price);
    }
}

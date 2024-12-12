package class1.ex;

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    void print() {
        System.out.println("상품명 : " + productName + ", 가격 : " + price + ", 수량 : " + quantity);
    }
}

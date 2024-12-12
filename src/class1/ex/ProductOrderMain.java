package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;
        orders[0] = dubu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        orders[1] = kimchi;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;
        orders[2] = cola;

        ProductOrder test = cola;
        test.productName = "테스트";
        test.price  = 2000;
        test.quantity = 100;

        test.print();

        int sum = 0;
        for (ProductOrder o : orders) {
            o.print();
            sum += (o.price * o.quantity);
        }


        System.out.println("총 결제 금액 : " + sum);
    }
}

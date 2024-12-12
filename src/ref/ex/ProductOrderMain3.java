package ref.ex;
import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int length = input.nextInt();
        input.nextLine();

        ProductOrder[] orders = new ProductOrder[length];
        for(int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명 : ");
            String productName = input.nextLine();
            System.out.print("가격 : ");
            int price = input.nextInt();

            System.out.print("수량 : ");
            int quantity = input.nextInt();
            input.nextLine();

            orders[i] = createProductOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액 : " + totalAmount);
    }

    static ProductOrder createProductOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            order.print();
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += (order.price * order.quantity);
        }

        return totalAmount;
    }
}

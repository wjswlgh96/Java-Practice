package poly.ex.pay;

public class PaypalPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("페이팔 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}

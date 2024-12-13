package poly.ex.pay;

public abstract class PayStore {

    public static Pay findPay(String option) {
        if (option.matches("kakao|카카오")) {
            return new KakaoPay();
        } else if (option.matches("naver|네이버")) {
            return new NaverPay();
        } else if(option.matches("paypal|페이팔")) {
            return new PaypalPay();
        } else {
            return new DefaultPay();
        }
    }
}

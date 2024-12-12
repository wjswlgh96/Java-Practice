package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if(isMaxItems()) {
            System.out.println("장바구니가 가득찼습니다!");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < itemCount; i++) {
            final Item target = items[i];
            System.out.println("이름 : " + target.getName() + ", 합계 : " + target.getTotalPrice());
        }

        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private boolean isMaxItems() {
        return items.length <= itemCount;
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }

        return totalPrice;
    }
}

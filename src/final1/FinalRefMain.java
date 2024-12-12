package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();
        data.value = 20;
        System.out.println("data.value = " + data.value);
        data.value = 50;
        System.out.println("data.value = " + data.value);
    }
}

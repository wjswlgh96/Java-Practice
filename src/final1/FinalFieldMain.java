package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit cInit1 = new ConstructInit(10);
        ConstructInit cInit2 = new ConstructInit(20);
        System.out.println("cInit1.value  = " + cInit1.value);


        System.out.println("필드 초기화");
        FieldInit f1 = new FieldInit();
        System.out.println("f1.value = " + f1.value);

        System.out.println("FieldInit.CONST_VALUE = " + FieldInit.CONST_VALUE);

    }
}

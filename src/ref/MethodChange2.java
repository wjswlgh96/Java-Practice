package ref;

import java.util.Arrays;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서도 호출 전 dataA.value : " + dataA.value);
        changePrimitive(dataA);
        System.out.println("메서도 호출 후 dataA.value : " + dataA.value);
    }

    static void changePrimitive(Data data) {
        data.value = 20;
    }
}

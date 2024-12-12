package access.b;

import access.a.AccessData;

public class OuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출 가능
        // data.defaultField = 2;
        // data.defaultMethod();

        // private 호출 불가능
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
    }
}

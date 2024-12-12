package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        Parent parent2 = new Child();

        call(parent1);
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if(parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}

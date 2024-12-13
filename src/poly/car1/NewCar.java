package poly.car1;

public class NewCar implements Car {
    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }
}

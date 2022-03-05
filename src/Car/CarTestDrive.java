package Car;

public class CarTestDrive {
   public static void main(String[] args) {
    Car car = new Car();
    car.setCarColor("Xanh");
    car.setCarPrice(100);
    System.out.println("CarColor: "+car.getCarColor());
    System.out.println("CarPrice: "+car.getCarPrice());
   }
}

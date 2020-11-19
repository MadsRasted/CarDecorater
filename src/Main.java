public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle redCar = new RedVehicleDecorator(new Car());
        Vehicle sportsCar = new SportscarDecorator(new Car());

        System.out.println("Normal car honk:");
        car.honk();

        System.out.println();

        System.out.println("Red car honk:");
        redCar.honk();

        System.out.println();

        System.out.println("Sports car honk: ");
        sportsCar.honk();
    }


}

public class SportscarDecorator extends VehicleDecorator{

    public SportscarDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public void honk(){
        decoratedVehicle.honk();
        setSportsType(decoratedVehicle);
    }

    private void setSportsType(Vehicle decoratedVehicle){
        System.out.println("Car type: Sportscar");
    }
}

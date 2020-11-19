public class RedVehicleDecorator extends VehicleDecorator{

    public RedVehicleDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public void honk(){
        decoratedVehicle.honk();
        setRedColor(decoratedVehicle);
    }

    private void setRedColor(Vehicle decoratedVehicle){
        System.out.println("car is red");
    }
}

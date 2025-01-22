public class Car {
    private String make;
    private String model;
    private String plateNumber;
    private int year;
    private int carId;
    private boolean isAvailable;

    public Car(String make, String model, int year, String plateNumber, int carId, boolean isAvailable){
        this.make = make;
        this.model = model;
        this.year = year;
        this.plateNumber = plateNumber;
        this.carId = carId;
        this.isAvailable = isAvailable;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear (int year){
        this.year = year;
    }

    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public void setCarId(int carId){
        this.carId = carId;
    }

    public void setAvailability(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public String getDetails(){
        return "";
    }
}

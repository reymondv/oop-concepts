public class Car {
    private String brand, model, color;
    private int year;

    public Car(){
        //Constructor with no parameter
    }

    public Car(String brand, String model, String color, int year){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void printDetails(){
        System.out.printf("Brand: %s%nModel: %s%nColor: %s%nYear: %s%n", brand, model, color, year);
    }

}
public class App {
    public static void main(String[] args) throws Exception {
        Car[] Cars = new Car[5];
        String[][] detailsArr  = {
            {"Honda", "Civic FD", "White", "2010"},
            {"Mitsubishi", "Lancer Evolution EX", "Black", "2010"},
            {"Ford", "Raptor", "White", "2013"},
            {"Toyota", "Fortuner", "Brown", "2020"},
            {"Subaru", "WRX STI", "Blue", "2015"}
        };

        for(int i = 0; i < detailsArr.length; i ++){
            Cars[i] = new Car(detailsArr[i][0], detailsArr[i][1], detailsArr[i][2], Integer.parseInt(detailsArr[i][3]));
        }

        for(int j = 0; j < Cars.length; j++){
            Cars[j].printDetails();
            System.out.println("-----------------");
        }
    }
}

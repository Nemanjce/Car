public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.printMainAttributes();

        Car companyCar = new Car(150, 30, 2000, false, "EFG-456", 'B', 3500, 6000);
        companyCar.changeModel("Fiat");
        companyCar.changeMaxFuel(150);
        companyCar.fuelUp();
        companyCar.changeConsumption(10);
        companyCar.changecurrentPassengers (3)

        companyCar.printMainAttributes();
        companyCar.travel(10);
        companyCar.printMainAttributes();
        
        Car testAuto = new Car ();
        testAuto.getIn();
        testAuto.printMainAttributes();
        testAuto.getIn();
        testAuto.printMainAttributes();
        testAuto.getIn();
        testAuto.printMainAttributes();
        testAuto.getIn();
        testAuto.printMainAttributes();

//        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed);
//        System.out.println(companyCar.condition);
//        System.out.println(companyCar.currentPrice);
//        System.out.println(companyCar.license);
//        System.out.println(companyCar.minSpeed);
//        System.out.println(companyCar.weight);
//        
//        Car audi = new Car();
//        audi.changeModel("Audi");
//        audi.fuelUp();
//        audi.changeConsumption(20);
//
//        audi.printMainAttributes();
//        audi.travel(20);
    }

}

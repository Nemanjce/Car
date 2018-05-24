
public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.printMainAttributes();
//        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed);
//        System.out.println(myCar.condition);
//        System.out.println(myCar.currentPrice);
//        System.out.println(myCar.license);
//        System.out.println(myCar.minSpeed);
//        System.out.println(myCar.weight);
        Car companyCar = new Car(150, 30, 2000, false, "EFG-456", 'B', 3500, 6000);
        companyCar.changeModel("Fiat");
        companyCar.changeMaxFuel(150);
        companyCar.fuelUp();
        companyCar.changeConsumption(10);

        companyCar.printMainAttributes();
        companyCar.travel(10);
        companyCar.printMainAttributes();

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


import loops.Loops;

public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.printAttributes();
//
//        Car companyCar = new Car(150, 30, 2000, false, "EFG-456", 'B', 3500, 60000);
//        companyCar.changeModel("Fiat");
//        companyCar.changeMaxFuel(150);
//        companyCar.fuelUp();
//        companyCar.changeConsumption(10);
//        companyCar.printMainAttributes();
//        companyCar.travel(20);
//        companyCar.printMainAttributes();
//
//        Car audi = new Car();
//        audi.changeModel("audi");
//        audi.fuelUp();
//        audi.changeConsumption(20);
//        
//        audi.printMainAttributes();
//        audi.travel(3);
//        audi.printMainAttributes();
//        audi.travel(3);
//        audi.printMainAttributes();

        Car testAuto = new Car();
//        testAuto.getIn();
        testAuto.changeMaxPassengers(9);
        testAuto.printMainAttributes();
        testAuto.getIn(3);
        testAuto.printMainAttributes();
        testAuto.getIn(3);
        testAuto.printMainAttributes();
        testAuto.getIn();
        testAuto.printMainAttributes();
        testAuto.getOut();
        testAuto.printMainAttributes();
        testAuto.getOut(2);
        testAuto.printMainAttributes();
        testAuto.getOut(2);
        testAuto.printMainAttributes();
        testAuto.getOut(2);
        testAuto.getOut();
        testAuto.printMainAttributes();
        testAuto.getOut(2);
        testAuto.printMainAttributes();
//  while loop      
//int x = 4;
//     
//     while (x > 0) {
//         System.out.println("Value of x: " + x);
//         x--;
//     }
//      System.out.println("Value of x after while loop : " + x);
//    }
//int y = 6;
//do {
//    System.out.println("Value of y is: " + y);
//    y--;
// 
//        Loops testLoop = new Loops();
//        testLoop.testWhileLoop();
//        Loops.testWhileLoop();
//        Loops.testDoWhileLoop();
//        Loops.testForLoop();
//        Loops.testDoubleForLoop();
        Loops.testMultiplicationTable();
    }
}

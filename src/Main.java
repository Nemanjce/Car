import Person.Person;
import Person.Student;
import Person.Teacher;
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

//        Car testAuto = new Car();
//        testAuto.getIn();
//        testAuto.changeMaxPassengers(9);
//        testAuto.printMainAttributes();
//        testAuto.getIn(3);
//        testAuto.printMainAttributes();
//        testAuto.getIn(3);
//        testAuto.printMainAttributes();
//        testAuto.getIn();
//        testAuto.printMainAttributes();
//        testAuto.getOut();
//        testAuto.printMainAttributes();
//        testAuto.getOut(2);
//        testAuto.printMainAttributes();
//        testAuto.getOut(2);
//        testAuto.printMainAttributes();
//        testAuto.getOut(2);
//        testAuto.getOut();
//        testAuto.printMainAttributes();
//        testAuto.getOut(2);
//        testAuto.printMainAttributes();

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

//        Loops.testMultiplicationTable();

        Person p1 = new Person();
        p1.showData();
        p1.setName("Neparametar");
        p1.setSurname("Nepar");
        p1.setJmbg("1234567777777777891123");
        p1.showData();

        Person p2 = new Person("Parametarr", "Parametarizovic", "72727277222");
        p2.showData();
        
        Student studentJovan = new Student("Jovan", "Jovanovic", "3433");
        studentJovan.serCurrentYear(4);
        studentJovan.setIndexNumber("gg-sss22");
        studentJovan.showData();
        
        Student studentMarija = new Student("Marija", "Makic    ", "666666", "oas=123", 2);
        studentMarija.showData();
        
        Teacher teacherMil = new Teacher("Mil", "Mill", "kbfvf885");
        teacherMil.setMainSubject("QA");
        teacherMil.setTeachinYears(7);
        teacherMil.showData();
        
    }
}

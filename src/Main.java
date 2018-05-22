
public class Main {

    
    public static void main(String[] args) {
        
        Car myCar = new Car();
        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed);
        System.out.println(myCar.condition);
        System.out.println(myCar.currentPrice);
        System.out.println(myCar.license);
        System.out.println(myCar.minSpeed);
        System.out.println(myCar.weight);




        
        Car companyCar = new Car(150, 30 , 2000, false, "EFG-456",'B',3500, 6000);
        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed);
        
    }
    
}


public class Car {

    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    ;
    String license = "ABC-123";
    char condition = 'A';
    double currentPrice = 3000;
    int mileagePassed = 50000;

    String model;
    int maxFuel;
    int currentFuel;
    int consumption;

    int currentPassengers;
    int maxPassengers;

    public Car() {
        this.model = "default";
        this.currentFuel = 0;
        this.maxFuel = 100;
        this.currentPassengers = 1;
        this.maxPassengers = 5;
    }

    public Car(int maxSpeed, int minSpeed, double weight, boolean isTheCarOn,
            String license, char condition, double currentPrice, int mileagePassed) {
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.weight = weight;
        this.isTheCarOn = isTheCarOn;
        this.license = license;
        this.condition = condition;
        this.currentPrice = currentPrice;
        this.mileagePassed = mileagePassed;

    }

    public void printMainAttributes() {
        System.out.println("Model " + this.model);
        System.out.println("Kapacitet rezervoara je: " + this.maxFuel);
        System.out.println("Trenutno gorivo: " + this.currentFuel);
        System.out.println("Predjena kilometraza: " + this.mileagePassed);
//        System.out.println("Trenutno putnika: " + this.currentPassengers);
//        System.out.println("Ukupno putnika: " + this.maxPassengers);
        System.out.println("Trenutno putnika: " + this.currentPassengers + " ,Maksimalno : " + this.maxPassengers);
        System.out.println();
    }

    public void printAttributes() {
        System.out.println("Maksimalna brzina je: " + this.maxSpeed);
        System.out.println("Minimalna brzina je: " + this.minSpeed);
        System.out.println("Registracioni broj je: " + this.license);
        System.out.println("Tezina je: " + this.weight);
        System.out.println("Predjena kilometraza: " + this.mileagePassed);

    }

    public void changeModel(String customModel) {
        this.model = customModel;
    }

    public void changeMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }

    public void fuelUp() {
        this.currentFuel = this.maxFuel;
    }

    public void changeConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }

    public void travel(int distance) {

        if (this.currentFuel > distance * this.consumption) {
            this.mileagePassed = this.mileagePassed + distance;
            this.currentFuel = this.currentFuel - distance * this.consumption;
            System.out.println("Putovali ste " + distance);
        } else {
            System.out.println("Nema dovoljno goriva");
        }

    }

    
    public void getIn(){ 
if(this.currentPassengers < this.maxPassengers) {
    this.currentPassengers = this.currentPassengers + 1;}
  System.out.println("Usla je jedna osoba, trenutno putnika " );
  else {System.out.println("Trenutno nema mesta");}
} 

// da li ima mesta u automobilu
// ako ima (true)
//      povecaj za 1
//  ispisi poruku da je neku usao
// ako nema mesta ( false)
// ISPISI poruku da nema mesta


this.currentPassengers = this.currentPassengers + 1;
    }

public void getOut(){
// da li ima putnika u automobilu
// ako ima (true)
//      neka izadje 1

//  ispisi poruku da je neku izasao
//
//  

this.currentPassengers = this.currentPassengers - 1}

    
    
    
    
}




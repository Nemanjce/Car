
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
    int numberOfPassengers;

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

    public void changenumberOfPassengers(int changenumberOfPassengers) {
        this.numberOfPassengers = changenumberOfPassengers;
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

    public void getIn() {
// da li ima mesta u automobilu
// ako ima (true)
// povecaj za 1
//  ispisi poruku da je neku usao
// ako nema mesta ( false)
// ISPISI poruku da nema mesta
        if (this.currentPassengers < this.maxPassengers) {
            this.currentPassengers = this.currentPassengers + 1;
            System.out.println("Usla je jedna ooba, trenutno putnika: " + this.currentPassengers);
        } else {
            System.out.println("Nema vise mesta.");
        }
    }

    public void getOut() {
// da li ima putnika u automobilu
// ako ima (true)
//      neka izadje 1
// ako nema (false)
//  ispisi poruku da je nema vise putnika
        if (this.currentPassengers > 0) {
            this.currentPassengers = this.currentPassengers - 1;
            System.out.println("Jedan putnik je izasao, trenutno putnika: " + this.currentPassengers);
        } else {
            System.out.println("Nema vise putnika.");
        }
    }

    public void getIn(int numberOfPassengers) {
        if(this.currentPassengers < this.maxPassengers - this.numberOfPassengers) {
            this.currentPassengers = this.currentPassengers + this.numberOfPassengers;
            System.out.println("Broj osoba koji je usao, trenutno putnika: " + this.numberOfPassengers);
        }
        System.out.println("Trenutno putnika: " + this.numberOfPassengers + this.currentPassengers);
//    }else {
//            System.out.println("Nema vise mesta.");
//    }
}

//    public void getOut(int numberOfPassengers) {
//        if (this.currentPassengers > 0) {
//            this.currentPassengers = this.currentPassengers - this.numberOfPassengers;
//            System.out.println("Broj putnika koji je izasao, trenutno putnika: " + this.currentPassengers);
//        } else {
//            System.out.println("Nema vise putnika.");
//        }
//    }

}
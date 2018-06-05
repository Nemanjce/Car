package Person;

public class Teacher extends Person {

    private String mainSubject;
    private int teachinYears;

    private String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    private int getTeachingYears() {
        return teachinYears;
    }

    public void setTeachinYears(int teachinYears) {
        this.teachinYears = teachinYears;
    }

    public Teacher(String name, String surname, String jmbg) {
        super(name, surname, jmbg);
    }

    
    public Teacher(String name, String surname, String jmbg, String mainSubject, int teachinYears) {
        super(name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.teachinYears = teachinYears;
    }
  
    @Override
    public void showData() {

        System.out.println("Glavni predmet : " + getMainSubject());
        System.out.println("Godine predavanja : " + getTeachingYears());
        super.showData();
    }
    
}
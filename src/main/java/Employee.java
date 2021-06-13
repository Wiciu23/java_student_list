import java.util.Scanner;

public class Employee implements Measure{
    private double salary =0;
    private String imie ="";
    private String nazwisko = "";
    private int wiek =0;

    public Employee(String imie,String nazwisko, double salary){
        this.salary = salary;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = 0;
    }

    public void setWiek() throws IllegalArgumentException{
        System.out.println("Podaj wiek: ");
        Scanner in = new Scanner(System.in);
        this.wiek = in.nextInt();
        if(wiek<0) {
            throw new IllegalArgumentException(){
            };
        }
    }

    public int getWiek(){
            int wiek = this.wiek;
            return wiek;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

}

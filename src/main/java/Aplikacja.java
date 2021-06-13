import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Aplikacja {
    public static void main(String[] args){

        Employee[] pracownicy = new Employee[2];
        pracownicy[0] = new Employee("Paweł","Anonim",11000);
        pracownicy[1] = new Employee("Łukasz","Anonim",8000);
        try{
        pracownicy[0].setWiek();
    }catch (IllegalArgumentException ex){
            System.out.println("Wiek nie może być mniejszy od 0 :)");
        }

        try{
            pracownicy[1].setWiek();
        }catch (IllegalArgumentException ex){
            System.out.println("Wiek nie może być mniejszy od 0 :)");
        }

        System.out.println(pracownicy[0].getWiek());
        System.out.println(pracownicy[1].getWiek());


        System.out.println(average(pracownicy));
        /*

        try { System.out.println(average(pracownicy));
        }catch (NullPointerException ex){
            System.out.println("Nie można obliczyć średniej gdyż, zmienna odwołuje się do null ");
        }
         */
}

    public static double average(Measure[] pracownicy) {
        double average = 0;
        for (Measure a:pracownicy
             ) {
            average += a.getMeasure();
        }
        return average/pracownicy.length;
    }
}



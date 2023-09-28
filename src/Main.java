import java.math.BigDecimal;
import java.net.InetAddress;
import java.time.LocalDate;

public class Main {


    public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {
        BigDecimal cena = BigDecimal.ZERO; // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (double i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
            // operátor "+=" znamená: přičti ke stávající
            // hodnotě navíc 0.1
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.ZERO;
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        String vykonMotoru = "120";
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " +velikostKosile+ ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");

        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();


        String name = "Karel Dvořák";
        LocalDate birthday = LocalDate.of(1988,9,5);
        int contract = 5;  // hodnoty zapasány v promené int , protže nešlo mi zapsat dělení proměných BigDecimal !
        int carrot = 25;   // celoká prodej v tunách
        String city = "Litomyšl";
        String spz = "5E3 4987";
        BigDecimal vehicleConsumption = BigDecimal.valueOf(45.5);
        String IP = "192.168.147.145";
        int diameter = carrot / contract; // hodnoty zapasány v promené int , protže nešlo mi zapsat dělení proměných BigDecimal ! Dale mam pořad problem s zapsaním nove třidy nebo spiše tomu nerozumi


        System.out.println("Na jednu uzavřenou smlouvy vychází " +diameter+ "t prodané mrkve.");

    }


}


package nomer2;

public class main {
    public static void main(String[] args) {
        MobilSport mobilSport = new MobilSport();
        MobilSedan mobilSedan = new MobilSedan();

        mobilSport.nyalakan_mesin();
        mobilSport.matikan_mesin();
        System.out.println();

        mobilSedan.nyalakan_mesin();
        mobilSedan.matikan_mesin();
    }
}

package Soal2;
public interface Booking {
    void book(int userAge, int duration);
    double calculateCost(int duration);
    double getPricePerDay();
}

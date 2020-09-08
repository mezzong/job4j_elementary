package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int numPassengers) {
        System.out.println("Количество пассажиров: " + numPassengers);
    }

    @Override
    public double fillUp(double fuel) {
        return fuel * 40;
    }
}

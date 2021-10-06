package model;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Order {
    private LocalDate checkin;
    private LocalDate checkout;
    private Customers customers;
    private Room room;


    public Order() {
    }

    public Order(LocalDate checkin, LocalDate checkout, Customers customers, Room room) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.customers = customers;
        this.room = room;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
        this.room.setStatus(false);
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
        this.room.setStatus(true);
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public long getBill() {
        long result;

        long numberOfDay = DAYS.between(checkin,checkout);

        int price = room.getPrice();

        result = numberOfDay * price;
        return result;
    }
}

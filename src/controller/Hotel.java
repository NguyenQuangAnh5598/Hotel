package controller;

import model.Customers;
import model.Order;
import model.Room;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Customers> customersList = new ArrayList<>();
    ArrayList<Room> roomList = new ArrayList<>();
    ArrayList<Order> orderList = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(ArrayList<Customers> customersList, ArrayList<Room> roomList) {
        this.customersList = customersList;
        this.roomList = roomList;
    }

    public void addNewRoom(Room room) {
        roomList.add(room);
    }

    public long getTotalIncome() {
        long total = 0;
        for (Order order : orderList) {
            total += order.getBill();
        }
        return total;
    }

    public ArrayList<Customers> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(ArrayList<Customers> customersList) {
        this.customersList = customersList;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
}

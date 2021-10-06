package view;

import controller.Hotel;
import model.Customers;
import model.Order;
import model.Room;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customers> customersList = new ArrayList<>();
        customersList.add(new Customers("Quang Anh","5/5/98","1"));
        customersList.add(new Customers("Anh","5/6/98","2"));
        customersList.add(new Customers("Quang","5/7/98","3"));

        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(new Room("1","A",1000,true));
        roomList.add(new Room("2","B",500,true));
        roomList.add(new Room("3","C",1100,true));

        Hotel hotel = new Hotel(customersList,roomList);

        ArrayList<Order> order = new ArrayList<>();
        order.add(new Order(LocalDate.of(2021,10,1),LocalDate.of(2021,10,5),customersList.get(1),roomList.get(1)));
       hotel.setOrderList(order);
        order.add(new Order(LocalDate.of(2021,10,1),LocalDate.of(2021,10,3),customersList.get(0),roomList.get(0)));
        System.out.println(hotel.getTotalIncome());
    }
}

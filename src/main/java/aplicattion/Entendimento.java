package aplicattion;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Entendimento {

    public static void main(String[]args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Client client = new Client("Jackson Ricardo Wippel", "jrwippel@hotmail.com", sdf.parse("10/10/1979"));

        Order order = new Order(new Date(), OrderStatus.valueOf("PROCESSING"), client);

        Product product = new Product("SMARTHPHONE", 100.00);
        Product product1 = new Product("TV SAMSUNG", 1500.00);

        OrderItem orderItem = new OrderItem(2, 100.00, product);
        OrderItem orderItem1 = new OrderItem(1, 1500.00, product1);

        order.addItem(orderItem);
        order.addItem(orderItem1);

        System.out.println(order);

    }
}

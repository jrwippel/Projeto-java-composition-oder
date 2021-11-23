package aplicattion;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name:");
        String nameClient = sc.nextLine();
        System.out.print("email:");
        String emailClient = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date dateBirth = sdf.parse(sc.next());

        Client client = new Client(nameClient, emailClient, dateBirth);

        System.out.print("Enter order data:");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Date dateOrder = new Date();
        Order order = new Order(dateOrder, status, client);


        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i=0;i<n;++i){
            System.out.println("Enter #"+ (i + 1) +"item data:");
            System.out.print("Product name:");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price:");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);
            System.out.print("Quantity:");
            int productQuantity = sc.nextInt();
            OrderItem orderItem = new OrderItem (productQuantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.print("ORDER SUMMARY:");


        System.out.println(order);


        sc.close();

    }


}

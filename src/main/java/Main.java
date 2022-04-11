import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Pavel", "Sokolov", 101);
        Customer customer2 = new Customer(2, "ilya", "Malauka", 102);
        Customer customer3 = new Customer(3, "Serega", "Polovets", 103);
        Customer customer4 = new Customer(4, "Bob", "Bobich", 104);
        ArrayList<Customer> customers= new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        Collections.sort(customers);
        System.out.println(customers);
        ArrayList<Customer> cardID= new ArrayList<>();
       customers.forEach(customer -> {
           if(customer.getCreditCard()> 102 && customer.getCreditCard()<104){
               cardID.add(customer);
           }


       });
        System.out.println(cardID); }


        }





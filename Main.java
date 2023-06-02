import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        Scanner scan = new Scanner(System.in);

        //Tworzę pizze capri wraz z jej kosztami w zalezności od wielkości:
        Double[] capriCosts = {25.00, 30.00, 35.00};
        String[] caprin = {"pieczarki", "szynka", "sos", "ser"};
        Pizza capri = new Pizza("Capriciosa", caprin, 1, capriCosts);

        Double[] vegeCosts = {25.00, 30.00, 35.00};
        String[] vegein = {"pieczarki", "szynka", "sos", "ser"};
        Pizza vege = new Pizza("wegetariańska", vegein, 0, vegeCosts);

        Double[] pepeCosts = {30.00, 35.00, 40.00};
        String[] pepein = {"salami", "papryka", "sos", "ser"};
        Pizza pepe = new Pizza("Peperoni", pepein, 0, pepeCosts);

        //Tworzę listę menu i dodaje do niej utworzone pizze:
        List<Pizza> pizzaList = new ArrayList<Pizza>();
        pizzaList.add(capri);
        pizzaList.add(vege);
        pizzaList.add(pepe);
        Menu menu = new Menu(pizzaList);

        System.out.println("Pizzeria");
        System.out.println("kreator pizzy - 1.");
        System.out.println("kreator zamówienia - 2.");
        System.out.println("koniec - 3.");
        int wybor = scan.nextInt();
        switch (wybor) {
            case 1:
                System.out.println("Kreator pizzy rozpoczęty.");
                menu.addToMenu();
                System.out.println(menu.getPizzaList());
                System.out.println("twoja pizza znajduję się końcu menu:");
//                order.makeOrder(menu.getPizzaList());
                System.out.println("Czy chciałbyś porządzić zamówienie?");
                System.out.println("Tak - 1");
                System.out.println("Nie - 2");
                wybor = scan.nextInt();
                if (wybor == 1) {
                    System.out.println("Kreator zamówienia rozpączęty.");
                    System.out.println("Złóż zamówienie.");
                    order.makeOrder(menu.getPizzaList());
                    System.out.println("Czy doliczamy dowóz 7 zł?");
                    System.out.println("Tak - 1");
                    System.out.println("Nie - 2");
                    wybor = scan.nextInt();
                    if (wybor == 1) {
                        System.out.println("całkowity koszt zamówienia:" + (order.calculateOrderCost() + 7.00));
                    } else if (wybor == 2) {
                        System.out.println("koszt twojego zamówinia: " + order.calculateOrderCost());
                    }
                } else if (wybor == 2) {
                    System.out.println("Kończę program.");
                    break;

                } else {
                    System.out.println("błąd, niepoprawna wartość.");
                }
                break;
            case 2:
                System.out.println("Kreator zamówienia rozpączęty.");
                System.out.println("Złóż zamówienie.");
                order.makeOrder(menu.getPizzaList());
                System.out.println("Czy doliczamy dowóz 7 zł?");
                System.out.println("Tak - 1");
                System.out.println("Nie - 2");
                wybor = scan.nextInt();
                if (wybor == 1) {
                    System.out.println("całkowity koszt zamówienia:" + (order.calculateOrderCost() + 7.00));
                } else if (wybor == 2) {
                    System.out.println("koszt twojego zamówinia: " + order.calculateOrderCost());
                }
                break;
            case 3:
                System.out.println("Wychodzę z programu.");
                break;
            default:
                System.out.println("błąd proszę wybrać poprawną liczbę");
                break;
        }


//        List<Pizza> order = new ArrayList<Pizza>();


//        order.calculateOrderCost();
//        System.out.println(order.getOrderCost());
//        //
//        System.out.println(order.calculateOrderCost());

        //1. Jedna osoba robi zamówienie i zapomniała o czymś i chce jeszcze coś domówić


//        Order order1 = new Order();
//        order1.makeOrder(menu.getPizzaList());
//
//        //Złozył zamówienie
//        //aLE JEST IDIOTĄ I CHCE JESZCZE DOMÓWIĆ COŚ:
//        order1.makeOrder(menu.getPizzaList());
//
//        //Tutaj będzie zamówienie 1 i zamówienie 2 zsumowane:
//        order1.getPizzaList();
//        order1.calculateOrderCost(); // Tutaj jest suma kosztów tych zamówień <-
//
//
//        //Wchodzi klient 1: chce złożyć zamówienie
//        Order order2 = new Order();
//        order2.makeOrder(menu.getPizzaList());
//
//        //Wchodzi w tym czasie albo po nim klient 2 i chce złożyć zamówienie:
//        Order order3 = new Order();
//        order3.makeOrder(menu.getPizzaList());

//        Zamówienie klienta 1 jest w order2.getPizzaList(); i analogicznie zamówienie klienta dwa w order3.getPizzaList();
    }


}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

    private List<Pizza> pizzaList = new ArrayList<>();

    private Double orderCost;

    public Order() {

    }

    public Order(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public Double getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(Double orderCost) {
        this.orderCost = orderCost;
    }

    public List<Pizza> makeOrder(List<Pizza> menu) {
        Scanner scanner = new Scanner(System.in);
        Pizza wybranaPizza = new Pizza();

        System.out.println("Ile Pizz ma się znaleźć na zamówieniu? ");
        int ilosc = scanner.nextInt();

        for (int i = 0; i < ilosc; i++) {
            System.out.println(menu.toString());
            System.out.println("Wybierz pizze " + (i + 1) + " : ");
            int wybor = scanner.nextInt();
            wybranaPizza = menu.get(wybor - 1);

            System.out.println("Podaj wielkość pizzy.");
            System.out.println("MAŁA , 30 CM - 1");
            System.out.println("ŚREDNIA, 40 CM - 2");
            System.out.println("DUŻA, 55 CM - 3");
            wybor = scanner.nextInt();

            if (wybor == 1) {
                wybranaPizza.setSize(Size.SMALL);
            } else if (wybor == 2) {
                wybranaPizza.setSize(Size.MEDIUM);
            } else if (wybor == 3) {
                wybranaPizza.setSize(Size.LARGE);
            } else {
                System.out.println("niepoprawna wartość proszę");

            }

            pizzaList.add(wybranaPizza);
        }

        return pizzaList;
    }

    public Double calculateOrderCost() {
        orderCost = 0.0;
        for (Pizza pizza : pizzaList) {
            orderCost += pizza.calculateCost();
        }
        return orderCost;
    }
}

import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Pizza> pizzaList;

    public Menu(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public List<Pizza> addToMenu() {
        Scanner scan = new Scanner(System.in);
        String[] wielkosci = {"małej", "średniej", "dużej"};

        System.out.println("Podaj nazwe pizzy:");
        String name = scan.nextLine();

        System.out.println("Podaj ostrość pizzy:");
        System.out.println("W skali od 0 - 3");
        System.out.println("0 - ładgodna.");
        System.out.println("1 - Pikanta.");
        System.out.println("2 - ostra.");
        System.out.println("3 - Bardzo ostra.");
        int shu = scan.nextInt();

        Double costs[] = new Double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj Cenę Pizzy " + wielkosci[i]);
            costs[i] = scan.nextDouble();
        }

        System.out.println("Podaj Ilość składników:");
        int ilosc = scan.nextInt();
        String[] skladniki = new String[ilosc + 1];

        System.out.println("Podaj wszystkie składniki jeden po drugim:");
        for (int i = 0; i < ilosc + 1; i++) {
            skladniki[i] = scan.nextLine();
        }


        Pizza newPizza = new Pizza(name, skladniki, shu, costs);
        pizzaList.add(newPizza);

        return pizzaList;
    }

}

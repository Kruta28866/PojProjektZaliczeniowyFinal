import java.util.Arrays;

public class Pizza {
    private String name;
    private String[] ingri;
    private int scaleShu;

    private Size size;

    private Double[] costs;

    private Double pizzaCost;


    public Pizza() {
    }

    public Pizza(String name, String[] ingri, int scaleShu, Double[] costs, Size size) {
        this.name = name;
        this.ingri = ingri;
        this.scaleShu = scaleShu;
        this.costs = costs;
        this.size = size;
        calculateCost();
    }

    public Pizza(String name, String[] ingri, int scaleShu, Double[] costs) {
        this.name = name;
        this.ingri = ingri;
        this.scaleShu = scaleShu;
        this.costs = costs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngri() {
        return ingri;
    }

    public void setIngri(String[] ingri) {
        this.ingri = ingri;
    }

    public int getScaleShu() {
        return scaleShu;
    }

    public void setScaleShu(int scaleShu) {
        this.scaleShu = scaleShu;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Double[] getCosts() {
        return costs;
    }

    public void setCosts(Double[] costs) {
        this.costs = costs;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Nazwa = " + name + '\'' +
                ", Składniki = " + Arrays.toString(ingri) +
                ", Ostrość = " + scaleShu +
                ", Wielkość = " + size +
                ", Koszt m,ś,d = " + Arrays.toString(costs) +
                '}';
    }

    public Double calculateCost() {

        if (size == Size.SMALL) {
            pizzaCost = costs[0];
        } else if (size == Size.MEDIUM) {
            pizzaCost = costs[1];
        } else if (size == Size.LARGE) {
            pizzaCost = costs[2];
        }

        return pizzaCost;
    }
}

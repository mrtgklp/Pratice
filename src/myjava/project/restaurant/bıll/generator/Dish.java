package myjava.project.restaurant.bıll.generator;

public class Dish {
    private int code;
    private String name;
    private double price;

    public Dish(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public Dish() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

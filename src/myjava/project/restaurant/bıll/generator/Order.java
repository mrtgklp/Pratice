package myjava.project.restaurant.bıll.generator;

public class Order {
    public int orderCode;
    public Dish dish;
    public int numberOfDish;
    public double orderPrice;

    public Order(Dish dish, int numberOfDish) {
        this.dish = dish;
        this.numberOfDish = numberOfDish;
    }
    public void setOrderCode(int orderCode){
        this.orderCode=orderCode;
    }
    public void setPrice(){
        this.orderPrice=this.dish.getPrice()*this.numberOfDish;
    }
}

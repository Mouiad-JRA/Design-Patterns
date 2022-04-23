package Mouiad.iterator;

public class Product {
    private String name;
    private float price;
    private float weight;

    public Product(String name, float price, float weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

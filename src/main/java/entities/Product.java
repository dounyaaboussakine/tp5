package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;

    // Constructeur sans arguments
    public Product() {}

    // Constructeur avec paramètres
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter pour id
    public int getId() {
        return id;
    }

    // Setter pour id
    public void setId(int id) {
        this.id = id;
    }

    // Getter pour name
    public String getName() {
        return name;
    }

    // Setter pour name
    public void setName(String name) {
        this.name = name;
    }

    // Getter pour price
    public double getPrice() {
        return price;
    }

    // Setter pour price
    public void setPrice(double price) {
        this.price = price;
    }

    // Méthode toString pour faciliter l'affichage
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

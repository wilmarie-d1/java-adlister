import java.io.Serializable;

public class Product implements Serializable {
private long id;
private double price;
private String title;
private String imgUrl;
private int quantity;

    public Product() {

    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public int getQuantity() {
        return quantity;
    }
}

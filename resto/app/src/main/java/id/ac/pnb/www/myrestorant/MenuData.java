package id.ac.pnb.www.myrestorant;

/**
 * Created by Windows 10 on 03/12/2017.
 */

public class MenuData {
    private String name;
    private String price;

    public MenuData(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

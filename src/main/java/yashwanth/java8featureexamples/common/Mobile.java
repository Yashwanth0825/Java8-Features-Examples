package yashwanth.java8featureexamples.common;

public class Mobile {
    private String company;
    private String model;
    private String color;
    private int storageInGB;

    private int priceInAUDollar;

    public Mobile(String company, String model, String color, int storageInGB, int priceInAUDollar) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.storageInGB = storageInGB;
        this.priceInAUDollar = priceInAUDollar;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorageInGB() {
        return storageInGB;
    }

    public void setStorageInGB(int storageInGB) {
        this.storageInGB = storageInGB;
    }

    public int getPriceInAUDollar() {
        return priceInAUDollar;
    }

    public void setPriceInAUDollar(int priceInAUDollar) {
        this.priceInAUDollar = priceInAUDollar;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", storageInGB=" + storageInGB +
                ", priceInAUDollar=" + priceInAUDollar +
                '}';
    }
}

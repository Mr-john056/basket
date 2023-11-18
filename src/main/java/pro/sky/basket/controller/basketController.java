package pro.sky.basket.controller;

import java.util.Objects;

public class basketController {
    private final int id;
    private final String nameOfProduct;
    private final int price;

    public basketController(int id, String nameOfProduct, int price) {
        this.id = id;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        basketController that = (basketController) o;
        return id == that.id && price == that.price && Objects.equals(nameOfProduct, that.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfProduct, price);
    }

    @Override
    public String toString() {
        return "basketController{" +
                "id=" + id +
                ", Наименование товара:'" + nameOfProduct + '\'' +
                ", Цена:" + price +
                '}';
    }

}

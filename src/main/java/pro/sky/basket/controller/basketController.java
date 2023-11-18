package pro.sky.basket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.basket.service.basketService;
import java.lang.Integer;

import java.util.Objects;

@Service
public class basketController {
    private final Integer id;
    private final String nameOfProduct;
    private final Integer price;
    private basketService service;

    public basketController(Integer id, String nameOfProduct, Integer price) {
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

    @GetMapping("/store/order/add")
    public basketController addBasketController(@RequestParam int id,
                                                @RequestParam String nameOfProduct,
                                                @RequestParam int price)
    {return service.add(id, nameOfProduct, price);
    }
}


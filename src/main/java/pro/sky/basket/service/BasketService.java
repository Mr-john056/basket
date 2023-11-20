package pro.sky.basket.service;

import org.springframework.stereotype.Service;
import pro.sky.basket.controller.BasketController;
import pro.sky.basket.exception.BadRequestExceptions;

import java.util.HashMap;
import java.util.List;

@Service

public abstract class BasketService {
    public abstract String add(String ids) throws BadRequestExceptions;

    public abstract HashMap<Integer, Integer> get();

    public abstract BasketController add(int id, String nameOfProduct, int price);

    public abstract BasketServiceImpl addProduct(int id);

    public abstract List<Integer> getBasketInfo();
}

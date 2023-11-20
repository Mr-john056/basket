package pro.sky.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.basket.service.BasketService;
import pro.sky.basket.service.BasketServiceImpl;

import java.lang.Integer;
import java.util.List;


@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public BasketServiceImpl addProduct(@RequestParam int id) {
        return basketService.addProduct(id);
    }

    @GetMapping("/get")
    public List<Integer> getBasket() {
        return basketService.getBasketInfo();
    }
}


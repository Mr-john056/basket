package pro.sky.basket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.basket.controller.basketController;
import pro.sky.basket.exception.badRequestException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
@SessionScope
public class basketServiceImpl extends basketService {

    private final HashMap<Integer, Integer> items = new HashMap<>();

    @Override
    public String add(String ids) throws badRequestException {
        try {
            List<Integer> parsed = Arrays.stream(ids.split(",")).map(Integer::parseInt).collect(Collectors.toList());
            for (Integer id : parsed) {
                addItem(id);
            }
            return "Ок";
        } catch (Exception e) {
            throw new badRequestException();
        }
    }
    private void addItem(Integer id) {
        int count = items.getOrDefault(id, 0) + 1;
        items.put(id, count);
    }

    @Override
    public HashMap<Integer, Integer> get() {
        return items;
    }

    @Override
    public basketController add(int id, String nameOfProduct, int price) {
        return null;
    }

}

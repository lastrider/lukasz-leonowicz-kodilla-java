package com.kodilla.patterns2.facade;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ShopService {
    private final List<Order> orders = new ArrayList<>();

    @Autowired
    private Authenticator authenticator;

    @Autowired
    private ProductService productService;

    public Long openOrder(Long userId) {
        if (authenticator.isAuthenticated(userId)) {
            Long maxOrder = (long) orders.stream()
                    .mapToInt(order -> order.getOrderId().intValue())
                    .max().orElse(0);
            orders.add(new Order(maxOrder + 1, userId, productService));
            return maxOrder + 1;
        } else {
            return -1L;
        }
    }

    public void addItem(long orderId, Long productId, double qty) {
        orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .forEach(order -> order.getItems().add(new Item(productId, qty)));
    }

    public boolean removeItem(Long orderId, Long productId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();

        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            int orderSize = theOrder.getItems().size();
            for (int n = 0; n < theOrder.getItems().size(); n++) {
                if (theOrder.getItems().get(n).getProductId().equals(productId)) {
                    theOrder.getItems().remove(n);
                    return true;
                }
            }
        }
        return false;
    }

    public BigDecimal calculateValue (Long orderId){
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getItems().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            return theOrder.calculateValue();
        }
        return BigDecimal.ZERO;
    }
}

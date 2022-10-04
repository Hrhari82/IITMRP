package com.example.ECommerceMicroservice2.Utilities;
import java.math.BigDecimal;
import java.util.List;

import com.example.ECommerceMicroservice2.Domain.Item;



public class OrderUtilities {

    public static BigDecimal countTotalPrice(List<Item> cart){
        BigDecimal total = BigDecimal.ZERO;
        for(int i = 0; i < cart.size(); i++){
            total = total.add(cart.get(i).getSubTotal());
        }
        return total;
    }
}
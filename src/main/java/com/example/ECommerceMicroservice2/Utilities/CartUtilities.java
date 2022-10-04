package com.example.ECommerceMicroservice2.Utilities;
import java.math.BigDecimal;

import com.example.ECommerceMicroservice2.Domain.Product;



public class CartUtilities {

    public static BigDecimal getSubTotalForItem(Product product, int quantity){
       return (product.getPrice()).multiply(BigDecimal.valueOf(quantity));
    }
}
package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Map;
import java.util.Set;

public interface Supplier {

   String getNameSupplier();
   Set<Map.Entry<String, Integer>> getProducts();

}

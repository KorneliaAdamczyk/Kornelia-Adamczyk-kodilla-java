package com.kodilla.good.patterns.challenges;

public class SaleRequestRetriever {

    public SaleRequest retriever (String name, int quantity){

        User user = new User ("Adam", "Kowalski", "adam.kowalski@gmail.com");
        Product product = new Product(name, "\n" +
                "    Termoobieg 3D Plus: doskonałe rezultaty pieczenia.\n" +
                "    Klasa efektywności energetycznej A: doskonałe pieczenie przy niskim zużyciu energii.\n" +
                "    Zawias drzwi u dołu: wygodne otwieranie i zamykanie piekarnika\n" +
                "    Szybkie nagrzewanie: nagrzewa do 30% szybciej zużywając tyle samo energii\n",quantity);

        return new SaleRequest(user, product);
    }
}

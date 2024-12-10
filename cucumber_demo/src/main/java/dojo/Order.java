package dojo;

import java.util.ArrayList;
import java.util.List;

class Order {

    private String owner;
    private String target;
    private List<String> cocktails;

    public Order() {
        this.cocktails = new ArrayList<>();
    }

    void declareOwner(String romeo) {
        this.owner = romeo;
    }

    void declareTarget(String juliette) {
        this.target = juliette;
    }

    List<String> getCocktails() {
        return this.cocktails;
    }

}

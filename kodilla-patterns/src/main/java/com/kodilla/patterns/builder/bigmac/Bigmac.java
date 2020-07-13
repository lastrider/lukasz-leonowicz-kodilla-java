package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private boolean bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients = new ArrayList<>();

    private Bigmac(boolean bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public boolean isBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {
        private boolean bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(boolean bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce == "standard" || sauce == "1000 islands" || sauce == "barbecue") {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalArgumentException("Wrong sauce");
            }
        }

        public BigmacBuilder ingredients(String ingredients) {
            if (ingredients == "lettuce" || ingredients == "onions" || ingredients == "bacon" ||
                    ingredients == "cucumber" || ingredients == "chili peppers" || ingredients == "mushrooms" ||
                    ingredients == "shrimps" || ingredients == "cheese") {
                this.ingredients.add(ingredients);
                return this;
            } else {
                throw new IllegalArgumentException("Wrong ingredients");
            }
        }

        public Bigmac build() throws Exception {

            if (sauce != null && burgers > 0 && ingredients.size() > 0) {
                return new Bigmac(bun, burgers, sauce, ingredients);
            } else {
                throw new Exception("Incomplete burger");
            }
        }
    }
}
package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {
    private boolean bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

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
        private String[] list = {"lettuce", "onions", "bacon", "cucumber", "shrimps", "cheese", "mushrooms", "chili peppers"};
        private List<String> ingredientList = Arrays.asList(list);

        public BigmacBuilder bun(boolean bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals("standard") || sauce.equals("1000 islands") || sauce.equals("barbecue")) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalArgumentException("Wrong sauce");
            }
        }

        public BigmacBuilder ingredients(String ingredients) {
            if (ingredientList.contains(ingredients)) {
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
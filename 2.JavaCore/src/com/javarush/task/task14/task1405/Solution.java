package com.javarush.task.task14.task1405;

/* 
Food
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;
        Drink drink = new Drink();
        Food drink1 = new Drink();
        Food asd = new Drink();
        Food food1 = new Drink();
        Drink fgh = (Drink) food1;





/*        foodMethods(newFood);
        selectableMethods(newFood);
        System.out.println(food instanceof Food);
        System.out.println(food instanceof Selectable);
        System.out.println(newFood instanceof Food);
        System.out.println(newFood instanceof Selectable);
        System.out.println(selectable instanceof Food);
        System.out.println(selectable instanceof Selectable);*/
    }

    public static void foodMethods(Food food) {
        //тут добавьте вызов методов для переменной food
        food.onEat();
        food.onSelect();
    }

    public static void selectableMethods(Selectable selectable) {
        //тут добавьте вызов методов для переменной selectable
        selectable.onSelect();

    }

    public static void drinkMethods(Drink drink) {
        drink.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }

    static class Drink extends Food  {
/*        @Override
        public void onEat() {
            System.out.println("The food was drunk");
        }*/

        @Override
        public void onSelect() {
            System.out.println("The drink was selected");
        }
        public void onlyDrinkM(){
            System.out.println("Only drink");
        }
    }
}

package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.RUSSIA);
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals("Ukraine")) {
                hen = new UkrainianHen();
            } else if (country.equals("Russia")) {
                hen = new RussianHen();
            } else if (country.equals("Moldova")) {
                hen = new MoldovanHen();
            } else if (country.equals("Belarus")) {
                hen = new BelarusianHen();
            }
            return hen;
        }
    }
/*package com.javarush.task.task14.task1408;

    public interface Country {
        String UKRAINE = "Ukraine";
        String RUSSIA = "Russia";
        String MOLDOVA = "Moldova";
        String BELARUS = "Belarus";
    }*/


}

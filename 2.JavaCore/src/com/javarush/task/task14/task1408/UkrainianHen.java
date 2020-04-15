package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        String c = String.format("%s Моя страна - %s. Я несу %d яиц в месяц.",super.getDescription(),Country.UKRAINE,getCountOfEggsPerMonth());
        return c ;
    }

    //Я - курица. Моя страна - Ukraine. Я несу 5 яиц в месяц.
    //Я - курица. Моя страна - Russia. Я несу 100 яиц в месяц
}

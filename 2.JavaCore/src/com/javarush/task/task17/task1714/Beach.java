package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach first = new Beach("first", 12.2f, 11);
        Beach second = new Beach("first", 12.4f, 12);
        System.out.println(first.compareTo(second));
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int res = 0;
        int firstQuality = this.getQuality();
        int secondQuality = o.getQuality();
        if (firstQuality > secondQuality) {
            res = res + 2;
        } else if (firstQuality == secondQuality) {

        } else {
            res = res - 2;
        }

        float firstDistance = this.getDistance();
        float secondDistance = o.getDistance();
        if (firstDistance > secondDistance) {
            res = res + 1;
        } else if (firstDistance == secondDistance) {

        } else
            res = res - 1;
        return res;
    }
}

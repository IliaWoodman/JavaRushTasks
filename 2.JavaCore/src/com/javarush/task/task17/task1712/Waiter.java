package com.javarush.task.task17.task1712;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        Manager manager = Manager.getInstance(); // создем менеджера

        while (continueWorking || !manager.getDishesQueue().isEmpty()) { // работать пока тру или очередь не пуста
            if (!manager.getDishesQueue().isEmpty()) {       //относим готовый заказ
                Dishes dishes = manager.getDishesQueue().poll();//получить элемент из начала и удалить его из очереди
                System.out.println("Официант отнес заказ для стола №" + dishes.getTableNumber());
            } else {                                         //берем новый заказ
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("Получен заказ от стола №" + order.getTableNumber());
                manager.getOrderQueue().add(order);
            }
            try {
                Thread.sleep(100);  //walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}

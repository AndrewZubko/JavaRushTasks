package com.javarush.task.task17.task1712;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        Manager manager = Manager.getInstance(); //создание менеджера1

        while (continueWorking || !manager.getDishesQueue().isEmpty()) { //Продолжает работать или есть готовые блюда чтобы отнести
            if (!manager.getDishesQueue().isEmpty()) {       //относим готовый заказ, если список не пустой
                Dishes dishes = manager.getDishesQueue().poll(); //создаёт блюдо из головы очереди
                System.out.println("Официант отнес заказ для стола №" + dishes.getTableNumber());
            } else {                                         //берем новый заказ
                Table table = manager.getNextTable(); // подходим к столу
                Order order = table.getOrder(); //берём заказ у этого стола
                System.out.println("Получен заказ от стола №" + order.getTableNumber());
                manager.getOrderQueue().add(order); //добавляем заказа в списко
            }
            try {
                Thread.sleep(100);  //walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}

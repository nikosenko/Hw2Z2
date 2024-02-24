public class Main {
    public static void main(String[] args) {

        int initialAccount = 100; //начальный счет
        int replenishAccount = 1000; //сумма пополнения
        int stepBonus = 100;//шаг начисления бонуса
        int bonus;
        if (replenishAccount >= 1000) {
            bonus = replenishAccount / stepBonus;
        } else {
            bonus = 0;
        }
        int totalAmount = initialAccount + replenishAccount + bonus;//общий счет

        System.out.println("Баланс " + totalAmount + " руб.");
        System.out.println("Счет пополнен на  " + replenishAccount + " руб.");
        System.out.println("Бонус составил " + bonus + " руб.");
    }
}
public class Main {
    public static void main(String[] args) {

        int initialAccount = 100; //начальный счет
        int replenishAccount = 111; //клиент попполнил счет на
        int bonus = (replenishAccount / 100);//количество бонусв
        int finalScore = (initialAccount + replenishAccount);//итоговый счет
        if (replenishAccount >= 1000) {
            System.out.println("Итоговый счет:");
            System.out.println(finalScore);
            System.out.println("Количество бонусов:");
            System.out.println(replenishAccount);
        } else {
            System.out.println("Итоговый счет:");
            System.out.println(finalScore);
            System.out.println("Количество бонусов:");
            System.out.println("0");
        }

    }
}
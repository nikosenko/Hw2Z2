public class Main {
    public static void main(String[] args) {

        int n = 100; //начальный счет
        int p = 5; //клиент попполнил счет на
        int b = p / 100; //количество бонусв
        int m = (n + p); //итоговый счет
        if (p >= 1000) {
            System.out.println("Итоговый счет:");
            System.out.println(m);
            System.out.println("Количество бонусов:");
            System.out.println(b);
        } else {
            System.out.println("Итоговый счет:");
            System.out.println(m);
            System.out.println("Количество бонусов:");
            System.out.println("0");
        }

    }
}
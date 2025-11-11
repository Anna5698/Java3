public class main {
    public static void main(String[] args) {
        // Исходные данные
        int initialBalance = 100;  // начальный счёт клиента
        int refillAmount = 1100;   // сумма пополнения

        // Логика расчёта
        int bonus = 0;
        if (refillAmount > 1000) {
            bonus = refillAmount / 100;
        }
        int finalBalance = initialBalance + refillAmount + bonus;

        // Вывод результата
        System.out.println("Итоговый счёт: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}

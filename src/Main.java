public class Main {
    public static void main(String[] args) {
        int NachShchet = 50;
        int sum = 1100;
        int bonus = 0;
        int ItogSchet = 0;

        if (sum >= 1000) {
            bonus = sum / 100;
        }
        ItogSchet = NachShchet + bonus + sum;
        System.out.println("Итоговый счет: " + ItogSchet + ". Ваши бонусные рубли: " + bonus);
    }
}

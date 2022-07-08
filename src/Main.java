public class Main {
    public static void main(String[] args) {
        int nachShchet = 50;
        int sum = 1100;
        int bonus = 0;
        int itogSchet = 0;

        if (sum >= 1000) {
            bonus = sum / 100;
        }
        itogSchet = nachShchet + bonus + sum;
        System.out.println("Итоговый счет: " + itogSchet + ". Ваши бонусные рубли: " + bonus);
    }
}

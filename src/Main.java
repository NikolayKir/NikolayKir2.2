public class Main {
    public static void main(String[] args) {
        int nachshchet = 50;
        int sum = 1100;
        int bonus = 0;
        int itogschet = 0;

        if (sum >= 1000) {
            bonus = sum / 100;
        }
        itogschet = nachshchet + bonus + sum;
        System.out.println("Итоговый счет: " + itogschet + ". Ваши бонусные рубли: " + bonus);
    }
}

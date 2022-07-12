public class Main {
    public static void main(String[] args) {
        int startingScore = 50;
        int price = 1100;
        int bonus = 0;
        int finalScore = 0;

        if (price >= 1000) {
            bonus = price / 100;
        }
        itogSchet = startingScore + bonus + price;
        System.out.println("Итоговый счет: " + finalScore + ". Ваши бонусные рубли: " + bonus);
    }
}

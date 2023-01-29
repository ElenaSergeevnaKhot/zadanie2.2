public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int addend = 100;
        int balance = 100;
        int adding = 1100;


        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int finalAccount = initialAccount + addend + bonus;

        System.out.println("Итоговый счёт: " + finalAccount);
        System.out.println("Бонус:" + bonus);

        int bonusObject = 0;
        if (adding > 1000) {
            bonusObject = adding / 100;
        }
        int amountOfMoney = balance + adding + bonusObject;

        System.out.println("Итоговый счёт: " + amountOfMoney);
        System.out.println("Бонус:" + bonusObject);

    }
}
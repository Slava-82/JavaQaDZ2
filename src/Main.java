public class Main {
    public static void main(String[] args) {

        double score = 100;  // у клиента на счету (остаток)
        double add = 1100; // сумма пополнения
        int bonus; // бонусные рубли

        if (add >= 1000) {
            bonus = (int) add / 100;
        } else {
            bonus = 0;
        }

        double total = score + add + bonus; // итоговый счёт

        System.out.println("Начислено " + bonus + " бонусных руб.");
        System.out.println("На Вашем счету " + total + " руб.");


    }
}
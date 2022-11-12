public class Main {
    public static void main(String[] args) {
        //task1
        byte a = 50;
        short b = 100;
        int c = 200;
        long d = 400L;

        float e = 10.5f;
        double f = 21;

        System.out.println("Значение переменной \"a\" с типом byte равно " + a);
        System.out.println("Значение переменной \"b\" с типом short равно " + b);
        System.out.println("Значение переменной \"c\" с типом int равно " + c);
        System.out.println("Значение переменной \"d\" с типом long равно " + d);
        System.out.println("Значение переменной \"e\" с типом float равно " + e);
        System.out.println("Значение переменной \"f\" с типом double равно " + f);
        //Переменные пришлось еще и инициализировать, в противном случае копмпилятор ругался :)

        //task2
        float g = 27.12f;
        long h = 987_678_965_549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;
        //в данном уроке я еще и обьявил переменные, не уверен что правильно понял задание.

        //task3
        short paper = 480;
        byte classLyudmilaPavlovna = 23;
        byte classAnnaSergeevna = 27;
        byte classEkaterinaAndreevna =30;
        int allClasses = classEkaterinaAndreevna + classAnnaSergeevna + classLyudmilaPavlovna;
        int paperInOneHand = paper / allClasses;
        System.out.println("На каждого ученика рассчитано " + paperInOneHand + " листов бумаги");

        //task4
        byte optimalCount = 16/2;
        int bottlesInTwentyMinutes = optimalCount * 20;
        int bottlesOneDay = (bottlesInTwentyMinutes * 3) * 24;
        int bottlesThreeDay = bottlesOneDay * 3;
        int bottlesOneMonth = bottlesOneDay * 30;
        System.out.println("За 20 минут машина произвела "+bottlesInTwentyMinutes+ " штук бутылок");
        System.out.println("За сутки машина произвела "+bottlesOneDay+ " штук бутылок");
        System.out.println("За три дня машина произвела "+bottlesThreeDay+ " штук бутылок");
        System.out.println("За месяц машина произвела "+bottlesOneMonth+ " штук бутылок");

        //task5
        int allPaintCount = 120;
        int whiteColorInOneClass = 2;
        int brownColorInOneClass = 4;
        int allColorInClass = whiteColorInOneClass + brownColorInOneClass;
        int countClass = allPaintCount / allColorInClass;
        System.out.println("В школе, где " + countClass+ " классов, нужно "+countClass * whiteColorInOneClass+" банок белой краски и "+countClass * brownColorInOneClass+" банок коричневой краски");

        //task6
        byte bananas = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte eggs = 70;
        int breakfast = (bananas * 5) + (milk * 2) + (iceCream * 2) + (eggs * 4);
        float convertKg = breakfast / 1000;
        System.out.println("Завтрак чемпиона весит "+ convertKg +" кг.");

        //task7
        short goalKg = (7*1000);
        short easyWorkout = 250;
        short hardWorkout = 500;
        int daysIsEasy = goalKg / easyWorkout;
        int daysIsHard = goalKg / hardWorkout;
        System.out.println("Если терять в весе по "+ easyWorkout +" грамм в день, то на похудение уйдет "+ daysIsEasy + " дней");
        System.out.println("Если же терять в весе по "+ hardWorkout +" грамм в день, то на похудение уйдет "+ daysIsHard + " дней");

        //task8
        float salaryMasha = 67760f;
        float salaryDennis = 83690f;
        float salaryKristina = 76230f;
        float promotionMasha = (salaryMasha / 100) * 10;
        float totalMasha = salaryMasha + promotionMasha;
        float promotionDennis = (salaryDennis / 100) * 10;
        float totalDennis = salaryDennis + promotionDennis;
        float promotionKristina = (salaryKristina / 100) * 10;
        float totalKristina = salaryKristina + promotionKristina;
        System.out.println("Маша теперь получает "+totalMasha+" рублей. Годовой доход вырос на "+totalMasha % salaryMasha+" рублей");
        System.out.println("Денис теперь получает "+totalDennis+" рублей. Годовой доход вырос на "+totalDennis % salaryDennis+" рублей");
        System.out.println("Кристина теперь получает "+totalKristina+" рублей. Годовой доход вырос на "+totalKristina % salaryKristina+" рублей");
    }
}
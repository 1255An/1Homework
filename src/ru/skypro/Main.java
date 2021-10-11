package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte z = 17;
        short x = 1000;
        int p = -100;
        long k = 999999L;
        float j = 56.56f;
        double f = 32.356378;
        char g = 126;
        char h = '~';
        System.out.println("g= " + g + ", h= " +h);


        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float bothBoxers = boxer1 + boxer2;
        System.out.println("Общий вес бойцов " + bothBoxers + " кг");
        float boxersDif = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов " +boxersDif + " кг");

        int bananaWeight = 80;
        int bananasAmount = 5;
        int bananas = bananaWeight * bananasAmount;
        int milkWeight = 105;
        int milkMl = 200;
        int milkMlToGr = 100;
        int milk = milkMl * milkWeight / milkMlToGr;
        int iceCreamWeight = 100;
        int iceCreamAmount = 2;
        int iceCreams = iceCreamWeight * iceCreamAmount;
        int eggWeight = 70;
        int eggsAmount =4;
        int eggs = eggWeight * eggsAmount;
        int breakfastWeight = bananas + milk + iceCreams + eggs;
        System.out.println("Общий вес завтрака " + breakfastWeight + " г");
        int gToKg = 1000;
        int breakfastKg = breakfastWeight / gToKg;
        System.out.println("Общий вес завтрака " + breakfastKg + " кг");

        int min = 250;
        int max = 500;
        int goal = 7;
        int weightLoss1 = goal * gToKg / min;
        int weightLoss2 = goal * gToKg / max;
        System.out.println("На похудение уйдет " + weightLoss1 + " дней, если терять 250 г в день");
        System.out.println("На похудение уйдет " + weightLoss2 + " дней, если терять 500 г в день");

        int MashaSalary = 67_760;
        int DenisSalary = 83_690;
        int KrisSalary = 76_230;
        int procent = 100;
        int rise = 10;
        int futureProcent = procent + rise;
        int MashaRise = MashaSalary * futureProcent / procent;
        int DenisRise = DenisSalary * futureProcent / procent;
        int KrisRise = KrisSalary * futureProcent / procent;
        int MashaDif = MashaRise - MashaSalary;
        int DenisDif = DenisRise - DenisSalary;
        int KrisDif = KrisRise - KrisSalary;
        System.out.println("Маша теперь получает " + MashaRise + " рублей. Годовой доход вырос на " + MashaDif + " рублей");
        System.out.println("Денис теперь получает " + DenisRise + " рублей. Годовой доход вырос на " + DenisDif + " рублей");
        System.out.println("Кристина теперь получает " + DenisRise + " рублей. Годовой доход вырос на " + KrisDif + " рублей");

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println("Результат = " + result);
        int invert = -1;
        int resultInvert = result * invert;
        System.out.println("Инвертированный результат = " + resultInvert);

        int v = 5;
        int y= 7;
        System.out.println("a = " + v + ", b = " + y);
        v = v+y;
        y= v-y;
        v= v-y;
        System.out.println("a = " + v + ", b = " + y);

        int s = 874;
        int n = s / 10 % 10;
        System.out.println("В центра числа " + s + " находится цифра " + n);

    }
}

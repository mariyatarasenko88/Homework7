public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            total = total + salary;
            i = total / salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
        int a = 10;
        for (; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPopulations = 12000000;
        int birthRate = 17;
        int mortality = 8;
        int years = 0;
        while (years < 10) {
            years = years + 1;
            totalPopulations = totalPopulations + 9 * 12;
            System.out.println("Год " + years + " численность населения составляет " + totalPopulations);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        float percent = 0.07F;
        int month = 0;
        while (month < 99) {
            salary = (int) (salary + salary * (percent));
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + salary);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        float percent = 0.07F;
        int month = 0;
        while (month < 99) {
            salary = (int) (salary + salary * (percent));
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + salary);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15000;
        float percent = 0.07F;
        int month = 0;
        while (month < 108) {
            salary = (int) (salary + salary * (percent));
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + salary);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int x = 5;
        for (; x <= 31; x += 7) {
            System.out.println("Сегодня пятница, " + x + " -е число. Необходимо подготовить отчет ");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2096;
        int yearsAgo = year - 200;
        int yearAfter = year + 100;
        for (; yearsAgo < yearAfter; yearsAgo = yearsAgo + 79) {
            System.out.println(yearsAgo);
        }
    }
}

        

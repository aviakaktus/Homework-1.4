public class Main {
    public static void main(String[] args) {
        //Домашка 1.4 Циклы
        // Задача 1
        int a = 1;
        while (a <=10){
            System.out.print(a + " ");
            a++;
        }
        System.out.println(" ");
        for (int b=10; b>=1; b--){
            System.out.print(b + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Задача 2
        int number1Friday = 4;
        int day = number1Friday;
        while (day <=31){
            System.out.println ("Сегодня пятница " + day + " число. Необходимо подготовить отчет");
            day = day +7;
        }
        System.out.println(" ");

        //Задача 3
        for (int yearProleta = 0; yearProleta<2122; yearProleta +=79){
            if (yearProleta > (2022-200)){
                System.out.println (yearProleta);
            }
        }
        System.out.println(" ");

        //Задача 4
        String ping = " ping ";
        String pong = " pong ";
        for (int i=1; i<=30; i++) {
            System.out.print (i + ": ");
            if (i%3==0){
                System.out.print (ping);
            }
            if (i%5==0){
                System.out.print (pong);
            }
            System.out.println ("");
        }
        System.out.println(" ");

        //Задача 5 - Числа Фибоначчи
        int slag1 = 0;
        int slag2 = 1;
        int sum = 1;
        System.out.print (slag1 + " ");
        System.out.print (slag2 + " ");
        for (int i=2; i<10; i++){
            sum = slag1 + slag2;
            System.out.print (sum + " ");
            slag1 = slag2;
            slag2 = sum;
        }
    }
}
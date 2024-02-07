public class Main {
    public static void main(String[] args) {
        System.out.println(task1(3));
        System.out.println(task1(14));
        System.out.println(task1(26));
        System.out.println(task2(12));
        System.out.println(task2(3));
        System.out.println(task2(7));
        System.out.println(task2(11));
        System.out.println(task3("abcde"));
        System.out.println(task4("12345"));
        System.out.println(task5(123));
        System.out.println(task6(784321));
        System.out.println(fibonacci(12));


    }
    public static String task1(int day) {
        if (day >= 1 && day <= 10) {
           return "Перша декада";
        } else if (day >= 11 && day <= 20) {
            return "Друга декада";
        } else if (day >= 21 && day <= 31) {
            return "Третя декада";
        } else{
            return "Помилка";
        }

    }
    public static String  task2(int month) {
        if (month == 1 || month == 2 || month == 12) {
            return "It`s winter";
        } else if (month >= 3 && month <= 4) {
            return "It`s spring";
        } else if (month >= 5 && month <= 8) {
            return "It`s summer";
        } else if (month >= 9 && month <= 11) {
            return "It`s autumn";
        } else {
            return "error";
        }
    }
    public static String task3(String b) {
        if (b.charAt(0) == 'a') {
           return "Yes";
        } else {
            return "No";
        }
    }

    public static String task4(String a) {
        char first = a.charAt(0);
        if (first == '1' || first == '2' || first == '3') {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static String task5(int num){
        if (num >= 100 && num <= 999){
            int num1 = num/100;
            int num2 = num/10%10;
            int num3 = num%10;

            int sum = num1+num2+num3;
            return "Сума чисел: "+sum;
        }else {
            return "Error";
        }
    }

    public static String task6(int num){
        if (num >= 100000 && num<= 999999){

            int num1 = num/100000;
            int num2 = num/10000%10;
            int num3 = num/1000%10;
            int num4 = num%1000/100;
            int num5 = num%100/10;
            int num6 = num%10;

            int sum1 = num1+num2+num3;
            int sum2 = num4+num5+num6;

            if (sum1==sum2){
                return "Yes";
            }else
                return "No";
        }else
            return "Error";
    }

    public static int fibonacci(int num){
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
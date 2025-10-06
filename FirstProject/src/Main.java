public class Main{
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(compareNumbersResult(5, 2));

        isPositiveNumber(0);

        System.out.println(isNegativeNumber(5));

        printNTimes("Строка", 5);

        System.out.println(isLeapYear(100));
        System.out.println(isLeapYear(400));
        System.out.println(isLeapYear(12));
        System.out.println(isLeapYear(5));

    }

    //1
    public static void printThreeWords () {
        System.out.println("""
                Orange\s
                Banana\s
                Apple""");
    }

    //2
    public static void checkSumSign() {
        int a = 2, b = -4;
        System.out.println(a+b>=0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    //3
    public static void printColor() {
        //Зададим диапазон случайного числа от -100 до 200
        int color = (int) (-100 + Math.random() * (200+100+1));
        System.out.println(color<=0 ? "Красный" : color>100 ? "Зелёный" : "Жёлтый");
    }

    //4
    public static void compareNumbers() {
        int a = (int) (Math.random()*100+1), b = (int) (Math.random()*100+1);
        System.out.println(a>=b ? "a>=b" : "a<b");
    }

    //5
    public static boolean compareNumbersResult (int a, int b) {
        return a+b<=20 && a+b>=10;
    }

    //6
    public static void isPositiveNumber(int a) {
        System.out.println(a>=0 ? "Positive Number" : "Negative Number");
    }

    //7
    public static boolean isNegativeNumber(int a) {
        return a<0;
    }

    //8
    public static void printNTimes(String string, int n) {
        for (int i = n-1; i >= 0; i--) {
            System.out.println(string);
        }
    }

    //9
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
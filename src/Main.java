import java.time.LocalDate;
import java.util.Scanner;

class Main {

    //принимает имя и возраст
    public static void getNameAge(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(name + ": " + age);
    };

    //возвращает последний символ слова
    public static char getLastChar(String str) {
        return str.charAt(str.length() - 1);
    };

    //определяет, является ли год високосным
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    };

    //определяет, закипел чайник или нет
    public static void isBoilingKettle(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        };
    };

    //определяет четное или нечетное число
    public static boolean isEven(int number) {
        return number % 2 == 0;
    };

    //определяет, является ли первая буква заглавной
    public static boolean isFirstLetterInUpperCase(String string) {
        var firstLetter = string.charAt(0);
        return Character.isUpperCase(firstLetter);
    };

    //получение текущего времени и даты
    public static void showCurrentDate() {
        var currentDate = LocalDate.now();
        var text = "Today is: " + currentDate;
        System.out.println(text);
    };

    //определяет тип предложения
    public static String getTypeOfSentence(String sentence) {
        var sentenceType = "";
        if (sentence.endsWith("?")) {
            sentenceType = "question";
        } else if (sentence.endsWith("!")) {
            sentenceType = "exclamation";
        } else {
            sentenceType = "general";
        }
        return "Sentence is " + sentenceType;
    };

    //возвращает модуль переданного числа
    public static int absFirst(int number) {
        if (number >= 0) {
            return number;
        }
        return -number;
    };

    //возвращает модуль переданного числа (тернарный оператор)
    public static int absSecond(int number) {
        return number >= 0 ? number : -number;
    };

    //отсчет
    public static void printNumbers(int lastNumber) {
        var i = 1;
        while (i <= lastNumber) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("finished!");
    };

    //обратный отсчет
    public static void printCountdown(int firstNumber) {
        while (firstNumber >= 1) {
            System.out.println(firstNumber);
            firstNumber -= 1;
        }
        System.out.println("finished!");
    };

    //складывает числа в указанном диапазоне, включая границы
    public static int sumNumbersFromRange(int start, int finish) {
        var i = start;
        var sum = 0;
        while (i <= finish) {
            sum = sum + i;
            i = i + 1;
        }
        return sum;
    };

    //повторяет строку указанное количество раз
    public static String repeat(String text, int times) {
        var result = "";
        var i = 1;
        while (i <= times) {
            result = result + text;
            i = i + 1;
        }
        return result;
    };

    //печатает каждую букву слова на отдельной строке
    public static void printNameBySymbol(String name) {
        var i = 0;
        while (i < name.length()) {
            System.out.println(name.charAt(i));
            i += 1;
        }
    };

    //переворот строки (посимвольный перебор считается базовым):
    public static String reverse(String str) {
        var i = 0;
        var result = "";
        while (i < str.length()) {
            result = str.charAt(i) + result;
            i += 1;
        }
        return result;
    };

    //сколько раз входит буква в предложение:
    public static int countChars(String str, char ch) {
        var i = 0;
        var count = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                count = count + 1;
            }
            i += 1;
        }
        return count;
    };

    //проверка простоты числа (делим x на все числа от двух до x - 1 и смотрим остаток от деления)
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        var divider = 2;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }
        divider += 1;
        }
        return true;
    };

    //шифрует сообщения: переставляет в тексте каждые два подряд идущих символа
    public static String encrypt(String str) {
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            var nextSymbol = (i + 2 > str.length()) ? "" : str.charAt(i + 1);
            result = result + nextSymbol + str.charAt(i);
        }
        return result;
    };

};
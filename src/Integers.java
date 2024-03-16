import java.util.Random;

public class Integers {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100001 - 11) + 11;
        System.out.println("Сгенерированное число: " + number);
        int sum = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("Сумма разрядов числа " + originalNumber + ": " + sum);
    }




}

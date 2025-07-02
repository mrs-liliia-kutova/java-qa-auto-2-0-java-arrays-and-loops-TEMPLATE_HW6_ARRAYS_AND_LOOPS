import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        int[] secretCode = {7, 14, 28, 56, 112};
//        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
//        boolean isCodeCorrect = true;
//
//        for (int i = 0; i < secretCode.length; i++) {
//            int userInput = scanner.nextInt(); // питаємо в користувача чергове число
//            if (userInput != secretCode[i]) { // перевіряємо число проти i-го елемента масиву з правильним кодом
//                isCodeCorrect = false; // якщо натрапляємо на неправильно введене число - усю комбінацію вважаємо невірною
//            }
//        }
//
//        if (isCodeCorrect) {
//            System.out.println("Замок відкрито! Заходьте всередину.");
//        } else {
//            System.out.println("Невірний код. Спробуйте ще.");
//        }
//        int[] inputNumbers = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
//        int sum = 0;
//        System.out.println("Ти натрапив на чарівну дошку з цифрами");
//
//        for (int i = 0; i < inputNumbers.length; i++) {
//            sum += inputNumbers[i];
//            }
//        System.out.println("Сума всіх чисел на дошці: " + sum);
//        System.out.println("Ти переходиш до 3-го завдання");

        int[] attackArray = {8, 16, 24, 32, 40};

        for (int i = 0; i < attackArray.length; i++) {
            if (attackArray[i]% 2 == 0) {
                System.out.println("Атаки парні. Захист активовано. ");
            } else {
                System.out.println("Увага. Непарна атака.");
            }

        }
    }
}
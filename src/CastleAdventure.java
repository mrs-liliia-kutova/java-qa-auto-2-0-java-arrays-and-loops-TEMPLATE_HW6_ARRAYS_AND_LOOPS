import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] secretCode = {7, 14, 28, 56, 112};
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt();
            if (userInput != secretCode[i]) {
                isCodeCorrect = false;
            }
        }

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходь всередину.");
        } else {
            System.out.println("Невірний код. Спробуй ще.");
        }
        int[] inputNumbers = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int sum = 0;
        System.out.println("Ти натрапив на чарівну дошку з цифрами");

        for (int i = 0; i < inputNumbers.length; i++) {
            sum += inputNumbers[i];
        }
        System.out.println("Сума всіх чисел на дошці: " + sum);
        System.out.println("Ти переходиш до 3-го завдання");

        int[] attackArray = {8, 16, 24, 32, 40};
        boolean evenNumbers = false;
        boolean oddNumbers = false;


        for (int i = 0; i < attackArray.length; i++) {
            if (attackArray[i] % 2 == 0) {
                evenNumbers = true;
            } else {
                oddNumbers = true;
            }
        }

            if (oddNumbers) {
                System.out.println("Увага. Непарна атака.");
            }
            else if (evenNumbers){
                System.out.println("Атаки парні. Захист активовано. ");
            }



                System.out.println("Введи своє улюблене число");
                int favouriteNumber = scanner.nextInt();
                boolean isNumberMatch = false;

                for (int k = 0; k < inputNumbers.length; k++) {
                    if (favouriteNumber == inputNumbers[k])
                        isNumberMatch = true;
                }

                if (isNumberMatch) {
                    System.out.println("Твій ключ знайдено! ");
                } else {
                    System.out.println("Треба більше магії...");

                }

            }
        }


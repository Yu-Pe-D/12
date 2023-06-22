package javaErrorException.HomeWork_003;
import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        try (Scanner iScanner = new Scanner(System.in)) {
            while (true){
                System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, номер телефона - цифры,) : ");
                String data = iScanner.nextLine();
                String[] arrayData = data.split(" ");
                if (arrayData.length == 4) {
                    return arrayData;
                } else if (arrayData.length < 4){
                    System.out.println("Вы ввели не все данные.");
                } else System.out.println("Вы ввели лишние данные.");
            }
        }

    }
}

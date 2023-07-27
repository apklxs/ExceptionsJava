//ЗАДАЧА 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) { 
        System.out.print(checkInputFloat(" Введите число number = "));
      }
   
public static float checkInputFloat(String info){
    String number = inputStringNumber(info);
    while(!containsOnlyDigitsAndDot(number)){
        System.out.println("Ввод числа не корректен");
        number = inputStringNumber("Введите число number = ");
    }
    return Float.valueOf(number);
}


public static String inputStringNumber(String info) {
    System.out.print(info);
    Scanner in = new Scanner(System.in);
    return in.next();
}


public static boolean containsOnlyDigitsAndDot(String number) {
    int countDot  = 0;
    int countMines = 0;
    for (char c : number.toCharArray()) {
        if ( c == '.') {
            countDot++;
        }
        if ( c == '-') {
            countMines++;
        }
        if (!(Character.isDigit(c) || c == '.' || c == '-')) {
            return false;
        }
        if (countDot > 1) {
            return false;
        }
        if (countMines > 1) {
            return false;
        }

    }
return true;
}

}  


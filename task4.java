//ЗАДАЧА 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) throws Exception {
       String stringCheck = inputStringNumber("Введите не пустую строку"); 
       checkEmptyString(stringCheck);
    }
    
    public static String inputStringNumber(String info) {
    System.out.print(info);
    Scanner in = new Scanner(System.in);
    return in.nextLine();
    }

    public static void checkEmptyString(String stringCheck) throws Exception {
        if(stringCheck.isEmpty() || stringCheck == null){
            throw new Exception("Введена пустая строка, пустые строки вводить нельзя");
        }
    
    }


}


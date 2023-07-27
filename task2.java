public class task2 {
  
    public static void main(String[] args) { 
        try {
            int d = 0;
            int[] intArray = { 1, 2, 3, 5, 6, 7, 8, 9 };
            if (d == 0){
                System.out.println("Переменная равна нулю, возможна неправильная операция деления на ноль");
            }
            if (intArray.length < 9){
                System.out.println("Массив возможно не имеет достаточное кол-во элементов, возможно требуется обращение к массиву большей длины");
            }
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (RuntimeException e) { //ArithmeticException заменен на RuntimeException т.к. в 10 строке помимо ошибки деления есть обращение к массиву который может не иметь элемента с индексом 8
            System.out.println("Catching exception: " + e);
         }
          

        
      }
    
}

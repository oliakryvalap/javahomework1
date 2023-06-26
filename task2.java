//Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        try (Scanner tru = new Scanner(System.in)){
             
System.out.println();
for (int i = 2; i <= 1000; i++){
    int count = 0;
    for (int j = 2; j <= i && count < 2; j++){
        if (i%j==0){
            count++;
    System.out.println(i);
}
        }
    } 
            }
            }
}

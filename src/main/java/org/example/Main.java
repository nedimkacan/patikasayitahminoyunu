package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rnd=new Random();
        int number=rnd.nextInt(100);
        int right=0;
        Scanner input=new Scanner(System.in);
        int selected;
        int[] wrong=new int[5];
        boolean isWin=false;
        while (right<5){
            System.out.println("Lütfen tahmininizi giriniz: ");
            selected=input.nextInt();
            if ((selected <= 0) || (selected >= 100)) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı girin !");
            }else {
                wrong[right]=selected;
                right++;
                if (selected == number) {
                    System.out.println("Tebrikler doğru tahmin !\nTahmin edilen sayı: " + number);
                    isWin=true;
                    break;
                }else{
                    System.out.println("Hatalı bir sayı girdiniz !");
                    if (selected > number) {
                        System.out.println("Girilen sayı: " + selected + " gizli sayı girilen sayıdan daha küçüktür :)");
                    }else{
                        System.out.println("Girilen sayı: " + selected + " gizli sayı girilen sayıdan daha büyüktür :)");
                    }
                    System.out.println("Kalan hak: " + (5-right));
                }
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz !\nDoğru Sayı: " + number);
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }
    }
}
package assignment8;

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String s1 = word.nextLine();
        char[] charArray = s1.toCharArray();
        System.out.println("nhap ki tu can tim: ");
        char s2 = word.next().charAt(0);
        int j = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == s2) {
                j += 1;
            }

        }
        if (j == 0) {
            System.out.println("ki tu khong co trong chuoi");
        } else {
            System.out.println("ki tu xuat hien " + j + " lan trong chuoi");
        }
    }

}

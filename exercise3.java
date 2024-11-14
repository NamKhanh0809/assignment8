package assignment8;

import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String s1 = word.nextLine();
        StringBuffer s2 = new StringBuffer(s1);  //khac kieu du lieu
        StringBuffer s3= s2.reverse();
        System.out.println(s3);
        if (s2.equals(s3)) {
            System.out.println("la palindrome");
        } else {
            System.out.println("khong la palindrome");
        }
    }
}

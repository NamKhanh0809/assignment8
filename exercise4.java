package assignment8;

public class exercise4 {

    public static void main(String[] args) {
        String s1 = "hello";
        char[] charArray = s1.toCharArray();
        for (int i = 0; 1 < charArray.length; i++) {

            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            } else if (charArray[i] >= 97 && charArray[i] <= 112) {
                charArray[i] += 32;
            }

        }
        System.out.println(charArray);
    }
}

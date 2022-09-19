import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = scan.nextInt();
        int total = 0, numValue;
        while (number>0){
            numValue = number % 10;
            total +=numValue;
            number /= 10;
        }
        System.out.println("Sonuç : "+total);

    }
}

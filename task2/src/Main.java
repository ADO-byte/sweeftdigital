import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= Integer.parseInt(scanner.nextLine());
        int i=0;
        while (number>=50){
            number=number-50;
            i+=1;
        }
        while (number>=20){
            number=number-20;
            i+=1;
        }
        while (number>=10){
            number=number-10;
            i+=1;
        }
        while (number>=5){
            number=number-5;
            i+=1;
        }
        while (number>=1){
            number=number-1;
            i+=1;
        }
        System.out.println("მინიმალური რაოდენობა: "+i);
    }
}

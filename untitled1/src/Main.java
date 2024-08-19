import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String number, change = "";
        Boolean neg = false;
        Scanner sc = new Scanner(System.in);
        int error = 0;

        while(error < 3) {
            change = "";
            number = sc.nextLine();

            neg = false;
            if(number.charAt(0) == '-') {
                neg = true;
//                start -= 1;
            }

            for(int i = 0; i <= (neg ? number.length() - 2 : number.length() - 1); i++) {
                if(number.charAt(number.length() - i - 1) >= '0' && number.charAt(number.length() - i - 1) <= '9')
                    change = number.charAt(number.length() - i - 1) + change;
                else {
                    error++;
                    if(error == 3)
                        System.out.println("Error occured.");
                }

                if(i % 3 == 2)
                    change = ',' + change;
            }
            if(change.charAt(0) == ',')
                change = change.substring(1);

//            for(int i = number.length() - 1; i >= (neg ? 1: 0); i--) {
//                if(number.charAt(i) >= '0' && number.charAt(i) <= '9')
//                    change = number.charAt(i) + change;
//                else {
//                    error++;
//                    if(error == 3)
//                        System.out.println("Error occured.");
//                }
//
//                if(i % 3 == 0)
//                    change = ',' + change;
//            }

            if(neg) {
                System.out.print("-");
            }
            System.out.println(change);
        }

    }
}
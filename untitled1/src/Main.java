import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String number, change = "";
        Boolean neg = false;
        Boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int error = 0;

        while(error < 3) {
            change = "";
            number = sc.nextLine();

            neg = false;
            if(number.charAt(0) == '-') {
                neg = true;
            }
            if(number.length() > (neg ? 21 : 20)) {
                error++;
                continue;
            }

            flag = true;
            for(int i = 0; i <= (neg ? number.length() - 2 : number.length() - 1) && flag; i++) {
                if(number.charAt(number.length() - i - 1) >= '0' && number.charAt(number.length() - i - 1) <= '9')
                    change = number.charAt(number.length() - i - 1) + change;
                else {
                    error++;
                    flag = false;
                }

                if(i % 3 == 2)
                    change = ',' + change;
            }
            if(!flag)
                continue;

            if(change.charAt(0) == ',')
                change = change.substring(1);

            if(neg) {
                System.out.print("-");
            }
            System.out.println(change);
        }

        System.out.println("Error occured.");
    }
}
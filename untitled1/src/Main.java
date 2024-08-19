import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String number, change = "";
        Scanner sc = new Scanner(System.in);
        int error = 0;
        int start;

        while(error < 3) {
            number = sc.nextLine();

            start = number.length() - 1;
            if(number.charAt(0) == '-') {
                change = "-";
                start -= 1;
            }

            for(int i = start; i >= 0; i--) {
                if(number.charAt(i) >= '0' && number.charAt(i) <= '9')
                    change += number.charAt(i);
                else {
                    error++;
                    if(error == 3)
                        System.out.println("Error occured.");
                }

                if(i % 3 == 0)
                    change += ',';
            }

            System.out.println(change);
        }

    }
}
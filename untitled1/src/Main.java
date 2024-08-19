import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String number;
        Scanner sc = new Scanner(System.in);

        number = sc.nextLine();
        for(int i = 0; i < number.length(); i++) {
            System.out.print(number.charAt(i));
            if(i % 3 == 0)
                System.out.print(",");
        }
    }
}
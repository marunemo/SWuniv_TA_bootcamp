import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String number, change = "";
        Scanner sc = new Scanner(System.in);

        number = sc.nextLine();
        for(int i = number.length() - 1; i >= 0; i--) {
            if(number.charAt(i) >= '0' && number.charAt(i) <= '9')
                change += number.charAt(i);
            if(i % 3 == 0)
                change += ',';
        }

        System.out.println(change);
    }
}
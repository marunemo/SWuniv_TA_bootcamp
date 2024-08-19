import java.util.Scanner;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//        String number, change;
//        Boolean neg = false;
//        Boolean flag = false;
//        Scanner sc = new Scanner(System.in);
//        int error = 0;
//
//        while(error < 3) {
//            change = "";
//            number = sc.nextLine();
//
//            flag = true;
//            neg = false;
//
//            if(number.charAt(0) == '-') {
//                neg = true;
//            }
//            if(number.length() > (neg ? 21 : 20)) {
//                error++;
//                flag = false;
//            }
//
//            for(int i = 0; i <= (neg ? number.length() - 2 : number.length() - 1) && flag; i++) {
//                if(number.charAt(number.length() - i - 1) >= '0' && number.charAt(number.length() - i - 1) <= '9')
//                    change = number.charAt(number.length() - i - 1) + change;
//                else {
//                    error++;
//                    flag = false;
//                }
//
//                if(i % 3 == 2)
//                    change = ',' + change;
//            }
//            if(!flag)
//                System.out.println("Error occured.");
//
//            else{
//                if(change.charAt(0) == ',')
//                change = change.substring(1);
//
//                if(neg) {
//                    System.out.print("-");
//                }
//                System.out.println(change);
//            }
//        }
//
//        System.out.println("Terminated.");
//    }

    public static void main(String[] args) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int[] list = {3,2,4,8,29,7,4,9,3,2,5};
        int[] list2 = {3,8,9,47,29,5,8,7,3,2,4,9,8,5,2,3,57,3};

        int[] change = new int[50];
        int changeIndex = 0;

        for(int i = 0; i < list.length; i++) {
            if(!map.containsKey(list[i])) {
                map.put(list[i], true);
                change[changeIndex++] = list[i];
            }
        }

        for(int i = 0; i < list2.length; i++) {
            if(!map.containsKey(list2[i])) {
                map.put(list2[i], true);
                change[changeIndex++] = list2[i];
            }
        }

        for(int i = 0; i < changeIndex; i++) {
            System.out.print(change[i] + " ");
        }
        System.out.println();
    }
}
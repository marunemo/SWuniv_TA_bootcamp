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
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] list = {1, 2, 3, 4};
        int[] list2 = {1, 2, 5, 6};

        int[] intersect = new int[50];
        int intersectIndex = 0;
        int[] union = new int[50];
        int unionIndex = 0;

        for(int i = 0; i < list.length; i++) {
            if(!map.containsKey(list[i])) {
                map.put(list[i], 1);
                union[unionIndex++] = list[i];
            }
            else if(map.get(list[i]) == 1) {
                map.put(list[i], 2);
                intersect[intersectIndex++] = list[i];
            }
        }

        for(int i = 0; i < list2.length; i++) {
            if(!map.containsKey(list2[i])) {
                map.put(list2[i], 1);
                union[unionIndex++] = list2[i];
            }
            else if(map.get(list2[i]) == 1) {
                map.put(list2[i], 2);
                intersect[intersectIndex++] = list2[i];

            }
        }

        System.out.print("intersect: ");
        for(int i = 0; i < intersectIndex; i++)
            System.out.print(intersect[i] + " ");
        System.out.println();

        System.out.print("union: ");
        for(int i = 0; i < unionIndex; i++)
            System.out.print(union[i] + " ");
        System.out.println();
    }
}
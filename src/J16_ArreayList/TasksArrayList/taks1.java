package J16_ArreayList.TasksArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class taks1 {
    public static void main(String[] args) {
        // girilen String'i Arraylist kullanarak ters çeviriniz.
        Scanner scan =new Scanner(System.in);
        System.out.println("bir String giriniz");
        String str = scan.nextLine();
        ArrayList<String> tr= new ArrayList<>(List.of(str.split("")));
        System.out.println(tr.get(3));
        System.out.println("tr = " + tr);
        for (int i = tr.size()-1; i >= 0 ; i--) {
            System.out.print(tr.get(i));

        }

    }
}

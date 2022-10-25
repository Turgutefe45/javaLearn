import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class deneme {
    public static void main(String[] args) {
       //-->iki string array elemanlarının ortak olmasını kontrol eden code creat ediniz
        String arr1[]={"nazım","gülsüm","dilek","erol","cüneyt","çiğdem"};
        String arr2[]={"musty","gül","ayşe","enise","ali","yusuf"};


      //  List<String>ortakIsim=new ArrayList<>();
        List<String>ortakIsim=new ArrayList<>();
        for (String str1:arr1
             ) {
            for (String str2:arr2){
                if (str2.equalsIgnoreCase(str1)){
                    ortakIsim.add(str2);
                }
                 
                
            }
            
        }
        if (ortakIsim.isEmpty()){
            System.out.println("ortakIsim yok = " + ortakIsim);
        }else System.out.println("ortakIsim = " + ortakIsim);


    }
}

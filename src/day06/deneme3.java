package day06;

public class deneme3 {
    public static void main(String[] args) {//Convert "Java" to "J*a*v*a*"

/* ForLoop
   print even numbers from 100 to 0 but do not use decrement(i--).

        INPUT      :
        OUTPUT  : 100 98 96 94 92 ....2 0
     */
        String s ="java";
        for (int i = 0; i <s.length() ; i++) {
            System.out.print(s.charAt(i)+ "*");

        }

    }
}

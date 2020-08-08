import java.util.Scanner;

public class do_test {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int i;

       do{
           System.out.println("írj be egy számot");
           i = sc.nextInt();
       }while(i != 10);

       if(i == 10){
           System.out.println("Ne ezt!!");
       }
    }
}
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner girdi= new Scanner(System.in);
        System.out.println("1.Kenar:" );
        a= girdi.nextInt();
        System.out.println("2.Kenar:" );
        b=girdi.nextInt();
        c = Math.sqrt((a * a) + (b*b));
        System.out.println("Hipo;" +c);


    }
}
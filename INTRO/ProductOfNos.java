import java.io.IOException;
public class ProductOfNos {
    public static void main(String[] args) throws IOException {
        
        System.out.printf("%s.%n","Enter your firs number: ");
        int var1 = Integer.parseInt(System.console().readLine());
        System.out.printf("%s.%n","Enter your seconde number:  ");
        int var2 = Integer.parseInt(System.console().readLine());
        System.out.println("the prudoct is: " + (var1*var2));

    }
}

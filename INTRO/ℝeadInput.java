import java.io.IOException;
public class ℝeadInput {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter your rst byte");

        int inByte = System.in.read();

        System.out.println("The rst byte that you typed: " + (char)inByte);

        System.out.printf("%s: %d.%n", "The rst byte that you typed", (int)inByte);
    }
    
}

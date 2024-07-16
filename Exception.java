import.java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String str = "Who would know naught of art must learn, act, and them take his ease";
        try {
            int a= 10;
            int b = 0;
            int c =b/a;
            System.out.print(c);
        }
        catch(ArithmeticException e) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(0);
                if (ch(i)== 'a' || ch(i)== 'e' || ch(i)== 'i' || ch(i)== 'o' || ch(i)== 'u' || ch(i)== 'A' || ch(i)== 'E' || ch(i)== 'I' || ch(i)== 'O' || ch(i)== 'U')
                    System.out.print("String contains vowels");
            }
            System.out.print("String does not contain any vowel");
        }
        finally {
            System.out.print("End of the program");
        }
    }
}

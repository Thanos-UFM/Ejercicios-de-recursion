import java.io.*;
import java.util.Scanner;

public class StringReverse{
    
    private String reverse(String text) {
        if ((text==null)||(text.length() <= 1) )
            return text;
        return reverse(text.substring(1)) + text.charAt(0);
    }
    
     public static void main(String []args){
        System.out.println("Ingrese el texto a invertir");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        StringReverse obj=new StringReverse();
        System.out.println("Reverse of \'"+text+"\' is \'"+obj.reverse(text)+"\'");
     }
}

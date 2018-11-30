package syntaxChecker;
import java_cup.runtime.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class Main {

    public static void main(String[] args) throws Exception{
        System.out.print("Please type your arithmethic expression:");
        try{
            String input = new Scanner(new File(args[0])).useDelimiter("\\Z").next();
            System.out.println(input);
            Parser p = new Parser(new scanner(input));
            p.parse();
            System.out.println("\n[accept]");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }catch(Exception e) {
            System.out.println("\n[reject]");
        }
    }
}
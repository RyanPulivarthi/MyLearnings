package Exception;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=7;
        try {
            n=scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

        System.out.println(n);
    }
}

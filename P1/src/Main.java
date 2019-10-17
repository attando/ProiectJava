package Main;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1:Porc");
        System.out.println("2:Pui");
        System.out.println("3:Peste");
        System.out.println("Alegeti mancarea");
        int op=sc.nextInt();
        switch(op) {
            case 1: System.out.println("Ai ales Porc");break;
            case 2: System.out.println("Ai ales Pui");break;
            case 3: System.out.println("Ai ales Peste");break;
        }
    }
}
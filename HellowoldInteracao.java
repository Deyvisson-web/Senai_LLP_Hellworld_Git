import java.util.Scanner;

class HelloWorldInteracao{
    public static void main(String [] args){

        System.out.println("Informe seu nome:");
        Scanner sc = new Scanner(System.in); 
        String nome = sc.nextLine();

        System.out.println("Hello World "+nome);
         }
    }
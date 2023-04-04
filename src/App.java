import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("numero? ");
        int numero = entrada.nextInt();

        System.out.println("O numero lido foi [" + numero +"]");
        entrada.close();
    }  
}

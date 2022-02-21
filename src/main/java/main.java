
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Homem homem = new Homem();
        Mulher mulher = new Mulher();
        int escolha = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Homem-1 \n"
                + "Mulher-2");
        
        try {
            escolha = teclado.nextInt();
            
        } catch (Exception e) {
            System.out.println("O input precisa ser obrigatoriamente um numero inteiro.");
            System.exit(0);
        }
        
        switch (escolha) {
            case 1:
                System.out.println(homem.Shomem());
                
                break;
            
            case 2:
                System.out.println(mulher.Smulher());
                
                break;
            default:
                System.out.print("Opção invalida");
            
        }
    }
    
}

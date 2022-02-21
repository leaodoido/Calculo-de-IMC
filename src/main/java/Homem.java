
import java.util.Scanner;

public class Homem extends Pessoa {

    String saida;

    public String IMC(Pessoa p) {
        String arroz = super.IMC(p);
        Double IMC = Double.parseDouble(arroz);

        if (IMC < 20.7) {
            saida = "IMC: " + IMC + " Abaixo do peso ideal";
        } else if (20.7 < IMC && IMC < 26.4) {
            saida = "IMC: " + IMC + " Peso Ideal";
        } else {
            saida = "IMC: " + IMC + " acima do peso ideal";
        }

        return saida;
    }

    public String Shomem() {
        Scanner teclado = new Scanner(System.in);
        System.out.println(this);
        setNome(teclado.next());
        try {
            setPeso(teclado.nextDouble());
            setAltura(teclado.nextDouble());

        } catch (Exception e) {
            System.out.println("Use apenas números, caso queira usar um numero inteiro utilize ',' e não '.'");
            System.exit(0);
        }

        String Shomem = "\n \n" + IMC(this) + "\n" + getNome() + "\n" + getPeso()
                + "\n" + getAltura() + "\n";

        return Shomem;
    }

}

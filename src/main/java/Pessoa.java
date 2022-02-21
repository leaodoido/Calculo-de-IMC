
public class Pessoa {

    private String nome;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String IMC(Pessoa p) {
        String IMC = "";

        IMC = "" + peso / (altura * altura);

        return IMC;
    }

    @Override
    public String toString() {
        return " Nome: <nome da pessoa> \n Peso: <seu peso> \n Altura: <sua altura>";
    }

}

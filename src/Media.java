public class Media {

    public static void main (String[] args) {
        calcularMedia();
    }

    public static  void calcularMedia() {
        double nota1 = 10;
        double nota2 = 7.5;
        double nota3 = 5;
        double nota4 = 10;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("O valor da sua média final é " + media);
    }
}

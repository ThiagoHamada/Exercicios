public class CalculaMedias {
    public static void main(String[] args) {

        float primeiramedia = (float) (8 + 9 + 7) / 3;
        float segundamedia = (float) ((4 + 5 + 6) / 3.0);
        float somamedias = primeiramedia + segundamedia;

        float mediadamedia = somamedias / 2;

        System.out.println("Média dos números 8, 9 e 7: " + primeiramedia);
        System.out.println("Média dos números 4, 5 e 6: " + segundamedia);
        System.out.println("Soma das médias: " + somamedias);
        System.out.println("Média das médias: " + mediadamedia);
    }
}

public class Main {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");

        while (proximo <= 500) {
            System.out.print(primeiro + " ");
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}

import java.util.Scanner;
public class Beecrowd1021 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        float N;
        int valor,nota100,nota50,nota20,nota10,nota5,nota2,moeda1,moeda050,moeda025,moeda010,moeda005,moeda001;
        
        //ler a variável
        N = leitor.nextFloat();
        
        //transformar valor para centavos
        valor = (int) (N*100);
        
        //atribuir valores às variáveis
        nota100 = valor/10000;
        valor %= 10000;
        nota50 = valor/5000;
        valor %= 5000;
        nota20 = valor/2000;
        valor %= 2000;
        nota10 = valor/1000;
        valor %= 1000;
        nota5 = valor/500;
        valor %= 500;
        nota2 = valor/200;
        valor %= 200;
        moeda1 = valor/100;
        valor %= 100;
        moeda050 = valor/50;
        valor %= 50;
        moeda025 = valor/25;
        valor %= 25;
        moeda010 = valor/10;
        valor %= 10;
        moeda005 = valor/5;
        valor %= 5;
        moeda001 = valor;
        
        //mostrar resultado no console
        System.out.printf("NOTAS:%n%d nota(s) de R$ 100.00%n%d nota(s) de R$ 50.00%n%d nota(s) de R$ 20.00%n%d nota(s) de R$ 10.00%n%d nota(s) de R$ 5.00%n%d nota(s) de R$ 2.00%n", nota100,nota50,nota20,nota10,nota5,nota2);
        System.out.printf("MOEDAS:%n%d moeda(s) de R$ 1.00%n%d moeda(s) de R$ 0.50%n%d moeda(s) de R$ 0.25%n%d moeda(s) de R$ 0.10%n%d moeda(s) de R$ 0.05%n%d moeda(s) de R$ 0.01%n", moeda1,moeda050,moeda025,moeda010,moeda005,moeda001);
    }
}
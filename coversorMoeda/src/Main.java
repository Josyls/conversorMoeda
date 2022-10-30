
// Iniciei o programa importando o comando de entrada Scanner;
import java.util.Scanner;

// Este próximo comando cria uma classe;
public class Main {

    // Neste comando eu informo onde meu programa inicia;

    public static void main(String[] args) {

        // Aqui foram declaradas as variáveis;

        double dolar;
        double euro;
        double libra;
        double pesoArgentino;
        double real;

        // Este comando instacia o objeto typeIt (cria um novo objeto);
        Scanner typeIt = new Scanner(System.in);

        // Este comando apenas printa a frase que você colocar dentro das Aspas;
        System.out.println("Quantos reais você tem? ");

        // Este comando (typeIt.nextInt()) atribui o valor que o usuario inserir para a variável real;
        real = typeIt.nextInt();

        // As próximas variáveis recebem o valor da variável real e dividem pelo valor do câmbio em questão;

        dolar = real / 5.20;
        libra = real / 6.42;
        euro = real / 5.53;
        pesoArgentino = real / 0.04;

        //  Os comandos seguintes printam o valor das variáveis acima;

        System.out.println("O seu valor em reais equivale a: US$ " + dolar + "  (Valor convertido para Dólar)" ) ;
        System.out.println("O seu valor em reais equivale a: £ " + libra + "  (Valor convertido para Libra)" );
        System.out.println("O seu valor em reais equivale a: € " + euro + "  (Valor convertido para Euro)" );
        System.out.println("O seu valor em reais equivale a: ARS " + pesoArgentino + "  (Valor convertido para Peso Argentino)" );

        // Nesta função encerramos o uso do objeto (typeIt) criado para entrada de dados;
        typeIt.close();
    }

    // Essa última Chave representa o fim do programa;
}
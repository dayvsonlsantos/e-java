import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Arrays -> Armazena vários valores do mesmo tipo
        
        // tipo[] nomeVariavel = new tipo[5];
        String[] nomes = new String[5]; //Obrigado a definir o tamanho dele;
        // Array começa em 0

        nomes[0] = "Kakashi";
        nomes[1] = "Naruto";
        nomes[2] = "Sasuke";
        nomes[3] = "Sakura";
        nomes[4] = "Itachi";

        //System.out.println(nomes[0]);

        for (int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++) {
            System.out.print(nomes[posicaoVetor] + " ");
        }

        // No Java também podemos criar um vetor com valores iniciais, dessa forma, 
        // ele detecta automaticamente quantas posições temos no array:

        String[] personagens = new String[]{
            "Kakashi", "Naruto", "Sasuke", "Sakura", "Itachi"
        };

        System.out.println("\nUsando For: \n");

        for (int posicaoVetor = 0; posicaoVetor < personagens.length; posicaoVetor++) {
            System.out.print(personagens[posicaoVetor] + " ");
        }

        // No entanto, em vez de utilizarmos esse for, podemos usar a Classe Arrays
        // Essa fornece um método, chamado toString, cujo podemos usar para imprimir todos os valores do array

        System.out.println("\nUsando Arrays.toString: " + Arrays.toString(personagens));

        System.out.println("\n");

        int[] numeros = new int[100];

        // Podemos preencher todo o array com um mesmo valor, para isso podemos usar a Classe Array
        
        //(Array, valor para inserir)
        Arrays.fill(numeros, 0);

        System.out.println("Usando Arrays.fill: " +numeros[62]);

    }
}

// Importando Scanner;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float numero;
        String jogo;
        
        System.out.println("Digite o seu jogo favorito: ");

        // Variável Scanner com S maiusculo, indica que é uma classe;
        // Sempre que criamos uma variável do tipo classe, criamos um objeto;
        // Classe objeto = instancia
        Scanner leitor = new Scanner(System.in); // Esse System.in indica que o valor é lido do teclado do usuário
        // Criamos um objeto leitor, para ler valores digitados do teclado

        //Utilizamos o useDelimiter para fazer com que o Java utilize os espaços como quebra de linha,
        //e assim salve o nome completo na variável, caso contrário, só salvaria apenas a primeira palavra antes do espaço.
        //Exemplo:
            //Sem useDelimiter -> League Of Legends -> League (Salvo na variável)
            //Com useDelimiter -> League Of Legends -> League Of Legends (Salvo na variável)
        leitor.useDelimiter("[\r\n]+"); // -> Considera como o final da string /r ou /n
                //Configurando (Definindo que os separadores é \r ou \n)
                //Esse + ao final, indica que os caracteres anteriores podem repetir


        //next é uma função que está dentro do Scanner
        //É como se tivessemos usando uma funcionalidade para fazer a leitura
        jogo = leitor.next();
                    //nextInt -> p/ Int
                    //nextFloat -> p/ float
                        //Nesse caso, como nosso computador está em português, precisamos digitar os valores float no terminal com virgula, e não ponto
                        //Ex: 1,2
                    //next -> String
                    //nextLine -> Pega a próxima linha, ou seja, inclui as quebras de linha;

        System.out.println("Jogo é: " + jogo);


        //Importante:
            // Quando respondemos o terminal, e o valor é salvo na variável
            // ao utilizar o nextLine, salvamos também o "enter" = /n
            // Ou seja, o nextLine acaba salvando o /n executado ao clicar enter, ao enviar a resposta da pergunta anterior;
            // Explicação em 14min desse vídeo: https://www.youtube.com/watch?v=zo47yrXIpdI&list=PLGPluF_nhP9p6zWTN88ZJ1q9J_ZK148-f&index=7

        String elo;
        int tier;
        String campeao;

        System.out.println("Qual o seu elo? ");
        elo = leitor.nextLine();

        System.out.println("Qual o seu tier? ");

        //Para "solucinar" essa situação, criamos uma variável temporária
        //Nesse caso, valor, cuja recebe o valor como um String, e depois convertemos para Int

        String valor = leitor.nextLine();
        tier = Integer.parseInt(valor); // -> Convertendo String em int
                // Integer -> Integer.parseInt(string);
                // Float -> Float.parseFloat(string);
                // Double -> Double.parseDouble(string);


        System.out.println("Qual o seu campeão preferido? ");
        campeao = leitor.nextLine();

        System.out.println("Você é mono " + campeao + " no elo " + elo + " " + tier);

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Variáveis do tipo primitivo -> Ocupam um espaço fixo na memória;
        // Podem ser: Inteiros, ponto flutuante (Decimais), Caracteres, Boolean;
            // Tipos de Inteiros: Byte, Short, Int e Long
                // Byte -> Armazena valores entre -128 e 127
                // Short -> Armazena valores entre -32768 e 32767
                // Int -> Armazena valores entre -2147483648 e 2147483647
                // Long -> Armazena valores entre 

            // Tipos de Ponto Flutuante
                // Float -> Necessário indicar que estamos utilizando o float, para isso adicionamos um f ao final do valor
                // Double -> Armazena um valor que é o dobro do tamanho, e pode ter muitos números depois da virgula
        
            // Tipo Caractere
                // char -> Armazena um único caractere
            
            // Tipo Booleano
                // boolean -> Armazena valores verdadeiro e falso;
        
        // Variável não primitiva
            // String -> Apresenta um tamanho variável, sendo do tipo classe.
            // Portanto, será um objeto, e por isso, ao declar a variável o tipo dela, será iniciado com letra maiuscula. Ex: String nome;
            // Precisa usar aspas duplas
        // Para declarar uma variável:
            // tipo nome inicializador(opcional);
                // Lembrando que o nome da variável não pode ser uma palavra reservada do Java
                // Nem podemos iniciar com números

            // Variaveis do tipo inteiro
            byte numeroPequeno = 127;
            System.out.println("Tipo Byte: " + numeroPequeno);

            short numeroShort = -32768;
            System.out.println("Tipo Short: " + numeroShort);

            int numeroMaior = -2147483648;
            System.out.println("Tipo Int: " + numeroMaior);

            // O java continua apresentando erro nesse valor abaixo, apesar de tal tipo de variável aceitar tal numero;
            // Isso ocorre pois o java reconhece os numeros por padrão como inteiro
            // Para resolver isso passamos o caractere "l" ao final, indicando o tipo long
            long numeroEnorme = 922337203685477000l;
            System.out.println("Tipo Long: " + numeroEnorme);


            // Variaveis do tipo Ponto Flutuante
            
            // Para indicarmos para o java, que o valor é do tipo float, precisamos adicionar um f na variável
            float peso = 78.7f; // -> = a 78,7
            
            double pi = 3.143459436578943756934;

            System.out.println("Tipo float: " + peso);
            System.out.println("Tipo double: " + pi);

            // Variáveis do tipo caractere
            char letra = 'z'; 
            String nome = "Dayvson"; // -> Precisa usar aspas duplas

            System.out.println("Tipo Char: " + letra);
            System.out.println("Tipo String: " + nome);

            // Variavel booleano
            boolean estouComFome = false;
            System.out.println("Tipo Boolean: " + estouComFome);
    }
}

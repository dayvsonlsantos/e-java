public class App {
    public static void main(String[] args) throws Exception {
        String nomeCompleto; // Declarando
        //Se tentar imprimir a variável sem iniciá-la, dará erro, pois é preciso definir um valor para tal;
        nomeCompleto = "Uzumaki Naruto"; // Inicializando
        System.out.println(nomeCompleto); // Usando

        String filme = "Vingadores"; // %s
        int anoLancamento = 2015; // %d
        int duracao = 240;
        float notaCritica = 8.7f; // %f
        char letraInicial = 'V'; // %c
        boolean foiSucesso = true; // %b


        // Como imprimir no console os valores das variáveis:

        // Opção 02: Forma tradicional
        System.out.println("O Filme: " + filme);
        System.out.println("Ano de Lançamento: "+ anoLancamento);
        System.out.println("Duração: " + duracao);
        System.out.println("Nota da Crítica: " + notaCritica);
        System.out.println("Letra Inicial: " + letraInicial);
        System.out.println("Foi sucesso? " + foiSucesso);

        // Opção 02: Utilizando o Format
        System.out.format("O filme %s lançado em %d tem uma duração de %d minutos.", filme, anoLancamento, duracao);
            // Tambem podemos colocar dentro de uma variável, mas para fazer isso com o format, precisamos:
                String texto = String.format("\nO filme %s lançado em %d tem uma duração de %d minutos.", filme, anoLancamento, duracao);
                System.out.println(texto);
        //Observação: System.err.println -> Usado para quando queremos imprimir no console uma mensagem de Erro.
    }
}

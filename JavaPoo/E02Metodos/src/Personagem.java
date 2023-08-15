import java.util.Random;

public class Personagem{
    String nome;
    int nivel;
    int forca;

    //Criando métodos no Java -> Criamos para evitar repitições de código;
    //Métodos são as tarefas/ações da classe, nesse caso, ações dos personagens
    //Métodos iniciam com letra minuscula

    //Criando uma ação de exibirStatus:

    //retorno nomeDoMetodo() {}
    void mostrarStatus(){
        System.out.format("\nPersonagem: %s (lvl %d) com %d de força", nome, nivel, forca);
    }
    //void -> Não está retornando nada

    
    //Podemos também passar parâmetro, por exemplo, quem o personagem atacou.
    //Método que não retornou nada e recebe um parâmetro alvo que é do tipo String
               //TipoDaVariavel Variavel
    void atacar(String alvo, String habilidade){
        // String vazia, ou seja, "" o tamanho (.length) é igual a 0
        int dadoCausado = calcularDano();
        if (habilidade.length() == 0){
            System.out.format("\n%s atacou %s e causou %d de dano.", nome, alvo, dadoCausado);
        } else {
            System.out.format("\n%s usou '%s' contra %s e causou %d de dano.", nome, habilidade, alvo, dadoCausado);
        }
    }
        // Podemos passar vários parâmetros no método, porém não é algo intuitivo.

    //Método para calcular o dano causado num personagem
    int calcularDano(){
        Random gerador = new Random();
        //A classe Random, gera valores a partir de 0. Como nosso dado20Faces, inicia em 1, faremos 1 + no inicio.
        // Pois 1 + 0 => 1
        // 1 + 19 => 20
        // Assim, conseguimos valores entre 1 e 20;
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;

        return dano;
    }
}
import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Gerar números no Java

        //Método 01
        
        //Math.random() -> Gera um valor aleatório entre 0 e 1, portando é um double;
        double dado6Faces = Math.random();
        JOptionPane.showMessageDialog(null, dado6Faces);

        //Para resolver a questão de ser apenas entre 0 e 1, podemos acrescentar soma e multiplicação a geração:
        int dado7Faces = 1 + (int) (Math.random() * 6);
        JOptionPane.showMessageDialog(null, dado7Faces);
        // Dessa forma acima, serão gerados valores entre 1 e 6

        //Método 02

        //Podemos utilizar a classe Random -> Possui um desempenho melhor do que o método 01
        //classe objeto = instancia
        Random gerador = new Random();
        int numero = gerador.nextInt(6) + 1; // -> Dessa forma, geramos um número inteiro, onde 6 é o valor máximo e o 1, o valor mínimo;
            // esse + 1, também poderia ter sido colocado na frente: 1 + gerador.nextInt(6); 
        JOptionPane.showMessageDialog(null, numero);

        // Além disso, podemos ainda passar um parâmetro seed no random, o qual faz com que sempre exiba aquele
        // valor determinado, e portando deixe de ser aleatório. Bastante usado para testes do programa.
        // Igual uma seed no minecraft

        Random gerador2 = new Random(9);
        int numero2 = gerador2.nextInt(100) + 1; 
        JOptionPane.showMessageDialog(null, numero2);

        String facesString = JOptionPane.showInputDialog(null, "Quantas faces tem o dado? ");
        int facesDado = Integer.parseInt(facesString);

        int resultado = 1 + gerador.nextInt(facesDado);

        JOptionPane.showMessageDialog(null, "Você tirou: " + resultado + " no dado.");
    }
}

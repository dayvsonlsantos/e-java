import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numeroA = 5;
        double numeroB = 2;

        double resultado = numeroA / 2.0; // -> Para o Java compreender que o resultado será um float, precisamos começar com float, caso contrario, ele dirá que 5/2 = 2. Em vez de 2,5.
        // Tambem podemos fazer assim:
        double resultado2 = (double) numeroA / 2; // -> (double) -> Isso se chama cast, onde forço a conversão para double;

        // % -> Resto da divisão -> mod
        
        JOptionPane.showMessageDialog(null, resultado + " e " + resultado2, "Matemática", JOptionPane.INFORMATION_MESSAGE);

    // Aglumas funções matemáticas da classe Math:
            // -> Existem várias outras

        //Math.abs -> Valor absoluto
        int resultado3 = Math.abs(-5);
        JOptionPane.showMessageDialog(null, resultado3);

        //Math.pow(base, expoente) -> Expoente
        int resultado4 = (int) Math.pow(10,2); // 10 ^ 2
            // (int) -> Usei o cast para forçar a conversão para inteiro
        JOptionPane.showMessageDialog(null, resultado4);

        //Math.sqrt -> Raiz quadrada
        int resultado5 = (int) Math.sqrt(4);
        JOptionPane.showMessageDialog(null, resultado5);

        //Math.ceil -> Arredondo um número para cima
        double resultado6 = Math.ceil(10.54);
        JOptionPane.showMessageDialog(null, resultado6);

        //Math.floor -> Arredondo um número para baixi
        double resultado7 = Math.floor(10.54);
        JOptionPane.showMessageDialog(null, resultado7);

        //Math.min -> Retorna o valor mínimo entre dois valores
        int resultado8 = Math.min(10,5);
        JOptionPane.showMessageDialog(null, resultado8);

        //Math.max -> Retorna o valor máximo entre dois valores
        int resultado9 = Math.max(10,5);
        JOptionPane.showMessageDialog(null, resultado9);

    }
}

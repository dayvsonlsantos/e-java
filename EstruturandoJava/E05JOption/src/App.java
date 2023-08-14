import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String filme = JOptionPane.showInputDialog(null, "Qual o seu filme favorito? ", "Academia dos Devs", JOptionPane.QUESTION_MESSAGE);
                        //Classe JOptionPane
                        //Método showInternalInputDialog
                        //parentComponent -> Elemento pai
                        //title -> Titulo
                        //JOptionPane.QUESTION_MESSAGE -> Tipo da mensagem, poderiamos passar valores, porém como não sabemos qual valor é cada tipo, podemos usar constantes, como a QUESTION_MESSAGE
        JOptionPane.showMessageDialog(null, "Filme preferido: " + filme, "Academia dos Devs", JOptionPane.INFORMATION_MESSAGE);

        //o JOptionPane sempre retorna uma String, então para salvar numeros, precisamos usar o parse e converter.
    }
}


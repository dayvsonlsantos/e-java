import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    //Classe principal
    public static void main(String[] args) throws Exception {
        // Iphone 12, tela de 6.1, 256gb
        // Galaxy Note 20 Ultra, tela de 6.9, 256gb
        // Xiaomi Mi 11 Ultra, tela de 6.81, 128gb

        //Para criar uma variável no java:
            //<tipoVariavel> nomeVariavel = valor;
            // int numero = 5; -> // Ex: para criar uma variável do tipo inteiro (que é uma variável do tipo primitivo).

        //Ao criar uma variável do tipo classe/objeto, estamos tentando criar um objeto.
        //Ou seja, sempre que criarmos uma variável do tipo classe, estaremos criando um objeto.
        //Para criar uma variável do tipo classe/objeto, faremos:
            //<TipoDaClasse> nomeObjeto = new <TipoDaClasse>();
        Celular celularA = new Celular();
        // Celular celularA -> Estamos declarando uma variável do tipo celular. Mas até então, é como se fosse algo vázio;
        // new Celular(); -> Estamos instanciando (criar um novo) um objeto;
        
        //Como modificar o valor desse objeto do tipo Celular ?
        //nomeObjeto.Atributo = estadoAtual
        celularA.nome = "iPhone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        Celular celularB = new Celular(); //Salvamos esse novo objeto criado, na variável celularB

        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        
        celularC.nome = "Xiaomi Mi 11 Ultra";
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";

        String iphone12 = String.format("\n%s \nTela de: %.1f \nArmazenamento: %dgb \nSO: %s", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        String galaxyNote20 = String.format("\n%s \nTela de: %.1f \nArmazenamento: %dgb \nSO: %s", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        String XiaomiMi11Ultra = String.format("\n%s \nTela de: %.1f \nArmazenamento: %dgb \nSO: %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);

        // System.out.format("\nCelular %s com tela de %.1f, com %dgb e SO %s", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        // System.out.format("\nCelular %s com tela de %.1f, com %dgb e SO %s", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        // System.out.format("\nCelular %s com tela de %.2f, com %dgb e SO %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);

        String[] options = {
            "iPhone 12",
            "Galaxy Note 20 Ultra",
            "Xiaomi Mi 11 Ultra"
        };

        int opcaoSmartphone = JOptionPane.showOptionDialog(null, "Informações do Smartphone", "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        String nomeImagem = ""; 
        String smartphoneEscolhido = "";

        switch (opcaoSmartphone) {
            case 0:
                nomeImagem = "iPhone12.png";
                smartphoneEscolhido = iphone12;
                break;
            case 1:
                nomeImagem = "galaxyNote20Ultra.jpg";
                smartphoneEscolhido = galaxyNote20;
                break;
            case 2:
                nomeImagem = "xiaomiMi11Ultra.png";
                smartphoneEscolhido = XiaomiMi11Ultra;
                break;
            default:
                nomeImagem = "default.png";
                smartphoneEscolhido = "Nenhum smartphone foi escolhido";
                break;
        }

        String caminhoImagem = String.format("/Volumes/Arquivos/Github/e-java/JavaPoo/E01AulaInicial/src/images/%s", nomeImagem);

        ImageIcon icone = new ImageIcon(caminhoImagem);

        JOptionPane.showMessageDialog(
            null, 
            smartphoneEscolhido, 
            "Lançamento:", 
            JOptionPane.INFORMATION_MESSAGE,
            icone);
    }
}

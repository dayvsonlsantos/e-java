import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String personagem = "Sasuke";

        switch (personagem) {
            case "Naruto":
                System.out.println("Eu sou o Naruto Uzumaki! Datebayo");
                break;
            case "Sasuke":
                System.out.println("Eu sou Uchiha Sasuke!");
                break;
            default:
                System.out.println("Eu sou Inevitável!");
                break; //Opcional no default
        }

        //Exemplo de como usar o Switch sem break; -> Reduz código

        int diaDaSemana = 2;
        
        switch (diaDaSemana) {
            case 2: // Segunda
            case 3: // Terça
            case 4: // Quarta
            case 5: // Quinta
            case 6: // Sexta
                System.out.println("Dia da Semana");                
                break;
            case 1: // Domingo
            case 7: // Sabado
                System.out.println("Final de Semana");                
                break;
            default:
                break;
        }
    
        
        String personagemComFoto = JOptionPane.showInputDialog(null, "Digite um personagem do Dradon Ball: ");
        String nomeImagem = "";
        String origem = "";

        switch (personagemComFoto) {
            case "Goku":
                origem = "Planela Sayajin";
                nomeImagem = "goku-icone";
                break;
            case "Piccolo":
                origem = "Planela Namekuseiji";
                nomeImagem = "piccolo-icone";
                break;
            case "Vegeta":
                origem = "Planela Sayajin";
                nomeImagem = "vegeta-icone";
                break;
            case "Bulma":
                origem = "Planela Terra";
                nomeImagem = "bulma-icone";
                break;
            case "Kuririn":
                origem = "Planela Terra";
                nomeImagem = "kuririn-icone";
                break;
            default:
                origem = "Desconhecida";
                nomeImagem = "default";
                break;
        }

        String informacoesPersonagem = String.format("Personagem: %s\nOrigem: %s", personagemComFoto, origem);
        
        String caminhoImagem = String.format("/Volumes/Arquivos/Github/java/iniciando-em-java/Switch.9/src/images/%s.png", nomeImagem);
        
        //Criamos um objeto da class ImageIcon
        ImageIcon icone = new ImageIcon(caminhoImagem);


        //O showConfirmDialog permite criar janelas com botoes
        JOptionPane.showConfirmDialog(null, informacoesPersonagem, "Descrição", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);
                                    // Parent, mensagem, tipo de janela, opções, tipo de mensagem, icone
    }
}

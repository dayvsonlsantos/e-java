public class App {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome = "Hércoles";
        heroi.nivel = 2;
        heroi.forca = 16;

        //Chamando o método;
        //objeto.metodo
        heroi.mostrarStatus();

        //Chamei um método atacar e passei como argumento uma string "Hydra"
        heroi.atacar("Hydra", "Espada Ardente");

        //Argumento -> Passar uma informação
        //Parâmetro -> Recebe uma informação
    }
}

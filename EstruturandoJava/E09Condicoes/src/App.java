public class App {
    public static void main(String[] args) throws Exception {
        int poderDeLuta = 7000;

        if(poderDeLuta > 8000) {
            System.out.println("É sim");
        }else{
            System.out.println("É nao");
        }

        String video = "naruto";
        
        // If ternario, recomendado p/ quando tivermos apenas uma condição:
        String categoria = (video == "naruto") ? "Anime" : "Série";

        System.out.println(categoria);
    }
}

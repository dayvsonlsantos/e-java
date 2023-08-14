public class App {
    public static void main(String[] args) throws Exception {
        //While (enquanto)
        //While (<condicao>) {}
        int contador = 0;
        while (contador < 3) {
            System.out.println("Olá");
            contador++;
        }

        /*
            do {
                ...
            } while (<condicao>);
        */

        contador = 0;

        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 100);

        // for(<valorInicial>; <condicao>; <passo>) {}
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

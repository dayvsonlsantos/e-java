import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        int numeroDeLados = 0;
        float tamanhoDoLado = 0f;
        String continuar = "n";
        int contador = 0;
        int quantidadeDePoligonos = 1;
        float areaTotal = 0f;

        System.out.println("\n-----------------------------------------");
        System.out.println("\nOlá, seja bem vindo ao meu programa :)");

        System.out.print("\nAntes de iniciarmos, quantos polígonos você deseja informar ?\n\nResposta: ");
        quantidadeDePoligonos = leitor.nextInt();

        if (quantidadeDePoligonos > 0) {
            int[] quantLadosPoligono = new int[quantidadeDePoligonos];
            float[] tamanhoLadoPoligono = new float[quantidadeDePoligonos];

            do {
                System.out.println("\n-----------------------------------------");

                System.out.format("\nOkay. Agora, por favor, informe o número de lados do %dº polígono regular: ",
                        contador + 1);

                numeroDeLados = leitor.nextInt();
                quantLadosPoligono[contador] = numeroDeLados;

                System.out.format("\nHá sim, por favor, também informe o tamanho do lado deste %dº polígono em cm: ",
                        contador + 1);

                tamanhoDoLado = leitor.nextFloat();
                tamanhoLadoPoligono[contador] = tamanhoDoLado;

                switch (numeroDeLados) {
                    case 1:
                    case 2:
                        System.out.println("\n-----------------------------------------");
                        System.out.println("Não existe polígonos com essa quantidade de lados");
                        System.out.println("\nFavor informar um poligono válido");
                        break;
                    case 3:
                        // System.out.println("Esse polígono é um triângulo");
                        break;
                    case 4:
                        // System.out.println("Esse polígono é um quadrado");
                        break;
                    default:
                        System.out.println("Polígonos com mais de 4 lados, ainda será implementado ao programa");
                        System.out.println("\n-----------------------------------------");
                        System.out.println("Polígonos com mais de 4 lados, ainda será implementado ao programa");
                        System.out.println("\nFavor informar um poligono válido, com 3 ou 4 lados");
                        break;
                }

                if (numeroDeLados >= 3 && numeroDeLados <= 4) {
                    if ((contador + 1) < quantidadeDePoligonos && numeroDeLados >= 3 && numeroDeLados <= 4) {
                        System.out.println("\n\n***");
                        System.out.print(
                                "\n-> Você deseja inserir outro polígono ?\nDigite: \n s para sim; \n qualquer tecla para não;\n\nResposta: ");
                        continuar = leitor.next();
                    } else {
                        continuar = "n";
                    }

                    if (continuar.equals("s") || continuar.equals("S")) {
                        contador++;
                    }
                } else {
                    continuar = "s";
                }

            } while (continuar.equals("s") || continuar.equals("S"));

            System.out.println("\n-----------------------------------------");

            String calcularArea = "s";
            System.out.println("\n***");
            System.out.print(
                    "\n-> Você gostaria de calcular as áreas ?\nDigite: \n s - para sim;\n Qualquer tecla para não;\n\nResposta: ");
            calcularArea = leitor.next();

            if (calcularArea.equals("s") || calcularArea.equals("S")) {

                System.out.println("\n");
                System.out.println("-----------------------------------------");
                System.out.println("\nPolígonos informados e suas respectivas áreas:\n");

                for (int i = 0; i < quantidadeDePoligonos; i++) {
                    if (quantLadosPoligono[i] != 0) {
                        switch (quantLadosPoligono[i]) {
                            case 3:
                                double areaTriangulo = (Math.pow(tamanhoLadoPoligono[i], 2) * Math.sqrt(3)) / 4;
                                System.out.format("\nTriângulo de lado %.2f cm e área %.2f cm2", tamanhoLadoPoligono[i],
                                        areaTriangulo);
                                areaTotal += areaTriangulo;
                                break;
                            case 4:
                                System.out.format("\nQuadrado de lado %.2f cm e área %.2f cm2", tamanhoLadoPoligono[i],
                                        tamanhoLadoPoligono[i] * tamanhoLadoPoligono[i]);
                                areaTotal += (tamanhoLadoPoligono[i] * tamanhoLadoPoligono[i]);
                                break;
                            default:
                                break;
                        }
                    }
                }
                System.out.format("\n\nÁrea total %.2f cm2\n\n", areaTotal);
            } else {
                System.out.println("\n\nTudo bem. Obrigado por usar o programa.");
            }
        } else if (quantidadeDePoligonos == 0){
            System.out.println("\nTudo bem. Obrigado por abrir o programa. Até mais!\n");
        } else {
            System.out.println("\nNão é possível informar valores negativos para essa pergunta.");
            System.out.println("\nO programa será encerrado. Obrigado por utilizar :)\n");
        }
        System.out.println("-----------------------------------------");

    }
}
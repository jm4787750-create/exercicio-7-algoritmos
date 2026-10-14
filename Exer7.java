// Autor: Jorge Miguel Calixto da Silva
// Exercício adaptado com autorização da autora original.

import java.util.Scanner;

public class Exer7 {
    private static final int TOTAL_PESSOAS = 10;

    public static void main(String[] args) {
        int pessoasMaioresDe50 = 0;
        int pessoasDe10a20 = 0;
        int pessoasComPesoAbaixoDe40 = 0;
        double somaAlturasDe10a20 = 0.0;

        try (Scanner entrada = new Scanner(System.in)) {
            for (int pessoa = 1; pessoa <= TOTAL_PESSOAS; pessoa++) {
                System.out.println("Pessoa " + pessoa);

                System.out.print("Digite a idade: ");
                int idade = entrada.nextInt();

                System.out.print("Digite o peso em kg: ");
                double peso = entrada.nextDouble();

                System.out.print("Digite a altura em metros: ");
                double altura = entrada.nextDouble();

                if (idade > 50) {
                    pessoasMaioresDe50++;
                }

                if (idade >= 10 && idade <= 20) {
                    somaAlturasDe10a20 += altura;
                    pessoasDe10a20++;
                }

                if (peso < 40.0) {
                    pessoasComPesoAbaixoDe40++;
                }

                System.out.println();
            }
        }

        double mediaAlturaDe10a20 = pessoasDe10a20 > 0
                ? somaAlturasDe10a20 / pessoasDe10a20
                : 0.0;
        double porcentagemPesoAbaixoDe40 =
                (pessoasComPesoAbaixoDe40 * 100.0) / TOTAL_PESSOAS;

        System.out.println("RESULTADO");
        System.out.println("Pessoas com mais de 50 anos: " + pessoasMaioresDe50);

        if (pessoasDe10a20 > 0) {
            System.out.printf(
                    "Média das alturas entre 10 e 20 anos: %.2f m%n",
                    mediaAlturaDe10a20
            );
        } else {
            System.out.println(
                    "Média das alturas entre 10 e 20 anos: nenhuma pessoa nessa faixa etária."
            );
        }

        System.out.printf(
                "Pessoas com peso abaixo de 40 kg: %.2f%%%n",
                porcentagemPesoAbaixoDe40
        );
    }
}
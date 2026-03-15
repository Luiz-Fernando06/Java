package academy.devdojo.maratonajava.introducao;
/*Pratica

       Crie variaveis para os campos descritos abaixo entre <> e imprima
       a seguinte mensagem:

       Eu <nome>, morando no endereço <endereço>, confirmo que recebi o
        salario de <salario>, na data <data>*/

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        String nome = "GordoFreudo";
        String endereco = "Anselmo de andrade 275";
        double salario = 810.50;
        String dataRecebimentoSalario = "06/07/2006";
        String relatorio = "Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário de "
                + salario + ","+" na data " + dataRecebimentoSalario;
        
        System.out.println(relatorio);
    }
}

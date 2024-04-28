public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        /**
         No java, existem algumas palavras reservadas para a representação dos tipos
         de dados básicos que precisam ser manipulados para a construção de programa.
         São conhecidos como tipos primitivos.

         Em Java existem 8 tipos primitivos, eles são:
         In, byte, shot, long, float, double, boolean e char.

         Eles não são considerados objetos.

         Variável é uma identificação de um espaço em memória utilizado pelo nosso programa.
         Seguindo as convenções em linguagem de programação, toda variável é composta por:
         Tipo de dados + identificação + valor atribuído.

         A estrutura padrão para se declarar uma variável sempre é:
         <tipo> <nomeVariavel> <atribuicaoDeValorOpcional>.

         exemplos:
         
         **/
        // exemplo declaração de variável.

        int idade;
        int anoFabricacao = 2021;
        double salarioMinino = 2.500; // na linguagem java o ponto não quer dizer milhar. O valor para ser
        // 2.500 precisa ser: 2500 - essa é a forma correta de atribuir um valor milhar.


        // Exemplo dos tipos de dados.

        byte idade = 123;
        short ano = 2024;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F; // o tipo float precisa colocar F no final
        double salario = 1275.33;

        // Java é fortemente tipado, então precisa ter alguns cuidados.
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = numeroNormal; // nesse caso precisa tomar cuidado, pois pode ser que em determinado ponto
        // do código, o valor de numeroNormal seja maior que o valor que short suporta.


    
    }
}

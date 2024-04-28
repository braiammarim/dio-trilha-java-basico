public class VariaveisConstantes {
    
        /** Variáveis e Constantes
         Uma variável é uma área de memória, associada a um nome,
         que pode armazenar valores de um determinado tipo. Um tipo de dado
         define um conjunto de valores e um conjunto de operações.
         Java é uma linguagem com rigidez de tipos, differente de linguagens
         como JavaScript, onde declarar o tipo da variável não é obrigatório.

         Constantes - já as constantes são valores armazenados em memória que não podem ser
         modificados depois de declarados. Em Java, esses valores são representados
         pela palavra reservada -final-, seguida do tipo.

         por convenção, Constantes são sempre escritas em CAIXA ALTA.

         Exemplos do uso de variáveis e constantes.

         * **/
    public static void main(String[] args) {
        /*
         * está linha é considerada como declaração de var
         * variável numero com valor 5 regira: tipo + nome.
         */
        int numero = 5;

        /*
         * na linha abaixo iremos alterar o valor da variável
         */
        numero = 10;
        System.out.println(numero);

        /* Ao usar a palavra reservada final, é determinado o valor fixo
         * Está variavel não podersá obter outro valor;
         * logo, foi determinado uma CONSTANTE na linguagem
         * 
         * EXEMPLO:
         */
    }   final double VALOR_DE_PI = 3.14;
        // esse valor não poderá ser alterado por foi colocado final no começo.
        // caso não seja adicionado será uma variável é vai ser possível alterar o valor.
        // por convenção a constante precisar estar em CAIXA ALTA.
}

import java.sql.Date;

public class OperadoresLogicos {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /**Operadores lógicos são simbolos especial que tem um significado próprio 
         para a linguagens e estão associados a operações lógicas. 
         
         A finalidade de Operadores é realizar as operações com a finalidade de chegar em um determinado resultado

         Operador de Atribuiição - Representado pelo síbolo de igualdade (=)

         Operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável.
         Em java definimos um tipo, nome e opcionalmente atribuímos um valor à variável através de operador
         de atribuição, 
        Cada tipo de dado tem uma forma de declararmos o valor à essa variável.

        Exemplos:

         **/
        String nome = "Braiam";
        int idade = 27;
        double peso = 100.0;
        char sexo = 'M'; // char permite apenas um carácter
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(idade);


        /**
         
        Operadores Aritméticos - Operador aritmético é usado para realizar operações matemáticas entre valores
        númericos, podendo se tornar ou não uma expressão mais complexa.

        Os operadores aritméticos são: + (Adição), - (Subtração), * (Multiplicação), / (Divisão),% (Resto da Divisão)

        Exemplos:
         
         **/

         double soma = 10.5 + 15.7;
         int subtracao = 113 - 25;
         int multiplicacao = 20 * 7;
         int divisao = 15 / 3;
         int modulo = 18 % 3;
         double resultado = (10 * 7) + (20 / 4);

         // OBSERVAÇÃO - O operador de adição quando usado em variáveis do tipo texto, ele realização a concatenção de textos

         //EXEMPLO

         String nomeCompleto = "LINGUAGEM" + "JAVA"; // Resultado: LINGUAGEMJAVA

         /**
          Operadores Unários - Esses operadores são aplicados jutanemnte com outro operador aritmético.
          Eles realizam alguns trabalhos básicos como incrementas, decrementar, inverter valores númericos e booleanos

          (+) Operador unário de valor positivo - úmeros são positivos sem esse operador explicitamente;
          (-) Operador unário de valor negativo - nega um número ou espressão aritmética;
          (++) Operador unário de incremento de valor - incrementa o valor em 1 unidade;
          (--) Operador unário de decremento de valor - decrementa o valor em 1 unidade;
          (!) Operador unário lógico de negação - nega o valor de uma expressão booleana;

          EXEMPLOS ABAIXO:
          **/
        int numero = 5;
        
        //imprimindo número negativo
        System.out.println(-numero); //Resultado -5

        //incrementando numero em mais 1 número, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando número em mais 1 número, imprime 7
        System.out.println(numero);
          
        //decrementando 
        
        System.out.println(- numero); // Resultado -7;
        // nesse caso não vai ser decrementando, pois o valor principal permanece 7.


        //para decrementar o valor é necessário fazer da seguinte forma:

        numero = - numero;
        //a partir daqui ele será decrementado.
    
        // para o número voltar a ser positivo precisa ser feito da seguinte forma:
        numero = numero * -1;// Volta a ser positivo.

        /**
         Operações de incrementação de valor
         **/
        int numero1 = 5;

        numero1 = numero1 + 2;
        //para incrementar de um em um pode-se fazer da seguinte forma:
        numero1++;
        System.out.println(numero1);

        // IMPORTANTE, PARA FAZER A OPERAÇÃO ++ TEM ORDEM DE PRECEDÊNCIA.
        System.out.println(++numero1); //Resultado 8
        System.out.println(numero1++); // aqui o incremento é feito após a execução
    
    }

}

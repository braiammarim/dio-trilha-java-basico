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
        String nome = "Braiam"; // String é um tipo de dado que representa texto
        int idade = 27; // int é um tipo de dado que representa números inteiros
        double peso = 100.0; // double é um tipo de dado que representa números decimais
        char sexo = 'M'; // char permite apenas um carácter. Colocar entre aspas simples
        boolean doadorOrgao = false;// boolean é um tipo de dado que representa verdadeiro ou falso
        Date dataNascimento = new Date(idade);// Date é um tipo de dado que representa data


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
         int modulo = 18 % 3; // Resto da divisão. usado para identificar se o número é impar ou par
         double resultado = (10 * 7) + (20 / 4);

         // OBSERVAÇÃO - O operador de adição quando usado em variáveis do tipo texto, ele realização a concatenção de textos

         //EXEMPLO

         String nomeCompleto = "LINGUAGEM" + "JAVA"; // Resultado: LINGUAGEMJAVA

         /**
          Operadores Unários - Esses operadores são aplicados juntamente com outro operador aritmético.
          Eles realizam alguns trabalhos básicos como incrementas, decrementar, inverter valores númericos e booleanos
          (+) Operador unário de valor positivo - Números são positivos sem esse operador explicitamente;
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
    
        // É possível negar expressões booleanas.
        // Valores Booleanos só tem duas alternativas TRUE OU FALSE

        boolean variavel = true;

        System.out.println(!variavel); // Resultado: FALSE. A expressão foi negada por conta do !



        /**
         OPERADORES TERNÁRIOS - O operador de condição ternária é uma forma resumida para definir uma
         condição e escolher por um dentre dois valores. Deve pensar numa condição ternária como se fosse
         uam condição IF normal, porém,, de uma forma em que toda a sua estrutura estará escrita numa única linha

         O operador ternário é representado pelos símbolos ? e :. Utilizados na seguinte estrutura de 
         sintaxe

         <Expressão Condicional> ? <Caso Condição Seja True> : <Caso Condição seja False>

        Exemplos abaixo:

         **/

         int c, d;
         c = 5;
         d = 6;
        
         String expressao = c==d ? "Verdadeiro" : "Falso";

         System.out.println(expressao); // Resultado: Falso


         /** OPERADORES RELACIONAIS - Os operadores relacionais avaliam a relação entre duas variáveis ou expressões
          * Nesse caso, mais precisamente, definem0-se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual
          ao da direita, retornando um valor booleano como resultado.

           == Quando desejamos verificar se uma variável é IGUAL a outra.
           != Quando desejamos verificar se uma variável é DIFERENTE da outra.
           > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
           >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL  outra.
           < Quando desejamos verificar se uma variável é MENOR QUE outra.
           <= Quando desejamos verificar se uma variável é MENOS OU IGUAL a outra.

            EXEMPLOS:
          
          **/
        int numero2 = 2;
        int numero3 = 3;

        boolean simOuNao = numero2 == numero3;

        System.out.println("NumeroDois é igual a numeroTres?" + simOuNao); // Resultado: FALSE

        simOuNao = numero2 != numero3;

        System.out.println("NumeroDois é diferente de NumeroTres?" + simOuNao); // Resultado: TRUE

        simOuNao = numero2 > numero3;

        System.out.println("NumeroDois é maior que NumeroTres?" + simOuNao); // Resultado: FALSE

        simOuNao = numero2 < numero3;

        System.out.println("NumeroDois é menor que NumeroTres?" + simOuNao); // Resultado: TRUE

        

    /** OPERADORES LÓGICOS - Os operadores lógicos representam o recurso que nos permite criar expressões
      lógicas maiores a partir da junção de duas ou mais expressões.
        - && Operador lógico AND (E) - Retorna verdadeiro se todas as expressões forem verdadeiras.
        - || Operador lógico OR (OU) - Retorna verdadeiro se pelo menos uma das expressões for verdadeira.
        - ! Operador lógico NOT (NÃO) - Retorna verdadeiro se a expressão for falsa e falso se a expressão for verdadeira.
            

     **/
    }

}

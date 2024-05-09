public class Metodos {
    public static void main(String[] args) throws Exception {
        
        /**
        MÉTODOS - Todas as ações das aplicaçõaes são consideradas métodos.

        Uma classe é definida por atributos e métodos. Atributos são, em sua grande maioria, variáveis
        de diferentes tipos e valores. Os métodos, por sua vez, correspondem as FUNÇÕES ou SUB-ROTINAS
        disponíveis dentro das nossas classes.


        - CRITÉRIO DE NOMEAÇÃO DE MÉTODOS.

        Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções
        facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas
        convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos
        os critérios são:
        - Deve ser nomeado como verbo
        - Seguir o padrão camelCase (Todas as letras minúsculas com exceção da primeira letra da
        segunda palavra).


        Exemplos sugeridos para nomeclatura de métodos:

        **/

        //somar(int n1, int n2){}

        //abrirConexao(){}

        //concluirProcessamento(){}

        //findById(int id){}

        // OBSERVAÇÃO!! Não existe em JAVA o conceito de MÉTODOS GLOBAIS. Todos os métodos devem
        //SEMPRE ser definidos dentro de uma classe


        /** CRITÉRIO DE DEFINIÇÃO DE MÉTODOS 
         Existe  uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos
         aspectos abaixo


        - QUAL A PROPOSTA PRINCIPAL DO MÉTODO? - Você deve se perguntar constantemente
         até compreender a real finalidade dele.

        - QUAL O TIPO DE RETORNO ESPERADO APÓS EXECUTAR O MÉTODO? - Você deve analisar se o método
        será responsável por retornar algum valor ou não

        CASO O MÉTODO NÃO RETORNE NENHUM VALOR, ELE SERÁ REPRESENTADO PELA PALAVRA-CHAVE - VOID

        1 - QUAIS OS PERÂMETROS SERÃO NECESSÁRIOS PARA A EXECUÇÃO DO MÉTODO? Os métodos as vezes
        precisão de argumentos como critérios para execução.

        2 - O MÉTODO POSSUI O RISCO DE APRESENTAR ALGUMA EXCEÇÃO? - Exceções são comuns na execução
        de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.

        3 - QUAL A VISIBILDIADE DO MÉTODO? - Será necessário que o método seja visível a toda aplicação,
        somente em mesmo pacores, através de herança ou somente a nível da própria classe.


        Abaixo tem um exemplo de uma classe com dois métodos e suas respectivas considerações
         **/

         //public double somar(int num1, int num2){
            //LÓGICA - FINALIDADE DO MÉTODO
            //return num1 + num2;
         

         //public void imprimir(String texto){
            //LÓGICA - FINALIDADE DO MÉTODO
            //AQUI NÃO PRECISA DO RETURN POIS O MÉTODO NÃO RETORNA NENHUM VALOR
            //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
            //System.out.println(texto);
         }


    }


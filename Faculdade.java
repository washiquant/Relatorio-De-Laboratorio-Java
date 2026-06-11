import java.util.Locale; //Importa a classe Locale para configurar padrões regionais (ex: separador decimal com ponto).
import java.util.Scanner; // Importa a Classe Scaner, que é usada no processo de entrada de dados .//( A parte *I* do processo de IPO).

//* Neste código, foi inserido o conceito de Don't Repeat Fourself, então para algumas linhas, como de entradas e saidas, eu apliquei o codigo, e depois eu coloquei um "#" e
// enumerei a linha, então todos os conceitos e codigos que estiverem com o memso numero daquela linha, eles tem o mesmo conceito chave. */


//---------------------------------------FORMULAS : --------------------------------------------------------------------------------------------------

double razaoValidos = validos / (double) amostras;
double percentualValidos = razaoValidos * 100.0; 
double tempoMedio = tempoTotalMin / amostras;

//-----------------------------------------------------------------------------------------------------------------------------------------------------

public class Faculdade {//Declara a classe principal do programa (obs : O arquivo deve ter o mesmo nome da classe).
    public static void main(String[] args) {// Metodo principal : ponto de entrada do programa ( onde  a execução começa).
        Locale.setDefault(Locale.US); // Define o padrão regional, no caso dos Estados Unidos.( o separador decimal será o ponto).

        Scanner entrada = new Scanner(System.in);//Cria o objeto Scanner para ler a entrada do usuário.
        
        System.out.println("=======Relatório Diário do Laboratório =======");//Imprime o titulo do programa e pula linha.

        System.out.print("Quantidade de Amostras Processadas: ");// Solicita ao usuário o numero de amostras # 1
        int amostras = entrada.nextInt(); //Lê o numero mandado pelo usuário após o enter. #2

        System.out.print("Tempo Total gasto (Minutos): "); // #1
        double tempoTotalMin = entrada.nextDouble(); // #2

        
        System.out.println("Numero de Resultados Validos: "); // #1
        int validos = entrada.nextInt(); // #2

      double tempoMedio = calcularTempoMedio(tempoTotalMin, amostras); // Chama função para calcular tempo médio por amostra
        double percentualValidos = calcularPercentualValidos(validos, amostras); // Chama função para calcular percentual de válidos

        System.out.println("\n=== Indicadores ==="); // Imprime uma linha em branco (\n) e o cabeçalho da seção de resultados
        System.out.println("Tempo Medio Por Amostra (min): " + formatar2Casas(tempoMedio)); // Exibe tempo médio formatado com 2 casas
        System.out.println("Percentual De Resultados Validos (%): " + formatar2Casas(percentualValidos)); // Exibe percentual formatado com 2 casas

        entrada.close(); // Fecha o Scanner para liberar recursos do sistema (boa prática)
    } // Fecha o método main

    public static double calcularTempoMedio(double tempoTotalMin, int amostras) { // Função para calcular a média de tempo por amostra
        return tempoTotalMin / amostras; // Divide o tempo total pelo número de amostras e retorna o resultado (double)
    } // Fecha a função calcularTempoMedio

    public static double calcularPercentualValidos(int validos, int amostras) { // Função para calcular o percentual de resultados válidos
        double razaoValidos = validos / (double) amostras; // Converte amostras para double para evitar divisão inteira (truncamento)
        return razaoValidos * 100.0; // Converte a razão (0 a 1) em percentual (0 a 100) e retorna
    } // Fecha a função calcularPercentualValidos

    public static String formatar2Casas(double valor) { // Função para formatar um número com 2 casas decimais para impressão
        return String.format(Locale.US, "%.2f", valor); // Formata com 2 casas decimais usando Locale.US (ponto como separador)
    } // Fecha a função formatar2Casas
} // Fecha a classe RelatorioDiarioLaboratorio




    

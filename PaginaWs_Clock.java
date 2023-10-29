
package paginaws_clock;

public class PaginaWs_Clock {
    int numeroPagina;
    int instrucao;
    int dado;
    int bitReferencia;
    int bitModificado;
    int tempoEnvelhecimento;
    boolean emMemoria;
    int tempoConjuntoTrabalho;

    public PaginaWs_Clock(int numeroPagina, int instrucao, int dado, int tempoEnvelhecimento) {
        this.numeroPagina = numeroPagina;
        this.instrucao = instrucao;
        this.dado = dado;
        this.bitReferencia = 0;
        this.bitModificado = 0;
        this.tempoEnvelhecimento = tempoEnvelhecimento;
        this.emMemoria = false;
        this.tempoConjuntoTrabalho = 0;
    }
}

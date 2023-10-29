
package paginaws_clock;

public class Ram {
    PaginaWs_Clock[] paginas;
    int tamanho;
    int ponteiroRelogio;

    public Ram(int tamanho) {
        this.tamanho = tamanho;
        paginas = new PaginaWs_Clock[tamanho];
        ponteiroRelogio = 0;
    }

    public boolean contemPagina(int instrucao) {
        for (PaginaWs_Clock pagina : paginas) {
            if (pagina != null && pagina.instrucao == instrucao) {
                return true;
            }
        }
        return false;
    }

    public void resetarBitsDeReferencia() {
        for (PaginaWs_Clock pagina : paginas) {
            if (pagina != null) {
                pagina.bitReferencia = 0;
            }
        }
    }
}

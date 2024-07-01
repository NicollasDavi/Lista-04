package Model;

import java.time.LocalDate;

public class SeguroVida extends Seguro {
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    public SeguroVida(String apolice, Segurado segurado, double vlrApolice, boolean ativo, LocalDate dtAtivacao, LocalDate dtFim, boolean cobreDoenca, boolean cobreAcidente) {
        super(apolice, segurado, vlrApolice, ativo, dtAtivacao, dtFim);
        this.cobreDoenca = cobreDoenca;
        this.cobreAcidente = cobreAcidente;
    }

    // Getters e setters
    public boolean isCobreDoenca() {
        return cobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public boolean isCobreAcidente() {
        return cobreAcidente;
    }

    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    @Override
    public String getDados() {
        return "SeguroVida [apolice=" + apolice + ", segurado=" + segurado.getNome() + ", valor=" + vlrApolice + ", ativo=" + ativo + ", doenca=" + cobreDoenca + ", acidente=" + cobreAcidente + "]";
    }
}

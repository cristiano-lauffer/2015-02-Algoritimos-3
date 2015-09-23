/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacoes;

/**
 *
 * @author Cristiano Lauffer
 */
public class Celula implements Comparable<Celula> {

    private String indice;
    private String formula;
    private String valor;

    public Celula() {
    }

    public Celula(String indice, String formula, String valor) {
        this.indice = indice;
        this.formula = formula;
        this.valor = valor;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Celula o) {
        return this.indice.compareTo(o.getIndice());
    }
}

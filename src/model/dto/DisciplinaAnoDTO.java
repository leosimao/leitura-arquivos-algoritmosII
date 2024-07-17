package model.dto;

import java.util.List;
import java.util.Map;

public class DisciplinaAnoDTO {
    private int anoVigente;
    private Map<String, List<Integer>> notasDisciplina;

    public int getAnoVigente() {
        return anoVigente;
    }

    public void setAnoVigente(int anoVigente) {
        this.anoVigente = anoVigente;
    }

    public Map<String, List<Integer>> getNotasDisciplina() {
        return notasDisciplina;
    }

    public void setNotasDisciplina(Map<String, List<Integer>> notasDisciplina) {
        this.notasDisciplina = notasDisciplina;
    }
}

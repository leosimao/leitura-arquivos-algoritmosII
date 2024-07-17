package model.dto;

import java.util.List;
import java.util.Map;

public class DisciplinaDTO {
    private Map<String, List<Integer>> notaDisciplinas;

    public DisciplinaDTO(Map<String, List<Integer>> notaDisciplinas) {
        this.notaDisciplinas = notaDisciplinas;
    }

    public Map<String, List<Integer>> getNotaDisciplinas() {
        return notaDisciplinas;
    }

    public void setNotaDisciplinas(Map<String, List<Integer>> notaDisciplinas) {
        this.notaDisciplinas = notaDisciplinas;
    }
}

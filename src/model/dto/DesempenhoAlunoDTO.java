package model.dto;

import java.util.List;
import java.util.Map;

public class DesempenhoAlunoDTO {
    private int idAluno;
    private Map<String, List<Integer>> notasAlunos;

    public DesempenhoAlunoDTO(int idAluno, Map<String, List<Integer>> notasAlunos){
        this.idAluno = idAluno;
        this.notasAlunos = notasAlunos;
    }
}

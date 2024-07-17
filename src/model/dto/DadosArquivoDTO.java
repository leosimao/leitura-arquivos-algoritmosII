package model.dto;

public class DadosArquivoDTO {
    private int idAluno;
    private int notaMateria1;
    private int notaMateria2;
    private int notaMateria3;
    private int notaMateria4;
    private int anoVigente;

    public DadosArquivoDTO(){}

    public DadosArquivoDTO(String[] valoresLinha) {
        this.idAluno = Integer.parseInt(valoresLinha[0]);
        this.notaMateria1 = Integer.parseInt(valoresLinha[1]);
        this.notaMateria2 = Integer.parseInt(valoresLinha[2]);
        this.notaMateria3 = Integer.parseInt(valoresLinha[3]);
        this.notaMateria4 = Integer.parseInt(valoresLinha[4]);
        this.anoVigente = Integer.parseInt(valoresLinha[5]);
    }

    public int getIdAluno() {
        return idAluno;
    }

    public int getNotaMateria1() {
        return notaMateria1;
    }

    public int getNotaMateria2() {
        return notaMateria2;
    }

    public int getNotaMateria3() {
        return notaMateria3;
    }

    public int getNotaMateria4() {
        return notaMateria4;
    }

    public int getAnoVigente() {
        return anoVigente;
    }
}
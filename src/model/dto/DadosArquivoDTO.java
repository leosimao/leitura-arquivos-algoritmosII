package model.dto;

public class DadosArquivoDTO {
    private final int idAluno;
    private final Double notaMateria1;
    private final Double notaMateria2;
    private final Double notaMateria3;
    private final Double notaMateria4;
    private final int anoVigente;

    public DadosArquivoDTO(String[] valoresLinha) {
        this.idAluno = Integer.parseInt(valoresLinha[0]);
        this.notaMateria1 = Double.parseDouble(valoresLinha[1]);
        this.notaMateria2 = Double.parseDouble(valoresLinha[2]);
        this.notaMateria3 = Double.parseDouble(valoresLinha[3]);
        this.notaMateria4 = Double.parseDouble(valoresLinha[4]);
        this.anoVigente = Integer.parseInt(valoresLinha[5]);
    }

    public int getIdAluno() {
        return idAluno;
    }

    public Double getNotaMateria1() {
        return notaMateria1;
    }

    public Double getNotaMateria2() {
        return notaMateria2;
    }

    public Double getNotaMateria3() {
        return notaMateria3;
    }

    public Double getNotaMateria4() {
        return notaMateria4;
    }

    public int getAnoVigente() {
        return anoVigente;
    }
}
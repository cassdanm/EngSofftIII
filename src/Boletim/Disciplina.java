package Boletim;

public class Disciplina {

    private double Media;
    private String Nome;
    private double P1;
    private double P2;
    private String Situacao;

    private ICalcMedia calcMedia;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        this.P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        this.P2 = p2;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String situacao) {
        this.Situacao = situacao;
    }

    public double getMedia() {
        return Media;
    }

    public void setMedia(double media) {
        this.Media = media;
    }

    public void CalcularMedia()
    {
        this.Media = calcMedia.CalculaMedia(this.P1, this.P2);
        this.Situacao = calcMedia.Situcao( this.Media);
    }

    public Disciplina( ICalcMedia metodo) {
        this.calcMedia = metodo;

    }

}

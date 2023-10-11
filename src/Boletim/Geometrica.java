package Boletim;

public class Geometrica implements ICalcMedia{
    @Override
    public double CalculaMedia(double x, double y) {
        double a = (x*y);
        double z = (float)Math.sqrt(a);
        return z;
    }

    @Override
    public String Situcao(double z) {
        if(z>7){
            return ("Aprovado");
        }else {
            return ("Reprovado");
        }
    }
}

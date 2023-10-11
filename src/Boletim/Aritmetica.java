package Boletim;

public class Aritmetica implements ICalcMedia {


    public double CalculaMedia(double x, double y) {
        double z = (x+y)/2;
        return(z);
    }

    @Override
    public String Situcao(double z) {

        if(z>5){
            return ("Aprovado");
        }else{
            return("Reprovado");
        }
    }
}

public class OutsourceEmployee extends Employee {

    public double mudancaAdicional;

    public OutsourceEmployee() {

    }

    public OutsourceEmployee (String nome, int horasTrabalhadas, float valorPorHora) {
        super(nome,horasTrabalhadas,valorPorHora);
        this.mudancaAdicional = mudancaAdicional;
    }

    public double getMudancaAdicional() {

        return mudancaAdicional;
    }

    public void setMudancaAdicional(){

        this.mudancaAdicional = mudancaAdicional;
    }

    @Override
    public double Pagamento() {
        
        return valorPorHora *= horasTrabalhadas + 1.1;
    }
}
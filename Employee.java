public class Employee {
    public String nome;
    public int horasTrabalhadas;
    public float valorPorHora;

    public Employee() {

    }

    public Employee(String nome, int horasTrabalhadas, float valorPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome(){

        return nome;
    }
    
    public void setNome (String nome) {

        this.nome = nome;
    }

    public int getHorasTrabalhadas(){

        return horasTrabalhadas;
    }

    public void sethorasTrabalhadas(int horasTrabalhadas) {

        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorPorHora() {

        return valorPorHora;
    }

    public void setvalorPorHora( float valorPorHora){

        this.valorPorHora = valorPorHora;
    }

    public double  Pagamento() {
        return valorPorHora *= horasTrabalhadas;
    }

    }


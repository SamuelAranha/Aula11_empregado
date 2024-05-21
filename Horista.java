public class Horista extends Empregado {
    private double horas;

    // Construtor
    public Horista(String nome, String endereço, double salario, double horas) {
        super(nome, endereço, salario);
        this.horas = horas;
    }

    // Métodos de acesso
    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getHoras() {
        return horas;
    }

    public void calcularSalario() {
        salario = horas * 50; 
    }
}



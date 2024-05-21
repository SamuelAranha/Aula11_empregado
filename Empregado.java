public class Empregado {
    protected String nome; 
    protected String endereco;
    protected double salario;

    // Construtor e métodos de acesso aqui...

    public Empregado(String endereco, String nome, double salario) {
        this.endereco = endereco;
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularIRPf() {
        double aux = 0; 
        if (salario >= 2112.01 && salario <= 2826.66) {
            aux = salario * 0.075;
        } else if (salario >= 2826.67 && salario <= 3751.05) {
            aux = salario * 0.15;
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            aux = salario * 0.225;
        } else if (salario > 4664.68) {
            aux = salario * 0.275;
        }
        return aux;
    }

    public double calcularInss() {
        double aux = 0;
        if (salario <= 1412){
            aux = salario * 0.075;
        } else if (salario > 1412 && salario < 2667){
            aux = salario * 0.09;
        } else if (salario > 2667 && salario < 4000){
            aux = salario * 0.12;
        } else if (salario > 4000){
            aux = salario * 0.14;
        }
        return aux;
    }

    public void imprimirInformacoes() {
        double inss = calcularInss(); // Calcula o valor do INSS
        double irpf = calcularIRPF(); // Calcula o valor do IRPF
        

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: " + salario);
        System.out.println("INSS: " + inss);
        System.out.println("IRPF: " + irpf);
        
}
}

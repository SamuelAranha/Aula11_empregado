public class Mensalista extends Empregado {
    private String cargo;

    public Mensalista(String nome, String endereco, Double salario, String cargo) {
        super(nome, endereco, salario);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void calcularSalario() {
        if (cargo.equals("Junior")) {
            this.salario = 2500.0;
        } else if (cargo.equals("Pleno")) {
            this.salario = 3500.0;
        } else if (cargo.equals("Senior")) {
            this.salario = 5500.0;
            
        }
    }
}



    



    public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Empregados mensalistas
        Mensalista men1 = new Mensalista("Jose", "Rua Abc", 0, "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        men1.imprimirInformacoes();

        Mensalista men2 = new Mensalista("Ana", "Rua sem fim", 0, "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        men2.imprimirInformacoes();

        // Empregados horistas
        Horista hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();
        hora1.imprimirInformacoes();

        Horista hora2 = new Horista("Cristina", "Rua da Centro", 100);
        hora2.calcularSalario();
        hora2.imprimirInformacoes();
}
    }
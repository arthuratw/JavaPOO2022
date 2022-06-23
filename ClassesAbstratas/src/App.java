public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Funcionario Comissionado");
        FuncionarioComissionado fc = new FuncionarioComissionado("Arthur","213", 15, 10.5);
        System.out.println(fc.toString());

        System.out.println("Funcionario Assalariado");
        FuncionarioAssalariado fa = new FuncionarioAssalariado("Carla", "391", 700.50);
        System.out.println(fa.toString());

        System.out.println("Funcionario Hora");
        FuncionarioHora fh = new FuncionarioHora("Odara", "043", 500.5, 10, 12.5);
        System.out.println(fh.toString());
    }
}

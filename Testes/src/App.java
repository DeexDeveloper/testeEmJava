

public class App {
    public static void main(String[] args) throws Exception {
        Testando testando = new Testando("ronaldo", "5456456456", 3462251, 6000f);
        testando.promover(20f);
        System.out.println(testando.getSalario());
        System.out.println(testando);
        testando.setFuncionario(testando.getFuncionario().toUpperCase());
        System.out.println(testando.getFuncionario());
        
    }

}

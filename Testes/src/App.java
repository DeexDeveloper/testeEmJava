import javax.swing.SortingFocusTraversalPolicy;

public class App {
    public static void main(String[] args) throws Exception {
        Testando testando = new Testando("ronaldo", "5456456456", 3462251, 6000f);
        testando.promover(20f);
        System.out.print(testando.getSalario());
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mouse", 120.90));
        produtos.add(new Produto("Teclado", 250.00));
        produtos.add(new Produto("Monitor", 980.50));
        produtos.add(new Produto("Headset", 180.00));

        ListaUtil.ordenarExibir(produtos);
    }
}
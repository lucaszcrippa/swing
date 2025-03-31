import java.util.ArrayList;

public class GerenciadorProdutos {
    private ArrayList<Produto> produtos;

    
    public GerenciadorProdutos() {
        produtos = new ArrayList<>();
    }

    
    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

   
    public String listarProdutos() {
        StringBuilder lista = new StringBuilder();
        for (Produto p : produtos) {
            lista.append(p.toString()).append("");
        }
        return lista.toString();
    }
}
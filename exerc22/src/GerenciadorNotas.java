public class GerenciadorNotas extends TelaNotas{
    
    public String GerenciadorNotas(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
        
    }
    
    
}


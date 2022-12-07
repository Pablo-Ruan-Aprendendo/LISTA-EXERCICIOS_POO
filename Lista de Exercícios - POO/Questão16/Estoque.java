import javax.swing.JOptionPane;

public class Estoque {
    
    public int ID,valor;
    public String nome;
    public float qttotal;
    




    public void Estoque(int ID, String nome, float qttotal, int valor) {
        this.ID = ID;
        this.nome = nome;
        this.qttotal = qttotal;
        this.valor = valor;
        
}

    public void protudosnoestoque(){

        JOptionPane.showMessageDialog(null, "PRODUTO" + nome, "QUANTIDADE" + qttotal, "NUMERO"+ID );
    }
}

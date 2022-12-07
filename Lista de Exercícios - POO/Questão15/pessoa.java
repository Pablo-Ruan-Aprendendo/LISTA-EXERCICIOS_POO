public class pessoa {
    
    private String nome;
	private String cpf;
	
	public void Pessoa(String _nome, String _cpf) {
		this.nome = _nome;
		this.cpf = _cpf;

}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void cadastros(){
        System.out.println("Maria Jose");
        System.out.println("000.000.000-00");
		System.out.println("CPF: " + cpf);
		
	}
}
    


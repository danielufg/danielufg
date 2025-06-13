public class Cliente extends Usuario implements Autenticavel{
    Cliente(String nomeCompleto, int matricula, String senha) {
        super(nomeCompleto, matricula, senha);
    }
    
    public boolean login(int matricula, String senha) {
    	if(this.getMatricula() == matricula && this.getSenha() == senha) {
            return true;
    	} else {
            return false;
    	}
    }
}

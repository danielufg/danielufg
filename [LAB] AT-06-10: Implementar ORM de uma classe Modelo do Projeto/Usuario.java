import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "usuario")

public abstract class Usuario {
    @DatabaseField
    private String nomeCompleto;
    
    @DatabaseField
    private int matricula;
    
    @DatabaseField
    private String senha;
   
    Usuario() {
   	 
    }
    
    Usuario(String nomeCompleto, int matricula, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.senha = senha;
    }
   
    public String mostrarDados() {
    	return "Nome: "+this.getNomeCompleto()+"\nMatricula: "+this.getMatricula();
    }
    
    public void setNomeCompleto(String nome) {
    	this.nomeCompleto = nome;
    }
    
    public String getNomeCompleto() {
    	return this.nomeCompleto;
    }
    
    public void setMatricula(int matricula){
    	this.matricula = matricula;
    }
   
    public int getMatricula() {
    	return this.matricula;
    }
   
    public void setSenha(String senha) {
    	this.senha = senha;
    }
    
    public String getSenha() {
    	return this.senha;
    }
}

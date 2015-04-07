
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue
	int id;
	String nome;
	double preco;

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	private void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
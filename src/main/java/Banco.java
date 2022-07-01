import java.util.List;
import lombok.*;

public @Data class Banco {

	private @Getter @Setter String nome;
	private List<Conta> contas;

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}

package moduloImovel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // A Classe se comporta como uma entidade
@Table(name = "CAD_EMISSAO_RELATORIO") // Tabela possue um nome diferente
public class EmissaoRelatorio {
	
	@Id	//Chave Primária
	@Column(name="CD_EMISSAO") //diz o nome da coluna no sql a ser mapeada.
	private String codEmissao;
	
	@Column(name="MATRICULA_IMOVEL")
	private Integer matriculaImovel;
	
	@Column(name="DV")
	private Integer dv;
	
	public String getCodEmissao() {
		return codEmissao;
	}

	public void setCodEmissao(String codEmissao) {
		this.codEmissao = codEmissao;
	}

	public Integer getMatriculaImovel() {
		return matriculaImovel;
	}

	public void setMatriculaImovel(Integer matriculaImovel) {
		this.matriculaImovel = matriculaImovel;
	}

	public Integer getDv() {
		return dv;
	}

	public void setDv(Integer dv) {
		this.dv = dv;
	}

	public Integer getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Integer dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Column(name="DATA_EMISSAO")
	private Integer dataNasc;
	
	
}

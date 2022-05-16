package exemplo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
	
	private ProdutoRepository prodRep;
	private LoteRepository loteRep;
	
	
	
	public List<Produto> listarProdsLote(String nome){
		List<Lote> lotes = loteRep.getAll();
		List<Produto> prods = getProdsFromLotes(lotes);
		List<Produto> prodsOk = getProdsByName(nome,prods);
		return prodsOk;
		
	}

	
	private List<Produto> getProdsByName(String nome, List<Produto> prods) {
		ArrayList<Produto> retorno = new ArrayList<Produto>();
		for(Produto p : prods) {
			if(p.getNome().contains(nome)) {
				retorno.add(p);
			}
		}
		return retorno;
	}
	
	
	
	private List<Produto> getProdsFromLotes(List<Lote> lotes) {
		ArrayList<Produto> retorno = new ArrayList<Produto>();
		for(Lote l : lotes) {
			retorno.add(l.getProduto());
		}
		return retorno;
	}
	
	

	
}

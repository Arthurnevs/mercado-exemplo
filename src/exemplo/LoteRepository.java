package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exemplo.Lote;

public class LoteRepository {

	private Map<String, Lote> catalogo;

	public LoteRepository() {
		this.catalogo = new HashMap<String, Lote>();
	}

	public String addLote(Lote lote) {
		String loteID = lote.getId();
		catalogo.put(loteID, lote);
		
		return loteID;
	}

	public void updateLote(String id, Long quantidade) {
		Lote lote = getLote(id);
		lote.setQuantidade(quantidade);
	}

	public Lote getLote(String id) {
		return catalogo.get(id);
	}

	public void removeLote(String id) {
		catalogo.remove(id);
	}

	public void listarLotes() {
		System.out.println(catalogo.values());
	}

	public List<Lote> getAll() {
		ArrayList<Lote> retorno = new ArrayList<Lote>();
		for(Lote l : catalogo.values()) {
			retorno.add(l);
		}
		return retorno;
	}
}
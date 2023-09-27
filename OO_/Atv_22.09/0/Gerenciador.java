import java.util.ArrayList;

public class Gerenciador {

    private ArrayList<ListadCompra> listasdCompras;

    public Gerenciador() {
        listasdCompras = new ArrayList<>();
    }

    public ListadCompra buscarListaCompra(String nomeLista) {
        for (ListadCompra lista : listasdCompras) {
            if (lista != null && lista.getNomeLista().equals(nomeLista)) {
                return lista;
            }
        }
        return null;
    }

    public boolean cadastrarListaCompra(String nomeLista) {
        ListadCompra listaExistente = buscarListaCompra(nomeLista);
        if (listaExistente == null) {
            ListadCompra novaLista = new ListadCompra(nomeLista);
            return listasdCompras.add(novaLista);
        }
        return false;
    }

}
/* */
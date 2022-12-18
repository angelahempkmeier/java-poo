import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import redesocial.dados.Post;
import redesocial.dados.Usuario;
import redesocial.negocio.Sistema;

public class FotosFeedTableModel extends AbstractTableModel {
	private List<Usuario> listaDePosts = new ArrayList<Usuario>();
 	private String[] colunas = {"Feed"};
 	private static Sistema sistema = Sistema.getInstance();

	
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return sistema.getUsuarioLogado().getListaDePosts().size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return sistema.getUsuarioLogado().getListaDePosts().get(rowIndex);
	}

	public String getColumnName(int column) {
		return colunas[column];
	}
	
	public void adicionarPost(Post p) {
		sistema.getUsuarioLogado().adicionarPost(p);
		fireTableStructureChanged();
	}
	
	
}

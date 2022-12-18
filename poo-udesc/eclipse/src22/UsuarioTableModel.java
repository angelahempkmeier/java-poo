import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import redesocial.dados.Usuario;
import redesocial.negocio.Sistema2;

public class UsuarioTableModel extends AbstractTableModel{
	private List<Usuario> seguindo = new ArrayList<Usuario>();
	private String[] colunas = {"Following"};
 	private static Sistema2 sistema = Sistema2.getInstance();

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return sistema.getUsuarioLogado().getListaDeUsuarios().size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return sistema.getUsuarioLogado().getListaDeUsuarios().get(rowIndex);
	}
	
	public String getColumnName(int column) {
		return colunas[column];
	}
	
	public void addRow(Usuario u) {
		this.sistema.getUsuarioLogado().getListaDeUsuarios().add(u);
		this.fireTableStructureChanged();
	}
	

}

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import redesocial.dados.Usuario;

public class FotosFeedTableModel extends AbstractTableModel {
	private List<Usuario> listaDePosts = new ArrayList<Usuario>();
 	private String[] colunas = {"Feed"};

	
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listaDePosts.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return listaDePosts.get(rowIndex);
	}

	public String getColumnName(int column) {
		return colunas[column];
	}
}

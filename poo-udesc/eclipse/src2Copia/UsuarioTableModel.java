import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import redesocial.dados.Usuario;
import redesocial.negocio.Sistema;

public class UsuarioTableModel extends AbstractTableModel{
	private List<Usuario> seguindo = new ArrayList<Usuario>();
	private String[] colunas = {"Following"};
	

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return seguindo.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return seguindo.get(rowIndex).getUsername();
	}
	
	public String getColumnName(int column) {
		return colunas[column];
	}
	
	public void addRow(Usuario u) {
		this.seguindo.add(u);
		this.fireTableStructureChanged();
	}
	

}

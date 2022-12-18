import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import redesocial.dados.Post;
import redesocial.dados.Usuario;
import redesocial.negocio.Sistema2;

public class FotosFeedTableModel extends DefaultTableModel {
	private List<Post> listaDePosts = new LinkedList<>();
 	private String[] colunas = {"Fotos", "Legenda", "Curtidas"};
 	private static Sistema2 sistema = Sistema2.getInstance();

	
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		if(listaDePosts == null) {
			return 0;
		}else {
			return listaDePosts.size();
		}
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		if(!listaDePosts.isEmpty()) {
			switch(columnIndex) {
				case 0: 
					return listaDePosts.get(rowIndex).getFoto();
				case 1:
					return listaDePosts.get(rowIndex).getLegenda();
				case 2:
					return listaDePosts.get(rowIndex).getFavoritos().size();
				default:
					return "-";
			}
		}
		return null;
	
	}

	public String getColumnName(int column) {
		return colunas[column];
	}
	
	public Class getColumnClass(int column) {
		return (column == 0) ? Icon.class : Object.class;
	}
	
	public void addPost(Post p) {
		this.listaDePosts.add(p);
		fireTableStructureChanged();
	}
	/*
	public void verFeedUsuario(Usuario u) {
		listaDePosts = this.sistema.verFeed(u);
		fireTableStructureChanged();
	}
	*/
	public void limparTabela() {
		listaDePosts = new LinkedList<>();
		fireTableStructureChanged();
	}
	
}

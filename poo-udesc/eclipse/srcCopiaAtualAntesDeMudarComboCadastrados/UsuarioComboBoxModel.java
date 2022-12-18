import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import redesocial.dados.*;


public class UsuarioComboBoxModel extends AbstractListModel implements ComboBoxModel{
	
	private List<Usuario> listUsers;
	private Usuario usuarioSelecionado;
	
	public UsuarioComboBoxModel() {
		this.listUsers = new ArrayList<>();
	}
	
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return listUsers.size();
	}

	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		return this.listUsers.get(index);
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO Auto-generated method stub
		if(anItem instanceof Usuario) {
			this.usuarioSelecionado = (Usuario) anItem;
			fireContentsChanged(this.listUsers, 0, this.listUsers.size());
		}
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return this.usuarioSelecionado;
	}

	public void addUsuarios(Usuario u) {
		this.listUsers.add(u);
	}
	
	public void reset() {
		this.listUsers.clear();
	}
	
	
	
}

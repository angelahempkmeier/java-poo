import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import redesocial.dados.Usuario;

public class FollowingComboBox extends AbstractListModel implements ComboBoxModel {
	private List<Usuario> following;
	private Usuario usuarioSelecionado;
	
	public FollowingComboBox() {
		this.following = new ArrayList<>();

	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return following.size();
	}

	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		return this.following.get(index);
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO Auto-generated method stub
		if(anItem instanceof Usuario) {
			this.usuarioSelecionado = (Usuario) anItem;
			fireContentsChanged(this.following, 0, this.following.size());
		}
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return this.usuarioSelecionado;
	}
	
	public void addUsuarios(Usuario u) {
		this.following.add(u);
	}
	
	public void reset() {
		this.following.clear();
	}

}

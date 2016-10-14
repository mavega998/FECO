package Modelos;

import java.util.ArrayList;

public class Sucursal extends Empresa {

    private ArrayList<Lote> lotes;
    private ArrayList<Usuario> usuarios;

    public Sucursal() {
    }

    public ArrayList<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(ArrayList<Lote> lotes) {
        this.lotes = lotes;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}

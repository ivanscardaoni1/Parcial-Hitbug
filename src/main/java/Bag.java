import Multimedia.Multimedia;

import java.util.List;

public class Bag {
    List<Multimedia> contenidoMultimedia;
    List<Usuario> colaboradores;
    List<Bag> bagsReferenciados;
    List<Hit> hitRequests;

    public List<Multimedia> getContenido() {
        return contenidoMultimedia;
    }

    public List<Bag> getBagsReferenciados() {
        return bagsReferenciados;
    }

    public void agregarColaborador(Usuario usuario) {
        colaboradores.add(usuario);
    }

    public void quitarColaborador(Usuario usuario) {
        colaboradores.remove(usuario);
    }

    public void agregarRequest(Hit hit) {
        hitRequests.add(hit);
    }

    void realizarCambio(Hit hit) {

    }
}

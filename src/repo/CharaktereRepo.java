package repo;
import model.Charaktere;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class CharaktereRepo {
    List<Charaktere> charakteres = new ArrayList<>();

    public void addCharkter(Charaktere charaktere) {
        charakteres.add(charaktere);
    }

    public List<Charaktere> getCharakteres() {
        return new ArrayList<>(charakteres);
    }

    public Charaktere getCharakterByName(String name) {
        return charakteres.stream()
                .filter(charaktere -> charaktere.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public void updateCharakter(String name, Charaktere updatedCharakter) {
        Charaktere charaktere = getCharakterByName(name);
        if (charaktere != null) {
            charaktere.setId(updatedCharakter.getId());
            charaktere.setName(updatedCharakter.getName());
            charaktere.setHerkunfsort(updatedCharakter.getHerkunfsort());
            charaktere.setListProducts(updatedCharakter.getListProducts());
        }
    }


    public void deleteCharakter(int id) {
        charakteres.removeIf(charaktere -> charaktere.getId() == id);
    }
}

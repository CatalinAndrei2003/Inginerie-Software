import java.util.HashMap;
import java.util.Map;

public class Scoala {
    private Map<String, Clasa> clase;

    public Scoala() {
        clase = new HashMap<>();
    }

    public void adaugaClasa(String identificator, Clasa clasa) {
        clase.put(identificator, clasa);
    }

    public void eliminaClasa(String identificator) {
        clase.remove(identificator);
    }

    public void adaugaElevInClasa(String identificator, Elev elev) {
        Clasa clasa = clase.get(identificator);
        if (clasa != null) {
            clasa.adaugaElev(elev);
        } else {
            System.out.println("Clasa nu a fost găsită!");
        }
    }

    public void eliminaElevDupaNume(String nume) {
        for (Clasa clasa : clase.values()) {
            clasa.elevi.removeIf(elev -> elev.getNume().equals(nume));
        }
    }

    public int getNumarClase() {
        return clase.size();
    }

    public int getTotalElevi() {
        int total = 0;
        for (Clasa clasa : clase.values()) {
            total += clasa.getTotalElevi();
        }
        return total;
    }
}

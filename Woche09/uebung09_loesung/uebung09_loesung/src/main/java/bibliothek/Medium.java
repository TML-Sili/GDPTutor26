package bibliothek;

import java.util.Objects;

public abstract class Medium implements Ausleihbar {
    private String titel;
    private int jahr;
    private boolean ausgeliehen;

    public Medium(String titel, int jahr) {
        this.titel = titel;
        this.jahr = jahr;
        this.ausgeliehen = false;
    }

    public String getTitel() {
        return titel;
    }

    public int getJahr() {
        return jahr;
    }

    @Override
    public boolean istAusgeliehen() {
        return ausgeliehen;
    }

    @Override
    public void ausleihen() {
        this.ausgeliehen = true;
    }

    @Override
    public void zurueckgeben() {
        this.ausgeliehen = false;
    }

    public abstract String getBeschreibung();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Medium other = (Medium) obj;
        return this.jahr == other.jahr && Objects.equals(this.titel, other.titel);
    }
}

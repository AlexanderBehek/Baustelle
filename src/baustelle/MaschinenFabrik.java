package baustelle;

public class MaschinenFabrik {
    public Maschine createMaschine() {
        return null;
    }

    // Gemeinsame Logik für Maschinenbedienung - Single Responsibility Principle
    public void maschineBedienen() {
        Maschine maschine = createMaschine();
        maschine.bedienen();
}}

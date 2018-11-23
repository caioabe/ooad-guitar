public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_RESEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String toString() {
        switch(this) {
            case INDIAN_ROSEWOOD: return "Indian Rosewood";
            case BRAZILIAN_RESEWOOD: return "Brazilian Rosewood";
            case MAHOGANY: return "Mahonany";
            case MAPLE: return "Maple";
            case COCOBOLO: return "Cocobolo";
            case CEDAR: return "Cedar";
            case ADIRONDACK: return "Adirondack";
            case ALDER: return "Alder";
            case SITKA: return "Sitka";
        }
        return null;
    }
}

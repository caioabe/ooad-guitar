public class GuitarSpec extends InstrumentSpec{
    private Integer numStrings;

    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model, Integer numStrings) {
        super(builder, type, backWood, topWood, model);
        this.numStrings = numStrings;
    }

    public Integer getNumStrings() { return numStrings; }

    public Boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;

        if (!(otherSpec instanceof GuitarSpec))
            return false;

        GuitarSpec spec = (GuitarSpec)otherSpec;

        if (spec.getNumStrings() != this.numStrings)
            return false;

        return true;
    }
}

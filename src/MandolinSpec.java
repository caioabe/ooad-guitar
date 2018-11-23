public class MandolinSpec extends InstrumentSpec{
    private Style style;

    public MandolinSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model, Style style) {
        super(builder, type, backWood, topWood, model);
        this.style = style;
    }

    public Style getStyle() { return style; }

    public Boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;

        if (!(otherSpec instanceof MandolinSpec))
            return false;

        MandolinSpec spec = (MandolinSpec)otherSpec;

        if (!this.style.equals(spec.getStyle()))
            return false;

        return true;
    }
}

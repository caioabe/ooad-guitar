public class InstrumentSpec {
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private String model;

    public InstrumentSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }

    public Boolean matches(InstrumentSpec instrumentSpec) {
        if (!this.builder.equals(instrumentSpec.getBuilder()))
            return false;

        String model = this.getModel().toLowerCase();

        if ((model != null) && (!model.equals("")) && (!model.equals(instrumentSpec.getModel().toLowerCase())))
            return false;

        if (!this.type.equals(instrumentSpec.getType()))
            return false;

        if (!this.backWood.equals(instrumentSpec.getBackWood()))
            return false;

        if (!this.topWood.equals(instrumentSpec.getTopWood()))
            return false;

        return true;
    }
}

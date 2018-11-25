public class Instrument {
    private String serialNumber;
    private Double price;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = (double)price;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }
}

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Ricks's  guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinWants = new GuitarSpec(
                Builder.FENDER,
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,
                "Stratocastor",
                12);

        List matchingInstruments= inventory.search(whatErinWants);

        if (!matchingInstruments.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");

            for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
                Instrument instrument = (Instrument)i.next();

                InstrumentSpec spec = instrument.getSpec();

                if (spec instanceof GuitarSpec) {
                    GuitarSpec printSpec = (GuitarSpec)spec;
                    System.out.println("We have a " +
                            printSpec.getBuilder() + " " + spec.getModel() + " " +
                            printSpec.getType() + " guitar:\n" +
                            printSpec.getBackWood() + " back and sides,\n" +
                            printSpec.getNumStrings() + "-strings,\n" +
                            printSpec.getTopWood() + " top.\n you can have it for only $" +
                            instrument.getPrice() + "!\n ---"
                    );
                } else if (spec instanceof MandolinSpec) {
                    MandolinSpec printSpec = (MandolinSpec)spec;
                    System.out.println("We have a " +
                            printSpec.getBuilder() + " " + spec.getModel() + " " +
                            printSpec.getType() + " guitar:\n" +
                            printSpec.getBackWood() + " back and sides,\n" +
                            printSpec.getStyle() + "-style,\n" +
                            printSpec.getTopWood() + " top.\n you can have it for only $" +
                            instrument.getPrice() + "!\n ---"
                    );
                }

            }
        } else {
            System.out.println("Sorry, Erin, we have nothing to you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument(
                "1",
                3,
                new GuitarSpec(
                    Builder.FENDER,
                    Type.ELECTRIC,
                    Wood.ALDER,
                    Wood.ALDER,
                    "Stratocastor", 12));
    }
}

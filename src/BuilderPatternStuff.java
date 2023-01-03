public class BuilderPatternStuff {
    public static void main(String[] args) {

        StuffBuilder stuffBuilder= new StuffBuilder();

        Stuff stuffCap = stuffBuilder.prepareActiveSports();
        System.out.println("Active Sports");
        stuffCap.showItems();
        System.out.println("Total Cost: " + stuffCap.getValue());

        Stuff stuffTeeShirt = stuffBuilder.prepareSmartCaps();
        System.out.println("\nSmart Caps");
        stuffTeeShirt.showItems();
        System.out.println("Total Cost: " + stuffTeeShirt.getValue());
    }
}

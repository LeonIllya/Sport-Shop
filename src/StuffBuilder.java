public class StuffBuilder {

    public Stuff prepareActiveSports(){
        Stuff stuff = new Stuff();
        stuff.addItem(new RedTeeShirt());
        stuff.addItem(new WhiteCap());
        return stuff;
    }

    public Stuff prepareSmartCaps(){
        Stuff stuff = new Stuff();
        stuff.addItem(new BlueTeeShirt());
        stuff.addItem(new BlackCap());
        return stuff;
    }
}

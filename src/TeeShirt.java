public abstract class TeeShirt implements Item {

    public Packing packing() {
        return new Wrapping();
    }

    @Override
    public abstract float price();
}


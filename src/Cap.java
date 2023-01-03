public abstract class Cap implements Item{

    public Packing packing() {
        return new Boxing();
    }

    @Override
    public abstract float price();
}

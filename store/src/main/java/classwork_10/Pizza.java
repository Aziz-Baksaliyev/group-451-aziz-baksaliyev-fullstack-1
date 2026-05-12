package classwork_10;

public class Pizza {
    private String size;
    private String crust;
    private String topping;

    public Pizza() {}

    public Pizza setSize(String size) {
        this.size = size;
        return this;
    }

    public Pizza setCrust(String crust) {
        this.crust = crust;
        return this;
    }

    public Pizza setTopping(String topping) {
        this.topping = topping;
        return this;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crust + ", topping=" + topping + "]";
    }
}

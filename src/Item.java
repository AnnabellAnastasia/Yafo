public class Item {
    // FIELDS
    private String name; // This object's "name"
    private int id; // This object's id: 1, 2, or 3
    private double price; // This object's cost


    // CONSTRUCTOR
    public Item(String nam, int id, double price) {
        this.name = nam; // Set this item object's name field
        this.id = id; // Set this item object's id field
        this.price = price; // Set this item object's price field
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }





}

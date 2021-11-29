package bai17_io_binary_file_and_serialization.bai_tap.copy_file_nhi_phan;

import java.io.Serializable;

public class Products implements Serializable {
    private String id;
    private String name;

    public Products() {
    }

    public Products(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}

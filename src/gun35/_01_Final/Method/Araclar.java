package gun35._01_Final.Method;

public class Araclar {

    private String model;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Araclar(String model) {
        setModel(model);
    }

    @Override
    public final String toString() {
        return "Araclar{" +
                "model='" + model + '\'' +
                '}';
    }
}

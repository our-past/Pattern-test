package five.contact;

public interface Prototype extends Cloneable {
    Prototype clone();
    String getType();
}
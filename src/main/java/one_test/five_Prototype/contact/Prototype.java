package one_test.five_Prototype.contact;

public interface Prototype extends Cloneable {
    Prototype clone();
    String getType();
}
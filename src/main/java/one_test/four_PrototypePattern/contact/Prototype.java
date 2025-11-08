package one_test.four_PrototypePattern.contact;

public interface Prototype<T> extends Cloneable {

    T clone();

    String getId();

}

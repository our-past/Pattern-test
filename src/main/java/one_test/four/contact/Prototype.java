package one_test.four.contact;

public interface Prototype<T> extends Cloneable {

    T clone();

    String getId();

}

package four.contact;

public interface Prototype<T> extends Cloneable {

    T clone();

    String getId();

}

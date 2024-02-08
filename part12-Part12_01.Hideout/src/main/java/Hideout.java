public class Hideout<T> {

    private T element;

    public void putIntoHideout(T toHide) {
        this.element = toHide;
    }

    public T takeFromHideout() {
        T oldElement = this.element;
        this.element = null;
        return oldElement;
    }

    public boolean isInHideout() {
        return this.element != null;
    }
}

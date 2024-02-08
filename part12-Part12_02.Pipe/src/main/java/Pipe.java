import java.util.LinkedList;

public class Pipe<T> {

    private LinkedList<T> element;

    public Pipe() {
        this.element = new LinkedList<>();
    }

    public void putIntoPipe(T value) {
        this.element.push(value);
    }

    public T takeFromPipe() {
        if (this.element.isEmpty()) {
            return null;
        }
        return this.element.removeLast();
    }

    public boolean isInPipe() {
        return !this.element.isEmpty();
    }
}

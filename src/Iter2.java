import java.util.Iterator;

public class Iter2 implements Iterable<Integer> {

    IterTest iterObj;

    Iter2(IterTest i) {
        iterObj = i;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iter(iterObj);
    }
}

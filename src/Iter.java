import java.util.Iterator;

public class Iter implements Iterator<Integer> {

    IterTest iterObj;
    int curInd;

    Iter(IterTest i){
        iterObj = i;
        curInd = i.start;
    }

    @Override
    public boolean hasNext() {
        return curInd != iterObj.end;
    }

    @Override
    public Integer next() {
        return iterObj.a[curInd++];
    }
}

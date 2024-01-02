package behavioural.iterator;

import java.util.Iterator;

// 이터레이터 생성
public interface Aggregate {
    public abstract Iterator createIterator();
}

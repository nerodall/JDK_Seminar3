public class Pair <T1,T2 extends Number> {
    T1 t1;
    T2 t2;
    public Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getFirst(){
         return t1;
    }

    public T2 getSecond(){
        return t2;
    }

    @Override
    public String toString() {
        return "first=" + t1 + ", second=" + t2;
    }
}



public class Generic_example<T1 extends Number, T2 extends Number> {
    T1 x;
    T2 y;
    Generic_example(T1 x, T2 y){
        this.x =x;
        this.y=y;
    }
    public T2 getValue(){
        return y;
    }
}

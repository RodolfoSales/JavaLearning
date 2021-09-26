public class Generic_example <Thing> {
    //public class Generic_example <Thing, Thing2>     
    
    Thing x;

    Generic_example(Thing x){
        this.x =x;
    }
    public Thing getValue(){
        return x;
    }
}

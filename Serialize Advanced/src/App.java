public class App {
    public static void main(String[] args) throws Exception {
        // notes 1. children classes of a parent class that implements Serializable will do so as well
        //       2. static fields are note serialized (they belong to the class, not an individual object)
        //       3. the class's definition ("class file") itself is not recorded, cast it as the object type
        //       4. Fields declared as "transient" aren't serialized, they are ignored
        //       5. serialVersionUID is a unique version ID

        //serialVersionUID = serialVersionUID is a unique ID that functions like a version #
        // verifies that the sender and receiver of a serialized object have loaded classes fo that object that match
        // Ensures object will be compatible between machines
        // Number must match. otherwise this will cause a InvalidClassException
        // A SerialVersionUID will be calculated based on class properties, members, etc.
        // A serializable class can declare its own serialVersionUID explicitly
    }
}

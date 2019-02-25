// Abstract all of the object making away from the client/test program
// NOTE: this factory class could act as a registry
public class CloneFactory{
    public Item getClone(Item itemSample){
        return itemSample.makeClone();
    }
}





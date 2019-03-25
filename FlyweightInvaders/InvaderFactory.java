public class InvaderFactory{
    private Invader invader;
    InvaderFactory(){
        invader = new Invader();
    }
    public Invader getInvader(){return invader;}
}

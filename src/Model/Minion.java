package Model;

public class Minion extends Hero{


    private boolean justRevived;

    public Minion(String heroID, int attackRange, int moveRange){
        super(heroID, attackRange, moveRange);
        this.justRevived = false;
    }

    public void specialAbility(){
        //need to allow this 'attack modifier to be 1 turn only'
    }

    public boolean isJustRevived() {
        return justRevived;
    }

    public void setJustRevived(boolean justRevived) {
        this.justRevived = justRevived;
    }


}
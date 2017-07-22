package Ques4;

/**
 * Created by Lenovo-1 on 12-07-2017.
 */
public class Fighter2 extends Fighter {

    public Fighter2() {
        setJumpBehaviour();
        setRollBehaviour();
    }

    @Override
    public void setJumpBehaviour() {
       this.jumpBehaviour=new ShortJumps();
    }

    @Override
    public void setRollBehaviour() {
        this.rollBehaviour=new SlowRoll();
    }
}

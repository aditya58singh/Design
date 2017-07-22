package Ques4;

/**
 * Created by Lenovo-1 on 12-07-2017.
 */
public class Fighter1 extends Fighter {

    public Fighter1() {
        setJumpBehaviour();
        setRollBehaviour();
    }

    @Override
    public void setJumpBehaviour() {
        this.jumpBehaviour=new LongJumps();
    }

    @Override
    public void setRollBehaviour() {
        this.rollBehaviour=new FastRoll();
    }
}

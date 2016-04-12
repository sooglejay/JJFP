package jzfp.com.precisionpoverty.event;


public class IntEvent {
    public static final int MSG_INT_TIME = 1000;

    public int getEventFlag() {
        return eventFlag;
    }

    public void setEventFlag(int eventFlag) {
        this.eventFlag = eventFlag;
    }

    private int eventFlag;

    public IntEvent(int eventFlag) {
        this.eventFlag = eventFlag;
    }
}

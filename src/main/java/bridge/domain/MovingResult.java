package bridge.domain;

public class MovingResult {

    private String moving;
    private String result;

    public MovingResult(String moving, String result) {
        this.moving = moving;
        this.result = result;
    }

    public String getMoving() {
        return moving;
    }

    public String getResult() {
        return result;
    }

}

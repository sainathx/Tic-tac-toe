public class WrongPlaceException extends Exception {
    private String msg = " please try again.";
    public WrongPlaceException() {
    }
    public WrongPlaceException(String msg) {
        super(msg);
        this.msg = msg;
    }
    @Override
    public String toString() {
        return "WrongPlaceException: " + msg;
    }
}
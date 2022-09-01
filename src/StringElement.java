public class StringElement {
    private final String value;
    private final int positionInLine;

    public StringElement(String value, int positionInLine) {
        this.value = value;
        this.positionInLine = positionInLine;
    }

    public String getValue() {
        return value;
    }

    public int getPositionInLine() {
        return positionInLine;
    }
}

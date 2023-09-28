public enum RomanNumeralCategory {
    THOUSAND(1000, "M", "*", "*"),
    HUNDRED(100, "C", "D", "M"),
    TEN(10, "X", "L", "C"),
    UNIT(1, "I", "V", "X");
    private final int value;
    private final String oneCharacter;
    private final String fiveCharacter;
    private final String tenCharacter;

    private RomanNumeralCategory(int value, String oneCharacter, String fiveCharacter, String tenCharacter) {
        this.value = value;
        this.oneCharacter = oneCharacter;
        this.fiveCharacter = fiveCharacter;
        this.tenCharacter = tenCharacter;
    }

    public int getValue() {
        return value;
    }

    public String getOneCharacter() {
        return oneCharacter;
    }

    public String getFiveCharacter() {
        return fiveCharacter;
    }

    public String getTenCharacter() {
        return tenCharacter;
    }

}

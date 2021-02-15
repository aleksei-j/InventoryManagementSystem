package dev.aleksei.ims.item;

public enum Type {
    RAW(1, "Raw"),
    MANUFACTURED(2, "Manufactured"),
    IMPORTED(3, "Imported"),
    UNKNOWN("unknown");

    private int number;
    private String type;

    Type(int number, String type) {
        this.number = number;
        this.type = type;
    }

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public static Type getTypeByNumber(int number) {

        for(Type type : Type.values()) {
            if (type.number == number)
                return type;
        }

        return UNKNOWN;
    }
}

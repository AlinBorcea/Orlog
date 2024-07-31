package main;

public enum DieFace {
    NONE,
    AX,
    ARROW,
    HELMET,
    SHIELD,
    HAND;

    public static DieFace fromInt(int x) {
        return switch (x) {
            case 1 -> AX;
            case 2 -> ARROW;
            case 3 -> HELMET;
            case 4 -> SHIELD;
            case 5 -> HAND;
            default -> NONE;
        };
    }
}

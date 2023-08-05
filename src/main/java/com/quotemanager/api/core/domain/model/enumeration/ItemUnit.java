package com.quotemanager.api.core.domain.model.enumeration;

public enum ItemUnit {
    METER("Meter"),
    SQUARE_METER("SquareMeter"),
    LITER("Liter"),
    CUBIC_METER("CubicMeter"),
    KILOGRAM("Kilogram"),
    GRAM("Gram"),
    PIECE("Piece"),
    KILOGRAM_PER_CUBIC_METER("KilogramPerCubicMeter");
    private final String value;

    ItemUnit(String value) { this.value = value; }

    public String getUnit() {
        return value;
    }
}
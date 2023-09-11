package com.quotemanager.api.core.domain.model.enumeration;

public enum ItemUnit {
    METER("METER"),
    SQUARE_METER("SQUARE_METER"),
    LITER("LITER"),
    CUBIC_METER("CUBIC_METER"),
    KILOGRAM("KILOGRAM"),
    GRAM("GRAM"),
    PIECE("PIECE"),
    KILOGRAM_PER_CUBIC_METER("KILOGRAM_PER_CUBIC_METER");

    private final String itemUnit;

    ItemUnit(String itemUnit) { this.itemUnit = itemUnit; }

    public String getItemUnit() { return this.itemUnit; }
}

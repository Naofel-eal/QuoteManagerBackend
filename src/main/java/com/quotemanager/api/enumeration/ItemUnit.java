package com.quotemanager.api.enumeration;

public enum ItemUnit {
    Meter("meter"),
    SquareMeter("SquareMeter"),
    Liter("Liter"),
    CubicMeter("CubicMeter"),
    Kilogram("Kilogram"),
    Gram("Gram"),
    Piece("Piece"),
    KilogramPerCubicMeter("KilogramPerCubicMeter");

    private final String itemUnit;

    ItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getItemUnit() {
        return this.itemUnit;
    }
}

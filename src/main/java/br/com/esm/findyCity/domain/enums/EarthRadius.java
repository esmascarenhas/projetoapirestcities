package br.com.esm.findyCity.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public enum EarthRadius {

    METERS("m", 6378168),
    KILOMETERS("km", 6378.168f),
    MILES("mi", 3958.747716f);



    private final String unit;
    private final float value;

    public float getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }
}

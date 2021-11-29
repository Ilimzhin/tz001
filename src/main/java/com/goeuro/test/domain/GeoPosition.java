package com.goeuro.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeoPosition {

    public double getLongitude;
    private Double latitude;
    private Double Longitude;
}

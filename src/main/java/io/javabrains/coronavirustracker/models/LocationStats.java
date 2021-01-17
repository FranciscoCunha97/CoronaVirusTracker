package io.javabrains.coronavirustracker.models;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevDay;

}

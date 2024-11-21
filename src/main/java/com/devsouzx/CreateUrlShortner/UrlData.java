package com.devsouzx.CreateUrlShortner;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UrlData {
    @JsonProperty("originalUrl")
    private String originalUrl;
    @JsonProperty("expirationTime")
    private long expirationTime;

    public UrlData(String originalUrl, long expirationTime) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTime;
    }
}

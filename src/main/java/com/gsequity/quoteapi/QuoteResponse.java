package com.gsequity.quoteapi;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class QuoteResponse {
    private String message;
}

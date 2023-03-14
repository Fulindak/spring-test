package com.example.springkuzmin.dto.currency;


import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class CurrencyResponse {
    private String name;
    private Double quantity;
    private Double exchangeRate;
    private Date date;
}

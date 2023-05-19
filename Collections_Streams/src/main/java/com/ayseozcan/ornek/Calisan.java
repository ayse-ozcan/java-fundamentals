package com.ayseozcan.ornek;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Calisan {
    String ad;
    String adres;
    String telefon;
    Bolum bolum;
}

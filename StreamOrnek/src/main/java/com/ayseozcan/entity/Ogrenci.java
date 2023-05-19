package com.ayseozcan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ogrenci {

    String okulno;
    String ad;
    String sinif;
    List<OgrenciNotu> notlar;
}

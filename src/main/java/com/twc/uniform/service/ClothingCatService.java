package com.twc.uniform.service;

import java.util.List;

import com.twc.uniform.entity.ww_mas_clothing_cat;

public interface ClothingCatService {
    List<ww_mas_clothing_cat> getClothingAll();

    List<ww_mas_clothing_cat> findClothingByCompany(String companyid);
}

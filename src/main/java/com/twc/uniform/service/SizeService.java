package com.twc.uniform.service;

import java.util.List;

import com.twc.uniform.entity.ww_mas_size_sku;

public interface SizeService {

    List<ww_mas_size_sku> findAll();
    List<ww_mas_size_sku> findSizeByClothing(String clothingid);
}

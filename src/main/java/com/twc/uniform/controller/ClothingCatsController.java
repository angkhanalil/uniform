package com.twc.uniform.controller;

import java.util.ArrayList;
import java.util.List;

import com.twc.uniform.entity.ww_mas_clothing_cat;
import com.twc.uniform.entity.ww_mas_size_sku;
import com.twc.uniform.service.ClothingCatService;
import com.twc.uniform.service.SizeService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clothingcats")
public class ClothingCatsController {

    private final ClothingCatService clothingCatService;
    private final SizeService sizeService;

    public ClothingCatsController(ClothingCatService clothingCatService, SizeService sizeService) {

        this.clothingCatService = clothingCatService;
        this.sizeService = sizeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ww_mas_clothing_cat>> getClothingAll() {

        List<ww_mas_clothing_cat> clothing = new ArrayList<>();
        List<ww_mas_size_sku> sku = new ArrayList<>();
        clothing = clothingCatService.getClothingAll();
        for (ww_mas_clothing_cat ww_mas_clothing_cat : clothing) {
            int clothingid = ww_mas_clothing_cat.getClothing_cat_id();
            sku = new ArrayList<>();
            sku = sizeService.findSizeByClothing(String.valueOf(clothingid));

            ww_mas_clothing_cat.setSize(sku); 
        }

        return ResponseEntity.ok().body(clothing);
    }

    @GetMapping("/clothing_company")
    public ResponseEntity<List<ww_mas_clothing_cat>> getClothing_Company(String companyid) {
        List<ww_mas_clothing_cat> clothing = new ArrayList<>();
        List<ww_mas_size_sku> sku = new ArrayList<>();
        clothing = clothingCatService.findClothingByCompany(companyid);
        for (ww_mas_clothing_cat ww_mas_clothing_cat : clothing) {
            int clothingid = ww_mas_clothing_cat.getClothing_cat_id();
            sku = new ArrayList<>();
            sku = sizeService.findSizeByClothing(String.valueOf(clothingid));
            ww_mas_clothing_cat.setSize(sku); 
        }

        return ResponseEntity.ok().body(clothing);

    }

    
}

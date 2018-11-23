package com.shay.spear.controller;

import com.shay.spear.domain.entity.TMarketRecord;
import com.shay.spear.model.TResults;
import com.shay.spear.service.MarketRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/record")
public class MarketRecordController {

    @Autowired
    private MarketRecordService marketRecordService;

    @GetMapping("")
    public TResults<TMarketRecord> getAll() {
        return marketRecordService.getList(0, 20);
    }
}

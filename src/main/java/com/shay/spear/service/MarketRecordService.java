package com.shay.spear.service;

import com.shay.spear.domain.entity.TMarketRecord;
import com.shay.spear.model.TResults;

import java.util.List;

public interface MarketRecordService {
    List<TMarketRecord> getAll();

    TResults<TMarketRecord> getList(int page, int size);
}

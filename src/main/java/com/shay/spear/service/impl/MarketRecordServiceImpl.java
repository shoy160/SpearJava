package com.shay.spear.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shay.spear.domain.entity.TMarketRecord;
import com.shay.spear.domain.mapper.MarketRecordMapper;
import com.shay.spear.model.TResults;
import com.shay.spear.service.MarketRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "marketRecordService")
public class MarketRecordServiceImpl implements MarketRecordService {

    @Autowired
    private MarketRecordMapper mapper;

    @Override
    public List<TMarketRecord> getAll() {
        return mapper.getAll();
    }

    @Override
    public TResults<TMarketRecord> getList(int page, int size) {
        Page pageHelper = PageHelper.startPage(page, size);
        List<TMarketRecord> list = mapper.getAll();
        TResults<TMarketRecord> result = new TResults<>();
        result.setData(list);
        result.setTotal((int)pageHelper.getTotal());
        return result;

    }
}

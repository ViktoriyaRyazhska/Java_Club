package com.team4.thebest.dao;

import com.team4.thebest.models.RentInfo;

public interface RentInfoDao {
    RentInfo findById(Long id);

    void save(RentInfo rentInfo);
}

package com.team4.thebest.services;

import com.team4.thebest.models.RentInfo;

public interface RentInfoService {
    RentInfo findById(Long id);

    void save(RentInfo rentInfo);

    void update(RentInfo rentInfo);

    RentInfo findByBookIdAndUserId(Long id, Long userId);
}

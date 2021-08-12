package com.team4.thebest.services.impl;

import com.team4.thebest.dao.RentInfoDao;
import com.team4.thebest.models.RentInfo;
import com.team4.thebest.services.RentInfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RentInfoServiceImpl implements RentInfoService {

    private final RentInfoDao rentInfoDao;

    @Override
    public RentInfo findById(Long id) {
        return rentInfoDao.findById(id);
    }

    @Override
    public void save(RentInfo rentInfo) {
        rentInfoDao.save(rentInfo);
    }

    @Override
    public void update(RentInfo rentInfo) {
        rentInfoDao.update(rentInfo);
    }

    @Override
    public RentInfo findByBookIdAndUserId(Long id, Long userId) {
        return rentInfoDao.findByBookIdAndUserId(id, userId);

    }
}

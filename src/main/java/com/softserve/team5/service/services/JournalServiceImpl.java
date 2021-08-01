package com.softserve.team5.service.services;

import com.softserve.team5.service.interfaces.JournalService;
import org.springframework.transaction.annotation.Transactional;

public class JournalServiceImpl implements JournalService {
    @Override
    @Transactional
    public void create(Object entity) {

    }

    @Override
    @Transactional
    public void update(Object entity) {

    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    @Transactional
    public Object getById(Long id) {
        return null;
    }
}

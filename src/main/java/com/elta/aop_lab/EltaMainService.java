package com.elta.aop_lab;

import com.elta.qualifier_lab.EltaDao;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class EltaMainService {

    private EltaProductDao eltaProductDao;

    public void work(){
        eltaProductDao.saveAll();
    }
}

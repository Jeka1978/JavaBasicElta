package com.elta.qualifier_lab;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Mode(ModeType.MAIN)
public class EltaOracleDao implements EltaDao {
    @Override
    public void saveAll() {
        System.out.println("saving to oracle");
    }
}

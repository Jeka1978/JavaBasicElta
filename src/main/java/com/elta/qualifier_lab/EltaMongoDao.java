package com.elta.qualifier_lab;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Profile("elta_services")
//spring.active.profiles   you can declare env variable
@Repository
@Mode(ModeType.BACKUP)
public class EltaMongoDao implements EltaDao {
    @Override
    public void saveAll() {
        System.out.println("saving to mongo");
    }
}

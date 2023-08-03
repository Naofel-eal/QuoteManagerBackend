package com.quotemanager.api.infrastructure.out.mapper.template;

import java.util.List;

public interface OUT_MapperTemplate<DOMAIN_ENTITY, DB_ENTITY> {
    DOMAIN_ENTITY toDomainEntity(DB_ENTITY dbEntity);
    DB_ENTITY toDatabaseEntity(DOMAIN_ENTITY domainEntity);
    List<DOMAIN_ENTITY> toDomainEntities(List<DB_ENTITY> dbEntities);
    List<DB_ENTITY> toDatabaseEntity(List<DOMAIN_ENTITY> domainEntities);
}

package com.solvd.essay.persistence.impl;

import com.solvd.essay.domain.EssayModule;
import com.solvd.essay.persistence.EssayModuleRepository;

import java.sql.Connection;
import java.sql.ResultSet;

public class EssayModuleRepositoryImpl extends AbstracDao<EssayModule> implements EssayModuleRepository<EssayModule> {

    public EssayModuleRepositoryImpl(Connection conn) {
        super(conn);
    }



    @Override
    public String getTableName(EssayModule essayModule) {
        return essayModule.tableName;
    }

    @Override
    public String getTableFields() {

        return "module_description";
    }

    @Override
    public String getThingFields(EssayModule essayModule) {
        return essayModule.getModuleDescription();
    }
}
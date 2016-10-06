package com.easycrm.hibernate.dao;

import java.sql.SQLException;

/**
 * Created by drkomp on 03.10.2016.
 */
public interface AbstractGDao<Entity> {
    public Entity getItById(long id) throws SQLException;
    public void addIt(Entity entity)throws SQLException;
    public void updateIt(Entity entity)throws SQLException;
    public void deleteItById(long id) throws SQLException;
}

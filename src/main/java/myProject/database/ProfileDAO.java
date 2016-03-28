package myProject.database;

import myProject.domain.profile.Profile;

import java.util.List;

/**
 * Created by Camille on 28.03.2016.
 */
public interface ProfileDAO {

    void create (Profile profile) throws DBException;

    Profile getById (Long id) throws DBException;

    void delete (Long id) throws DBException;

    void update (Long id) throws DBException;

    List<Profile> getAll () throws DBException;

}

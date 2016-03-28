package myProject.database.jdbc;

import myProject.database.DBException;
import myProject.database.ProfileDAO;
import sun.java2d.cmm.Profile;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by Camille on 28.03.2016.
 */
public class ProfileDAOImpl extends DAOImpl implements ProfileDAO {

  @Override
    public void create (Profile profile) throws DBException {
      if (profile == null){
          return;
      }
      Connection connection = null;
      try {
          connection = getConnection();
          PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO mytestdatabase.profile values (default,?,?,?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);




      }
  }

}

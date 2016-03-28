package myProject.database.jdbc;

import myProject.database.DBException;
import myProject.database.ProfileDAO;
import myProject.domain.profile.Profile;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
          preparedStatement.setString(1,profile.getFirstName());
          preparedStatement.setString(2,profile.getFamilyName());
          preparedStatement.setString(3,profile.getBirthDate());
          preparedStatement.setString(4,profile.getCharacterTrait1());
          preparedStatement.setString(5,profile.getCharacterTrait2());
          preparedStatement.setString(6,profile.getCharacterTrait3());
          preparedStatement.setString(7,profile.getDescription());
          preparedStatement.executeUpdate();
          ResultSet resSet = preparedStatement.getGeneratedKeys();
          if (resSet.next()){
              profile.setProfileId(resSet.getLong(1));
          }



      }  catch (Throwable e) {
          System.out.println("Exception while execute UserDAOImpl.create()");
          e.printStackTrace();
          throw new DBException(e);
      } finally {
          closeConnection(connection);}
  }

}

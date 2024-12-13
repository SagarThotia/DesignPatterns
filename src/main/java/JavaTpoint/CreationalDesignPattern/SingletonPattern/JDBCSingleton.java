package JavaTpoint.CreationalDesignPattern.SingletonPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JDBCSingleton
{
    // Step1 create a JDBCSingleton class
    // static member holds only one instance of the JDBCSingleton class.
    private static JDBCSingleton jdbcSingleton;

    // JDBCSingleton prevents the instantiation from any other class
    private JDBCSingleton()
    {

    }

    // Now we are providing global point to access
    public static JDBCSingleton getInstance()
    {
        if(jdbcSingleton == null)
        {
            jdbcSingleton = new JDBCSingleton();
        }
        return jdbcSingleton;
    }

    // to get the connection from methods like insert, view etc.
    private static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/samsen","root","MongoDB@6542");
        return connection;
    }

   // to insert the record into the database
    public int insert(String name, String pass) throws SQLException
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int recordCounter = 0;
        try
        {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement("insert into userdata(username, password) values(?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, pass);
            recordCounter = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(preparedStatement != null)
            {
                preparedStatement.close();
            }
            if(connection != null)
            {
                connection.close();
            }
        }
        return recordCounter;
    }

    // to view the data from the database
    public void view(String name) throws SQLException
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try
        {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement("select * from userdata where username = ?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                System.out.println("Name= " + resultSet.getString(2) + "\t" + "Password= " + resultSet.getString(3));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(resultSet != null)
            {
                resultSet.close();
            }

            if(preparedStatement != null)
            {
                preparedStatement.close();
            }

            if(connection != null)
            {
                connection.close();
            }
        }
    }

    // to update the password for the given username
    public int update(String name,String password) throws SQLException
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int recordCounter = 0;
        try
        {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement("update userdata set password = ? where username = '"+ name +"'");
            preparedStatement.setString(1, password);
            recordCounter = preparedStatement.executeUpdate();
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }finally
        {
            if(preparedStatement != null)
            {
                preparedStatement.close();
            }

            if(connection != null)
            {
               connection.close();
            }
        }
        return recordCounter;
    }

    // to delete the data from the database
    public int delete(int userid) throws SQLException
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int recordCounter = 0;
        try
        {
            connection = this.getConnection();
            preparedStatement = connection.prepareStatement("delete from userdata where id ='"+ userid + "'");
            recordCounter = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally
        {
            if(preparedStatement != null)
            {
                preparedStatement.close();
            }

            if(connection != null)
            {
                connection.close();
            }
        }
        return recordCounter;
    }
}

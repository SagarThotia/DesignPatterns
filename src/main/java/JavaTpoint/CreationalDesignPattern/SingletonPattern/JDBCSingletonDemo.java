package JavaTpoint.CreationalDesignPattern.SingletonPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class JDBCSingletonDemo
{
    static int count = 1;
    static int choice;

    public static void main(String[] args) throws IOException
    {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Database operations");
            System.out.println("--------------------");
            System.out.println("1. Insert");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            System.out.println("\n");
            System.out.println("Please enter the choice what you want to perform in the database: ");

            choice = Integer.parseInt(br.readLine());
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the username you want to insert into the database: ");
                    String username = br.readLine();
                    System.out.println("Enter the password you want to insert into the database: ");
                    String password = br.readLine();

                    try
                    {
                        int i = jdbc.insert(username, password);
                        if (i > 0) {
                            System.out.println((count++) + " Data has been inserted successfully");
                        } else {
                            System.out.println("Data has not been inserted");
                        }
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Press Enter key to continue...");
                    System.in.read();

                    break;

                case 2:

                    System.out.println("Enter the username: ");
                    String user = br.readLine();

                    try {
                        jdbc.view(user);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Press Enter key to continue...");
                    System.in.read();

                    break;

                case 3:

                    System.out.println("Enter the username you want to update into the database: ");
                    String usern = br.readLine();
                    System.out.println("Enter the new password: ");
                    String pass = br.readLine();

                    try
                    {
                        int i = jdbc.update(usern,pass);
                        if (i > 0)
                        {
                            System.out.println((count++) + " Data has been updated successfully");
                        }
                    } catch (SQLException e)
                    {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Press Enter key to continue...");
                    System.in.read();
                    break;

                case 4:

                    System.out.println("Enter the userid you want to delete from the database: ");
                    int userid = Integer.parseInt(br.readLine());

                    try
                    {
                        int i = jdbc.delete(userid);
                        if (i > 0) {
                            System.out.println((count++) + " Data has been deleted successfully");
                        }else {
                            System.out.println("Data has not been deleted");
                        }
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Press Enter key to continue...");
                    System.in.read();
                    break;

                default:
                    return;
            }
        }while(choice != 5);
    }
}

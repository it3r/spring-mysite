package com.iter.dao;

import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import com.mysql.jdbc.Driver;

public class InfoDao {

    public InfoDao(){
        updateInfo();
    }

    private String aboutMe;
    private Map<String ,String> technologies;

    public void updateInfo(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/personal-site", "root", "" );
            Statement stm = con.createStatement();
            // получаем инфу обо мне
            ResultSet set = stm.executeQuery( "SELECT * FROM `about_me`" );
            set.next();
            aboutMe = set.getString( 1 );
            set.close();
            // получаем инфу об технологиях
            set = stm.executeQuery( "SELECT * FROM `spring_tech`" );
            technologies =  new HashMap<String, String>(  );
            while ( set.next() ){
                technologies.put( set.getString( "name" ), set.getString( "value" ) );
            }
            stm.close();
            con.close();
        }catch ( Exception e ){
            e.printStackTrace();
            //throw new RuntimeException( "No connection with database" );
        }
    }

    public String getAboutMe(){
        return aboutMe;
    }

    public Map<String ,String> getTechnologies(){
        return technologies;
    }
}

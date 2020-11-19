package pl.edu.wszib.warehouse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.warehouse.database.DataBase;
import pl.edu.wszib.warehouse.database.IDataBase;
import pl.edu.wszib.warehouse.gui.GUI;
import pl.edu.wszib.warehouse.gui.GUI2;
import pl.edu.wszib.warehouse.gui.IGUI;

@Configuration
public class AppConfiguration {

    @Bean
    public IDataBase dataBase() {
        return new DataBase();
    }

    @Bean
    public IGUI gui(IDataBase dataBase) {
        GUI gui = new GUI();
        gui.dataBase = dataBase;
        return gui;
    }


}

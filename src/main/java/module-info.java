module com.jam.jasbank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires java.desktop;


    opens com.jam.jasbank to javafx.fxml;
    exports com.jam.jasbank;
    exports com.jam.jasbank.Controllers;
    exports com.jam.jasbank.Controllers.Admin;
    exports com.jam.jasbank.Controllers.Client;
    exports com.jam.jasbank.Models;
    exports com.jam.jasbank.Views;
}
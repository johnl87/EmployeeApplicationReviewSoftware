module com.example.employeeapplicationreviewsoftware {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires eu.hansolo.tilesfx;

    opens com.example.employeeapplicationreviewsoftware to javafx.fxml;
    exports com.example.employeeapplicationreviewsoftware;
}
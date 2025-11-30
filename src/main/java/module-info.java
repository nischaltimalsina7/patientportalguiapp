module edu.secourse.patientportalguiapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.secourse.patientportalguiapp to javafx.fxml;
    exports edu.secourse.patientportalguiapp;
}
module com.ioglyph.castor.ui {
    exports com.ioglyph.castor.ui to javafx.graphics;

    requires javafx.graphics;
    requires javafx.controls;

    requires com.ioglyph.castor.model;
}

module com.ioglyph.castor.persistence{
    requires transitive com.ioglyph.castor.core;

    requires transitive java.persistence;
    requires com.fasterxml.classmate;
    requires net.bytebuddy;

    requires spring.data.jpa;
    requires spring.tx;

    requires jdk.unsupported;

    exports com.ioglyph.castor.persistence;
    exports com.ioglyph.castor.persistence.infrastructure;

    opens com.ioglyph.castor.persistence to org.hibernate.orm.core, spring.core;
    opens com.ioglyph.castor.persistence.infrastructure to org.hibernate.orm.core, spring.core;
}

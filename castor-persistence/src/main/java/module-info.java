module com.ioglyph.castor.persistence{
    requires transitive com.ioglyph.castor.core;

    requires jdk.unsupported;

    requires java.persistence;
    requires net.bytebuddy;

    requires spring.context;
    requires spring.data.jpa;
    requires spring.tx;

    exports com.ioglyph.castor.persistence;
    exports com.ioglyph.castor.persistence.infrastructure;

    opens com.ioglyph.castor.persistence to org.hibernate.orm.core, spring.core;
    opens com.ioglyph.castor.persistence.infrastructure to org.hibernate.orm.core, spring.core;
}

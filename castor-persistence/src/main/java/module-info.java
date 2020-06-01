module com.ioglyph.castor.persistence{
    requires transitive com.ioglyph.castor.core;

    requires java.persistence;
    requires java.sql;
    requires jdk.unsupported;

    requires net.bytebuddy;

    requires org.mybatis;
    requires org.mybatis.spring;
    requires org.mybatis.spring.boot.autoconfigure;

//    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.data.jpa;
    requires spring.tx;

    exports com.ioglyph.castor.persistence;

    opens com.ioglyph.castor.persistence to org.mybatis.spring, spring.core;
}

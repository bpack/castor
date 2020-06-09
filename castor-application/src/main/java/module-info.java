module com.ioglyph.castor.application {
    requires com.ioglyph.castor.core;
    requires com.ioglyph.castor.feature;
    requires com.ioglyph.castor.model;
    requires com.ioglyph.castor.persistence;
    requires com.ioglyph.castor.rest;
    requires com.ioglyph.castor.security;
    requires com.ioglyph.castor.service;

    requires java.instrument;
    requires java.persistence;
//    requires java.sql;

    requires spring.beans;
    requires spring.boot;
    requires spring.boot.actuator;
    requires spring.boot.actuator.autoconfigure;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.data.jpa;

    exports com.ioglyph.castor.application;
    exports com.ioglyph.castor.application.config;

    opens com.ioglyph.castor.application to spring.core;
    opens com.ioglyph.castor.application.config to spring.core;
}

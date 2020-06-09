module com.ioglyph.castor.rest {
    requires com.ioglyph.castor.common;
    requires com.ioglyph.castor.service;

    requires spring.web;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

    exports com.ioglyph.castor.rest;
}

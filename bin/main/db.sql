--drop database db_soap;
/*
drop table soapfault;
drop table soaprequest;
*/
--CREATE DATABASE db_soap WITH OWNER = postgres ENCODING = 'UTF8' template=template0;

CREATE TABLE soaprequest
(
  id serial NOT NULL,
  request_data character varying(1000),
  response_data character varying(1000),
  method_name character varying(150),
  activity_date timestamp without time zone,
  CONSTRAINT soaprequest_pkey PRIMARY KEY (id)
);

CREATE TABLE soapfault
(
  id serial NOT NULL,
  fault_code character varying(2000),
  fault_message character varying(4000),
  trace_data character varying(50),
  log_date timestamp without time zone,
  CONSTRAINT soapfault_pkey PRIMARY KEY (id)
);
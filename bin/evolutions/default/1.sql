# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table task (
  id                        integer not null,
  username                  varchar(255),
  password                  varchar(255),
  constraint pk_task primary key (id))
;

create sequence task_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists task;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists task_seq;


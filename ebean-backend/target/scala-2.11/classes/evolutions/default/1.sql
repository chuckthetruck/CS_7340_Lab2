# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table papers (
  paper_id                      bigint auto_increment not null,
  title                         varchar(255),
  book_title                    varchar(255),
  pages                         varchar(255),
  year                          varchar(255),
  url                           varchar(255),
  ee                            varchar(255),
  publisher                     varchar(255),
  journal                       varchar(255),
  volume                        varchar(255),
  number                        varchar(255),
  crossref                      varchar(255),
  isbn                          varchar(255),
  constraint pk_papers primary key (paper_id)
);


# --- !Downs

drop table if exists papers;


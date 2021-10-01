# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table authors (
  author_id                     bigint auto_increment not null,
  author_name                   varchar(255),
  constraint pk_authors primary key (author_id)
);

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

create table paperstoauthors (
  paper_id                      bigint not null,
  author_id                     bigint not null,
  constraint pk_paperstoauthors primary key (paper_id,author_id)
);

alter table paperstoauthors add constraint fk_paperstoauthors_papers foreign key (paper_id) references papers (paper_id) on delete restrict on update restrict;
create index ix_paperstoauthors_papers on paperstoauthors (paper_id);

alter table paperstoauthors add constraint fk_paperstoauthors_authors foreign key (author_id) references authors (author_id) on delete restrict on update restrict;
create index ix_paperstoauthors_authors on paperstoauthors (author_id);


# --- !Downs

alter table paperstoauthors drop foreign key fk_paperstoauthors_papers;
drop index ix_paperstoauthors_papers on paperstoauthors;

alter table paperstoauthors drop foreign key fk_paperstoauthors_authors;
drop index ix_paperstoauthors_authors on paperstoauthors;

drop table if exists authors;

drop table if exists papers;

drop table if exists paperstoauthors;


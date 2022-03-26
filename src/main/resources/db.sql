create table `rainbow`
(
    id      integer not null primary key autoincrement,
    mayday  varchar(255),
    hit_cnt integer default 0
);
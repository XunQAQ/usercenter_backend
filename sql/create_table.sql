-- auto-generated definition
create table user
(
    username     varchar(256)                       null comment 'User nickname',
    id           bigint auto_increment comment 'ID' primary key,
    userAccount  varchar(256)                       null comment 'Account',
    avatarUrl    varchar(1024)                      null comment 'User avatar',
    gender       tinyint                            null comment 'Gender',
    userPassword varchar(512)                       not null comment 'Password',
    phone        varchar(128)                       null comment 'Phone number',
    email        varchar(512)                       null comment 'Email',
    userStatus   int      default 0                 not null comment 'Status: 0 - Normal',
    createTime   datetime default CURRENT_TIMESTAMP null comment 'Creation time',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete     tinyint  default 0                 not null comment 'Deletion flag',
    userRole     int      default 0                 not null comment 'User role: 0 - Regular user, 1 - Administrator',
    planetCode   varchar(512)                       null comment 'Planet code'
)

    comment 'user';


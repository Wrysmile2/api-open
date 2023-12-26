use examination;

-- 接口表
create table if not exists examination.`interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `name` varchar(256) not null comment '用户名',
    `description` varchar(256) null comment '用户名',
    `url` varchar(512) not null comment '接口地址',
    `requestHeader` text null comment '请求头',
    `responseHeader` text null comment '响应头',
    `status` int default 0 not null comment '接口状态（0-关闭，1-开启）',
    `method` varchar(256) null comment '请求类型',
    `userId` bigint not null comment '创建人',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDeleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '接口表';

insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('白天磊', '罗晓博', 'www.bryon-gleason.org', '雷俊驰', '程绍齐', 0, '尹弘文', 4);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('朱烨磊', '叶嘉熙', 'www.shena-kunde.net', '潘浩宇', '龚涛', 0, '徐哲瀚', 7408428759);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('李越彬', '姚语堂', 'www.carla-wiza.co', '金子轩', '冯烨磊', 0, '汪晓啸', 64);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('戴越泽', '阎靖琪', 'www.cleora-fadel.net', '韩鸿涛', '徐健雄', 0, '卢文昊', 73);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('白琪', '崔远航', 'www.mahalia-paucek.com', '余思淼', '周鑫鹏', 0, '唐钰轩', 99651167);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('雷瑞霖', '莫炫明', 'www.stuart-zboncak.io', '万弘文', '贾靖琪', 0, '洪立轩', 3670);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('叶志强', '宋哲瀚', 'www.farrah-paucek.com', '杜鸿煊', '毛熠彤', 0, '黄晋鹏', 311006);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('周炫明', '徐明辉', 'www.ezra-thompson.info', '杨哲瀚', '毛智辉', 0, '白志泽', 6175665699);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('田嘉懿', '姚鸿涛', 'www.marietta-rosenbaum.name', '白擎宇', '孙思', 0, '陈健柏', 78);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('顾鹏煊', '胡烨磊', 'www.sydney-yost.name', '邱弘文', '赵黎昕', 0, '郭志泽', 1570);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('苏涛', '冯皓轩', 'www.arielle-klein.net', '姚擎苍', '梁鹤轩', 0, '韩靖琪', 41220350);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('潘语堂', '黄靖琪', 'www.kathlyn-lind.org', '谢君浩', '魏涛', 0, '谭思', 901657);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('张立轩', '毛明哲', 'www.roger-corkery.co', '范鹏涛', '任健雄', 0, '潘语堂', 6021);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('谢鹏', '邱立辉', 'www.trisha-senger.com', '高浩宇', '邱潇然', 0, '许志泽', 30686);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('邓振家', '顾凯瑞', 'www.ellie-medhurst.io', '高烨伟', '陶煜祺', 0, '陶天翊', 7488438253);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('卢弘文', '邓乐驹', 'www.issac-gleason.io', '韦立辉', '侯鸿煊', 0, '徐鸿煊', 0);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('毛思聪', '雷鸿涛', 'www.serena-becker.biz', '周鹏飞', '谭俊驰', 0, '潘雨泽', 29);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('彭博文', '郝鑫磊', 'www.roy-mayer.org', '雷弘文', '谢泽洋', 0, '龚伟诚', 82899515);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('梁博超', '张凯瑞', 'www.ruthe-altenwerth.com', '贺博涛', '赵子默', 0, '郭烨霖', 975083758);
insert into examination.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`, `method`, `userId`) values ('雷越泽', '孙子涵', 'www.annetta-kuvalis.io', '莫昊强', '阎伟祺', 0, '孟梓晨', 73231221);
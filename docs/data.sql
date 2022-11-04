CREATE TABLE trade(
    t_id int NOT NULL PRIMARY KEY COMMENT '订单编号',
    buyer_nick varchar(40) COMMENT '淘宝昵称',
    buyer_phone varchar(11) COMMENT '买家电话',
    receiver_name varchar(100) COMMENT '接受人姓名',
    receiver_address varchar(100) COMMENT '收货地址',
    receiver_city varchar(10) COMMENT '收货城市',
    trade_status varchar(30) COMMENT '订单状态: TRADE_FINISHED(交易成功),TRADE_CLOSED(付款以后用户退款成功,交易自动关闭), TRADE_CLOSED_BY_TAOBAO(付款以前, 卖家或买家主动关闭交易)',
    create_time DATETIME COMMENT '创建时间'
);

CREATE TABLE orders(
    o_id int NOT NULL PRIMARY KEY COMMENT '子订单编号',
    t_id int NOT NULL COMMENT '订单号',
    seller_shop varchar(40) COMMENT '卖家店铺',
    cid varchar(10) COMMENT '商品分类',
    title varchar(20) COMMENT '商品标题',
    price float COMMENT '商品价格',
    discount_fee float COMMENT '折扣',
    num int COMMENT '购买数量'
);

INSERT INTO trade(t_id, buyer_nick, buyer_phone, receiver_name, receiver_address, receiver_city, trade_status, create_time) VALUES(1000, 'tb_n1', '13666010110', '王先生', '通州北苑5001', '北京', 'TRADE_FINISHED', '2020-01-01');
INSERT INTO trade(t_id, buyer_nick, buyer_phone, receiver_name, receiver_address, receiver_city, trade_status, create_time) VALUES(1001, 'tb_n1', '13398735142', '赵先生', '传媒大学门卫', '北京', 'TRADE_FINISHED', '2020-01-02');
INSERT INTO trade(t_id, buyer_nick, buyer_phone, receiver_name, receiver_address, receiver_city, trade_status, create_time) VALUES(1002, 'tb_n2', '13598710101', '刘女士', '新街口百货公司', '南京', 'TRADE_CLOSED', '2020-01-06');
INSERT INTO trade(t_id, buyer_nick, buyer_phone, receiver_name, receiver_address, receiver_city, trade_status, create_time) VALUES(1003, 'tb_n3', '13809812345', '钱小姐', '玄武湖北门街对面拉面馆', '南京', 'TRADE_CLOSED_BY_TAOBAO', '2020-01-06');
INSERT INTO trade(t_id, buyer_nick, buyer_phone, receiver_name, receiver_address, receiver_city, trade_status, create_time) VALUES(1004, 'tb_n2', '13189056789', '孙小姐', '鼓浪屿码头', '厦门', 'TRADE_CLOSED_BY_TAOBAO', '2020-01-05');
INSERT INTO orders(o_id, t_id, seller_shop, cid, title, price, discount_fee, num) VALUES(5001, 1000, 'apple旗舰店', '00010', 'iphone6s', 5700.00, 30.5, 2);
INSERT INTO orders(o_id, t_id, seller_shop, cid, title, price, discount_fee, num) VALUES(5002, 1000, '古尚古', '00210', 'iphone6s透明壳', 110.00, 5.5, 3);
INSERT INTO orders(o_id, t_id, seller_shop, cid, title, price, discount_fee, num) VALUES(5003, 1001, 'apple旗舰店', '00010', 'iphone11', 7800.00, 50.00, 1);
INSERT INTO orders(o_id, t_id, seller_shop, cid, title, price, discount_fee, num) VALUES(5004, 1002, 'xiaomi旗舰店', '00010', '小米11', 4800.00, 20.00, 2);
INSERT INTO orders(o_id, t_id, seller_shop, cid, title, price, discount_fee, num) VALUES(5005, 1002, 'xiaomi旗舰店', '00210', '小米充电器', 120.00, 0.50, 5);
INSERT INTO orders(o_id, t_id, seller_shop, cid, title, price, discount_fee, num) VALUES(5006, 1003, '天猫超市', '00011', '山东红富士', 73.10, 0.20, 15);
INSERT INTO orders(o_id, t_id, seller_shop, cid, title, price, discount_fee, num) VALUES(5007, 1003, '天猫超市', '00011', '春节特价橙子', 80.65, 0.30, 40);
INSERT INTO orders(o_id, t_id, seller_shop, cid, title, price, discount_fee, num) VALUES(5008, 1003, '天猫超市', '00011', '正宗东北大米', 320.10, 1.50, 8);
INSERT INTO orders(o_id, t_id, seller_shop, cid, title, price, discount_fee, num) VALUES(5009, 1004, '苏宁旗舰店', '20010', '白色大风力吹风机', 220.10, 7.50, 1);
INSERT INTO orders(o_id, t_id, seller_shop, cid, title, price, discount_fee, num) VALUES(5010, 1004, '苏宁旗舰店', '10001', '索尼80寸4K高分辨率电视', 12000.10, 90.50, 2);
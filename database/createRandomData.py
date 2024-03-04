from faker import Faker
import random
import pymysql

# 连接数据库
conn = pymysql.connect(host="localhost", user="root", password="123456", database="oil")
cursor = conn.cursor()

fake = Faker("zh_CN")

# 生成所有的省份
provinces = [
    "北京市",
    "天津市",
    "河北省",
    "山西省",
    "内蒙古自治区",
    "辽宁省",
    "吉林省",
    "黑龙江省",
    "上海市",
    "江苏省",
    "浙江省",
    "安徽省",
    "福建省",
    "江西省",
    "山东省",
    "河南省",
    "湖北省",
    "湖南省",
    "广东省",
    "广西壮族自治区",
    "海南省",
    "重庆市",
    "四川省",
    "贵州省",
    "云南省",
    "西藏自治区",
    "陕西省",
    "甘肃省",
    "青海省",
    "宁夏回族自治区",
    "新疆维吾尔自治区",
    "台湾省",
    "香港特别行政区",
    "澳门特别行政区",
]

provinces_and_capitals = {
    "北京市": "北京",
    "天津市": "天津",
    "河北省": "石家庄",
    "山西省": "太原",
    "内蒙古自治区": "呼和浩特",
    "辽宁省": "沈阳",
    "吉林省": "长春",
    "黑龙江省": "哈尔滨",
    "上海市": "上海",
    "江苏省": "南京",
    "浙江省": "杭州",
    "安徽省": "合肥",
    "福建省": "福州",
    "江西省": "南昌",
    "山东省": "济南",
    "河南省": "郑州",
    "湖北省": "武汉",
    "湖南省": "长沙",
    "广东省": "广州",
    "广西壮族自治区": "南宁",
    "海南省": "海口",
    "重庆市": "重庆",
    "四川省": "成都",
    "贵州省": "贵阳",
    "云南省": "昆明",
    "西藏自治区": "拉萨",
    "陕西省": "西安",
    "甘肃省": "兰州",
    "青海省": "西宁",
    "宁夏回族自治区": "银川",
    "新疆维吾尔自治区": "乌鲁木齐",
    "台湾省": "台北",
    "香港特别行政区": "香港",
    "澳门特别行政区": "澳门",
}

# 插入省份表数据
for province in provinces:
    capital_city = provinces_and_capitals[province]
    gdp = round(random.uniform(1000, 10000), 2)
    region = random.choice(["华东", "西北", "华中", "西南"])
    insert_query = f"INSERT INTO province (province_name, capital_city, gross_domestic_product, region) VALUES ('{province}', '{capital_city}', {gdp}, '{region}')"
    cursor.execute(insert_query)


# 插入石油产量表数据
for province in provinces:
    total_production = round(random.uniform(10000, 100000), 2)
    crude_oil_amount = round(total_production * random.uniform(0.1, 0.9), 2)
    loss_amount = round(total_production * random.uniform(0, 0.1), 2)
    finished_product_amount = round(
        total_production - crude_oil_amount - loss_amount, 2
    )
    insert_query = f"INSERT INTO oil_production (province_name, total_production, crude_oil_amount, loss_amount, finished_product_amount) VALUES ('{province}', {total_production}, {crude_oil_amount}, {loss_amount}, {finished_product_amount})"
    cursor.execute(insert_query)

# 插入产品数量表数据
for province in provinces:
    refined_products = round(random.uniform(1000, 10000), 2)
    chemical_products = round(random.uniform(1000, 10000), 2)
    gasoline = round(random.uniform(500, 5000), 2)
    diesel = round(random.uniform(500, 5000), 2)
    lubricating_oil = round(random.uniform(500, 5000), 2)
    fertilizer = round(random.uniform(500, 5000), 2)
    kerosene = round(random.uniform(500, 5000), 2)
    insert_query = f"INSERT INTO product_quantity (province_name, refined_products, chemical_products, gasoline, diesel, lubricating_oil, fertilizer, kerosene) VALUES ('{province}', {refined_products}, {chemical_products}, {gasoline}, {diesel}, {lubricating_oil}, {fertilizer}, {kerosene})"
    cursor.execute(insert_query)

# 插入石油库存表数据
for province in provinces:
    total_refining_production = round(random.uniform(10000, 100000), 2)
    inventory_quantity = random.randint(1000, 10000)
    external_supply_quantity = random.randint(1000, 10000)
    insert_query = f"INSERT INTO oil_inventory (province_name, total_refining_production, inventory_quantity, external_supply_quantity) VALUES ('{province}', {total_refining_production}, {inventory_quantity}, {external_supply_quantity})"
    cursor.execute(insert_query)

# 提交插入操作
conn.commit()

# 关闭连接
cursor.close()
conn.close()

CREATE TABLE province (
    id INT AUTO_INCREMENT PRIMARY KEY,
    province_name VARCHAR(100) NOT NULL,
    capital_city VARCHAR(100) NOT NULL,
    gross_domestic_product DECIMAL(18, 2) NOT NULL,
    region ENUM('华东', '西北', '华中', '西南') NOT NULL
);


CREATE TABLE oil_production (
    id INT AUTO_INCREMENT PRIMARY KEY,
    province_name VARCHAR(100) NOT NULL,
    total_production DECIMAL(18, 2) NOT NULL,
    crude_oil_amount DECIMAL(18, 2) NOT NULL,
    loss_amount DECIMAL(18, 2) NOT NULL,
    finished_product_amount DECIMAL(18, 2) NOT NULL
);


CREATE TABLE product_quantity (
    id INT AUTO_INCREMENT PRIMARY KEY,
    province_name VARCHAR(100) NOT NULL,
    refined_products DECIMAL(18, 2) NOT NULL,
    chemical_products DECIMAL(18, 2) NOT NULL,
    gasoline DECIMAL(18, 2) NOT NULL,
    diesel DECIMAL(18, 2) NOT NULL,
    lubricating_oil DECIMAL(18, 2) NOT NULL,
    fertilizer DECIMAL(18, 2) NOT NULL,
    kerosene DECIMAL(18, 2) NOT NULL
);


CREATE TABLE oil_inventory (
    id INT AUTO_INCREMENT PRIMARY KEY,
    province_name VARCHAR(100) NOT NULL,
    total_refining_production DECIMAL(18, 2) NOT NULL,
    inventory_quantity INT NOT NULL,
    external_supply_quantity INT NOT NULL
);

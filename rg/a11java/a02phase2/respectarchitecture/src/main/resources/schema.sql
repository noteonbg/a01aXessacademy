
CREATE TABLE IF NOT EXISTS patient (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(10) NOT NULL,
    condition VARCHAR(100) NOT NULL
);


CREATE TABLE IF NOT EXISTS patient_poc (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(10) NOT NULL,
    condition VARCHAR(100) NOT NULL,

    -- Flattened address fields from @Embedded Address
    street VARCHAR(150),
    city VARCHAR(100),
    state VARCHAR(100),
    pincode VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS citizen (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS  aadhaar_card (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    aadhaar_number VARCHAR(12) NOT NULL,
    citizen_id BIGINT,
    CONSTRAINT fk_citizen FOREIGN KEY (citizen_id) REFERENCES citizen(id)
);


-- Table for Pharmacy
CREATE TABLE IF NOT EXISTS pharmacy (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100)
);

-- Table for Medicine
CREATE TABLE IF NOT EXISTS medicine (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL,
    pharmacy_id BIGINT,
    CONSTRAINT fk_pharmacy FOREIGN KEY (pharmacy_id) REFERENCES pharmacy(id) on delete cascade
);


CREATE TABLE IF NOT EXISTS book (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    author VARCHAR(100) NOT NULL,
    genre VARCHAR(50)
);



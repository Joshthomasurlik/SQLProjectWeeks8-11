DROP TABLE IF EXISTS project_category;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS material;
DROP TABLE IF EXISTS project;




CREATE TABLE project (
project_id INT NOT NULL,
project_name VARCHAR(128) NOT NULL,
estimated_hours decimal (7, 2) NULL,
actual_hours decimal (7, 2) NULL,
difficulty INT NULL,
notes TEXT NULL,
PRIMARY KEY (PROJECT_ID)
);

CREATE TABLE material (
material_id INT NOT NULL,
project_id INT NOT NULL,
material_name varchar(128) NOT NULL,
num_required INT NULL,
cost decimal (7,2) NULL,
PRIMARY KEY (material_id),
FOREIGN KEY (project_id),
ON DELETE CASCADE
);

CREATE TABLE step (
step_id INT NOT NULL,
project_id INT NOT NULL,
step_text TEXT NOT NULL,
step_order INT NOT NULL,
PRIMARY KEY (step_id),
FOREIGN KEY (project_id),
ON DELETE CASCADE

);

CREATE TABLE category (
category_id INT NOT NULL,
category_name VARCHAR (128) NOT NULL,
PRIMARY KEY (category_id),
);

CREATE TABLE project_category (
project_id INT NOT NULL,
category_id INT NOT NULL,
FOREIGN KEY (project_id),
FOREIGN KEY (category_id),
UNIQUE KEY (project_id),
UNIQUE KEY (category_id),
ON DELETE CASCADE
);
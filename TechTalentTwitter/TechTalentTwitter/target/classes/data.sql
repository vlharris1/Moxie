MERGE INTO `role` VALUES (1,'USER');

INSERT INTO user (user_id, active, email, first_name, last_name, password, username) VALUES
('0', 'active','moxie@email.com', 'Moxie', 'Harris', 'password', 'foxymoxie');

MERGE INTO user (user_id, active, email, first_name, last_name, password, username) VALUES
('0', '1','username@email.com', 'username', 'username', 'password', 'username');

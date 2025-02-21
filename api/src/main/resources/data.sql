
-- Ajout de quelques citations inspirantes
INSERT IGNORE INTO quote (content) VALUES 
('Le succès, c’est d’aller d’échec en échec sans perdre son enthousiasme.'),
('Faites de votre vie un rêve, et d’un rêve, une réalité.'),
('Croyez en vos rêves et ils se réaliseront peut-être. Croyez en vous et ils se réaliseront sûrement.');

-- Ajout d'un utilisateur test
INSERT IGNORE INTO user (name) VALUES ('Alice');

-- Ajout d'une conversation test
INSERT IGNORE INTO conversation (user_id, message, response) VALUES 
(1, 'Je suis stressé par le travail...', 'Le succès, c’est d’aller d’échec en échec sans perdre son enthousiasme.');

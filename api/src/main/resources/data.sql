
-- Ajout de quelques citations inspirantes
INSERT IGNORE INTO quote (id, content) VALUES 
(1, 'Le succès, c’est d’aller d’échec en échec sans perdre son enthousiasme.'),
(2, 'Faites de votre vie un rêve, et d’un rêve, une réalité.'),
(3, 'Croyez en vos rêves et ils se réaliseront peut-être. Croyez en vous et ils se réaliseront sûrement.'),
(4, 'La persévérance, c’est ce qui rend l’impossible possible, le possible probable et le probable réalisé.'),
(5, "Croyez en vos rêves et ils se réaliseront peut-être. Croyez en vous et ils se réaliseront sûrement."),
(6, 'La vie est un mystère qu’il faut vivre, et non un problème à résoudre.'),
(7, 'La vie, c’est comme une bicyclette, il faut avancer pour ne pas perdre l’équilibre.'),
(8, 'La vie est un défi à relever, un bonheur à mériter, une aventure à tenter.');


-- Ajout d'une conversation test
INSERT IGNORE INTO conversation (id, username, message, response_id) VALUES 
(1, 'Jean-Kevin', 'Je suis stressé par le travail...', 3);

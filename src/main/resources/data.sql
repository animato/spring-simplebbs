INSERT INTO `article` (`subject`, `contents`, `author`, `user_id`) VALUES
('첫 번째 글', '첫 번째 글의 내용입니다.', '홍길동', 1),
('두 번째 글', '두 번째 글의 내용입니다.', '이몽룡', 1);

INSERT INTO `user` (`username`, `password`)
VALUES
	('user', '{bcrypt}$2a$10$TS7MzAWpYfTSztMgpJ.cl.l1hy5TFbuY.HDMB4oRnRqYwaSq9jZ/2');
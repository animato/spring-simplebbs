INSERT INTO `article` (`subject`, `contents`, `author`, `user_id`) VALUES
('첫 번째 글', '첫 번째 글의 내용입니다.', '홍길동', 3),
('두 번째 글', '두 번째 글의 내용입니다.', '이몽룡', 2);

INSERT INTO `user` (`username`, `password`)
VALUES
	('user', '{bcrypt}$2a$10$TS7MzAWpYfTSztMgpJ.cl.l1hy5TFbuY.HDMB4oRnRqYwaSq9jZ/2');

INSERT INTO `comment` (`id`, `article_id`, `user_id`, `author`, `content`, `created_at`, `updated_at`)
VALUES
    (1, 1, 1, 'user', '댓글 테스트', '2024-07-23 09:44:42', NULL),
    (2, 1, 1, 'user', 'asdfasdfasdfasdfsdf', '2024-07-23 09:44:46', NULL);

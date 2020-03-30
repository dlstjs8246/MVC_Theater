-- 영화관
DROP SCHEMA IF EXISTS pis_movie;

-- 영화관
CREATE SCHEMA pis_movie;

-- 영화
CREATE TABLE pis_movie.movie (
	no       INT         NOT NULL COMMENT '번호', -- 번호
	name     varchar(20) NULL     COMMENT '제목', -- 제목
	content  TEXT        NULL     COMMENT '내용', -- 내용
	file     varchar(20) NULL     COMMENT '파일', -- 파일
	schedule varchar(40) NULL     COMMENT '시간표' -- 시간표
)
COMMENT '영화';

-- 영화
ALTER TABLE pis_movie.movie
	ADD CONSTRAINT PK_movie -- 영화 기본키
		PRIMARY KEY (
			no -- 번호
		);
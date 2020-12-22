# 코드로 배우는 스프링 부트 웹 프로젝트

## Guest Book Project   
|기능|URL|GET/POST|기능|Redirect URL|
|:---:|:---:|:---:|:---:|:---:|
|목록|/guestbook/list|GET|목록/페이징/검색|X|
|등록|/guestbook/register|GET|입력 화면|X|
|등록|/guestbook/register|POST|등록 처리|/guestbook/list|
|조회|/guestbook/read|GET|조회 화면|X|
|수정|/guestbook/modify|GET|수정/삭제 기능 화면|X|
|수정|/guestbook/modify|POST|수정 처리|/guestbook/read|
|삭제|/guestbook/remove|POST|삭제 처리|/guestbook/list|

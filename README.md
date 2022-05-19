# ToyProject-Board-SpringBoot
Springboot를 이용한  게시판

## 개발환경
- IDE(통합개발환경) : IntelliJ Ultimate Edition
- 개발 언어 : Java 11.0.9
- 프레임워크 : Spring Boot 2.6.7
- 빌드 : Gradle
- DB(데이터베이스) : MariaDB 15.1
- DB 접근 기술(ORM) : JPA
- View 템플릿 : Thymeleaf



## 기능
### 1. 게시글 리스트 리스팅 처리
- DB에 등록된 게시글을 최신순서로 정렬
![게시판 리스트](https://user-images.githubusercontent.com/86394597/169237504-57af05e5-8603-4550-ab41-e33b2bd20362.JPG)


- 아래 페이징처리된 버튼을 통해 분할처리된 페이지들에 등록된 게시글을 확인 가능, 현재 페이지는 red색 표기(게시글 리스트 페이징처리 기능)
![Inked게시판 리스트 페이징처리_LI](https://user-images.githubusercontent.com/86394597/169237522-54ef174c-5f16-4b65-9528-5b645837f48c.jpg)

- textArea에 원하는 단어 입력 시, 단어를 포함한 게시글 리스트가 표출 (게시글 검색 기능)
![게시판 검색](https://user-images.githubusercontent.com/86394597/169237548-aaa4c655-605b-45ad-92b7-ead4343297df.JPG)
![DB](https://user-images.githubusercontent.com/86394597/169237530-f95889a8-bc49-42e7-8c6d-b88bee6036da.JPG)


### 2. 게시글 작성 처리
- 파일 선택 버튼 클릭 시, 파일 업로드 가능 (파일 업로드 기능)
![게시글 작성폼](https://user-images.githubusercontent.com/86394597/169237079-c9c293d3-efea-4971-af11-b641d71d17fe.JPG)


- 등록하기 버튼 클릭 시, 등록완료 알림창을 띄운 후 게시글 리스트 페이지로 이동
![글작성완료 알림창](https://user-images.githubusercontent.com/86394597/169237815-8b59ea16-f391-46df-a14e-790aae26294d.JPG)


- 목록으로 버튼 클릭 시, 게시글 리스트 페이지로 이동
![게시글 작성 후 리스트](https://user-images.githubusercontent.com/86394597/169237718-02364ec2-edda-4bfc-901a-d5a358f89325.JPG)



### 3. 게시글 상세페이지 처리
- 업로드된 파일 띄우기
![게시글 작성 후 상세페이지](https://user-images.githubusercontent.com/86394597/169237906-1d703923-c8b8-4c45-a7e2-1d1f4fe600f5.JPG)


- 파일다운 버튼 클릭 시, 이미지를 저장 가능한 페이지로 이동
- 삭제하기 버튼 클릭 시, 삭제완료 알림창을 띄운 후 게시글 리스트 페이지로 이동 (게시글 삭제메세지 기능)
- 수정하기 버튼 클릭 시, 수정폼 페이지로 이동
- 목록으로 버튼 클릭 시, 게시글 리스트 페이지로 이동


### 4. 게시글 수정 처리
- 수정 버튼을 클릭하여 수정폼에 들어오면, 원문 게시글의 내용을 미리 수정폼에 위치시켜둔다.
![게시글 수정폼](https://user-images.githubusercontent.com/86394597/169238047-374aff70-df84-4ea4-bc2f-5ed595f495fa.JPG)


- 파일 업로드 기능

- 수정하기 버튼 클릭 시, 수정완료 알림창을 띄운 후 게시글 리스트 페이지로 이동 (게시글 수정메세지 기능)
![게시글 수정완료 알림창](https://user-images.githubusercontent.com/86394597/169238151-e4d55345-dd73-4633-87ec-c61ba5e5be3a.JPG)
![게시글 수정 후 리스트](https://user-images.githubusercontent.com/86394597/169238184-b2f69735-fa63-4181-a4e9-11b8aee30c5c.JPG)
![게시글 수정 후 상세페이지](https://user-images.githubusercontent.com/86394597/169238114-fcd14000-2fb3-43e5-bcb1-d14b95a8c829.JPG)


- 이전으로 버튼 클릭 시, 원문 게시글 상세페이지로 이동

### 5. 게시글 삭제 처리
- 삭제하기 버튼 클릭 시, 삭제완료 알림창을 띄운 후 게시글 리스트 페이지로 이동 (게시글 삭제메세지 기능)
![게시글 삭제 알림창](https://user-images.githubusercontent.com/86394597/169237951-6743dd38-73a0-4a54-9c1e-cf7badbca1f4.JPG)


### 6. 리스트 목록 이동, 이전, 수정하기 등 페이지 이동처리


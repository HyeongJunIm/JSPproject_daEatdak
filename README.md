# JSP - Daeatdak
JSP - MyBatis 프로젝트

## 🕰️ 목적
* 첫 목적은 컨트롤러 등을 통해 페이지와 데이터 이동 등을 확인하기 위한 간단한 프로젝트였다.
* 그 때문에 한 달이라는 시간이 흘렀음에도 백엔드 작업이 거의 이루어지지 않았기에 초기에 계획했엇던 ERD를 바탕으로  프로젝트를 진행하였다.
* 약 1주일 간 개인적으로 진행하였고 장바구니 물품 삭제, 결제, 마이페이지 결제내역 등은 미완성 상태이다.

<br>


## 🖥️ 프로젝트 소개
다이어트 식품 쇼핑몰<br>


## 🕰️ 개발 기간
* 2023.8 - 2023.9
* 혼자 진행한 기간 2023.11.11~ 18




### ⚙️ 개발 환경
- **IDE** : Eclipse
- **Library** : MyBatis
- **Database** : Oracle DB(11xe)

### 📌포트폴리오 

[DaEatdak.pdf](https://github.com/bokkaa/JSP-daEatdak/files/14491662/DaEatdak.pdf)


## 📌 내가 맡은 기능
#### 메인 페이지 <a href="https://github.com/bokkaa/JSPproject_daEatdak/wiki/%EB%A9%94%EC%9D%B8%ED%8E%98%EC%9D%B4%EC%A7%80" >상세보기 - WIKI 이동</a>
- 카테고리별 상품 목록
- 최근 등롣된 상품

#### 상품 목록 및 검색 <a href="https://github.com/bokkaa/JSP-daEatdak/wiki/%EC%83%81%ED%92%88-%EB%AA%A9%EB%A1%9D-%EB%B0%8F-%EA%B2%80%EC%83%89" >상세보기 - WIKI 이동</a>
- 상품 목록
- 상품 검색

#### 상품 상세 <a href="https://github.com/bokkaa/JSP-daEatdak/wiki/%EC%83%81%ED%92%88-%EC%83%81%EC%84%B8" >상세보기 - WIKI 이동</a>
- 상품 상세 정보
- 찜하기
- 장바구니 담기

#### 로그인 및 회원가입 <a href="https://github.com/bokkaa/JSP-daEatdak/wiki/%EB%A1%9C%EA%B7%B8%EC%9D%B8-%EB%B0%8F-%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85" >상세보기 - WIKI 이동</a>
- 로그인
- 회원가입

#### 계정 찾기 <a href="https://github.com/bokkaa/JSP-daEatdak/wiki/%EA%B3%84%EC%A0%95%EC%B0%BE%EA%B8%B0" >상세보기 - WIKI 이동</a>
- 이메일 찾기
- 비밀번호 찾기

#### 마이페이지 회원정보 수정 <a href="https://github.com/bokkaa/JSP-daEatdak/wiki/%EB%A7%88%EC%9D%B4%ED%8E%98%EC%9D%B4%EC%A7%80---%ED%9A%8C%EC%9B%90%EC%A0%95%EB%B3%B4-%EC%88%98%EC%A0%95" >상세보기 - WIKI 이동</a>
- 회원 비밀번호 인증
- 회원 정보 수정
  
#### 마이페이지 찜 내역 <a href="https://github.com/bokkaa/JSP-daEatdak/wiki/%EB%A7%88%EC%9D%B4%ED%8E%98%EC%9D%B4%EC%A7%80-%EC%B0%9C-%EB%AA%A9%EB%A1%9D" >상세보기 - WIKI 이동</a>
- 상품 찜 목록
- 찜 목록 상품 장바구니 담기
- 찜 삭제

<hr>


<hr>

## 📌느낀점

정식으로 JPA 수업도 들었던 것이 아니고 인프런에서 JPA 관련 강의 두 개를 들으며 시작했던 프로젝트였다. 그 상태로 처음 프로젝트를 시작했을 때, 빌더 패턴에서 막히기 시작했다. 그래서 빌더 패턴은 무엇이고 빌더 패턴은 왜 사용하는지 등을 이런 저런 자료를 찾아보며 프로젝트에 적용하기 시작했다.  

프로젝트를 진행하며 JPA에서 경계해야하는 N+1 문제가 일어난 적이 한 번 있었다. 보통 N+1이 터지는 이유는 특히 ForEach(빠른 for문) 안에서 쿼리가 개수만큼 더 돌아가는 경우였고, 이를 해결하기 위해 정보를 하나의 쿼리로 데이터를 조회하거나 여러 쿼리로 조회하여 스트림을 통해 매핑을 하였다. 

그런데 한 가지 문제가 있었는데 엔티티 관계가 OneToOne인 경우 자동적으로 유니크 키가 설정되어 삭제 후 수정 로직이 들어가는 기능을 구현했을 시 에러가 발생했다. 때문에 어쩔 수 없이 OneToOne 관계지만 OneToMany , ManyToOne으로 관계를 설정해야만 했다.

까다롭다면 까다로운 이 ORM 기술을 한 번 사용해보니 장점은 명확했다. 일단 JAVA가 일종의 주인이 되어 JAVA 코드로 데이터베이스를 관리할 수 있다는 점이 가장 큰 장점이 아닐까 싶다. 


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

#### 관리자페이지 상품 <a href="https://github.com/bokkaa/JSP-daEatdak/wiki/%EA%B4%80%EB%A6%AC%EC%9E%90-%ED%8E%98%EC%9D%B4%EC%A7%80---%EC%83%81%ED%92%88" >상세보기 - WIKI 이동</a>
- 상품 목록
- 상품 등록
- 상품 수정 및 삭제

<hr>


## 📌느낀점

처음으로 페이지와 데이터를 연동하여 흐름을 알아가는 과정의 프로젝트다 보니 일반으로 보여지는 웹사이트 만큼 완성도가 있지는 않았다. 데이터를 불러오기 위한 쿼리문도 완성도가 높은 수준은 아니였다.
Mybtis Framework를 통해서 데이터를 연동하여 페이지에 원하는 것을 보여질수 있다는 것에 만족해야했다.
JSP프로젝트를 통해서 원하는 데이터를 요구하기 위해 Controller -> DAO -> Mapper라는 과정을 통하여 어떤식으로 코드를 작성해야며 이때 필요한 요구되는 필드, html에서 사용해야하는 코드 등  동작과정들을 많이 배울 수 있었다. 

이전에 Eclipse에 순수하게 JAVA코드만을 작성하여 연습하였던 것보다는 실제 눈으로 볼수있다는 점에서 많은 흥미와 재미를 느꼈으며 좀더 코드에 흐름에 대해서 이해하기위해 노력하였고 앞으로 이어져 나갈 Spring 프로젝트에서는 이런 배운점을 기반으로 좀더 코드를 간결하고 가독성 있게 작성하기 위해 노력해야겠다.




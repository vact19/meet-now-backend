패키지 설명

- api : 요청과 응답과 관련한 컨트롤러, DTO가 포함된다.
    service가 포함될 수도 있는데, 이는 DTO 변환 역할만 하고 중요한 역할은 domain 패키지의 service가 한다.


- global : 애플리케이션 전체에 영향을 미치는 설정관련 코드
    - config : 설정 파일 등록 (@Configuration) 


- domain : 서비스를 이루는 핵심 자원이 모여있음.
    domain 패키지의 요소들은 api 패키지의 DTO를 최대한 모르게 하는 것이 좋다. 
    domain이 리더고 DTO가 팔로워의 느낌이다.
  - DTO는 화면이 늘어날수록 무한정 늘어날 수 있어서,
    팔로워인 DTO들이 리더인 domain 패키지의 요소들을 따른다.
    그래서 가급적 api 패키지 내부의 DTO클래스에서 toEntity()는 만들되,
    domain 패키지 내부의 entity 클래스에서 toDto()는 만들지 않는다


      


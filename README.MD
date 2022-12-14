## JPA 예제
<ol>
<li>
<ol>
    <li> ORM (Object Relational Mapping)</li>
1) 객체 관계 매핑 <br>
2) 테이블을 자동으로 매핑하는 방법
    <li>장점</li>
1) ORM을 사용하면서 데이터베이스 쿼리를 객체지향적으로 조작할 수 있습니다.<br>
    &nbsp- 쿼리문을 작성하는 양이 현저히 줄어 개발 비용이 줄어듭니다.<br>
    &nbsp- 객체지향적으로 데이터베이스에 접근할 수 있어 코드의 가독성을 높입니다.<br><br>
2) 재사용 및 유지보수가 편리합니다.<br>
    &nbsp- ORM을 통해 매핑된 객체는 모두 독립적으로 작성되어 있어 재사용이 용이합니다.<br>
    &nbsp- 객체들은 각 클래스로 나뉘어 있어 유지보수가 수월합니다.<br><br>
3) 데이터베이스에 대한 종속성이 줄어듭니다.<br>
    &nbsp- ORM을 통해 자동으로 생성된 SQL문은 객체를 기반으로 데이터베이스 테이블을 관리하기 때문에 데이터베이스에 종속성이 적지 않습니다.<br>
    &nbsp- 데이터베이스를 교체하는 상황에서도 비교적 적은 리스크를 부담합니다.

<li>단점</li>
1) ORM만으로 온전한 서비스를 구현하기에는 한계가 있습니다.<br>
    - 복잡한 서비스의 경우 직접 쿼리를 구현하지않고 코드로 구현하기 어렵습니다.<br>
    - 복잡한 쿼리를 정확한 설계 없이 ORM만으로 구성하게 되면 속도 저하등의 문제가 발생 합니다<br>
2) 애플리케이션의 객체 관점과 데이터베이스의 관계 관점이 불일치 합니다.<br>
    - 세분성 : 테이블 수와 애플리케이션의 엔티티 클래스의 수가 다른 경우가 생깁니다.<br>
    - 상속성 : RDBMS에 상속개념이 없습니다.<br>
    - 식별성 : 기본키로 동일성을 정의합니다.<br>
    - 연관성 : 외래키를 삽입함으로서 연관성을 표현합니다.<br>
    - 탐색 : 자바와 RDBMS는 객체 접근 방법이 다릅니다. 자바에서는 특정 값에 접근하기 위해 객체 참조 같은 연결 수단을 활용합니다.<br>
</ol>
</li>
<li>
     <ol>
        <li>하이버네이트</li>
        - JPA의 구현체 <br>
        - Spring Data JPA 활용 <br>
        - 엔티티 매니저는 엔티티 매니저 팩토리에서 생성한다 (JPA Repo는 Entity 매니저 이용) <br>
        <li>엔티티 생명주기</li>
        - 비영속 (영속성 컨텍스트에 추가되지 않은 엔티티 객체의 상태를 의미합니다. <br>
        - 영속 (영속성 컨텍스트에 의해 엔티티 객체가 관리되는 상태입니다) <br>
        - 준영속 (영속성 컨텍스트에 의해 관리되던 엔티티 객체가 켄텍스트와 분리된 상태입니다. <br>
        - 삭제 ( 데이터 베이스에서 레코드를 삭제하기 위해 영속성 컨텍스트에 삭제 요청을 한 상태입니다. <br> 
    </ol>
</li>
<li>
    <ol>
        <li>생성규칙</li>
        - 1. FindBy<br>
        - 2. AND,OR<br>
        - 3. Like/NotLike<br>
        - 4. StartsWith/StartingWith<br>
        - 5. EndWith/EndingWidth<br>
        - 6. IsNull/IsNotNull<br>
        - 7. True/False<br>
        - 8. Before/After<br>
        - 9. LessThan/GreaterThan<br>
        - 10.Between<br>
        - 11.OrderBy<br>
        - 12.countBy<br>
    </ol>
</li>
</ol>
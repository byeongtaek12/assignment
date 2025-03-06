# Java-Project-Calculator

Java를 사용하여 level1, 2, 3 단계별로 계산기 만들기
<br>
<br>
브랜치 lv1, lv2, lv3(구현❌)를 확인해주세요.
-------

## 프로젝트 개요

프로젝트명 : 계산기 <br>

프로젝트 목적 : 

- Java 기초적인 문법을 배우고 기본기 수련
- 절차지향적 설계 이해
- 객체지향적 설계 이해
- 자바 전반적 이해

사용언어 : Java

-----

### 레벨별 요구 사항

-----
#### 필수기능 Lv1, Lv2   ( ¯\_(ツ)_/¯ ) <br> 

Lv1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기

- 양의 정수(0 포함)를 입력받기
- 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
- 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
- 반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기

Lv2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기

- 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
- Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 
수정
- App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화 getter와 setter 사용)
- Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정

---
#### 도전기능 LV3 (┬┬﹏┬┬)  구현x <br>

Lv3. Enum, 제네릭, 람다 & 스트림을 이해한 계산기 만들기
- Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리하고 이를 사칙연산 계산기 ArithmeticCalculator 클래스에 활용
- 실수, 즉 double 타입의 값을 전달 받아도 연산이 수행하도록 만들기(제네릭 활용하여 구현)
- 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력(스트림과 람다 활용하여 구현)


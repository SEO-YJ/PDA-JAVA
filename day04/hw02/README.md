### UserDAO 구현 프로젝트
# 구현
회원 정보 - id, pw, 이름
DB를 대체할 클래스 DAO (DB 기능은 Map의 메소드로 대체)

# 과정
- 1:회원가입 / 2:로그인 / 3: 회원정보 수정 / 4 : 탈퇴 / 0 : 종료
- 1
   - 가입하실 아이디와 비밀번호, 이름을(띄어쓰기로 구분하여) 입력해주세요
   - name님 가입을 환영합니다~
- 2
   - 로그인을 위해 아이디와 password를 input하세요
   - id 님 로그인이 완료되었습니다. / 로그인 실패
- 3
   - [로그인 O] 로그인 상태가 아닙니다
   - [로그인 X] users.getCurrentUser()님의 정보를 변경합니다
      - 변경하실 pw를 입력하세요
- 4
   - [로그인 O] 로그인 상태가 아닙니다
   - [로그인 X] [탈퇴]
- 0
   - [종료]
## ERD
![image](https://github.com/SJJuunnY/Java_Practice_PDA/assets/118606256/cc54ddd4-3bb8-4879-901c-a9a8e3f84eba)
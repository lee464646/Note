git 영역
https://iseunghan.tistory.com/322

git init과 git init --bare
https://blog.naver.com/ggoddii/222499144562


git 명령어
git init : 로컬 공간 만들기
git clone [git_path] : 코드 가져오기
git checkout [branch_name] : 브랜치 선택하기
git branch [branch_name] : 브랜치 생성하기
git branch -r : 원격 브랜치 목록보기
-m 이름
-d 삭제
-rm 삭제
git commit -m "" : 설명
git push [romote_name branch_name] : git server 보내기
git pull : fetch + merge
git fetch : git 서버 최신 것 확인 ?
git log [이름/브랜치이름] : 로그 읽기
git reset --hard HEAD^ : commit한 이전 코드 취소하기
git stash [save ""] : 작업코드 임시 저장 브랜치 변경
git stash pop : 마지막 임시저장한 작업코드 가져오기

merge 하면 현재 브랜치에 원하는 것을 가져오는 것이다.
즉, 마스터에서 다른 걸 marge 하면 마스터에 덮어씌워지는 참사 발생

원격서버와 로컬서버 ?

저장소와 작업공간

first ... 충돌 가장 높은 브랜치 있는 명령어 있다

mkdir 
vim
?하나더

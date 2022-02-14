public class testClass {

    public static void main(String[] args) {

        //String skill, String[] skill_trees
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};


        int answer = 0;
        // 스킬 순서 나눠두기
        String[] advanceSkill = skill.split("");
        // 입력 스킬 수만큼 반복
        for (int i = 0; i < skill_trees.length; i++) {
            boolean flag = true;
            //
            for (int j = 1; j < advanceSkill.length; j++) {
                int start = skill_trees[i].indexOf(advanceSkill[j-1]);
                System.out.println("start : " + start);
                int end = skill_trees[i].indexOf(advanceSkill[j]);
                System.out.println("end : " + end);
                //
                if (start == -1 && end != -1) {
                    flag = false;
                }
                //
                if (end != -1 && start > end) {
                    flag = false;
                }
                //
                if (flag == false) break;
            }
            //
            if (flag) answer++;

        }
        System.out.println("일치 개수 : "+answer);

    }
}

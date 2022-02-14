public class test2 {

    public static void main(String[] args) {

        String skill = "tes";
        for (int i = 0; i < skill.length(); i++) {
            String currentTree = skill.substring(i, i + 1);
            System.out.println("i : " + i + ", curr : "+currentTree);
        }

    }
}

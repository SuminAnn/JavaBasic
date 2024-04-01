package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberContruct member1 = new MemberContruct("user1", 15, 90);
        MemberContruct member2 = new MemberContruct("user2", 16);

        MemberContruct[] members = {member1, member2};

        for (MemberContruct m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);
        }
    }
}

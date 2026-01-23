package hello.core.member;

public class MemberServiceImpl implements MemberService {

	//구현체가 없이 만들면 NPE로 터지기 때문에 new를 통해 구현체 생성
	private final MemberRepository memberRepository = new MemoryMemberRepository();

	//회원가입
	@Override
	public void join(Member member){
		memberRepository.save(member);
	}

	//회원조회
	@Override
	public Member findMember(Long memberId){
		return memberRepository.findById(memberId);
	}
}


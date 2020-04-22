public class ReferenceTypes{
	public ReferenceTypes(){

	}
	public ReferenceTypes(String data){

	}
	
	public void makeMemberObject(){
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MenberDTO("Sangmin");
		MemberDTO dto2 = new MenberDTO("Sangmin", "010XXXXYYYY");
		MemberDTO dto2 = new MenberDTO("Sangmin", "010XXXXYYYY", "god@godofjava.com");
	}
}

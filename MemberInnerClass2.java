class MemberInnerClass2{
	
	private String memberVar;
	
	public static void main(String[] args){
		MemberInnerClass2 m = new MemberInnerClass2();
		m.memberVar = "str001";
		IClass o = m.get("hahaer");
		o.print();
	}
	
	
	
	interface IClass{
		public void print();
	}

	public IClass get(String $str){
		
		String sskk = "sskk";
		class Inner implements IClass{
			private String _fvv;
			public Inner(String $s){
				//_fvv = $str;
				//_fvv = $s;
				//_fvv = sskk;
				_fvv = memberVar;
			}
			public void print(){
				System.out.println(_fvv);
			}
		}
		return new Inner("Œ“¿¥¿≤");
	}

}


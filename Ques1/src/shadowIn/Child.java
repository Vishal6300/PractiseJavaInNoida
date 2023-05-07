package shadowIn;

public class Child {
		private int serialNo;
		private String name;
		private int age;
		private String Hospital;
		
		
		public int getSerialNo() {
			return serialNo;
		}
		public void setSerialNo(int serialNo) {
			this.serialNo = serialNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getHospital() {
			return Hospital;
		}
		public void setHospital(String hospital) {
			Hospital = hospital;
		}
		
		
		@Override
		public String toString() {
			return "Child [serialNo=" + serialNo + ", name=" + name + ", age=" + age + ", Hospital=" + Hospital + "]";
		}
		
		
		public Child(int serialNo, String name, int age, String hospital) {
			super();
			this.serialNo = serialNo;
			this.name = name;
			this.age = age;
			Hospital = hospital;
		}
		
		
}

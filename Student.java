//Student.java

class Student{
		private String name;
		private long prn;
		private int Position;
		private String dob;
		private double marks;

		public Student(String name, long prn, int Position){
			setName(name);
			setPRN(prn);
			setPosition(Position);
			setDob(dob);
			setMarks(marks);

		}
		
		public void setName(String name){
			this.name = name;
		}

		public String getName(){
			return this.name;
		}
		
		public void setPRN(long prn){
			this.prn = prn;
		}
		
		public long getPRN(){
			return this.prn;
		}
		
		public void setPosition(int Position){
			this.Position = Position;
		}
		
		public int getPosition(){
			return this.Position;
		}

		public void setDob(String dob){ this.dob = dob; }

		public String getDob(){ return this.dob; }

		public void setMarks(double marks){ this.marks = marks; }

		public double getMarks(){ return this.marks; }
		
}
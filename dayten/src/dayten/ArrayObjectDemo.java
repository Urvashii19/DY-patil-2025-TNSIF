package dayten;

public class ArrayObjectDemo {
	
		public static void main(String[] args) {
			
			//Student s=new Student(0, null)
			student [] arr;
			
			//declared memory for 5 object or type students
			
			arr=new student[5];
			
			arr[0] = new student(101, "urvashi");
			arr[1] = new student(102, "Zeel");
			arr[2] = new student(103, "Aditya");
			arr[3] = new student(104, "Rahul");
			arr[4] = new student(105, "Akshay");
			//arr[5] = new Student(106, "Suraj");
			
			for(int i=0; i<arr.length;i++)
			{
				System.out.println("Elemnts at"+ i+": "
			+arr[i].getRollNo()+"\t"+arr[i].getName());
			}

		}

	}



class Employee{
	public int empid;
	private String name;
	private float salary;

	Employee1(int empid, String name, float salary){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public String toString(){
		return "Employee Id:"+empid+" Employee Name: "+this.name+" Employee Salary: "+this.salary;
	}
	//obj.toString();

	public boolean equals(Object obj){
		Employee1 e = (Employee1) obj;
		return empid == e.empid;
	}

}

class EmpToStringMain50{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size o array: ");
		int sz = sc.nextInt();

		Employee arr[] = new Employee[sz];

		for(int i=0; i<arr.length; i++){
			System.out.println("Enter employeed id: ");
			int eid = sc.nextInt();

			for(int j=0; j<i; j++){
				System.out.println(arr[j].empid);
				if (eid==(arr[j].empid )){
					System.out.println("Already Exists");
					break;
				}
			}				
			
			System.out.println("Enter employeed Name: ");
			String ename = sc.next();
			System.out.println("Enter employeed Salary: ");
			float esal = sc.nextFloat();

			Employee e = new Employee(eid, ename, esal);
			arr[i]=e;
			
		}

		for(Employee e : arr){
			System.out.println(e);
		}
		
	}
}
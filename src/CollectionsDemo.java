import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		TreeSet<Employee> tsemp=new TreeSet<Employee>();
		tsemp.add(new Employee(101, "One", "Intern", 01));
		tsemp.add(new Employee(102, "Two", "Intern", 02));
		tsemp.add(new Employee(103, "Three", "Intern", 03));
		tsemp.add(new Employee(104, "Four", "Intern", 04));
		
		tsemp.stream().forEach(t -> System.out.println(t));
		
		System.out.println("=======Descending Order=========");
		
		TreeSet<Employee> tsempByName=new TreeSet<Employee>((Employee o1, Employee o2)
				->o2.getEmployeename().compareTo(o1.getEmployeename()));
		
		tsempByName.add(new Employee(101, "One", "Intern", 01));
		tsempByName.add(new Employee(102, "Two", "Intern", 02));
		tsempByName.add(new Employee(103, "Three", "Intern", 03));
		tsempByName.add(new Employee(104, "Four", "Intern", 04));
		
		tsempByName.stream().forEach(t -> System.out.println(t));

	}

}

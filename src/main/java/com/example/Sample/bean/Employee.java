package com.example.Sample.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

	@Entity
	public class Employee {

		@Id
		@GeneratedValue
		private long empid;
		private String empname;
		private Double salary;
		public Employee() {
			super();
		}
		public Employee(String empname, Double salary) {
			super();
			this.empname = empname;
			this.salary = salary;
		}
		public long getEmpid() {
			return empid;
		}
		public void setEmpid(long empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
		}
		
		
	
}

package com.carlosehs.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	   private long employee_id;
	
		@Column
	   private String name;
		@Column
	   private String last_name;
		@Column
	   private Date birth_date;
		@Column
	   private String reports_to;
		@Column
	   private long ext;
		
		public Employee() {
			
		}

		public long getEmployee_id() {
			return employee_id;
		}

		public void setEmployee_id(long employee_id) {
			this.employee_id = employee_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public Date getBirth_date() {
			return birth_date;
		}

		public void setBirth_date(Date birth_date) {
			this.birth_date = birth_date;
		}

		public String getReports_to() {
			return reports_to;
		}

		public void setReports_to(String reports_to) {
			this.reports_to = reports_to;
		}

		public long getExt() {
			return ext;
		}

		public void setExt(long ext) {
			this.ext = ext;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((birth_date == null) ? 0 : birth_date.hashCode());
			result = prime * result + (int) (employee_id ^ (employee_id >>> 32));
			result = prime * result + (int) (ext ^ (ext >>> 32));
			result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((reports_to == null) ? 0 : reports_to.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (birth_date == null) {
				if (other.birth_date != null)
					return false;
			} else if (!birth_date.equals(other.birth_date))
				return false;
			if (employee_id != other.employee_id)
				return false;
			if (ext != other.ext)
				return false;
			if (last_name == null) {
				if (other.last_name != null)
					return false;
			} else if (!last_name.equals(other.last_name))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (reports_to == null) {
				if (other.reports_to != null)
					return false;
			} else if (!reports_to.equals(other.reports_to))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Employee [employee_id=" + employee_id + ", name=" + name + ", last_name=" + last_name
					+ ", birth_date=" + birth_date + ", reports_to=" + reports_to + ", ext=" + ext + "]";
		}
		
		
		

}

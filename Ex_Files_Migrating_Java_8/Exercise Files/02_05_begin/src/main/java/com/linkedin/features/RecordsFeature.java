package com.linkedin.features;

public class RecordsFeature {

	public static class Cat{
		
		private String name;
		private int age;

		public Cat(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String name() {
			return name;
		}
		
		public int age() {
			return age;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			Cat other = (Cat) obj;
			if (age != other.age)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Cat [name=" + name + ", age=" + age + "]";
		}
		
	}
	
	public static Cat myCat() {
		
		return new Cat("Athena", 5);
		
	}
}

package com.example.customer.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Customer {
	private Identity identity;
	private Username username;
	private Password password;
	private IsAdmin isAdmin;
	private FullName fullname;
	private Age age;
	private Location location;
	private List<Interests> interests;
	private Email email;
	private Epurse epurse;

	public static class Builder {
		private Identity identity;
		private Username username;
		private Password password;
		private IsAdmin isAdmin;
		private FullName fullname;
		private Age age;
		private Location location;
		private List<Interests> interests;
		private Email email;
		private Epurse epurse;

		public Builder identity(String identity) {
			this.identity = Identity.valueOf(identity);
			return this;
		}

		public Builder fullname(String first, String last) {
			this.fullname = FullName.of(first, last);
			return this;
		}

		public Builder age(int age) {
			this.age = Age.of(age);
			return this;
		}

		public Builder email(String email) {
			this.email = Email.valueOf(email);
			return this;
		}

		public Builder epurse(double money) {
			this.epurse = Epurse.of(money);
			return this;
		}

		public Builder interests(String... depts) {
			this.interests = Arrays.stream(depts).filter(Objects::nonNull).map(String::toUpperCase)
					.map(Interests::valueOf).toList();
			return this;
		}

		public Builder location(String location) {
			this.location = Location.of(location);
			return this;
		}

		public Builder password(String password) {
			this.password = Password.valueOf(password);
			return this;
		}

		public Builder username(String username) {
			this.username = Username.of(username);
			return this;
		}

		public Customer build() {
			// Validation
			var customer = new Customer(this.identity);
			customer.setFullname(fullname);
			customer.setIdentity(identity);
			customer.setUsername(username);
			customer.setPassword(password);
			customer.setAge(age);
			customer.setLocation(location);
			customer.setInterests(interests);
			customer.setEmail(email);
			customer.setEpurse(epurse);
			return customer;
		}

		public IsAdmin getIsAdmin() {
			return isAdmin;
		}

		public void setIsAdmin(IsAdmin isAdmin) {
			this.isAdmin = isAdmin;
		}
	}

	public Customer(Identity identity) {
		this.identity = identity;
	}

	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public Username getUsername() {
		return username;
	}

	public void setUsername(Username username) {
		this.username = username;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public IsAdmin getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(IsAdmin isAdmin) {
		this.isAdmin = isAdmin;
	}

	public FullName getFullname() {
		return fullname;
	}

	public void setFullname(FullName fullname) {
		this.fullname = fullname;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Interests> getInterests() {
		return interests;
	}

	public void setInterests(List<Interests> interests) {
		this.interests = interests;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Epurse getEpurse() {
		return epurse;
	}

	public void setEpurse(Epurse epurse) {
		this.epurse = epurse;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(identity, other.identity);
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + ", fullname="
				+ fullname + ", age=" + age + ", location=" + location + ", interests=" + interests + ", email=" + email
				+ ", epurse=" + epurse + "]";
	}

}

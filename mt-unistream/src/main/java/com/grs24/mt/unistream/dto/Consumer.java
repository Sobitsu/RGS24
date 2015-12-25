package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public class Consumer 
{
	/** Клиент */
	private Person Person;

	/** Роль клиента в переводе */
	private ConsumerRole Role;

	public Consumer() {
	}

	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person Person) {
		this.Person = Person;
	}

	public ConsumerRole getRole() {
		return Role;
	}

	public void setRole(ConsumerRole Role) {
		this.Role = Role;
	}

	@Override
	public String toString() {
		return "Consumer{" + "Person=" + Person + ", Role=" + Role + '}';
	}
}

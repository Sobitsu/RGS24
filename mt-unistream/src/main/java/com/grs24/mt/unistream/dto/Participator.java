package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public class Participator 
{
	/** Идентификатор пункта обслуживания клиентов */
	private Integer ID;

	/** Роль пункта в переводе */
	private ParticipatorRole Role;

	public Participator() {
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public ParticipatorRole getRole() {
		return Role;
	}

	public void setRole(ParticipatorRole Role) {
		this.Role = Role;
	}

	@Override
	public String toString() {
		return "Participator{" + "ID=" + ID + ", Role=" + Role + '}';
	}
}

package in.ashokit.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class InsurancePlan {
	
	@Id
	private Integer planId;
	private String planName;
	private String planHolderName;
	private String planStatus;
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanHolderName() {
		return planHolderName;
	}
	public void setPlanHolderName(String planHolderName) {
		this.planHolderName = planHolderName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

}

package template;

public abstract class ATemplateProcedure {

	
	public abstract void getProcedurePapers();
	public abstract void getOfficerApprovalProcedure();
	public abstract void identifyDamage();
	public abstract void evaluateHouse();
	public abstract void sendEvaluation();
	
	public void getInsurance() {
		getProcedurePapers();
		getOfficerApprovalProcedure();
		identifyDamage();
		evaluateHouse();
		sendEvaluation();
		
		// return
	}
}

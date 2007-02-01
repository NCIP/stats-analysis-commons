package gov.nih.nci.caintegrator.analysis.messaging;

import java.util.ArrayList;
import java.util.List;

public class CompoundAnalysisResult extends AnalysisResult {

	private List<AnalysisResult> results = new ArrayList<AnalysisResult>();
	
	private static final long serialVersionUID = 1L;

	public CompoundAnalysisResult(String sessionId, String taskId) {
		super(sessionId, taskId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AnalysisResult> getResults() {
		return results;
	}

	public void setResults(List<AnalysisResult> results) {
		this.results = results;
	}
	
	public void addResult(AnalysisResult result) {
	  results.add(result);
	}

	public int getNumResults() { return results.size(); }
	
}
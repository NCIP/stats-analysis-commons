package gov.nih.nci.caintegrator.analysis.messaging;

import gov.nih.nci.caintegrator.enumeration.CoVariateType;
import gov.nih.nci.caintegrator.enumeration.MultiGroupComparisonAdjustmentType;
import gov.nih.nci.caintegrator.enumeration.StatisticalMethodType;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class GeneralizedLinearModelRequest extends AnalysisRequest implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	private StatisticalMethodType statisticalMethod;
	private CoVariateType coVariateType;
	private MultiGroupComparisonAdjustmentType multiGrpComparisonAdjType = MultiGroupComparisonAdjustmentType.NONE;	
	private SampleGroup group1 = null;
	private SampleGroup baselineGroup = null;
	private double foldChangeThreshold = Double.NEGATIVE_INFINITY;
	private double pValueThreshold = Double.POSITIVE_INFINITY;
	
	// TODO: need to come back to do array platform
	
	public GeneralizedLinearModelRequest(String sessionid, String taskId) {
		super(sessionid, taskId);
	}
	public SampleGroup getBaselineGroup() {
		return baselineGroup;
	}
	public void setBaselineGroup(SampleGroup baselineGroup) {
		this.baselineGroup = baselineGroup;
	}
	public CoVariateType getCoVariateType() {
		return coVariateType;
	}
	public void setCoVariateType(CoVariateType coVariateType) {
		this.coVariateType = coVariateType;
	}
	public double getFoldChangeThreshold() {
		return foldChangeThreshold;
	}
	public void setFoldChangeThreshold(double foldChangeThreshold) {
		this.foldChangeThreshold = foldChangeThreshold;
	}
	public SampleGroup getGroup1() {
		return group1;
	}
	public void setGroup1(SampleGroup group1) {
		this.group1 = group1;
	}
	public MultiGroupComparisonAdjustmentType getMultiGrpComparisonAdjType() {
		return multiGrpComparisonAdjType;
	}
	public void setMultiGrpComparisonAdjType(
			MultiGroupComparisonAdjustmentType multiGrpComparisonAdjType) {
		this.multiGrpComparisonAdjType = multiGrpComparisonAdjType;
	}
	public double getPValueThreshold() {
		return pValueThreshold;
	}
	public void setPValueThreshold(double valueThreshold) {
		pValueThreshold = valueThreshold;
	}
	public StatisticalMethodType getStatisticalMethod() {
		return statisticalMethod;
	}
	public void setStatisticalMethod(StatisticalMethodType statisticalMethod) {
		this.statisticalMethod = statisticalMethod;
	}
	
	@Override
	public String toString() {
		 int blGroupSize = -1;
		  if (baselineGroup!=null) {
		    blGroupSize = baselineGroup.size();
		  }
		  
		  int group1Size = -1;
		  if (group1 !=null) {
		    group1Size = group1.size();
		  }
			
		  String retStr = "GLMTestRequest: sessionId=" + getSessionId() + " taskId=" + getTaskId() + " blGroupSize=" + blGroupSize + " group1Szie=" + group1Size;
		  
		  if (group1 != null) { 
		    retStr += " GRP1=" + group1.getGroupName();
		  }
		  
		  if (baselineGroup != null) {
		    retStr += " baselineGroup=" + baselineGroup.getGroupName();
		  }
		  
		  return retStr;
	}
	

}
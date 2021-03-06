/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.enumeration;

import java.io.Serializable;

/**
 * @author sahnih
 *
 */




public enum MultiGroupComparisonAdjustmentType implements Serializable{
	/** Lists all the possible MultiGroup Comparison Adjustment Types used in 
	 * Class Comparion
	 */
	NONE { 
        public String toString() 
        { 
            return "";
        } }, 
	FWER { 
		public String toString() 
		{ 
			return "Family-Wise Error Rate(FWER): Bonferroni";
		} },
	FDR {public String toString() 
		{ 
			return "False Discovery Rate(FDR): Benjamini-Hochberg";
		} }

};

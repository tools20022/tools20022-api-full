/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ReportingRecordStatus1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the per record status details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportRecord3#mmOriginalRecordIdentification
 * StatusReportRecord3.mmOriginalRecordIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusReportRecord3#mmStatus
 * StatusReportRecord3.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportRecord3#mmValidationRule
 * StatusReportRecord3.mmValidationRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReportRecord3#mmSupplementaryData
 * StatusReportRecord3.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusReportRecord3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the per record status details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatusReportRecord3", propOrder = {"originalRecordIdentification", "status", "validationRule", "supplementaryData"})
public class StatusReportRecord3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text originalRecordIdentification;
	/**
	 * Unique and unambiguous technical identification of the original data for
	 * which the status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportRecord3
	 * StatusReportRecord3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalRecordIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous technical identification of the original data for which the status is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalRecordIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatusReportRecord3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRcrdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRecordIdentification";
			definition = "Unique and unambiguous technical identification of the original data for which the status is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected ReportingRecordStatus1Code status;
	/**
	 * Defines status of the reported transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code
	 * ReportingRecordStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportRecord3
	 * StatusReportRecord3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines status of the reported transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatusReportRecord3.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines status of the reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportingRecordStatus1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericValidationRuleIdentification1> validationRule;
	/**
	 * Provides the details of the rule which could not be validated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericValidationRuleIdentification1
	 * GenericValidationRuleIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportRecord3
	 * StatusReportRecord3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the details of the rule which could not be validated."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValidationRule = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StatusReportRecord3.mmObject();
			isDerived = false;
			xmlTag = "VldtnRule";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationRule";
			definition = "Provides the details of the rule which could not be validated.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericValidationRuleIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReportRecord3
	 * StatusReportRecord3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StatusReportRecord3.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatusReportRecord3.mmOriginalRecordIdentification, StatusReportRecord3.mmStatus, StatusReportRecord3.mmValidationRule, StatusReportRecord3.mmSupplementaryData);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReportRecord3";
				definition = "Provides the per record status details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OrgnlRcrdId", required = true)
	public Max140Text getOriginalRecordIdentification() {
		return originalRecordIdentification;
	}

	public void setOriginalRecordIdentification(Max140Text originalRecordIdentification) {
		this.originalRecordIdentification = originalRecordIdentification;
	}

	@XmlElement(name = "Sts", required = true)
	public ReportingRecordStatus1Code getStatus() {
		return status;
	}

	public void setStatus(ReportingRecordStatus1Code status) {
		this.status = status;
	}

	@XmlElement(name = "VldtnRule")
	public List<GenericValidationRuleIdentification1> getValidationRule() {
		return validationRule;
	}

	public void setValidationRule(List<com.tools20022.repository.msg.GenericValidationRuleIdentification1> validationRule) {
		this.validationRule = validationRule;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}
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
import com.tools20022.repository.msg.GenericValidationRuleIdentification1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusReportRecord3", propOrder = {"originalRecordIdentification", "status", "validationRule", "supplementaryData"})
public class StatusReportRecord3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlRcrdId", required = true)
	protected Max140Text originalRecordIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<StatusReportRecord3, Max140Text> mmOriginalRecordIdentification = new MMMessageAttribute<StatusReportRecord3, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportRecord3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRcrdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRecordIdentification";
			definition = "Unique and unambiguous technical identification of the original data for which the status is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(StatusReportRecord3 obj) {
			return obj.getOriginalRecordIdentification();
		}

		@Override
		public void setValue(StatusReportRecord3 obj, Max140Text value) {
			obj.setOriginalRecordIdentification(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected ReportingRecordStatus1Code status;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<StatusReportRecord3, ReportingRecordStatus1Code> mmStatus = new MMMessageAttribute<StatusReportRecord3, ReportingRecordStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportRecord3.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines status of the reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportingRecordStatus1Code.mmObject();
		}

		@Override
		public ReportingRecordStatus1Code getValue(StatusReportRecord3 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(StatusReportRecord3 obj, ReportingRecordStatus1Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "VldtnRule")
	protected List<GenericValidationRuleIdentification1> validationRule;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<StatusReportRecord3, List<GenericValidationRuleIdentification1>> mmValidationRule = new MMMessageAssociationEnd<StatusReportRecord3, List<GenericValidationRuleIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportRecord3.mmObject();
			isDerived = false;
			xmlTag = "VldtnRule";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationRule";
			definition = "Provides the details of the rule which could not be validated.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericValidationRuleIdentification1.mmObject();
		}

		@Override
		public List<GenericValidationRuleIdentification1> getValue(StatusReportRecord3 obj) {
			return obj.getValidationRule();
		}

		@Override
		public void setValue(StatusReportRecord3 obj, List<GenericValidationRuleIdentification1> value) {
			obj.setValidationRule(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<StatusReportRecord3, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<StatusReportRecord3, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusReportRecord3.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(StatusReportRecord3 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(StatusReportRecord3 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReportRecord3.mmOriginalRecordIdentification, com.tools20022.repository.msg.StatusReportRecord3.mmStatus,
						com.tools20022.repository.msg.StatusReportRecord3.mmValidationRule, com.tools20022.repository.msg.StatusReportRecord3.mmSupplementaryData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReportRecord3";
				definition = "Provides the per record status details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getOriginalRecordIdentification() {
		return originalRecordIdentification;
	}

	public StatusReportRecord3 setOriginalRecordIdentification(Max140Text originalRecordIdentification) {
		this.originalRecordIdentification = Objects.requireNonNull(originalRecordIdentification);
		return this;
	}

	public ReportingRecordStatus1Code getStatus() {
		return status;
	}

	public StatusReportRecord3 setStatus(ReportingRecordStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<GenericValidationRuleIdentification1> getValidationRule() {
		return validationRule == null ? validationRule = new ArrayList<>() : validationRule;
	}

	public StatusReportRecord3 setValidationRule(List<GenericValidationRuleIdentification1> validationRule) {
		this.validationRule = Objects.requireNonNull(validationRule);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public StatusReportRecord3 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}
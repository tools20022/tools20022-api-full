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
import com.tools20022.repository.codeset.ReportingMessageStatus1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericValidationRuleIdentification1;
import com.tools20022.repository.msg.OriginalReportStatistics3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the report level status advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAdviceReport3#mmStatus
 * StatusAdviceReport3.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAdviceReport3#mmValidationRule
 * StatusAdviceReport3.mmValidationRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAdviceReport3#mmMessageDate
 * StatusAdviceReport3.mmMessageDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusAdviceReport3#mmStatistics
 * StatusAdviceReport3.mmStatistics}</li>
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
 * "StatusAdviceReport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the report level status advice."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusAdviceReport3", propOrder = {"status", "validationRule", "messageDate", "statistics"})
public class StatusAdviceReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected ReportingMessageStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
	 * ReportingMessageStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusAdviceReport3
	 * StatusAdviceReport3}</li>
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
	 * definition} = "Provides the status for the full message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusAdviceReport3, ReportingMessageStatus1Code> mmStatus = new MMMessageAttribute<StatusAdviceReport3, ReportingMessageStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusAdviceReport3.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Provides the status for the full message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportingMessageStatus1Code.mmObject();
		}

		@Override
		public ReportingMessageStatus1Code getValue(StatusAdviceReport3 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(StatusAdviceReport3 obj, ReportingMessageStatus1Code value) {
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
	 * {@linkplain com.tools20022.repository.msg.StatusAdviceReport3
	 * StatusAdviceReport3}</li>
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
	public static final MMMessageAssociationEnd<StatusAdviceReport3, List<GenericValidationRuleIdentification1>> mmValidationRule = new MMMessageAssociationEnd<StatusAdviceReport3, List<GenericValidationRuleIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusAdviceReport3.mmObject();
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
		public List<GenericValidationRuleIdentification1> getValue(StatusAdviceReport3 obj) {
			return obj.getValidationRule();
		}

		@Override
		public void setValue(StatusAdviceReport3 obj, List<GenericValidationRuleIdentification1> value) {
			obj.setValidationRule(value);
		}
	};
	@XmlElement(name = "MsgDt")
	protected ISODate messageDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusAdviceReport3
	 * StatusAdviceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the report date whith the status advice message is related to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusAdviceReport3, Optional<ISODate>> mmMessageDate = new MMMessageAttribute<StatusAdviceReport3, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusAdviceReport3.mmObject();
			isDerived = false;
			xmlTag = "MsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageDate";
			definition = "Indicates the report date whith the status advice message is related to.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(StatusAdviceReport3 obj) {
			return obj.getMessageDate();
		}

		@Override
		public void setValue(StatusAdviceReport3 obj, Optional<ISODate> value) {
			obj.setMessageDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Sttstcs")
	protected OriginalReportStatistics3 statistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalReportStatistics3
	 * OriginalReportStatistics3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusAdviceReport3
	 * StatusAdviceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttstcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Statistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Statistical information on the results of the records processing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusAdviceReport3, Optional<OriginalReportStatistics3>> mmStatistics = new MMMessageAssociationEnd<StatusAdviceReport3, Optional<OriginalReportStatistics3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusAdviceReport3.mmObject();
			isDerived = false;
			xmlTag = "Sttstcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Statistics";
			definition = "Statistical information on the results of the records processing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalReportStatistics3.mmObject();
		}

		@Override
		public Optional<OriginalReportStatistics3> getValue(StatusAdviceReport3 obj) {
			return obj.getStatistics();
		}

		@Override
		public void setValue(StatusAdviceReport3 obj, Optional<OriginalReportStatistics3> value) {
			obj.setStatistics(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusAdviceReport3.mmStatus, com.tools20022.repository.msg.StatusAdviceReport3.mmValidationRule,
						com.tools20022.repository.msg.StatusAdviceReport3.mmMessageDate, com.tools20022.repository.msg.StatusAdviceReport3.mmStatistics);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusAdviceReport3";
				definition = "Provides the report level status advice.";
			}
		});
		return mmObject_lazy.get();
	}

	public ReportingMessageStatus1Code getStatus() {
		return status;
	}

	public StatusAdviceReport3 setStatus(ReportingMessageStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<GenericValidationRuleIdentification1> getValidationRule() {
		return validationRule == null ? validationRule = new ArrayList<>() : validationRule;
	}

	public StatusAdviceReport3 setValidationRule(List<GenericValidationRuleIdentification1> validationRule) {
		this.validationRule = Objects.requireNonNull(validationRule);
		return this;
	}

	public Optional<ISODate> getMessageDate() {
		return messageDate == null ? Optional.empty() : Optional.of(messageDate);
	}

	public StatusAdviceReport3 setMessageDate(ISODate messageDate) {
		this.messageDate = messageDate;
		return this;
	}

	public Optional<OriginalReportStatistics3> getStatistics() {
		return statistics == null ? Optional.empty() : Optional.of(statistics);
	}

	public StatusAdviceReport3 setStatistics(OriginalReportStatistics3 statistics) {
		this.statistics = statistics;
		return this;
	}
}
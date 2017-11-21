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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatusAdviceReport3", propOrder = {"status", "validationRule", "messageDate", "statistics"})
public class StatusAdviceReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ReportingMessageStatus1Code status;
	/**
	 * Provides the status for the full message.
	 * <p>
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
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatusAdviceReport3.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Provides the status for the full message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportingMessageStatus1Code.mmObject();
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
	public static final MMMessageAssociationEnd mmValidationRule = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StatusAdviceReport3.mmObject();
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
	protected ISODate messageDate;
	/**
	 * Indicates the report date whith the status advice message is related to.
	 * <p>
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
	public static final MMMessageAttribute mmMessageDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatusAdviceReport3.mmObject();
			isDerived = false;
			xmlTag = "MsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageDate";
			definition = "Indicates the report date whith the status advice message is related to.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected OriginalReportStatistics3 statistics;
	/**
	 * Statistical information on the results of the records processing.
	 * <p>
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
	public static final MMMessageAssociationEnd mmStatistics = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> StatusAdviceReport3.mmObject();
			isDerived = false;
			xmlTag = "Sttstcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Statistics";
			definition = "Statistical information on the results of the records processing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalReportStatistics3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatusAdviceReport3.mmStatus, StatusAdviceReport3.mmValidationRule, StatusAdviceReport3.mmMessageDate, StatusAdviceReport3.mmStatistics);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusAdviceReport3";
				definition = "Provides the report level status advice.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Sts", required = true)
	public ReportingMessageStatus1Code getStatus() {
		return status;
	}

	public void setStatus(ReportingMessageStatus1Code status) {
		this.status = status;
	}

	@XmlElement(name = "VldtnRule")
	public List<GenericValidationRuleIdentification1> getValidationRule() {
		return validationRule;
	}

	public void setValidationRule(List<com.tools20022.repository.msg.GenericValidationRuleIdentification1> validationRule) {
		this.validationRule = validationRule;
	}

	@XmlElement(name = "MsgDt")
	public ISODate getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(ISODate messageDate) {
		this.messageDate = messageDate;
	}

	@XmlElement(name = "Sttstcs")
	public OriginalReportStatistics3 getStatistics() {
		return statistics;
	}

	public void setStatistics(com.tools20022.repository.msg.OriginalReportStatistics3 statistics) {
		this.statistics = statistics;
	}
}
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
import com.tools20022.repository.area.auth.InvoiceTaxReportStatusAdviceV01;
import com.tools20022.repository.codeset.TaxReportingStatus1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides the Invoice tax status report header details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmTaxAuthority
 * InvoiceTaxStatusReportHeader1.mmTaxAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmMessageIdentification
 * InvoiceTaxStatusReportHeader1.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmOriginalMessageIdentification
 * InvoiceTaxStatusReportHeader1.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmReportStatus
 * InvoiceTaxStatusReportHeader1.mmReportStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1#mmValidationRule
 * InvoiceTaxStatusReportHeader1.mmValidationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportStatusAdviceV01#mmStatusReportHeader
 * InvoiceTaxReportStatusAdviceV01.mmStatusReportHeader}</li>
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
 * "InvoiceTaxStatusReportHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the Invoice tax status report header details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1
 * MoneyMarketStatusReportHeader1}</li>
 * </ul>
 */
public class InvoiceTaxStatusReportHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TaxOrganisationIdentification1 taxAuthority;
	/**
	 * Party to which the TaxReport is delivered. This message block contains
	 * party details for a specific tax authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TaxOrganisationIdentification1
	 * TaxOrganisationIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
	 * InvoiceTaxStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAuthrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to which the TaxReport is delivered. This message block contains party details for a specific tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxAuthority = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvoiceTaxStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "TaxAuthrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAuthority";
			definition = "Party to which the TaxReport is delivered. This message block contains party details for a specific tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxOrganisationIdentification1.mmObject();
		}
	};
	protected MessageIdentification1 messageIdentification;
	/**
	 * Identifies the InvoiceTaxReportStatusAdvice message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
	 * InvoiceTaxStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the InvoiceTaxReportStatusAdvice message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvoiceTaxStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the InvoiceTaxReportStatusAdvice message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
		}
	};
	protected MessageIdentification1 originalMessageIdentification;
	/**
	 * Reference to the identification of the InvoiceTaxReport message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
	 * InvoiceTaxStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of the InvoiceTaxReport message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalMessageIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvoiceTaxStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Reference to the identification of the InvoiceTaxReport message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
		}
	};
	protected TaxReportingStatus1Code reportStatus;
	/**
	 * Provides the status for the full report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxReportingStatus1Code
	 * TaxReportingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
	 * InvoiceTaxStatusReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status for the full report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1#mmReportStatus
	 * MoneyMarketStatusReportHeader1.mmReportStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvoiceTaxStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "RptSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportStatus";
			definition = "Provides the status for the full report.";
			previousVersion_lazy = () -> MoneyMarketStatusReportHeader1.mmReportStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxReportingStatus1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceTaxStatusReportHeader1
	 * InvoiceTaxStatusReportHeader1}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketStatusReportHeader1#mmValidationRule
	 * MoneyMarketStatusReportHeader1.mmValidationRule}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValidationRule = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvoiceTaxStatusReportHeader1.mmObject();
			isDerived = false;
			xmlTag = "VldtnRule";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationRule";
			definition = "Provides the details of the rule which could not be validated.";
			previousVersion_lazy = () -> MoneyMarketStatusReportHeader1.mmValidationRule;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericValidationRuleIdentification1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvoiceTaxStatusReportHeader1.mmTaxAuthority, InvoiceTaxStatusReportHeader1.mmMessageIdentification, InvoiceTaxStatusReportHeader1.mmOriginalMessageIdentification,
						InvoiceTaxStatusReportHeader1.mmReportStatus, InvoiceTaxStatusReportHeader1.mmValidationRule);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceTaxReportStatusAdviceV01.mmStatusReportHeader);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceTaxStatusReportHeader1";
				definition = "Provides the Invoice tax status report header details.";
				previousVersion_lazy = () -> MoneyMarketStatusReportHeader1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TaxOrganisationIdentification1 getTaxAuthority() {
		return taxAuthority;
	}

	public void setTaxAuthority(com.tools20022.repository.msg.TaxOrganisationIdentification1 taxAuthority) {
		this.taxAuthority = taxAuthority;
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(com.tools20022.repository.msg.MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	public MessageIdentification1 getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public void setOriginalMessageIdentification(com.tools20022.repository.msg.MessageIdentification1 originalMessageIdentification) {
		this.originalMessageIdentification = originalMessageIdentification;
	}

	public TaxReportingStatus1Code getReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(TaxReportingStatus1Code reportStatus) {
		this.reportStatus = reportStatus;
	}

	public List<GenericValidationRuleIdentification1> getValidationRule() {
		return validationRule;
	}

	public void setValidationRule(List<com.tools20022.repository.msg.GenericValidationRuleIdentification1> validationRule) {
		this.validationRule = validationRule;
	}
}
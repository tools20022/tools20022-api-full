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
import com.tools20022.repository.codeset.Operation3Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details on the queried trade parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2#mmOperator
 * TradePartyQueryCriteria2.mmOperator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2#mmReportingCounterparty
 * TradePartyQueryCriteria2.mmReportingCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2#mmOtherCounterparty
 * TradePartyQueryCriteria2.mmOtherCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2#mmBeneficiary
 * TradePartyQueryCriteria2.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2#mmSubmittingAgent
 * TradePartyQueryCriteria2.mmSubmittingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2#mmBroker
 * TradePartyQueryCriteria2.mmBroker}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2#mmCCP
 * TradePartyQueryCriteria2.mmCCP}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOneElementPresentRule#forTradePartyQueryCriteria2
 * ConstraintOneElementPresentRule.forTradePartyQueryCriteria2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradePartyQueryCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details on the queried trade parties."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradePartyQueryCriteria2", propOrder = {"operator", "reportingCounterparty", "otherCounterparty", "beneficiary", "submittingAgent", "broker", "cCP"})
public class TradePartyQueryCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Oprtr", required = true)
	protected Operation3Code operator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Operation3Code
	 * Operation3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2
	 * TradePartyQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oprtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the AND/OR operators as query criteria."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOperator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Oprtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Operator";
			definition = "Specifies the AND/OR operators as query criteria.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Operation3Code.mmObject();
		}
	};
	@XmlElement(name = "RptgCtrPty")
	protected TradePartyIdentificationQuery4 reportingCounterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery4
	 * TradePartyIdentificationQuery4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2
	 * TradePartyQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgCtrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the reporting counterparty of the contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportingCounterparty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "RptgCtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingCounterparty";
			definition = "Identifies the reporting counterparty of the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradePartyIdentificationQuery4.mmObject();
		}
	};
	@XmlElement(name = "OthrCtrPty")
	protected TradePartyIdentificationQuery4 otherCounterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery4
	 * TradePartyIdentificationQuery4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2
	 * TradePartyQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCtrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the other counterparty of the contract.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCounterparty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "OthrCtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCounterparty";
			definition = "Identifies the other counterparty of the contract.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradePartyIdentificationQuery4.mmObject();
		}
	};
	@XmlElement(name = "Bnfcry")
	protected TradePartyIdentificationQuery4 beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery4
	 * TradePartyIdentificationQuery4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2
	 * TradePartyQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bnfcry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party subject to the rights and obligations arising from the contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Identifies the party subject to the rights and obligations arising from the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradePartyIdentificationQuery4.mmObject();
		}
	};
	@XmlElement(name = "SubmitgAgt")
	protected TradePartyIdentificationQuery6 submittingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery6
	 * TradePartyIdentificationQuery6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2
	 * TradePartyQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the submitting agent of the reported of the contract.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubmittingAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SubmitgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingAgent";
			definition = "Identifies the submitting agent of the reported of the contract.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradePartyIdentificationQuery6.mmObject();
		}
	};
	@XmlElement(name = "Brkr")
	protected TradePartyIdentificationQuery6 broker;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery6
	 * TradePartyIdentificationQuery6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2
	 * TradePartyQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brkr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Broker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the broker who acts as an intermediary for the reporting counterparty.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBroker = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "Brkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Broker";
			definition = "Identifies the broker who acts as an intermediary for the reporting counterparty.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradePartyIdentificationQuery6.mmObject();
		}
	};
	@XmlElement(name = "CCP")
	protected TradePartyIdentificationQuery7 cCP;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery7
	 * TradePartyIdentificationQuery7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyQueryCriteria2
	 * TradePartyQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The unique code for the CCP that has cleared the contract.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCCP = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CCP";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCP";
			definition = "The unique code for the CCP that has cleared the contract.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradePartyIdentificationQuery7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradePartyQueryCriteria2.mmOperator, com.tools20022.repository.msg.TradePartyQueryCriteria2.mmReportingCounterparty,
						com.tools20022.repository.msg.TradePartyQueryCriteria2.mmOtherCounterparty, com.tools20022.repository.msg.TradePartyQueryCriteria2.mmBeneficiary,
						com.tools20022.repository.msg.TradePartyQueryCriteria2.mmSubmittingAgent, com.tools20022.repository.msg.TradePartyQueryCriteria2.mmBroker, com.tools20022.repository.msg.TradePartyQueryCriteria2.mmCCP);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOneElementPresentRule.forTradePartyQueryCriteria2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradePartyQueryCriteria2";
				definition = "Details on the queried trade parties.";
			}
		});
		return mmObject_lazy.get();
	}

	public Operation3Code getOperator() {
		return operator;
	}

	public TradePartyQueryCriteria2 setOperator(Operation3Code operator) {
		this.operator = Objects.requireNonNull(operator);
		return this;
	}

	public Optional<TradePartyIdentificationQuery4> getReportingCounterparty() {
		return reportingCounterparty == null ? Optional.empty() : Optional.of(reportingCounterparty);
	}

	public TradePartyQueryCriteria2 setReportingCounterparty(com.tools20022.repository.msg.TradePartyIdentificationQuery4 reportingCounterparty) {
		this.reportingCounterparty = reportingCounterparty;
		return this;
	}

	public Optional<TradePartyIdentificationQuery4> getOtherCounterparty() {
		return otherCounterparty == null ? Optional.empty() : Optional.of(otherCounterparty);
	}

	public TradePartyQueryCriteria2 setOtherCounterparty(com.tools20022.repository.msg.TradePartyIdentificationQuery4 otherCounterparty) {
		this.otherCounterparty = otherCounterparty;
		return this;
	}

	public Optional<TradePartyIdentificationQuery4> getBeneficiary() {
		return beneficiary == null ? Optional.empty() : Optional.of(beneficiary);
	}

	public TradePartyQueryCriteria2 setBeneficiary(com.tools20022.repository.msg.TradePartyIdentificationQuery4 beneficiary) {
		this.beneficiary = beneficiary;
		return this;
	}

	public Optional<TradePartyIdentificationQuery6> getSubmittingAgent() {
		return submittingAgent == null ? Optional.empty() : Optional.of(submittingAgent);
	}

	public TradePartyQueryCriteria2 setSubmittingAgent(com.tools20022.repository.msg.TradePartyIdentificationQuery6 submittingAgent) {
		this.submittingAgent = submittingAgent;
		return this;
	}

	public Optional<TradePartyIdentificationQuery6> getBroker() {
		return broker == null ? Optional.empty() : Optional.of(broker);
	}

	public TradePartyQueryCriteria2 setBroker(com.tools20022.repository.msg.TradePartyIdentificationQuery6 broker) {
		this.broker = broker;
		return this;
	}

	public Optional<TradePartyIdentificationQuery7> getCCP() {
		return cCP == null ? Optional.empty() : Optional.of(cCP);
	}

	public TradePartyQueryCriteria2 setCCP(com.tools20022.repository.msg.TradePartyIdentificationQuery7 cCP) {
		this.cCP = cCP;
		return this;
	}
}
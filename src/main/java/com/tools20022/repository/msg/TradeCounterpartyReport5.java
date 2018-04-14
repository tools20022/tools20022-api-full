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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.OrganisationIdentification3Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Counterparty15;
import com.tools20022.repository.msg.Counterparty2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to parties in the contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5#mmReportingCounterparty
 * TradeCounterpartyReport5.mmReportingCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5#mmOtherCounterparty
 * TradeCounterpartyReport5.mmOtherCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5#mmBroker
 * TradeCounterpartyReport5.mmBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5#mmSubmittingAgent
 * TradeCounterpartyReport5.mmSubmittingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5#mmClearingMember
 * TradeCounterpartyReport5.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5#mmBeneficiary
 * TradeCounterpartyReport5.mmBeneficiary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeCounterpartyReport5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to parties in the contract."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeCounterpartyReport5", propOrder = {"reportingCounterparty", "otherCounterparty", "broker", "submittingAgent", "clearingMember", "beneficiary"})
public class TradeCounterpartyReport5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptgCtrPty", required = true)
	protected Counterparty15 reportingCounterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Counterparty15
	 * Counterparty15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5
	 * TradeCounterpartyReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgCtrPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of the reporting counterparty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeCounterpartyReport5, Counterparty15> mmReportingCounterparty = new MMMessageAssociationEnd<TradeCounterpartyReport5, Counterparty15>() {
		{
			businessComponentTrace_lazy = () -> TradePartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCounterpartyReport5.mmObject();
			isDerived = false;
			xmlTag = "RptgCtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingCounterparty";
			definition = "Definition of the reporting counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Counterparty15.mmObject();
		}

		@Override
		public Counterparty15 getValue(TradeCounterpartyReport5 obj) {
			return obj.getReportingCounterparty();
		}

		@Override
		public void setValue(TradeCounterpartyReport5 obj, Counterparty15 value) {
			obj.setReportingCounterparty(value);
		}
	};
	@XmlElement(name = "OthrCtrPty", required = true)
	protected Counterparty2 otherCounterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Counterparty2
	 * Counterparty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5
	 * TradeCounterpartyReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCtrPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of the other counterparty in the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeCounterpartyReport5, Counterparty2> mmOtherCounterparty = new MMMessageAssociationEnd<TradeCounterpartyReport5, Counterparty2>() {
		{
			businessComponentTrace_lazy = () -> TradePartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCounterpartyReport5.mmObject();
			isDerived = false;
			xmlTag = "OthrCtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCounterparty";
			definition = "Definition of the other counterparty in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Counterparty2.mmObject();
		}

		@Override
		public Counterparty2 getValue(TradeCounterpartyReport5 obj) {
			return obj.getOtherCounterparty();
		}

		@Override
		public void setValue(TradeCounterpartyReport5 obj, Counterparty2 value) {
			obj.setOtherCounterparty(value);
		}
	};
	@XmlElement(name = "Brkr")
	protected OrganisationIdentification3Choice broker;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentification3Choice
	 * OrganisationIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Broker Broker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5
	 * TradeCounterpartyReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brkr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Broker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the broker as an intermediary for the reporting counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeCounterpartyReport5, Optional<OrganisationIdentification3Choice>> mmBroker = new MMMessageAssociationEnd<TradeCounterpartyReport5, Optional<OrganisationIdentification3Choice>>() {
		{
			businessComponentTrace_lazy = () -> Broker.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCounterpartyReport5.mmObject();
			isDerived = false;
			xmlTag = "Brkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Broker";
			definition = "Identification of the broker as an intermediary for the reporting counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrganisationIdentification3Choice.mmObject();
		}

		@Override
		public Optional<OrganisationIdentification3Choice> getValue(TradeCounterpartyReport5 obj) {
			return obj.getBroker();
		}

		@Override
		public void setValue(TradeCounterpartyReport5 obj, Optional<OrganisationIdentification3Choice> value) {
			obj.setBroker(value.orElse(null));
		}
	};
	@XmlElement(name = "SubmitgAgt")
	protected OrganisationIdentification3Choice submittingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentification3Choice
	 * OrganisationIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubmittingPartyRole
	 * SubmittingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5
	 * TradeCounterpartyReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitgAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the submitting agent in the case where the reporting counterparty has delegated the submission of the report to a third party or to the other counterparty.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeCounterpartyReport5, Optional<OrganisationIdentification3Choice>> mmSubmittingAgent = new MMMessageAssociationEnd<TradeCounterpartyReport5, Optional<OrganisationIdentification3Choice>>() {
		{
			businessComponentTrace_lazy = () -> SubmittingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCounterpartyReport5.mmObject();
			isDerived = false;
			xmlTag = "SubmitgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingAgent";
			definition = "Identification of the submitting agent in the case where the reporting counterparty has delegated the submission of the report to a third party or to the other counterparty.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrganisationIdentification3Choice.mmObject();
		}

		@Override
		public Optional<OrganisationIdentification3Choice> getValue(TradeCounterpartyReport5 obj) {
			return obj.getSubmittingAgent();
		}

		@Override
		public void setValue(TradeCounterpartyReport5 obj, Optional<OrganisationIdentification3Choice> value) {
			obj.setSubmittingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrMmb")
	protected OrganisationIdentification3Choice clearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentification3Choice
	 * OrganisationIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBroker
	 * ClearingBroker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5
	 * TradeCounterpartyReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the clearing member in the case where the trade is cleared."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeCounterpartyReport5, Optional<OrganisationIdentification3Choice>> mmClearingMember = new MMMessageAssociationEnd<TradeCounterpartyReport5, Optional<OrganisationIdentification3Choice>>() {
		{
			businessComponentTrace_lazy = () -> ClearingBroker.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCounterpartyReport5.mmObject();
			isDerived = false;
			xmlTag = "ClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Identification of the clearing member in the case where the trade is cleared.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrganisationIdentification3Choice.mmObject();
		}

		@Override
		public Optional<OrganisationIdentification3Choice> getValue(TradeCounterpartyReport5 obj) {
			return obj.getClearingMember();
		}

		@Override
		public void setValue(TradeCounterpartyReport5 obj, Optional<OrganisationIdentification3Choice> value) {
			obj.setClearingMember(value.orElse(null));
		}
	};
	@XmlElement(name = "Bnfcry")
	protected OrganisationIdentification3Choice beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentification3Choice
	 * OrganisationIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport5
	 * TradeCounterpartyReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bnfcry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the beneficiary who is subject to the rights and obligations arising from the contract."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeCounterpartyReport5, Optional<OrganisationIdentification3Choice>> mmBeneficiary = new MMMessageAssociationEnd<TradeCounterpartyReport5, Optional<OrganisationIdentification3Choice>>() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCounterpartyReport5.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Identification of the beneficiary who is subject to the rights and obligations arising from the contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrganisationIdentification3Choice.mmObject();
		}

		@Override
		public Optional<OrganisationIdentification3Choice> getValue(TradeCounterpartyReport5 obj) {
			return obj.getBeneficiary();
		}

		@Override
		public void setValue(TradeCounterpartyReport5 obj, Optional<OrganisationIdentification3Choice> value) {
			obj.setBeneficiary(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeCounterpartyReport5.mmReportingCounterparty, com.tools20022.repository.msg.TradeCounterpartyReport5.mmOtherCounterparty,
						com.tools20022.repository.msg.TradeCounterpartyReport5.mmBroker, com.tools20022.repository.msg.TradeCounterpartyReport5.mmSubmittingAgent, com.tools20022.repository.msg.TradeCounterpartyReport5.mmClearingMember,
						com.tools20022.repository.msg.TradeCounterpartyReport5.mmBeneficiary);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeCounterpartyReport5";
				definition = "Information related to parties in the contract.";
			}
		});
		return mmObject_lazy.get();
	}

	public Counterparty15 getReportingCounterparty() {
		return reportingCounterparty;
	}

	public TradeCounterpartyReport5 setReportingCounterparty(Counterparty15 reportingCounterparty) {
		this.reportingCounterparty = Objects.requireNonNull(reportingCounterparty);
		return this;
	}

	public Counterparty2 getOtherCounterparty() {
		return otherCounterparty;
	}

	public TradeCounterpartyReport5 setOtherCounterparty(Counterparty2 otherCounterparty) {
		this.otherCounterparty = Objects.requireNonNull(otherCounterparty);
		return this;
	}

	public Optional<OrganisationIdentification3Choice> getBroker() {
		return broker == null ? Optional.empty() : Optional.of(broker);
	}

	public TradeCounterpartyReport5 setBroker(OrganisationIdentification3Choice broker) {
		this.broker = broker;
		return this;
	}

	public Optional<OrganisationIdentification3Choice> getSubmittingAgent() {
		return submittingAgent == null ? Optional.empty() : Optional.of(submittingAgent);
	}

	public TradeCounterpartyReport5 setSubmittingAgent(OrganisationIdentification3Choice submittingAgent) {
		this.submittingAgent = submittingAgent;
		return this;
	}

	public Optional<OrganisationIdentification3Choice> getClearingMember() {
		return clearingMember == null ? Optional.empty() : Optional.of(clearingMember);
	}

	public TradeCounterpartyReport5 setClearingMember(OrganisationIdentification3Choice clearingMember) {
		this.clearingMember = clearingMember;
		return this;
	}

	public Optional<OrganisationIdentification3Choice> getBeneficiary() {
		return beneficiary == null ? Optional.empty() : Optional.of(beneficiary);
	}

	public TradeCounterpartyReport5 setBeneficiary(OrganisationIdentification3Choice beneficiary) {
		this.beneficiary = beneficiary;
		return this;
	}
}
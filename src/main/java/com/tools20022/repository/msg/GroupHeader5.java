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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics shared by all individual transactions included in the
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader5#mmMessageIdentification
 * GroupHeader5.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader5#mmCreationDateTime
 * GroupHeader5.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader5#mmInitiatingParty
 * GroupHeader5.mmInitiatingParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader5#mmForwardingAgent
 * GroupHeader5.mmForwardingAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader5#mmDebtorAgent
 * GroupHeader5.mmDebtorAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader5#mmCreditorAgent
 * GroupHeader5.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader5#mmInstructingAgent
 * GroupHeader5.mmInstructingAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader5#mmInstructedAgent
 * GroupHeader5.mmInstructedAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.PaymentStatusReportV02#mmGroupHeader
 * PaymentStatusReportV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentStatusReportV02#mmGroupHeader
 * PaymentStatusReportV02.mmGroupHeader}</li>
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
 * "GroupHeader5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics shared by all individual transactions included in the message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "GroupHeader5", propOrder = {"messageIdentification", "creationDateTime", "initiatingParty", "forwardingAgent", "debtorAgent", "creditorAgent", "instructingAgent", "instructedAgent"})
public class GroupHeader5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text messageIdentification;
	/**
	 * Point to point reference assigned by the instructing party and sent to
	 * the next party in the chain to unambiguously identify the message.
	 * 
	 * Usage: The instructing party has to make sure that
	 * 'MessageIdentification' is unique per instructed party for a pre-agreed
	 * period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5 GroupHeader5}</li>
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
	 * definition} =
	 * "Point to point reference assigned by the instructing party and sent to the next party in the chain to unambiguously identify the message.\n\nUsage: The instructing party has to make sure that 'MessageIdentification' is unique per instructed party for a pre-agreed period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> GroupHeader5.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference assigned by the instructing party and sent to the next party in the chain to unambiguously identify the message.\n\nUsage: The instructing party has to make sure that 'MessageIdentification' is unique per instructed party for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * Date and time at which the status report was created by the instructing
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreationDate
	 * PaymentExecution.mmCreationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5 GroupHeader5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the status report was created by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreationDate;
			componentContext_lazy = () -> GroupHeader5.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the status report was created by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected PartyIdentification8 initiatingParty;
	/**
	 * Party initiating the payment. In the payment context, this can either be
	 * the debtor (in a credit transfer), the creditor (in a direct debit), or
	 * the party that initiates the payment on behalf of the debtor or creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5 GroupHeader5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party initiating the payment. In the payment context, this can either be the debtor (in a credit transfer), the creditor (in a direct debit), or the party that initiates the payment on behalf of the debtor or creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitiatingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> GroupHeader5.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Party initiating the payment. In the payment context, this can either be the debtor (in a credit transfer), the creditor (in a direct debit), or the party that initiates the payment on behalf of the debtor or creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification8.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 forwardingAgent;
	/**
	 * Financial institution that receives the instruction from the initiating
	 * party and forwards it to the next agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5 GroupHeader5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FwdgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the instruction from the initiating party and forwards it to the next agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForwardingAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> GroupHeader5.mmObject();
			isDerived = false;
			xmlTag = "FwdgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardingAgent";
			definition = "Financial institution that receives the instruction from the initiating party and forwards it to the next agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 debtorAgent;
	/**
	 * Financial institution servicing an account for the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5 GroupHeader5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> GroupHeader5.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 creditorAgent;
	/**
	 * Financial institution servicing an account for the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5 GroupHeader5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> GroupHeader5.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 instructingAgent;
	/**
	 * Agent that instructs the next party in the chain to carry out the (set
	 * of) instruction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5 GroupHeader5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that instructs the next party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructingAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> GroupHeader5.mmObject();
			isDerived = false;
			xmlTag = "InstgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			definition = "Agent that instructs the next party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 instructedAgent;
	/**
	 * Agent that is instructed by the previous party in the chain to carry out
	 * the (set of) instruction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5 GroupHeader5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> GroupHeader5.mmObject();
			isDerived = false;
			xmlTag = "InstdAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgent";
			definition = "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(GroupHeader5.mmMessageIdentification, GroupHeader5.mmCreationDateTime, GroupHeader5.mmInitiatingParty, GroupHeader5.mmForwardingAgent, GroupHeader5.mmDebtorAgent,
						GroupHeader5.mmCreditorAgent, GroupHeader5.mmInstructingAgent, GroupHeader5.mmInstructedAgent);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.PaymentStatusReportV02.mmGroupHeader, com.tools20022.repository.area.pacs.PaymentStatusReportV02.mmGroupHeader);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GroupHeader5";
				definition = "Set of characteristics shared by all individual transactions included in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "CreDtTm", required = true)
	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@XmlElement(name = "InitgPty")
	public PartyIdentification8 getInitiatingParty() {
		return initiatingParty;
	}

	public void setInitiatingParty(com.tools20022.repository.msg.PartyIdentification8 initiatingParty) {
		this.initiatingParty = initiatingParty;
	}

	@XmlElement(name = "FwdgAgt")
	public BranchAndFinancialInstitutionIdentification3 getForwardingAgent() {
		return forwardingAgent;
	}

	public void setForwardingAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 forwardingAgent) {
		this.forwardingAgent = forwardingAgent;
	}

	@XmlElement(name = "DbtrAgt")
	public BranchAndFinancialInstitutionIdentification3 getDebtorAgent() {
		return debtorAgent;
	}

	public void setDebtorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 debtorAgent) {
		this.debtorAgent = debtorAgent;
	}

	@XmlElement(name = "CdtrAgt")
	public BranchAndFinancialInstitutionIdentification3 getCreditorAgent() {
		return creditorAgent;
	}

	public void setCreditorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 creditorAgent) {
		this.creditorAgent = creditorAgent;
	}

	@XmlElement(name = "InstgAgt")
	public BranchAndFinancialInstitutionIdentification3 getInstructingAgent() {
		return instructingAgent;
	}

	public void setInstructingAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 instructingAgent) {
		this.instructingAgent = instructingAgent;
	}

	@XmlElement(name = "InstdAgt")
	public BranchAndFinancialInstitutionIdentification3 getInstructedAgent() {
		return instructedAgent;
	}

	public void setInstructedAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 instructedAgent) {
		this.instructedAgent = instructedAgent;
	}
}
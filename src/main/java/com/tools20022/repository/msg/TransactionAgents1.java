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
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3;
import com.tools20022.repository.msg.ProprietaryAgent1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements providing information specific to the individual
 * transaction(s) included in the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents1#mmDebtorAgent
 * TransactionAgents1.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents1#mmCreditorAgent
 * TransactionAgents1.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents1#mmIntermediaryAgent1
 * TransactionAgents1.mmIntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents1#mmIntermediaryAgent2
 * TransactionAgents1.mmIntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents1#mmIntermediaryAgent3
 * TransactionAgents1.mmIntermediaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents1#mmReceivingAgent
 * TransactionAgents1.mmReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents1#mmDeliveringAgent
 * TransactionAgents1.mmDeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents1#mmIssuingAgent
 * TransactionAgents1.mmIssuingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents1#mmSettlementPlace
 * TransactionAgents1.mmSettlementPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents1#mmProprietary
 * TransactionAgents1.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
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
 * "TransactionAgents1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements providing information specific to the individual transaction(s) included in the message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionAgents1", propOrder = {"debtorAgent", "creditorAgent", "intermediaryAgent1", "intermediaryAgent2", "intermediaryAgent3", "receivingAgent", "deliveringAgent", "issuingAgent", "settlementPlace", "proprietary"})
public class TransactionAgents1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DbtrAgt")
	protected BranchAndFinancialInstitutionIdentification3 debtorAgent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
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
	public static final MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>> mmDebtorAgent = new MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents1.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(TransactionAgents1 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(TransactionAgents1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setDebtorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgt")
	protected BranchAndFinancialInstitutionIdentification3 creditorAgent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
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
	public static final MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>> mmCreditorAgent = new MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents1.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(TransactionAgents1 obj) {
			return obj.getCreditorAgent();
		}

		@Override
		public void setValue(TransactionAgents1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setCreditorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt1")
	protected BranchAndFinancialInstitutionIdentification3 intermediaryAgent1;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor agent and creditor agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the debtor agent and the intermediary agent 2."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>> mmIntermediaryAgent1 = new MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1";
			definition = "Agent between the debtor agent and creditor agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the debtor agent and the intermediary agent 2.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(TransactionAgents1 obj) {
			return obj.getIntermediaryAgent1();
		}

		@Override
		public void setValue(TransactionAgents1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setIntermediaryAgent1(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt2")
	protected BranchAndFinancialInstitutionIdentification3 intermediaryAgent2;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor agent and creditor agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the intermediary agent 1 and the intermediary agent 3."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>> mmIntermediaryAgent2 = new MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2";
			definition = "Agent between the debtor agent and creditor agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the intermediary agent 1 and the intermediary agent 3.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(TransactionAgents1 obj) {
			return obj.getIntermediaryAgent2();
		}

		@Override
		public void setValue(TransactionAgents1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setIntermediaryAgent2(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt3")
	protected BranchAndFinancialInstitutionIdentification3 intermediaryAgent3;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor agent and creditor agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the intermediary agent 2 and the creditor agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>> mmIntermediaryAgent3 = new MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3";
			definition = "Agent between the debtor agent and creditor agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the intermediary agent 2 and the creditor agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(TransactionAgents1 obj) {
			return obj.getIntermediaryAgent3();
		}

		@Override
		public void setValue(TransactionAgents1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setIntermediaryAgent3(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgAgt")
	protected BranchAndFinancialInstitutionIdentification3 receivingAgent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives securities from the delivering agent at the place of settlement, eg, central securities depository.\nCan also be used in the context of treasury operations."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>> mmReceivingAgent = new MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents1.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			definition = "Party that receives securities from the delivering agent at the place of settlement, eg, central securities depository.\nCan also be used in the context of treasury operations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(TransactionAgents1 obj) {
			return obj.getReceivingAgent();
		}

		@Override
		public void setValue(TransactionAgents1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setReceivingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgAgt")
	protected BranchAndFinancialInstitutionIdentification3 deliveringAgent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, eg, central securities depository.\nCan also be used in the context of treasury operations."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>> mmDeliveringAgent = new MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents1.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgent";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, eg, central securities depository.\nCan also be used in the context of treasury operations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(TransactionAgents1 obj) {
			return obj.getDeliveringAgent();
		}

		@Override
		public void setValue(TransactionAgents1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setDeliveringAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "IssgAgt")
	protected BranchAndFinancialInstitutionIdentification3 issuingAgent;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal entity that has the right to issue securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>> mmIssuingAgent = new MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents1.mmObject();
			isDerived = false;
			xmlTag = "IssgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuingAgent";
			definition = "Legal entity that has the right to issue securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(TransactionAgents1 obj) {
			return obj.getIssuingAgent();
		}

		@Override
		public void setValue(TransactionAgents1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setIssuingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPlc")
	protected BranchAndFinancialInstitutionIdentification3 settlementPlace;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where settlement of the securities takes place.\n\nNote: this is typed by a financial institution identification - as this is the standard way of identifying eg securities settlement agent/central system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>> mmSettlementPlace = new MMMessageAssociationEnd<TransactionAgents1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents1.mmObject();
			isDerived = false;
			xmlTag = "SttlmPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPlace";
			definition = "Place where settlement of the securities takes place.\n\nNote: this is typed by a financial institution identification - as this is the standard way of identifying eg securities settlement agent/central system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(TransactionAgents1 obj) {
			return obj.getSettlementPlace();
		}

		@Override
		public void setValue(TransactionAgents1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setSettlementPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "Prtry")
	protected List<ProprietaryAgent1> proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryAgent1
	 * ProprietaryAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary agent related to the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents1, List<ProprietaryAgent1>> mmProprietary = new MMMessageAssociationEnd<TransactionAgents1, List<ProprietaryAgent1>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents1.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary agent related to the underlying transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProprietaryAgent1.mmObject();
		}

		@Override
		public List<ProprietaryAgent1> getValue(TransactionAgents1 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(TransactionAgents1 obj, List<ProprietaryAgent1> value) {
			obj.setProprietary(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionAgents1.mmDebtorAgent, com.tools20022.repository.msg.TransactionAgents1.mmCreditorAgent,
						com.tools20022.repository.msg.TransactionAgents1.mmIntermediaryAgent1, com.tools20022.repository.msg.TransactionAgents1.mmIntermediaryAgent2, com.tools20022.repository.msg.TransactionAgents1.mmIntermediaryAgent3,
						com.tools20022.repository.msg.TransactionAgents1.mmReceivingAgent, com.tools20022.repository.msg.TransactionAgents1.mmDeliveringAgent, com.tools20022.repository.msg.TransactionAgents1.mmIssuingAgent,
						com.tools20022.repository.msg.TransactionAgents1.mmSettlementPlace, com.tools20022.repository.msg.TransactionAgents1.mmProprietary);
				trace_lazy = () -> Role.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionAgents1";
				definition = "Set of elements providing information specific to the individual transaction(s) included in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getDebtorAgent() {
		return debtorAgent == null ? Optional.empty() : Optional.of(debtorAgent);
	}

	public TransactionAgents1 setDebtorAgent(BranchAndFinancialInstitutionIdentification3 debtorAgent) {
		this.debtorAgent = debtorAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getCreditorAgent() {
		return creditorAgent == null ? Optional.empty() : Optional.of(creditorAgent);
	}

	public TransactionAgents1 setCreditorAgent(BranchAndFinancialInstitutionIdentification3 creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getIntermediaryAgent1() {
		return intermediaryAgent1 == null ? Optional.empty() : Optional.of(intermediaryAgent1);
	}

	public TransactionAgents1 setIntermediaryAgent1(BranchAndFinancialInstitutionIdentification3 intermediaryAgent1) {
		this.intermediaryAgent1 = intermediaryAgent1;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getIntermediaryAgent2() {
		return intermediaryAgent2 == null ? Optional.empty() : Optional.of(intermediaryAgent2);
	}

	public TransactionAgents1 setIntermediaryAgent2(BranchAndFinancialInstitutionIdentification3 intermediaryAgent2) {
		this.intermediaryAgent2 = intermediaryAgent2;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getIntermediaryAgent3() {
		return intermediaryAgent3 == null ? Optional.empty() : Optional.of(intermediaryAgent3);
	}

	public TransactionAgents1 setIntermediaryAgent3(BranchAndFinancialInstitutionIdentification3 intermediaryAgent3) {
		this.intermediaryAgent3 = intermediaryAgent3;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getReceivingAgent() {
		return receivingAgent == null ? Optional.empty() : Optional.of(receivingAgent);
	}

	public TransactionAgents1 setReceivingAgent(BranchAndFinancialInstitutionIdentification3 receivingAgent) {
		this.receivingAgent = receivingAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getDeliveringAgent() {
		return deliveringAgent == null ? Optional.empty() : Optional.of(deliveringAgent);
	}

	public TransactionAgents1 setDeliveringAgent(BranchAndFinancialInstitutionIdentification3 deliveringAgent) {
		this.deliveringAgent = deliveringAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getIssuingAgent() {
		return issuingAgent == null ? Optional.empty() : Optional.of(issuingAgent);
	}

	public TransactionAgents1 setIssuingAgent(BranchAndFinancialInstitutionIdentification3 issuingAgent) {
		this.issuingAgent = issuingAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getSettlementPlace() {
		return settlementPlace == null ? Optional.empty() : Optional.of(settlementPlace);
	}

	public TransactionAgents1 setSettlementPlace(BranchAndFinancialInstitutionIdentification3 settlementPlace) {
		this.settlementPlace = settlementPlace;
		return this;
	}

	public List<ProprietaryAgent1> getProprietary() {
		return proprietary == null ? proprietary = new ArrayList<>() : proprietary;
	}

	public TransactionAgents1 setProprietary(List<ProprietaryAgent1> proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}
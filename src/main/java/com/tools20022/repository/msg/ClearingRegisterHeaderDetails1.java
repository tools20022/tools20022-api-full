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
import com.tools20022.repository.choice.ClearingScheme1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about clearing register.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#ProcessingPeriod
 * ClearingRegisterHeaderDetails1.ProcessingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#TotalInterbankSettlementCreditAmount
 * ClearingRegisterHeaderDetails1.TotalInterbankSettlementCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#TotalInterbankSettlementDebitAmount
 * ClearingRegisterHeaderDetails1.TotalInterbankSettlementDebitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#ClearingAgent
 * ClearingRegisterHeaderDetails1.ClearingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#ClearingAgentAccount
 * ClearingRegisterHeaderDetails1.ClearingAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#GuaranteeFundAgent
 * ClearingRegisterHeaderDetails1.GuaranteeFundAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#GuaranteeFundAgentAccount
 * ClearingRegisterHeaderDetails1.GuaranteeFundAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#ClearingCircuit
 * ClearingRegisterHeaderDetails1.ClearingCircuit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#SettlementTimeRequest
 * ClearingRegisterHeaderDetails1.SettlementTimeRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#SettlementTimeIndication
 * ClearingRegisterHeaderDetails1.SettlementTimeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#PaymentIdentification
 * ClearingRegisterHeaderDetails1.PaymentIdentification}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingRegisterHeaderDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about clearing register."</li>
 * </ul>
 */
public class ClearingRegisterHeaderDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Processing period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Period4 Period4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing period."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProcessingPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "PrcgPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingPeriod";
			definition = "Processing period.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Period4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Amount of money moved between the instructing agent and the instructed
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlIntrBkSttlmCdtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TotalInterbankSettlementCreditAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "TtlIntrBkSttlmCdtAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementCreditAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money debited between the instructing agent and the instructed
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlIntrBkSttlmDbtAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementDebitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money debited between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TotalInterbankSettlementDebitAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "TtlIntrBkSttlmDbtAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementDebitAmount";
			definition = "Amount of money debited between the instructing agent and the instructed agent.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Agent of the clearing account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent of the clearing account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ClearingAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAgent";
			definition = "Agent of the clearing account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Clearing Account which is used while execution of clearing positions
	 * registry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing Account which is used while execution of clearing positions registry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ClearingAgentAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAgentAccount";
			definition = "Clearing Account which is used while execution of clearing positions registry.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Account number of guarantee fund which is used during RCP execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntFndAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeFundAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account number of guarantee fund which is used during RCP execution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd GuaranteeFundAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "GrntFndAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeFundAgent";
			definition = "Account number of guarantee fund which is used during RCP execution.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Agent of the guarantee fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntFndAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeFundAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent of the guarantee fund."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd GuaranteeFundAgentAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "GrntFndAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeFundAgentAccount";
			definition = "Agent of the guarantee fund.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashAccount24.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Clearing scheme related to Registry of the Clearing Positions (RCP).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClearingScheme1Choice
	 * ClearingScheme1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrCrct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingCircuit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing scheme related to Registry of the Clearing Positions (RCP)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ClearingCircuit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClrCrct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingCircuit";
			definition = "Clearing scheme related to Registry of the Clearing Positions (RCP).";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClearingScheme1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information on the requested settlement time(s) of the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTimeRequest2
	 * SettlementTimeRequest2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTmReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTimeRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the requested settlement time(s) of the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SettlementTimeRequest = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "SttlmTmReq";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTimeRequest";
			definition = "Provides information on the requested settlement time(s) of the payment instruction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SettlementTimeRequest2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information on the occurred settlement time(s) of the payment
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1
	 * SettlementDateTimeIndication1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTmIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTimeIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the occurred settlement time(s) of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SettlementTimeIndication = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "SttlmTmIndctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTimeIndication";
			definition = "Provides information on the occurred settlement time(s) of the payment transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SettlementDateTimeIndication1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Set of elements used to reference a payment register.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentIdentification3
	 * PaymentIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1
	 * ClearingRegisterHeaderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements used to reference a payment register."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PaymentIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "PmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Set of elements used to reference a payment register.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaymentIdentification3.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.ProcessingPeriod, com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.TotalInterbankSettlementCreditAmount,
						com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.TotalInterbankSettlementDebitAmount, com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.ClearingAgent,
						com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.ClearingAgentAccount, com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.GuaranteeFundAgent,
						com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.GuaranteeFundAgentAccount, com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.ClearingCircuit,
						com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.SettlementTimeRequest, com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.SettlementTimeIndication,
						com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.PaymentIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearingRegisterHeaderDetails1";
				definition = "Information about clearing register.";
			}
		});
		return mmObject_lazy.get();
	}
}
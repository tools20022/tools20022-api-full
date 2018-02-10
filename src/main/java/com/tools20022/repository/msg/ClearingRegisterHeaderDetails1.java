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
import com.tools20022.repository.choice.ClearingScheme1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
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
 * Information about clearing register.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmProcessingPeriod
 * ClearingRegisterHeaderDetails1.mmProcessingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmTotalInterbankSettlementCreditAmount
 * ClearingRegisterHeaderDetails1.mmTotalInterbankSettlementCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmTotalInterbankSettlementDebitAmount
 * ClearingRegisterHeaderDetails1.mmTotalInterbankSettlementDebitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmClearingAgent
 * ClearingRegisterHeaderDetails1.mmClearingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmClearingAgentAccount
 * ClearingRegisterHeaderDetails1.mmClearingAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmGuaranteeFundAgent
 * ClearingRegisterHeaderDetails1.mmGuaranteeFundAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmGuaranteeFundAgentAccount
 * ClearingRegisterHeaderDetails1.mmGuaranteeFundAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmClearingCircuit
 * ClearingRegisterHeaderDetails1.mmClearingCircuit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmSettlementTimeRequest
 * ClearingRegisterHeaderDetails1.mmSettlementTimeRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmSettlementTimeIndication
 * ClearingRegisterHeaderDetails1.mmSettlementTimeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingRegisterHeaderDetails1#mmPaymentIdentification
 * ClearingRegisterHeaderDetails1.mmPaymentIdentification}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClearingRegisterHeaderDetails1", propOrder = {"processingPeriod", "totalInterbankSettlementCreditAmount", "totalInterbankSettlementDebitAmount", "clearingAgent", "clearingAgentAccount", "guaranteeFundAgent",
		"guaranteeFundAgentAccount", "clearingCircuit", "settlementTimeRequest", "settlementTimeIndication", "paymentIdentification"})
public class ClearingRegisterHeaderDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcgPrd", required = true)
	protected Period4 processingPeriod;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmProcessingPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "PrcgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingPeriod";
			definition = "Processing period.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Period4.mmObject();
		}
	};
	@XmlElement(name = "TtlIntrBkSttlmCdtAmt", required = true)
	protected ActiveCurrencyAndAmount totalInterbankSettlementCreditAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmTotalInterbankSettlementCreditAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "TtlIntrBkSttlmCdtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementCreditAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlIntrBkSttlmDbtAmt", required = true)
	protected ActiveCurrencyAndAmount totalInterbankSettlementDebitAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute mmTotalInterbankSettlementDebitAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "TtlIntrBkSttlmDbtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementDebitAmount";
			definition = "Amount of money debited between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ClrAgt")
	protected BranchAndFinancialInstitutionIdentification5 clearingAgent;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmClearingAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAgent";
			definition = "Agent of the clearing account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "ClrAgtAcct")
	protected CashAccount24 clearingAgentAccount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmClearingAgentAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAgentAccount";
			definition = "Clearing Account which is used while execution of clearing positions registry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	@XmlElement(name = "GrntFndAgt")
	protected BranchAndFinancialInstitutionIdentification5 guaranteeFundAgent;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmGuaranteeFundAgent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "GrntFndAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeFundAgent";
			definition = "Account number of guarantee fund which is used during RCP execution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "GrntFndAgtAcct")
	protected CashAccount24 guaranteeFundAgentAccount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmGuaranteeFundAgentAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "GrntFndAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeFundAgentAccount";
			definition = "Agent of the guarantee fund.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	@XmlElement(name = "ClrCrct")
	protected ClearingScheme1Choice clearingCircuit;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmClearingCircuit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClrCrct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingCircuit";
			definition = "Clearing scheme related to Registry of the Clearing Positions (RCP).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClearingScheme1Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlmTmReq")
	protected SettlementTimeRequest2 settlementTimeRequest;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmSettlementTimeRequest = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "SttlmTmReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTimeRequest";
			definition = "Provides information on the requested settlement time(s) of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTimeRequest2.mmObject();
		}
	};
	@XmlElement(name = "SttlmTmIndctn")
	protected SettlementDateTimeIndication1 settlementTimeIndication;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmSettlementTimeIndication = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "SttlmTmIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTimeIndication";
			definition = "Provides information on the occurred settlement time(s) of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementDateTimeIndication1.mmObject();
		}
	};
	@XmlElement(name = "PmtId", required = true)
	protected PaymentIdentification3 paymentIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd mmPaymentIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmObject();
			isDerived = false;
			xmlTag = "PmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Set of elements used to reference a payment register.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentIdentification3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmProcessingPeriod, com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmTotalInterbankSettlementCreditAmount,
						com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmTotalInterbankSettlementDebitAmount, com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmClearingAgent,
						com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmClearingAgentAccount, com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmGuaranteeFundAgent,
						com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmGuaranteeFundAgentAccount, com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmClearingCircuit,
						com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmSettlementTimeRequest, com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmSettlementTimeIndication,
						com.tools20022.repository.msg.ClearingRegisterHeaderDetails1.mmPaymentIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearingRegisterHeaderDetails1";
				definition = "Information about clearing register.";
			}
		});
		return mmObject_lazy.get();
	}

	public Period4 getProcessingPeriod() {
		return processingPeriod;
	}

	public ClearingRegisterHeaderDetails1 setProcessingPeriod(com.tools20022.repository.msg.Period4 processingPeriod) {
		this.processingPeriod = Objects.requireNonNull(processingPeriod);
		return this;
	}

	public ActiveCurrencyAndAmount getTotalInterbankSettlementCreditAmount() {
		return totalInterbankSettlementCreditAmount;
	}

	public ClearingRegisterHeaderDetails1 setTotalInterbankSettlementCreditAmount(ActiveCurrencyAndAmount totalInterbankSettlementCreditAmount) {
		this.totalInterbankSettlementCreditAmount = Objects.requireNonNull(totalInterbankSettlementCreditAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getTotalInterbankSettlementDebitAmount() {
		return totalInterbankSettlementDebitAmount;
	}

	public ClearingRegisterHeaderDetails1 setTotalInterbankSettlementDebitAmount(ActiveCurrencyAndAmount totalInterbankSettlementDebitAmount) {
		this.totalInterbankSettlementDebitAmount = Objects.requireNonNull(totalInterbankSettlementDebitAmount);
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getClearingAgent() {
		return clearingAgent == null ? Optional.empty() : Optional.of(clearingAgent);
	}

	public ClearingRegisterHeaderDetails1 setClearingAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 clearingAgent) {
		this.clearingAgent = clearingAgent;
		return this;
	}

	public Optional<CashAccount24> getClearingAgentAccount() {
		return clearingAgentAccount == null ? Optional.empty() : Optional.of(clearingAgentAccount);
	}

	public ClearingRegisterHeaderDetails1 setClearingAgentAccount(com.tools20022.repository.msg.CashAccount24 clearingAgentAccount) {
		this.clearingAgentAccount = clearingAgentAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getGuaranteeFundAgent() {
		return guaranteeFundAgent == null ? Optional.empty() : Optional.of(guaranteeFundAgent);
	}

	public ClearingRegisterHeaderDetails1 setGuaranteeFundAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 guaranteeFundAgent) {
		this.guaranteeFundAgent = guaranteeFundAgent;
		return this;
	}

	public Optional<CashAccount24> getGuaranteeFundAgentAccount() {
		return guaranteeFundAgentAccount == null ? Optional.empty() : Optional.of(guaranteeFundAgentAccount);
	}

	public ClearingRegisterHeaderDetails1 setGuaranteeFundAgentAccount(com.tools20022.repository.msg.CashAccount24 guaranteeFundAgentAccount) {
		this.guaranteeFundAgentAccount = guaranteeFundAgentAccount;
		return this;
	}

	public Optional<ClearingScheme1Choice> getClearingCircuit() {
		return clearingCircuit == null ? Optional.empty() : Optional.of(clearingCircuit);
	}

	public ClearingRegisterHeaderDetails1 setClearingCircuit(ClearingScheme1Choice clearingCircuit) {
		this.clearingCircuit = clearingCircuit;
		return this;
	}

	public Optional<SettlementTimeRequest2> getSettlementTimeRequest() {
		return settlementTimeRequest == null ? Optional.empty() : Optional.of(settlementTimeRequest);
	}

	public ClearingRegisterHeaderDetails1 setSettlementTimeRequest(com.tools20022.repository.msg.SettlementTimeRequest2 settlementTimeRequest) {
		this.settlementTimeRequest = settlementTimeRequest;
		return this;
	}

	public Optional<SettlementDateTimeIndication1> getSettlementTimeIndication() {
		return settlementTimeIndication == null ? Optional.empty() : Optional.of(settlementTimeIndication);
	}

	public ClearingRegisterHeaderDetails1 setSettlementTimeIndication(com.tools20022.repository.msg.SettlementDateTimeIndication1 settlementTimeIndication) {
		this.settlementTimeIndication = settlementTimeIndication;
		return this;
	}

	public PaymentIdentification3 getPaymentIdentification() {
		return paymentIdentification;
	}

	public ClearingRegisterHeaderDetails1 setPaymentIdentification(com.tools20022.repository.msg.PaymentIdentification3 paymentIdentification) {
		this.paymentIdentification = Objects.requireNonNull(paymentIdentification);
		return this;
	}
}
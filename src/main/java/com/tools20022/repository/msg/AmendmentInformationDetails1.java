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
import com.tools20022.repository.codeset.Frequency1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3;
import com.tools20022.repository.msg.CashAccount7;
import com.tools20022.repository.msg.PartyIdentification8;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amendment information details providing the list of direct debit mandate
 * elements that have been modified when the amendment indicator has been set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalMandateIdentification
 * AmendmentInformationDetails1.mmOriginalMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalCreditorSchemeIdentification
 * AmendmentInformationDetails1.mmOriginalCreditorSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalCreditorAgent
 * AmendmentInformationDetails1.mmOriginalCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalCreditorAgentAccount
 * AmendmentInformationDetails1.mmOriginalCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalDebtor
 * AmendmentInformationDetails1.mmOriginalDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalDebtorAccount
 * AmendmentInformationDetails1.mmOriginalDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalDebtorAgent
 * AmendmentInformationDetails1.mmOriginalDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalDebtorAgentAccount
 * AmendmentInformationDetails1.mmOriginalDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalFinalCollectionDate
 * AmendmentInformationDetails1.mmOriginalFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1#mmOriginalFrequency
 * AmendmentInformationDetails1.mmOriginalFrequency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
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
 * "AmendmentInformationDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amendment information details providing the list of direct debit mandate elements that have been modified when the amendment indicator has been set."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmendmentInformationDetails1", propOrder = {"originalMandateIdentification", "originalCreditorSchemeIdentification", "originalCreditorAgent", "originalCreditorAgentAccount", "originalDebtor", "originalDebtorAccount",
		"originalDebtorAgent", "originalDebtorAgentAccount", "originalFinalCollectionDate", "originalFrequency"})
public class AmendmentInformationDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMndtId")
	protected Max35Text originalMandateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
	 * Mandate.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
	 * AmendmentInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original mandate identification that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmendmentInformationDetails1, Optional<Max35Text>> mmOriginalMandateIdentification = new MMMessageAttribute<AmendmentInformationDetails1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmMandateIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandateIdentification";
			definition = "Original mandate identification that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AmendmentInformationDetails1 obj) {
			return obj.getOriginalMandateIdentification();
		}

		@Override
		public void setValue(AmendmentInformationDetails1 obj, Optional<Max35Text> value) {
			obj.setOriginalMandateIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCdtrSchmeId")
	protected PartyIdentification8 originalCreditorSchemeIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
	 * AmendmentInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrSchmeId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorSchemeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original creditor scheme identification that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<PartyIdentification8>> mmOriginalCreditorSchemeIdentification = new MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<PartyIdentification8>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorSchemeIdentification";
			definition = "Original creditor scheme identification that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification8.mmObject();
		}

		@Override
		public Optional<PartyIdentification8> getValue(AmendmentInformationDetails1 obj) {
			return obj.getOriginalCreditorSchemeIdentification();
		}

		@Override
		public void setValue(AmendmentInformationDetails1 obj, Optional<PartyIdentification8> value) {
			obj.setOriginalCreditorSchemeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCdtrAgt")
	protected BranchAndFinancialInstitutionIdentification3 originalCreditorAgent;
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
	 * AmendmentInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original creditor agent that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<BranchAndFinancialInstitutionIdentification3>> mmOriginalCreditorAgent = new MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgent";
			definition = "Original creditor agent that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(AmendmentInformationDetails1 obj) {
			return obj.getOriginalCreditorAgent();
		}

		@Override
		public void setValue(AmendmentInformationDetails1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setOriginalCreditorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCdtrAgtAcct")
	protected CashAccount7 originalCreditorAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
	 * AmendmentInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCdtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original creditor agent acount that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<CashAccount7>> mmOriginalCreditorAgentAccount = new MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<CashAccount7>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgentAccount";
			definition = "Original creditor agent acount that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(AmendmentInformationDetails1 obj) {
			return obj.getOriginalCreditorAgentAccount();
		}

		@Override
		public void setValue(AmendmentInformationDetails1 obj, Optional<CashAccount7> value) {
			obj.setOriginalCreditorAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtr")
	protected PartyIdentification8 originalDebtor;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
	 * AmendmentInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<PartyIdentification8>> mmOriginalDebtor = new MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<PartyIdentification8>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtor";
			definition = "Original debtor that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification8.mmObject();
		}

		@Override
		public Optional<PartyIdentification8> getValue(AmendmentInformationDetails1 obj) {
			return obj.getOriginalDebtor();
		}

		@Override
		public void setValue(AmendmentInformationDetails1 obj, Optional<PartyIdentification8> value) {
			obj.setOriginalDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtrAcct")
	protected CashAccount7 originalDebtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
	 * AmendmentInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor account that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<CashAccount7>> mmOriginalDebtorAccount = new MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<CashAccount7>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAccount";
			definition = "Original debtor account that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(AmendmentInformationDetails1 obj) {
			return obj.getOriginalDebtorAccount();
		}

		@Override
		public void setValue(AmendmentInformationDetails1 obj, Optional<CashAccount7> value) {
			obj.setOriginalDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtrAgt")
	protected BranchAndFinancialInstitutionIdentification3 originalDebtorAgent;
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
	 * AmendmentInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor's agent that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<BranchAndFinancialInstitutionIdentification3>> mmOriginalDebtorAgent = new MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgent";
			definition = "Original debtor's agent that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(AmendmentInformationDetails1 obj) {
			return obj.getOriginalDebtorAgent();
		}

		@Override
		public void setValue(AmendmentInformationDetails1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setOriginalDebtorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlDbtrAgtAcct")
	protected CashAccount7 originalDebtorAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
	 * AmendmentInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlDbtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original debtor agent account that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<CashAccount7>> mmOriginalDebtorAgentAccount = new MMMessageAssociationEnd<AmendmentInformationDetails1, Optional<CashAccount7>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgentAccount";
			definition = "Original debtor agent account that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(AmendmentInformationDetails1 obj) {
			return obj.getOriginalDebtorAgentAccount();
		}

		@Override
		public void setValue(AmendmentInformationDetails1 obj, Optional<CashAccount7> value) {
			obj.setOriginalDebtorAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlFnlColltnDt")
	protected ISODate originalFinalCollectionDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFinalCollectionDate
	 * DirectDebitMandate.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
	 * AmendmentInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlFnlColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalFinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original final collection date that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmendmentInformationDetails1, Optional<ISODate>> mmOriginalFinalCollectionDate = new MMMessageAttribute<AmendmentInformationDetails1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFinalCollectionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFnlColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFinalCollectionDate";
			definition = "Original final collection date that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AmendmentInformationDetails1 obj) {
			return obj.getOriginalFinalCollectionDate();
		}

		@Override
		public void setValue(AmendmentInformationDetails1 obj, Optional<ISODate> value) {
			obj.setOriginalFinalCollectionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlFrqcy")
	protected Frequency1Code originalFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
	 * DirectDebitMandate.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails1
	 * AmendmentInformationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original frequency that has been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmendmentInformationDetails1, Optional<Frequency1Code>> mmOriginalFrequency = new MMMessageAttribute<AmendmentInformationDetails1, Optional<Frequency1Code>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFrequency";
			definition = "Original frequency that has been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}

		@Override
		public Optional<Frequency1Code> getValue(AmendmentInformationDetails1 obj) {
			return obj.getOriginalFrequency();
		}

		@Override
		public void setValue(AmendmentInformationDetails1 obj, Optional<Frequency1Code> value) {
			obj.setOriginalFrequency(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalMandateIdentification,
						com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalCreditorSchemeIdentification, com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalCreditorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalCreditorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalDebtor,
						com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalDebtorAccount, com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalDebtorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalDebtorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalFinalCollectionDate,
						com.tools20022.repository.msg.AmendmentInformationDetails1.mmOriginalFrequency);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmendmentInformationDetails1";
				definition = "Amendment information details providing the list of direct debit mandate elements that have been modified when the amendment indicator has been set.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getOriginalMandateIdentification() {
		return originalMandateIdentification == null ? Optional.empty() : Optional.of(originalMandateIdentification);
	}

	public AmendmentInformationDetails1 setOriginalMandateIdentification(Max35Text originalMandateIdentification) {
		this.originalMandateIdentification = originalMandateIdentification;
		return this;
	}

	public Optional<PartyIdentification8> getOriginalCreditorSchemeIdentification() {
		return originalCreditorSchemeIdentification == null ? Optional.empty() : Optional.of(originalCreditorSchemeIdentification);
	}

	public AmendmentInformationDetails1 setOriginalCreditorSchemeIdentification(PartyIdentification8 originalCreditorSchemeIdentification) {
		this.originalCreditorSchemeIdentification = originalCreditorSchemeIdentification;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getOriginalCreditorAgent() {
		return originalCreditorAgent == null ? Optional.empty() : Optional.of(originalCreditorAgent);
	}

	public AmendmentInformationDetails1 setOriginalCreditorAgent(BranchAndFinancialInstitutionIdentification3 originalCreditorAgent) {
		this.originalCreditorAgent = originalCreditorAgent;
		return this;
	}

	public Optional<CashAccount7> getOriginalCreditorAgentAccount() {
		return originalCreditorAgentAccount == null ? Optional.empty() : Optional.of(originalCreditorAgentAccount);
	}

	public AmendmentInformationDetails1 setOriginalCreditorAgentAccount(CashAccount7 originalCreditorAgentAccount) {
		this.originalCreditorAgentAccount = originalCreditorAgentAccount;
		return this;
	}

	public Optional<PartyIdentification8> getOriginalDebtor() {
		return originalDebtor == null ? Optional.empty() : Optional.of(originalDebtor);
	}

	public AmendmentInformationDetails1 setOriginalDebtor(PartyIdentification8 originalDebtor) {
		this.originalDebtor = originalDebtor;
		return this;
	}

	public Optional<CashAccount7> getOriginalDebtorAccount() {
		return originalDebtorAccount == null ? Optional.empty() : Optional.of(originalDebtorAccount);
	}

	public AmendmentInformationDetails1 setOriginalDebtorAccount(CashAccount7 originalDebtorAccount) {
		this.originalDebtorAccount = originalDebtorAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getOriginalDebtorAgent() {
		return originalDebtorAgent == null ? Optional.empty() : Optional.of(originalDebtorAgent);
	}

	public AmendmentInformationDetails1 setOriginalDebtorAgent(BranchAndFinancialInstitutionIdentification3 originalDebtorAgent) {
		this.originalDebtorAgent = originalDebtorAgent;
		return this;
	}

	public Optional<CashAccount7> getOriginalDebtorAgentAccount() {
		return originalDebtorAgentAccount == null ? Optional.empty() : Optional.of(originalDebtorAgentAccount);
	}

	public AmendmentInformationDetails1 setOriginalDebtorAgentAccount(CashAccount7 originalDebtorAgentAccount) {
		this.originalDebtorAgentAccount = originalDebtorAgentAccount;
		return this;
	}

	public Optional<ISODate> getOriginalFinalCollectionDate() {
		return originalFinalCollectionDate == null ? Optional.empty() : Optional.of(originalFinalCollectionDate);
	}

	public AmendmentInformationDetails1 setOriginalFinalCollectionDate(ISODate originalFinalCollectionDate) {
		this.originalFinalCollectionDate = originalFinalCollectionDate;
		return this;
	}

	public Optional<Frequency1Code> getOriginalFrequency() {
		return originalFrequency == null ? Optional.empty() : Optional.of(originalFrequency);
	}

	public AmendmentInformationDetails1 setOriginalFrequency(Frequency1Code originalFrequency) {
		this.originalFrequency = originalFrequency;
		return this;
	}
}
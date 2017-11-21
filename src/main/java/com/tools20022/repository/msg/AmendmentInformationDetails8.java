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
import com.tools20022.repository.codeset.Frequency6Code;
import com.tools20022.repository.datatype.ISODate;
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
 * Provides further details on the list of direct debit mandate elements that
 * have been modified when the amendment indicator has been set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalMandateIdentification
 * AmendmentInformationDetails8.mmOriginalMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalCreditorSchemeIdentification
 * AmendmentInformationDetails8.mmOriginalCreditorSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalCreditorAgent
 * AmendmentInformationDetails8.mmOriginalCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalCreditorAgentAccount
 * AmendmentInformationDetails8.mmOriginalCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtor
 * AmendmentInformationDetails8.mmOriginalDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtorAccount
 * AmendmentInformationDetails8.mmOriginalDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtorAgent
 * AmendmentInformationDetails8.mmOriginalDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtorAgentAccount
 * AmendmentInformationDetails8.mmOriginalDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalFinalCollectionDate
 * AmendmentInformationDetails8.mmOriginalFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalFrequency
 * AmendmentInformationDetails8.mmOriginalFrequency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
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
 * "AmendmentInformationDetails8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the list of direct debit mandate elements that have been modified when the amendment indicator has been set."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
 * AmendmentInformationDetails10}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AmendmentInformationDetails8", propOrder = {"originalMandateIdentification", "originalCreditorSchemeIdentification", "originalCreditorAgent", "originalCreditorAgentAccount", "originalDebtor", "originalDebtorAccount",
		"originalDebtorAgent", "originalDebtorAgentAccount", "originalFinalCollectionDate", "originalFrequency"})
public class AmendmentInformationDetails8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text originalMandateIdentification;
	/**
	 * Unique identification, as assigned by the creditor, to unambiguously
	 * identify the original mandate.
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
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
	 * Mandate.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
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
	 * definition} =
	 * "Unique identification, as assigned by the creditor, to unambiguously identify the original mandate."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalMandateIdentification
	 * AmendmentInformationDetails10.mmOriginalMandateIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Mandate.mmMandateIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the original mandate.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalMandateIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification43 originalCreditorSchemeIdentification;
	/**
	 * Original creditor scheme identification that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalCreditorSchemeIdentification
	 * AmendmentInformationDetails10.mmOriginalCreditorSchemeIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalCreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorSchemeIdentification";
			definition = "Original creditor scheme identification that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalCreditorSchemeIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 originalCreditorAgent;
	/**
	 * Original creditor agent that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalCreditorAgent
	 * AmendmentInformationDetails10.mmOriginalCreditorAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgent";
			definition = "Original creditor agent that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalCreditorAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	protected CashAccount24 originalCreditorAgentAccount;
	/**
	 * Original creditor agent account that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
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
	 * definition} = "Original creditor agent account that has been modified."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalCreditorAgentAccount
	 * AmendmentInformationDetails10.mmOriginalCreditorAgentAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalCreditorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgentAccount";
			definition = "Original creditor agent account that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalCreditorAgentAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected PartyIdentification43 originalDebtor;
	/**
	 * Original debtor that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtor
	 * AmendmentInformationDetails10.mmOriginalDebtor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtor";
			definition = "Original debtor that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalDebtor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected CashAccount24 originalDebtorAccount;
	/**
	 * Original debtor account that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtorAccount
	 * AmendmentInformationDetails10.mmOriginalDebtorAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAccount";
			definition = "Original debtor account that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalDebtorAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 originalDebtorAgent;
	/**
	 * Original debtor agent that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
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
	 * definition} = "Original debtor agent that has been modified."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtorAgent
	 * AmendmentInformationDetails10.mmOriginalDebtorAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgent";
			definition = "Original debtor agent that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalDebtorAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	protected CashAccount24 originalDebtorAgentAccount;
	/**
	 * Original debtor agent account that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtorAgentAccount
	 * AmendmentInformationDetails10.mmOriginalDebtorAgentAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgentAccount";
			definition = "Original debtor agent account that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalDebtorAgentAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected ISODate originalFinalCollectionDate;
	/**
	 * Original final collection date that has been modified.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails10.mmOriginalFinalCollectionDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalFinalCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFinalCollectionDate;
			componentContext_lazy = () -> AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFnlColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFinalCollectionDate";
			definition = "Original final collection date that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalFinalCollectionDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Frequency6Code originalFrequency;
	/**
	 * Original frequency that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency6Code
	 * Frequency6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
	 * DirectDebitMandate.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
	 * AmendmentInformationDetails8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalFrequency
	 * AmendmentInformationDetails10.mmOriginalFrequency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> AmendmentInformationDetails8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFrequency";
			definition = "Original frequency that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmOriginalFrequency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency6Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AmendmentInformationDetails8.mmOriginalMandateIdentification, AmendmentInformationDetails8.mmOriginalCreditorSchemeIdentification,
						AmendmentInformationDetails8.mmOriginalCreditorAgent, AmendmentInformationDetails8.mmOriginalCreditorAgentAccount, AmendmentInformationDetails8.mmOriginalDebtor, AmendmentInformationDetails8.mmOriginalDebtorAccount,
						AmendmentInformationDetails8.mmOriginalDebtorAgent, AmendmentInformationDetails8.mmOriginalDebtorAgentAccount, AmendmentInformationDetails8.mmOriginalFinalCollectionDate,
						AmendmentInformationDetails8.mmOriginalFrequency);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmendmentInformationDetails8";
				definition = "Provides further details on the list of direct debit mandate elements that have been modified when the amendment indicator has been set.";
				nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OrgnlMndtId")
	public Max35Text getOriginalMandateIdentification() {
		return originalMandateIdentification;
	}

	public void setOriginalMandateIdentification(Max35Text originalMandateIdentification) {
		this.originalMandateIdentification = originalMandateIdentification;
	}

	@XmlElement(name = "OrgnlCdtrSchmeId")
	public PartyIdentification43 getOriginalCreditorSchemeIdentification() {
		return originalCreditorSchemeIdentification;
	}

	public void setOriginalCreditorSchemeIdentification(com.tools20022.repository.msg.PartyIdentification43 originalCreditorSchemeIdentification) {
		this.originalCreditorSchemeIdentification = originalCreditorSchemeIdentification;
	}

	@XmlElement(name = "OrgnlCdtrAgt")
	public BranchAndFinancialInstitutionIdentification5 getOriginalCreditorAgent() {
		return originalCreditorAgent;
	}

	public void setOriginalCreditorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 originalCreditorAgent) {
		this.originalCreditorAgent = originalCreditorAgent;
	}

	@XmlElement(name = "OrgnlCdtrAgtAcct")
	public CashAccount24 getOriginalCreditorAgentAccount() {
		return originalCreditorAgentAccount;
	}

	public void setOriginalCreditorAgentAccount(com.tools20022.repository.msg.CashAccount24 originalCreditorAgentAccount) {
		this.originalCreditorAgentAccount = originalCreditorAgentAccount;
	}

	@XmlElement(name = "OrgnlDbtr")
	public PartyIdentification43 getOriginalDebtor() {
		return originalDebtor;
	}

	public void setOriginalDebtor(com.tools20022.repository.msg.PartyIdentification43 originalDebtor) {
		this.originalDebtor = originalDebtor;
	}

	@XmlElement(name = "OrgnlDbtrAcct")
	public CashAccount24 getOriginalDebtorAccount() {
		return originalDebtorAccount;
	}

	public void setOriginalDebtorAccount(com.tools20022.repository.msg.CashAccount24 originalDebtorAccount) {
		this.originalDebtorAccount = originalDebtorAccount;
	}

	@XmlElement(name = "OrgnlDbtrAgt")
	public BranchAndFinancialInstitutionIdentification5 getOriginalDebtorAgent() {
		return originalDebtorAgent;
	}

	public void setOriginalDebtorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 originalDebtorAgent) {
		this.originalDebtorAgent = originalDebtorAgent;
	}

	@XmlElement(name = "OrgnlDbtrAgtAcct")
	public CashAccount24 getOriginalDebtorAgentAccount() {
		return originalDebtorAgentAccount;
	}

	public void setOriginalDebtorAgentAccount(com.tools20022.repository.msg.CashAccount24 originalDebtorAgentAccount) {
		this.originalDebtorAgentAccount = originalDebtorAgentAccount;
	}

	@XmlElement(name = "OrgnlFnlColltnDt")
	public ISODate getOriginalFinalCollectionDate() {
		return originalFinalCollectionDate;
	}

	public void setOriginalFinalCollectionDate(ISODate originalFinalCollectionDate) {
		this.originalFinalCollectionDate = originalFinalCollectionDate;
	}

	@XmlElement(name = "OrgnlFrqcy")
	public Frequency6Code getOriginalFrequency() {
		return originalFrequency;
	}

	public void setOriginalFrequency(Frequency6Code originalFrequency) {
		this.originalFrequency = originalFrequency;
	}
}
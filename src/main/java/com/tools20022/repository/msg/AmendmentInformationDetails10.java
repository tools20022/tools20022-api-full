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
import com.tools20022.repository.choice.Frequency21Choice;
import com.tools20022.repository.choice.MandateSetupReason1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DirectDebitMandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalMandateIdentification
 * AmendmentInformationDetails10.mmOriginalMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalCreditorSchemeIdentification
 * AmendmentInformationDetails10.mmOriginalCreditorSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalCreditorAgent
 * AmendmentInformationDetails10.mmOriginalCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalCreditorAgentAccount
 * AmendmentInformationDetails10.mmOriginalCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtor
 * AmendmentInformationDetails10.mmOriginalDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtorAccount
 * AmendmentInformationDetails10.mmOriginalDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtorAgent
 * AmendmentInformationDetails10.mmOriginalDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalDebtorAgentAccount
 * AmendmentInformationDetails10.mmOriginalDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalFinalCollectionDate
 * AmendmentInformationDetails10.mmOriginalFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalFrequency
 * AmendmentInformationDetails10.mmOriginalFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10#mmOriginalReason
 * AmendmentInformationDetails10.mmOriginalReason}</li>
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
 * "AmendmentInformationDetails10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the list of direct debit mandate elements that have been modified when the amendment indicator has been set."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11
 * AmendmentInformationDetails11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8
 * AmendmentInformationDetails8}</li>
 * </ul>
 */
public class AmendmentInformationDetails10 {

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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalMandateIdentification
	 * AmendmentInformationDetails11.mmOriginalMandateIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalMandateIdentification
	 * AmendmentInformationDetails8.mmOriginalMandateIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.mmMandateIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the original mandate.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalMandateIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalMandateIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalCreditorSchemeIdentification
	 * AmendmentInformationDetails11.mmOriginalCreditorSchemeIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalCreditorSchemeIdentification
	 * AmendmentInformationDetails8.mmOriginalCreditorSchemeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalCreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrSchmeId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorSchemeIdentification";
			definition = "Original creditor scheme identification that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalCreditorSchemeIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalCreditorSchemeIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalCreditorAgent
	 * AmendmentInformationDetails11.mmOriginalCreditorAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalCreditorAgent
	 * AmendmentInformationDetails8.mmOriginalCreditorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgent";
			definition = "Original creditor agent that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalCreditorAgent);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalCreditorAgent;
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalCreditorAgentAccount
	 * AmendmentInformationDetails11.mmOriginalCreditorAgentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalCreditorAgentAccount
	 * AmendmentInformationDetails8.mmOriginalCreditorAgentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalCreditorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCdtrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreditorAgentAccount";
			definition = "Original creditor agent account that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalCreditorAgentAccount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalCreditorAgentAccount;
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtor
	 * AmendmentInformationDetails11.mmOriginalDebtor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtor
	 * AmendmentInformationDetails8.mmOriginalDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtor";
			definition = "Original debtor that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalDebtor);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalDebtor;
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtorAccount
	 * AmendmentInformationDetails11.mmOriginalDebtorAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtorAccount
	 * AmendmentInformationDetails8.mmOriginalDebtorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAccount";
			definition = "Original debtor account that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalDebtorAccount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalDebtorAccount;
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtorAgent
	 * AmendmentInformationDetails11.mmOriginalDebtorAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtorAgent
	 * AmendmentInformationDetails8.mmOriginalDebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgent";
			definition = "Original debtor agent that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalDebtorAgent);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalDebtorAgent;
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalDebtorAgentAccount
	 * AmendmentInformationDetails11.mmOriginalDebtorAgentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalDebtorAgentAccount
	 * AmendmentInformationDetails8.mmOriginalDebtorAgentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalDebtorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlDbtrAgtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDebtorAgentAccount";
			definition = "Original debtor agent account that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalDebtorAgentAccount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalDebtorAgentAccount;
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails11.mmOriginalFinalCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalFinalCollectionDate
	 * AmendmentInformationDetails8.mmOriginalFinalCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalFinalCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmFinalCollectionDate;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFnlColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFinalCollectionDate";
			definition = "Original final collection date that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalFinalCollectionDate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalFinalCollectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Frequency21Choice originalFrequency;
	/**
	 * Original frequency that has been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency21Choice
	 * Frequency21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
	 * DirectDebitMandate.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalFrequency
	 * AmendmentInformationDetails11.mmOriginalFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails8#mmOriginalFrequency
	 * AmendmentInformationDetails8.mmOriginalFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlFrqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalFrequency";
			definition = "Original frequency that has been modified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalFrequency);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails8.mmOriginalFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency21Choice.mmObject();
		}
	};
	protected MandateSetupReason1Choice originalReason;
	/**
	 * Original reason for the mandate to allow the user to distinguish between
	 * different mandates for the same creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MandateSetupReason1Choice
	 * MandateSetupReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDescription
	 * Agreement.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original reason for the mandate to allow the user to distinguish between different mandates for the same creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11#mmOriginalReason
	 * AmendmentInformationDetails11.mmOriginalReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.mmDescription;
			componentContext_lazy = () -> AmendmentInformationDetails10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReason";
			definition = "Original reason for the mandate to allow the user to distinguish between different mandates for the same creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails11.mmOriginalReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateSetupReason1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalMandateIdentification,
						com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalCreditorSchemeIdentification, com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalCreditorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalCreditorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalDebtor,
						com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalDebtorAccount, com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalDebtorAgent,
						com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalDebtorAgentAccount, com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalFinalCollectionDate,
						com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalFrequency, com.tools20022.repository.msg.AmendmentInformationDetails10.mmOriginalReason);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmendmentInformationDetails10";
				definition = "Provides further details on the list of direct debit mandate elements that have been modified when the amendment indicator has been set.";
				nextVersions_lazy = () -> Arrays.asList(AmendmentInformationDetails11.mmObject());
				previousVersion_lazy = () -> AmendmentInformationDetails8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalMandateIdentification() {
		return originalMandateIdentification;
	}

	public void setOriginalMandateIdentification(Max35Text originalMandateIdentification) {
		this.originalMandateIdentification = originalMandateIdentification;
	}

	public PartyIdentification43 getOriginalCreditorSchemeIdentification() {
		return originalCreditorSchemeIdentification;
	}

	public void setOriginalCreditorSchemeIdentification(com.tools20022.repository.msg.PartyIdentification43 originalCreditorSchemeIdentification) {
		this.originalCreditorSchemeIdentification = originalCreditorSchemeIdentification;
	}

	public BranchAndFinancialInstitutionIdentification5 getOriginalCreditorAgent() {
		return originalCreditorAgent;
	}

	public void setOriginalCreditorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 originalCreditorAgent) {
		this.originalCreditorAgent = originalCreditorAgent;
	}

	public CashAccount24 getOriginalCreditorAgentAccount() {
		return originalCreditorAgentAccount;
	}

	public void setOriginalCreditorAgentAccount(com.tools20022.repository.msg.CashAccount24 originalCreditorAgentAccount) {
		this.originalCreditorAgentAccount = originalCreditorAgentAccount;
	}

	public PartyIdentification43 getOriginalDebtor() {
		return originalDebtor;
	}

	public void setOriginalDebtor(com.tools20022.repository.msg.PartyIdentification43 originalDebtor) {
		this.originalDebtor = originalDebtor;
	}

	public CashAccount24 getOriginalDebtorAccount() {
		return originalDebtorAccount;
	}

	public void setOriginalDebtorAccount(com.tools20022.repository.msg.CashAccount24 originalDebtorAccount) {
		this.originalDebtorAccount = originalDebtorAccount;
	}

	public BranchAndFinancialInstitutionIdentification5 getOriginalDebtorAgent() {
		return originalDebtorAgent;
	}

	public void setOriginalDebtorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 originalDebtorAgent) {
		this.originalDebtorAgent = originalDebtorAgent;
	}

	public CashAccount24 getOriginalDebtorAgentAccount() {
		return originalDebtorAgentAccount;
	}

	public void setOriginalDebtorAgentAccount(com.tools20022.repository.msg.CashAccount24 originalDebtorAgentAccount) {
		this.originalDebtorAgentAccount = originalDebtorAgentAccount;
	}

	public ISODate getOriginalFinalCollectionDate() {
		return originalFinalCollectionDate;
	}

	public void setOriginalFinalCollectionDate(ISODate originalFinalCollectionDate) {
		this.originalFinalCollectionDate = originalFinalCollectionDate;
	}

	public Frequency21Choice getOriginalFrequency() {
		return originalFrequency;
	}

	public void setOriginalFrequency(Frequency21Choice originalFrequency) {
		this.originalFrequency = originalFrequency;
	}

	public MandateSetupReason1Choice getOriginalReason() {
		return originalReason;
	}

	public void setOriginalReason(MandateSetupReason1Choice originalReason) {
		this.originalReason = originalReason;
	}
}
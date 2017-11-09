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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CashAccountIdentification1Choice;
import com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction, initiated by the creditor, to debit a debtor's account in favour
 * of the creditor. A direct debit can be pre-authorised or not. In most
 * countries, authorisation is in the form of a mandate between the debtor and
 * creditor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmDebtorAccountIdentification
 * DirectDebitMandate3.mmDebtorAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmDebtorIdentification
 * DirectDebitMandate3.mmDebtorIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmDebtorTaxIdentificationNumber
 * DirectDebitMandate3.mmDebtorTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmDebtorNationalRegistrationNumber
 * DirectDebitMandate3.mmDebtorNationalRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmCreditorIdentification
 * DirectDebitMandate3.mmCreditorIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmFirstAgent
 * DirectDebitMandate3.mmFirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmFirstAgentBranch
 * DirectDebitMandate3.mmFirstAgentBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmFinalAgent
 * DirectDebitMandate3.mmFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmFinalAgentBranch
 * DirectDebitMandate3.mmFinalAgentBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmRegistrationIdentification
 * DirectDebitMandate3.mmRegistrationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmMandateIdentification
 * DirectDebitMandate3.mmMandateIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebit
 * DirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DirectDebitMandate3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor."
 * </li>
 * </ul>
 */
public class DirectDebitMandate3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CashAccountIdentification1Choice debtorAccountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification1Choice
	 * CashAccountIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CashAccountIdentification1Choice.mmObject();
		}
	};
	protected PartyIdentification2Choice debtorIdentification;
	/**
	 * Party that owes the cash to the creditor/final party. The debtor is also
	 * the debit account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes the cash to the creditor/final party. The debtor is also the debit account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "DbtrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorIdentification";
			definition = "Party that owes the cash to the creditor/final party. The debtor is also the debit account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected Max35Text debtorTaxIdentificationNumber;
	/**
	 * Number assigned by a tax authority to an entity.
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrTaxIdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorTaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorTaxIdentificationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "DbtrTaxIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorTaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text debtorNationalRegistrationNumber;
	/**
	 * Number assigned by a national registration authority to an entity.
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmNationalRegistrationNumber
	 * PartyIdentificationInformation.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrNtlRegnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorNationalRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national registration authority to an entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorNationalRegistrationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmNationalRegistrationNumber;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "DbtrNtlRegnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorNationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification2Choice creditorIdentification;
	/**
	 * Party that receives an amount of money from the debtor. In the context of
	 * the payment model, the creditor is also the credit account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "CdtrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorIdentification";
			definition = "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected FinancialInstitutionIdentification3Choice firstAgent;
	/**
	 * Financial institution that receives the direct debit instruction from the
	 * creditor or other authorised party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice
	 * FinancialInstitutionIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the direct debit instruction from the creditor or other authorised party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "FrstAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			definition = "Financial institution that receives the direct debit instruction from the creditor or other authorised party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstitutionIdentification3Choice.mmObject();
		}
	};
	protected BranchData firstAgentBranch;
	/**
	 * Information identifying a specific branch of a financial institution.
	 * 
	 * Usage : this component should be used in case the identification
	 * information in the financial institution component does not provide
	 * identification up to branch level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BranchData
	 * BranchData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAgtBrnch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgentBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying a specific branch of a financial institution.\n\nUsage : this component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstAgentBranch = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "FrstAgtBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgentBranch";
			definition = "Information identifying a specific branch of a financial institution.\n\nUsage : this component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.BranchData.mmObject();
		}
	};
	protected FinancialInstitutionIdentification3Choice finalAgent;
	/**
	 * Financial institution that receives the payment transaction on behalf of
	 * the creditor, or other nominated party, and credits the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice
	 * FinancialInstitutionIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the payment transaction on behalf of the creditor, or other nominated party, and credits the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "FnlAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalAgent";
			definition = "Financial institution that receives the payment transaction on behalf of the creditor, or other nominated party, and credits the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstitutionIdentification3Choice.mmObject();
		}
	};
	protected BranchData finalAgentBranch;
	/**
	 * Information identifying a specific branch of a financial institution.
	 * 
	 * Usage : this component should be used in case the identification
	 * information in the financial institution component does not provide
	 * identification up to branch level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BranchData
	 * BranchData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlAgtBrnch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalAgentBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying a specific branch of a financial institution.\n\nUsage : this component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalAgentBranch = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "FnlAgtBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalAgentBranch";
			definition = "Information identifying a specific branch of a financial institution.\n\nUsage : this component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.BranchData.mmObject();
		}
	};
	protected Max35Text registrationIdentification;
	/**
	 * Reference assigned to a creditor by its financial institution, or
	 * relevant authority, authorising the creditor to take part in a direct
	 * debit scheme.
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
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmRegistrationIdentification
	 * DirectDebit.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DirectDebit.mmRegistrationIdentification;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "RegnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationIdentification";
			definition = "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme.\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text mandateIdentification;
	/**
	 * Reference of the direct debit mandate that has been agreed upon by the
	 * debtor and creditor.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the direct debit mandate that has been agreed upon by the debtor and creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> DirectDebitMandate3.mmObject();
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Reference of the direct debit mandate that has been agreed upon by the debtor and creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DirectDebitMandate3.mmDebtorAccountIdentification, DirectDebitMandate3.mmDebtorIdentification, DirectDebitMandate3.mmDebtorTaxIdentificationNumber,
						DirectDebitMandate3.mmDebtorNationalRegistrationNumber, DirectDebitMandate3.mmCreditorIdentification, DirectDebitMandate3.mmFirstAgent, DirectDebitMandate3.mmFirstAgentBranch, DirectDebitMandate3.mmFinalAgent,
						DirectDebitMandate3.mmFinalAgentBranch, DirectDebitMandate3.mmRegistrationIdentification, DirectDebitMandate3.mmMandateIdentification);
				trace_lazy = () -> DirectDebit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DirectDebitMandate3";
				definition = "Instruction, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.";
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccountIdentification1Choice getDebtorAccountIdentification() {
		return debtorAccountIdentification;
	}

	public void setDebtorAccountIdentification(CashAccountIdentification1Choice debtorAccountIdentification) {
		this.debtorAccountIdentification = debtorAccountIdentification;
	}

	public PartyIdentification2Choice getDebtorIdentification() {
		return debtorIdentification;
	}

	public void setDebtorIdentification(PartyIdentification2Choice debtorIdentification) {
		this.debtorIdentification = debtorIdentification;
	}

	public Max35Text getDebtorTaxIdentificationNumber() {
		return debtorTaxIdentificationNumber;
	}

	public void setDebtorTaxIdentificationNumber(Max35Text debtorTaxIdentificationNumber) {
		this.debtorTaxIdentificationNumber = debtorTaxIdentificationNumber;
	}

	public Max35Text getDebtorNationalRegistrationNumber() {
		return debtorNationalRegistrationNumber;
	}

	public void setDebtorNationalRegistrationNumber(Max35Text debtorNationalRegistrationNumber) {
		this.debtorNationalRegistrationNumber = debtorNationalRegistrationNumber;
	}

	public PartyIdentification2Choice getCreditorIdentification() {
		return creditorIdentification;
	}

	public void setCreditorIdentification(PartyIdentification2Choice creditorIdentification) {
		this.creditorIdentification = creditorIdentification;
	}

	public FinancialInstitutionIdentification3Choice getFirstAgent() {
		return firstAgent;
	}

	public void setFirstAgent(FinancialInstitutionIdentification3Choice firstAgent) {
		this.firstAgent = firstAgent;
	}

	public BranchData getFirstAgentBranch() {
		return firstAgentBranch;
	}

	public void setFirstAgentBranch(com.tools20022.repository.msg.BranchData firstAgentBranch) {
		this.firstAgentBranch = firstAgentBranch;
	}

	public FinancialInstitutionIdentification3Choice getFinalAgent() {
		return finalAgent;
	}

	public void setFinalAgent(FinancialInstitutionIdentification3Choice finalAgent) {
		this.finalAgent = finalAgent;
	}

	public BranchData getFinalAgentBranch() {
		return finalAgentBranch;
	}

	public void setFinalAgentBranch(com.tools20022.repository.msg.BranchData finalAgentBranch) {
		this.finalAgentBranch = finalAgentBranch;
	}

	public Max35Text getRegistrationIdentification() {
		return registrationIdentification;
	}

	public void setRegistrationIdentification(Max35Text registrationIdentification) {
		this.registrationIdentification = registrationIdentification;
	}

	public Max35Text getMandateIdentification() {
		return mandateIdentification;
	}

	public void setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = mandateIdentification;
	}
}
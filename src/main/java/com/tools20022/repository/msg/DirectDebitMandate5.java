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
import com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice;
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountIdentificationAndName5;
import com.tools20022.repository.msg.BranchData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Direct debit mandate parties and accounts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorAccount
 * DirectDebitMandate5.mmDebtorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtor
 * DirectDebitMandate5.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorTaxIdentificationNumber
 * DirectDebitMandate5.mmDebtorTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorNationalRegistrationNumber
 * DirectDebitMandate5.mmDebtorNationalRegistrationNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmCreditor
 * DirectDebitMandate5.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorAgent
 * DirectDebitMandate5.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorAgentBranch
 * DirectDebitMandate5.mmDebtorAgentBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmCreditorAgent
 * DirectDebitMandate5.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmCreditorAgentBranch
 * DirectDebitMandate5.mmCreditorAgentBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmRegistrationIdentification
 * DirectDebitMandate5.mmRegistrationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmMandateIdentification
 * DirectDebitMandate5.mmMandateIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebit
 * DirectDebit}</li>
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
 * "DirectDebitMandate5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Direct debit mandate parties and accounts."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4
 * DirectDebitMandate4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DirectDebitMandate5", propOrder = {"debtorAccount", "debtor", "debtorTaxIdentificationNumber", "debtorNationalRegistrationNumber", "creditor", "debtorAgent", "debtorAgentBranch", "creditorAgent", "creditorAgentBranch",
		"registrationIdentification", "mandateIdentification"})
public class DirectDebitMandate5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DbtrAcct", required = true)
	protected AccountIdentificationAndName5 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5
	 * AccountIdentificationAndName5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorAccount
	 * DirectDebitMandate4.mmDebtorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, AccountIdentificationAndName5> mmDebtorAccount = new MMMessageAttribute<DirectDebitMandate5, AccountIdentificationAndName5>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmDebtorAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentificationAndName5.mmObject();
		}

		@Override
		public AccountIdentificationAndName5 getValue(DirectDebitMandate5 obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, AccountIdentificationAndName5 value) {
			obj.setDebtorAccount(value);
		}
	};
	@XmlElement(name = "Dbtr")
	protected PartyIdentification70Choice debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes the cash to the creditor/final party. The debtor is also the debit account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtor
	 * DirectDebitMandate4.mmDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, Optional<PartyIdentification70Choice>> mmDebtor = new MMMessageAttribute<DirectDebitMandate5, Optional<PartyIdentification70Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes the cash to the creditor/final party. The debtor is also the debit account owner.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmDebtor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification70Choice> getValue(DirectDebitMandate5 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, Optional<PartyIdentification70Choice> value) {
			obj.setDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrTaxIdNb")
	protected Max35Text debtorTaxIdentificationNumber;
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorTaxIdentificationNumber
	 * DirectDebitMandate4.mmDebtorTaxIdentificationNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, Optional<Max35Text>> mmDebtorTaxIdentificationNumber = new MMMessageAttribute<DirectDebitMandate5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "DbtrTaxIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorTaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmDebtorTaxIdentificationNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DirectDebitMandate5 obj) {
			return obj.getDebtorTaxIdentificationNumber();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, Optional<Max35Text> value) {
			obj.setDebtorTaxIdentificationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrNtlRegnNb")
	protected Max35Text debtorNationalRegistrationNumber;
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmNationalRegistrationNumber
	 * PartyIdentificationInformation.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorNationalRegistrationNumber
	 * DirectDebitMandate4.mmDebtorNationalRegistrationNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, Optional<Max35Text>> mmDebtorNationalRegistrationNumber = new MMMessageAttribute<DirectDebitMandate5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmNationalRegistrationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "DbtrNtlRegnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorNationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmDebtorNationalRegistrationNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DirectDebitMandate5 obj) {
			return obj.getDebtorNationalRegistrationNumber();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, Optional<Max35Text> value) {
			obj.setDebtorNationalRegistrationNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdtr")
	protected PartyIdentification70Choice creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmCreditor
	 * DirectDebitMandate4.mmCreditor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, Optional<PartyIdentification70Choice>> mmCreditor = new MMMessageAttribute<DirectDebitMandate5, Optional<PartyIdentification70Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmCreditor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification70Choice> getValue(DirectDebitMandate5 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, Optional<PartyIdentification70Choice> value) {
			obj.setCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAgt", required = true)
	protected FinancialInstitutionIdentification7Choice debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice
	 * FinancialInstitutionIdentification7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
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
	 * "Financial institution that receives the direct debit instruction from the creditor or other authorised party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorAgent
	 * DirectDebitMandate4.mmDebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, FinancialInstitutionIdentification7Choice> mmDebtorAgent = new MMMessageAttribute<DirectDebitMandate5, FinancialInstitutionIdentification7Choice>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution that receives the direct debit instruction from the creditor or other authorised party.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmDebtorAgent;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstitutionIdentification7Choice.mmObject();
		}

		@Override
		public FinancialInstitutionIdentification7Choice getValue(DirectDebitMandate5 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, FinancialInstitutionIdentification7Choice value) {
			obj.setDebtorAgent(value);
		}
	};
	@XmlElement(name = "DbtrAgtBrnch")
	protected BranchData debtorAgentBranch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BranchData
	 * BranchData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmBranch
	 * Organisation.mmBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgtBrnch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorAgentBranch
	 * DirectDebitMandate4.mmDebtorAgentBranch}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, Optional<BranchData>> mmDebtorAgentBranch = new MMMessageAttribute<DirectDebitMandate5, Optional<BranchData>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmBranch;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentBranch";
			definition = "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmDebtorAgentBranch;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchData.mmObject();
		}

		@Override
		public Optional<BranchData> getValue(DirectDebitMandate5 obj) {
			return obj.getDebtorAgentBranch();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, Optional<BranchData> value) {
			obj.setDebtorAgentBranch(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgt")
	protected FinancialInstitutionIdentification7Choice creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice
	 * FinancialInstitutionIdentification7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
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
	 * "Financial institution that receives the payment transaction on behalf of the creditor, or other nominated party, and credits the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmCreditorAgent
	 * DirectDebitMandate4.mmCreditorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, Optional<FinancialInstitutionIdentification7Choice>> mmCreditorAgent = new MMMessageAttribute<DirectDebitMandate5, Optional<FinancialInstitutionIdentification7Choice>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution that receives the payment transaction on behalf of the creditor, or other nominated party, and credits the account.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmCreditorAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstitutionIdentification7Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification7Choice> getValue(DirectDebitMandate5 obj) {
			return obj.getCreditorAgent();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, Optional<FinancialInstitutionIdentification7Choice> value) {
			obj.setCreditorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgtBrnch")
	protected BranchData creditorAgentBranch;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgtBrnch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmCreditorAgentBranch
	 * DirectDebitMandate4.mmCreditorAgentBranch}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, Optional<BranchData>> mmCreditorAgentBranch = new MMMessageAttribute<DirectDebitMandate5, Optional<BranchData>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentBranch";
			definition = "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmCreditorAgentBranch;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchData.mmObject();
		}

		@Override
		public Optional<BranchData> getValue(DirectDebitMandate5 obj) {
			return obj.getCreditorAgentBranch();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, Optional<BranchData> value) {
			obj.setCreditorAgentBranch(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnId")
	protected Max35Text registrationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.DirectDebit#mmRegistrationIdentification
	 * DirectDebit.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
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
	 * "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmRegistrationIdentification
	 * DirectDebitMandate4.mmRegistrationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, Optional<Max35Text>> mmRegistrationIdentification = new MMMessageAttribute<DirectDebitMandate5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> DirectDebit.mmRegistrationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "RegnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationIdentification";
			definition = "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmRegistrationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DirectDebitMandate5 obj) {
			return obj.getRegistrationIdentification();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, Optional<Max35Text> value) {
			obj.setRegistrationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MndtId")
	protected Max35Text mandateIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5
	 * DirectDebitMandate5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmMandateIdentification
	 * DirectDebitMandate4.mmMandateIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DirectDebitMandate5, Optional<Max35Text>> mmMandateIdentification = new MMMessageAttribute<DirectDebitMandate5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate5.mmObject();
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Reference of the direct debit mandate that has been agreed upon by the debtor and creditor.";
			previousVersion_lazy = () -> DirectDebitMandate4.mmMandateIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DirectDebitMandate5 obj) {
			return obj.getMandateIdentification();
		}

		@Override
		public void setValue(DirectDebitMandate5 obj, Optional<Max35Text> value) {
			obj.setMandateIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitMandate5.mmDebtorAccount, com.tools20022.repository.msg.DirectDebitMandate5.mmDebtor,
						com.tools20022.repository.msg.DirectDebitMandate5.mmDebtorTaxIdentificationNumber, com.tools20022.repository.msg.DirectDebitMandate5.mmDebtorNationalRegistrationNumber,
						com.tools20022.repository.msg.DirectDebitMandate5.mmCreditor, com.tools20022.repository.msg.DirectDebitMandate5.mmDebtorAgent, com.tools20022.repository.msg.DirectDebitMandate5.mmDebtorAgentBranch,
						com.tools20022.repository.msg.DirectDebitMandate5.mmCreditorAgent, com.tools20022.repository.msg.DirectDebitMandate5.mmCreditorAgentBranch,
						com.tools20022.repository.msg.DirectDebitMandate5.mmRegistrationIdentification, com.tools20022.repository.msg.DirectDebitMandate5.mmMandateIdentification);
				trace_lazy = () -> DirectDebit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DirectDebitMandate5";
				definition = "Direct debit mandate parties and accounts.";
				previousVersion_lazy = () -> DirectDebitMandate4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentificationAndName5 getDebtorAccount() {
		return debtorAccount;
	}

	public DirectDebitMandate5 setDebtorAccount(AccountIdentificationAndName5 debtorAccount) {
		this.debtorAccount = Objects.requireNonNull(debtorAccount);
		return this;
	}

	public Optional<PartyIdentification70Choice> getDebtor() {
		return debtor == null ? Optional.empty() : Optional.of(debtor);
	}

	public DirectDebitMandate5 setDebtor(PartyIdentification70Choice debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<Max35Text> getDebtorTaxIdentificationNumber() {
		return debtorTaxIdentificationNumber == null ? Optional.empty() : Optional.of(debtorTaxIdentificationNumber);
	}

	public DirectDebitMandate5 setDebtorTaxIdentificationNumber(Max35Text debtorTaxIdentificationNumber) {
		this.debtorTaxIdentificationNumber = debtorTaxIdentificationNumber;
		return this;
	}

	public Optional<Max35Text> getDebtorNationalRegistrationNumber() {
		return debtorNationalRegistrationNumber == null ? Optional.empty() : Optional.of(debtorNationalRegistrationNumber);
	}

	public DirectDebitMandate5 setDebtorNationalRegistrationNumber(Max35Text debtorNationalRegistrationNumber) {
		this.debtorNationalRegistrationNumber = debtorNationalRegistrationNumber;
		return this;
	}

	public Optional<PartyIdentification70Choice> getCreditor() {
		return creditor == null ? Optional.empty() : Optional.of(creditor);
	}

	public DirectDebitMandate5 setCreditor(PartyIdentification70Choice creditor) {
		this.creditor = creditor;
		return this;
	}

	public FinancialInstitutionIdentification7Choice getDebtorAgent() {
		return debtorAgent;
	}

	public DirectDebitMandate5 setDebtorAgent(FinancialInstitutionIdentification7Choice debtorAgent) {
		this.debtorAgent = Objects.requireNonNull(debtorAgent);
		return this;
	}

	public Optional<BranchData> getDebtorAgentBranch() {
		return debtorAgentBranch == null ? Optional.empty() : Optional.of(debtorAgentBranch);
	}

	public DirectDebitMandate5 setDebtorAgentBranch(BranchData debtorAgentBranch) {
		this.debtorAgentBranch = debtorAgentBranch;
		return this;
	}

	public Optional<FinancialInstitutionIdentification7Choice> getCreditorAgent() {
		return creditorAgent == null ? Optional.empty() : Optional.of(creditorAgent);
	}

	public DirectDebitMandate5 setCreditorAgent(FinancialInstitutionIdentification7Choice creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	public Optional<BranchData> getCreditorAgentBranch() {
		return creditorAgentBranch == null ? Optional.empty() : Optional.of(creditorAgentBranch);
	}

	public DirectDebitMandate5 setCreditorAgentBranch(BranchData creditorAgentBranch) {
		this.creditorAgentBranch = creditorAgentBranch;
		return this;
	}

	public Optional<Max35Text> getRegistrationIdentification() {
		return registrationIdentification == null ? Optional.empty() : Optional.of(registrationIdentification);
	}

	public DirectDebitMandate5 setRegistrationIdentification(Max35Text registrationIdentification) {
		this.registrationIdentification = registrationIdentification;
		return this;
	}

	public Optional<Max35Text> getMandateIdentification() {
		return mandateIdentification == null ? Optional.empty() : Optional.of(mandateIdentification);
	}

	public DirectDebitMandate5 setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = mandateIdentification;
		return this;
	}
}
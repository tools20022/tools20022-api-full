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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
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
 * Payment instrument between a debtor and a creditor, which flows through one
 * or more financial institutions or systems.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#mmReference
 * CreditTransfer8.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#mmDebtor
 * CreditTransfer8.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmDebtorAccount
 * CreditTransfer8.mmDebtorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#mmDebtorAgent
 * CreditTransfer8.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmDebtorAgentAccount
 * CreditTransfer8.mmDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmIntermediaryAgent1
 * CreditTransfer8.mmIntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmIntermediaryAgent1Account
 * CreditTransfer8.mmIntermediaryAgent1Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmIntermediaryAgent2
 * CreditTransfer8.mmIntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmIntermediaryAgent2Account
 * CreditTransfer8.mmIntermediaryAgent2Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditorAgent
 * CreditTransfer8.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditorAgentAccount
 * CreditTransfer8.mmCreditorAgentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditor
 * CreditTransfer8.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditorAccount
 * CreditTransfer8.mmCreditorAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditTransfer
 * CreditTransfer}</li>
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
 * "CreditTransfer8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CreditTransfer6
 * CreditTransfer6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreditTransfer8", propOrder = {"reference", "debtor", "debtorAccount", "debtorAgent", "debtorAgentAccount", "intermediaryAgent1", "intermediaryAgent1Account", "intermediaryAgent2", "intermediaryAgent2Account",
		"creditorAgent", "creditorAgentAccount", "creditor", "creditorAccount"})
public class CreditTransfer8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ref")
	protected Max35Text reference;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
	 * PaymentIdentification.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmReference
	 * CreditTransfer6.mmReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmCreditorReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.";
			previousVersion_lazy = () -> CreditTransfer6.mmReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Dbtr")
	protected PartyIdentification113 debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
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
	 * "Party that owes an amount of money to the (ultimate) creditor. In the context of the payment model, the debtor is also the debit account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmDebtor
	 * CreditTransfer6.mmDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor. In the context of the payment model, the debtor is also the debit account owner.";
			previousVersion_lazy = () -> CreditTransfer6.mmDebtor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification113.mmObject();
		}
	};
	@XmlElement(name = "DbtrAcct")
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmDebtorAccount
	 * CreditTransfer6.mmDebtorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			previousVersion_lazy = () -> CreditTransfer6.mmDebtorAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountIdentificationAndName5.mmObject();
		}
	};
	@XmlElement(name = "DbtrAgt")
	protected FinancialInstitutionIdentification10 debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
	 * FinancialInstitutionIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmDebtorAgent
	 * CreditTransfer6.mmDebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			previousVersion_lazy = () -> CreditTransfer6.mmDebtorAgent;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification10.mmObject();
		}
	};
	@XmlElement(name = "DbtrAgtAcct")
	protected AccountIdentificationAndName5 debtorAgentAccount;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the account of the debtor's agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmDebtorAgentAccount
	 * CreditTransfer6.mmDebtorAgentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorAgentAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentAccount";
			definition = "Identifies the account of the debtor's agent.";
			previousVersion_lazy = () -> CreditTransfer6.mmDebtorAgentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountIdentificationAndName5.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt1")
	protected FinancialInstitutionIdentification10 intermediaryAgent1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
	 * FinancialInstitutionIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
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
	 * "Agent between the debtor's agent and the creditor's agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmIntermediaryAgent1
	 * CreditTransfer6.mmIntermediaryAgent1}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediaryAgent1 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1";
			definition = "Agent between the debtor's agent and the creditor's agent.";
			previousVersion_lazy = () -> CreditTransfer6.mmIntermediaryAgent1;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification10.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt1Acct")
	protected AccountIdentificationAndName5 intermediaryAgent1Account;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 1 at its servicing agent in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmIntermediaryAgent1Account
	 * CreditTransfer6.mmIntermediaryAgent1Account}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediaryAgent1Account = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Account";
			definition = "Unambiguous identification of the account of the intermediary agent 1 at its servicing agent in the payment chain.";
			previousVersion_lazy = () -> CreditTransfer6.mmIntermediaryAgent1Account;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountIdentificationAndName5.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt2")
	protected FinancialInstitutionIdentification10 intermediaryAgent2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
	 * FinancialInstitutionIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
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
	 * "Agent between the debtor's agent and the creditor's agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmIntermediaryAgent2
	 * CreditTransfer6.mmIntermediaryAgent2}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediaryAgent2 = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2";
			definition = "Agent between the debtor's agent and the creditor's agent.";
			previousVersion_lazy = () -> CreditTransfer6.mmIntermediaryAgent2;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification10.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt2Acct")
	protected AccountIdentificationAndName5 intermediaryAgent2Account;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 2 at its servicing agent in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmIntermediaryAgent2Account
	 * CreditTransfer6.mmIntermediaryAgent2Account}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediaryAgent2Account = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2Account";
			definition = "Unambiguous identification of the account of the intermediary agent 2 at its servicing agent in the payment chain.";
			previousVersion_lazy = () -> CreditTransfer6.mmIntermediaryAgent2Account;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountIdentificationAndName5.mmObject();
		}
	};
	@XmlElement(name = "CdtrAgt", required = true)
	protected FinancialInstitutionIdentification10 creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
	 * FinancialInstitutionIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmCreditorAgent
	 * CreditTransfer6.mmCreditorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			previousVersion_lazy = () -> CreditTransfer6.mmCreditorAgent;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification10.mmObject();
		}
	};
	@XmlElement(name = "CdtrAgtAcct")
	protected AccountIdentificationAndName5 creditorAgentAccount;
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor agent at its servicing agent to which a credit entry will be made as a result of the payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmCreditorAgentAccount
	 * CreditTransfer6.mmCreditorAgentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorAgentAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentAccount";
			definition = "Unambiguous identification of the account of the creditor agent at its servicing agent to which a credit entry will be made as a result of the payment transaction.";
			previousVersion_lazy = () -> CreditTransfer6.mmCreditorAgentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountIdentificationAndName5.mmObject();
		}
	};
	@XmlElement(name = "Cdtr")
	protected PartyIdentification113 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmCreditor
	 * CreditTransfer6.mmCreditor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner.";
			previousVersion_lazy = () -> CreditTransfer6.mmCreditor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification113.mmObject();
		}
	};
	@XmlElement(name = "CdtrAcct", required = true)
	protected AccountIdentificationAndName5 creditorAccount;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmCreditorAccount
	 * CreditTransfer6.mmCreditorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			previousVersion_lazy = () -> CreditTransfer6.mmCreditorAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AccountIdentificationAndName5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransfer8.mmReference, com.tools20022.repository.msg.CreditTransfer8.mmDebtor, com.tools20022.repository.msg.CreditTransfer8.mmDebtorAccount,
						com.tools20022.repository.msg.CreditTransfer8.mmDebtorAgent, com.tools20022.repository.msg.CreditTransfer8.mmDebtorAgentAccount, com.tools20022.repository.msg.CreditTransfer8.mmIntermediaryAgent1,
						com.tools20022.repository.msg.CreditTransfer8.mmIntermediaryAgent1Account, com.tools20022.repository.msg.CreditTransfer8.mmIntermediaryAgent2,
						com.tools20022.repository.msg.CreditTransfer8.mmIntermediaryAgent2Account, com.tools20022.repository.msg.CreditTransfer8.mmCreditorAgent, com.tools20022.repository.msg.CreditTransfer8.mmCreditorAgentAccount,
						com.tools20022.repository.msg.CreditTransfer8.mmCreditor, com.tools20022.repository.msg.CreditTransfer8.mmCreditorAccount);
				trace_lazy = () -> CreditTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditTransfer8";
				definition = "Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems.";
				previousVersion_lazy = () -> CreditTransfer6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public CreditTransfer8 setReference(Max35Text reference) {
		this.reference = reference;
		return this;
	}

	public Optional<PartyIdentification113> getDebtor() {
		return debtor == null ? Optional.empty() : Optional.of(debtor);
	}

	public CreditTransfer8 setDebtor(com.tools20022.repository.msg.PartyIdentification113 debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<AccountIdentificationAndName5> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public CreditTransfer8 setDebtorAccount(com.tools20022.repository.msg.AccountIdentificationAndName5 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public Optional<FinancialInstitutionIdentification10> getDebtorAgent() {
		return debtorAgent == null ? Optional.empty() : Optional.of(debtorAgent);
	}

	public CreditTransfer8 setDebtorAgent(com.tools20022.repository.msg.FinancialInstitutionIdentification10 debtorAgent) {
		this.debtorAgent = debtorAgent;
		return this;
	}

	public Optional<AccountIdentificationAndName5> getDebtorAgentAccount() {
		return debtorAgentAccount == null ? Optional.empty() : Optional.of(debtorAgentAccount);
	}

	public CreditTransfer8 setDebtorAgentAccount(com.tools20022.repository.msg.AccountIdentificationAndName5 debtorAgentAccount) {
		this.debtorAgentAccount = debtorAgentAccount;
		return this;
	}

	public Optional<FinancialInstitutionIdentification10> getIntermediaryAgent1() {
		return intermediaryAgent1 == null ? Optional.empty() : Optional.of(intermediaryAgent1);
	}

	public CreditTransfer8 setIntermediaryAgent1(com.tools20022.repository.msg.FinancialInstitutionIdentification10 intermediaryAgent1) {
		this.intermediaryAgent1 = intermediaryAgent1;
		return this;
	}

	public Optional<AccountIdentificationAndName5> getIntermediaryAgent1Account() {
		return intermediaryAgent1Account == null ? Optional.empty() : Optional.of(intermediaryAgent1Account);
	}

	public CreditTransfer8 setIntermediaryAgent1Account(com.tools20022.repository.msg.AccountIdentificationAndName5 intermediaryAgent1Account) {
		this.intermediaryAgent1Account = intermediaryAgent1Account;
		return this;
	}

	public Optional<FinancialInstitutionIdentification10> getIntermediaryAgent2() {
		return intermediaryAgent2 == null ? Optional.empty() : Optional.of(intermediaryAgent2);
	}

	public CreditTransfer8 setIntermediaryAgent2(com.tools20022.repository.msg.FinancialInstitutionIdentification10 intermediaryAgent2) {
		this.intermediaryAgent2 = intermediaryAgent2;
		return this;
	}

	public Optional<AccountIdentificationAndName5> getIntermediaryAgent2Account() {
		return intermediaryAgent2Account == null ? Optional.empty() : Optional.of(intermediaryAgent2Account);
	}

	public CreditTransfer8 setIntermediaryAgent2Account(com.tools20022.repository.msg.AccountIdentificationAndName5 intermediaryAgent2Account) {
		this.intermediaryAgent2Account = intermediaryAgent2Account;
		return this;
	}

	public FinancialInstitutionIdentification10 getCreditorAgent() {
		return creditorAgent;
	}

	public CreditTransfer8 setCreditorAgent(com.tools20022.repository.msg.FinancialInstitutionIdentification10 creditorAgent) {
		this.creditorAgent = Objects.requireNonNull(creditorAgent);
		return this;
	}

	public Optional<AccountIdentificationAndName5> getCreditorAgentAccount() {
		return creditorAgentAccount == null ? Optional.empty() : Optional.of(creditorAgentAccount);
	}

	public CreditTransfer8 setCreditorAgentAccount(com.tools20022.repository.msg.AccountIdentificationAndName5 creditorAgentAccount) {
		this.creditorAgentAccount = creditorAgentAccount;
		return this;
	}

	public Optional<PartyIdentification113> getCreditor() {
		return creditor == null ? Optional.empty() : Optional.of(creditor);
	}

	public CreditTransfer8 setCreditor(com.tools20022.repository.msg.PartyIdentification113 creditor) {
		this.creditor = creditor;
		return this;
	}

	public AccountIdentificationAndName5 getCreditorAccount() {
		return creditorAccount;
	}

	public CreditTransfer8 setCreditorAccount(com.tools20022.repository.msg.AccountIdentificationAndName5 creditorAccount) {
		this.creditorAccount = Objects.requireNonNull(creditorAccount);
		return this;
	}
}
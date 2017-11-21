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
import com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice;
import com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice;
import com.tools20022.repository.choice.DateAndDateTimeSearchChoice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.EntryStatus1Code;
import com.tools20022.repository.entity.AccountStatus;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for a cash entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmAccountIdentification
 * CashAccountEntrySearch4.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryAmount
 * CashAccountEntrySearch4.mmEntryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryAmountCurrency
 * CashAccountEntrySearch4.mmEntryAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmCreditDebitIndicator
 * CashAccountEntrySearch4.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryStatus
 * CashAccountEntrySearch4.mmEntryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryDate
 * CashAccountEntrySearch4.mmEntryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmAccountOwner
 * CashAccountEntrySearch4.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmAccountServicer
 * CashAccountEntrySearch4.mmAccountServicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
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
 * "CashAccountEntrySearch4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a cash entry."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3
 * CashAccountEntrySearch3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CashAccountEntrySearch4", propOrder = {"accountIdentification", "entryAmount", "entryAmountCurrency", "creditDebitIndicator", "entryStatus", "entryDate", "accountOwner", "accountServicer"})
public class CashAccountEntrySearch4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<AccountIdentificationSearchCriteria2Choice> accountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice
	 * AccountIdentificationSearchCriteria2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
	 * CashAccountEntrySearch4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmAccountIdentification
	 * CashAccountEntrySearch3.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> CashAccountEntrySearch4.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> CashAccountEntrySearch3.mmAccountIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}
	};
	protected List<ActiveOrHistoricAmountRange1Choice> entryAmount;
	/**
	 * Specifies the entry amount(s) on which the query is performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice
	 * ActiveOrHistoricAmountRange1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
	 * CashAccountEntrySearch4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the entry amount(s) on which the query is performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmEntryAmount
	 * CashAccountEntrySearch3.mmEntryAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> CashAccountEntrySearch4.mmObject();
			isDerived = false;
			xmlTag = "NtryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmount";
			definition = "Specifies the entry amount(s) on which the query is performed.";
			previousVersion_lazy = () -> CashAccountEntrySearch3.mmEntryAmount;
			minOccurs = 0;
			complexType_lazy = () -> ActiveOrHistoricAmountRange1Choice.mmObject();
		}
	};
	protected List<ActiveOrHistoricCurrencyCode> entryAmountCurrency;
	/**
	 * Currency of the entry amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
	 * CashAccountEntrySearch4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryAmtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the entry amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmEntryAmountCurrency
	 * CashAccountEntrySearch3.mmEntryAmountCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryAmountCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountEntrySearch4.mmObject();
			isDerived = false;
			xmlTag = "NtryAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmountCurrency";
			definition = "Currency of the entry amount.";
			previousVersion_lazy = () -> CashAccountEntrySearch3.mmEntryAmountCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * Indicates whether an entry is a credit or a debit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmCreditDebitIndicator
	 * Entry.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
	 * CashAccountEntrySearch4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether an entry is a credit or a debit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmCreditDebitIndicator
	 * CashAccountEntrySearch3.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Entry.mmCreditDebitIndicator;
			componentContext_lazy = () -> CashAccountEntrySearch4.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether an entry is a credit or a debit.";
			previousVersion_lazy = () -> CashAccountEntrySearch3.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	protected List<EntryStatus1Code> entryStatus;
	/**
	 * Status of an entry on the books of the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatus1Code
	 * EntryStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmEntryStatus
	 * AccountStatus.mmEntryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
	 * CashAccountEntrySearch4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtrySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an entry on the books of the account servicer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmEntryStatus
	 * CashAccountEntrySearch3.mmEntryStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountStatus.mmEntryStatus;
			componentContext_lazy = () -> CashAccountEntrySearch4.mmObject();
			isDerived = false;
			xmlTag = "NtrySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryStatus";
			definition = "Status of an entry on the books of the account servicer.";
			previousVersion_lazy = () -> CashAccountEntrySearch3.mmEntryStatus;
			minOccurs = 0;
			simpleType_lazy = () -> EntryStatus1Code.mmObject();
		}
	};
	protected List<DateAndDateTimeSearchChoice> entryDate;
	/**
	 * Date and time at which an entry is posted to an account on the account
	 * servicer's books.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice
	 * DateAndDateTimeSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmEntryDate
	 * Entry.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
	 * CashAccountEntrySearch4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which an entry is posted to an account on the account servicer's books."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmEntryDate
	 * CashAccountEntrySearch3.mmEntryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Entry.mmEntryDate;
			componentContext_lazy = () -> CashAccountEntrySearch4.mmObject();
			isDerived = false;
			xmlTag = "NtryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			previousVersion_lazy = () -> CashAccountEntrySearch3.mmEntryDate;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
		}
	};
	protected PartyIdentification43 accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
	 * CashAccountEntrySearch4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmAccountOwner
	 * CashAccountEntrySearch3.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CashAccountEntrySearch4.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> CashAccountEntrySearch3.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 accountServicer;
	/**
	 * Party that manages the account on behalf of the account owner, that is
	 * manages the registration and booking of entries on the account,
	 * calculates balances on the account and provides information about the
	 * account.
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
	 * CashAccountEntrySearch4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmAccountServicer
	 * CashAccountEntrySearch3.mmAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountServicer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CashAccountEntrySearch4.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.\n";
			previousVersion_lazy = () -> CashAccountEntrySearch3.mmAccountServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CashAccountEntrySearch4.mmAccountIdentification, CashAccountEntrySearch4.mmEntryAmount, CashAccountEntrySearch4.mmEntryAmountCurrency,
						CashAccountEntrySearch4.mmCreditDebitIndicator, CashAccountEntrySearch4.mmEntryStatus, CashAccountEntrySearch4.mmEntryDate, CashAccountEntrySearch4.mmAccountOwner, CashAccountEntrySearch4.mmAccountServicer);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountEntrySearch4";
				definition = "Defines the criteria used to search for a cash entry.";
				previousVersion_lazy = () -> CashAccountEntrySearch3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctId")
	public List<AccountIdentificationSearchCriteria2Choice> getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(List<AccountIdentificationSearchCriteria2Choice> accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	@XmlElement(name = "NtryAmt")
	public List<ActiveOrHistoricAmountRange1Choice> getEntryAmount() {
		return entryAmount;
	}

	public void setEntryAmount(List<ActiveOrHistoricAmountRange1Choice> entryAmount) {
		this.entryAmount = entryAmount;
	}

	@XmlElement(name = "NtryAmtCcy")
	public List<ActiveOrHistoricCurrencyCode> getEntryAmountCurrency() {
		return entryAmountCurrency;
	}

	public void setEntryAmountCurrency(List<ActiveOrHistoricCurrencyCode> entryAmountCurrency) {
		this.entryAmountCurrency = entryAmountCurrency;
	}

	@XmlElement(name = "CdtDbtInd")
	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	@XmlElement(name = "NtrySts")
	public List<EntryStatus1Code> getEntryStatus() {
		return entryStatus;
	}

	public void setEntryStatus(List<EntryStatus1Code> entryStatus) {
		this.entryStatus = entryStatus;
	}

	@XmlElement(name = "NtryDt")
	public List<DateAndDateTimeSearchChoice> getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(List<DateAndDateTimeSearchChoice> entryDate) {
		this.entryDate = entryDate;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification43 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.PartyIdentification43 accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "AcctSvcr")
	public BranchAndFinancialInstitutionIdentification5 getAccountServicer() {
		return accountServicer;
	}

	public void setAccountServicer(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 accountServicer) {
		this.accountServicer = accountServicer;
	}
}
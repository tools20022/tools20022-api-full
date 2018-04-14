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
import com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice;
import com.tools20022.repository.choice.DateAndDateTimeSearch3Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.EntryStatus1Code;
import com.tools20022.repository.entity.AccountStatus;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msg.PartyIdentification125;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5#mmAccountIdentification
 * CashAccountEntrySearch5.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5#mmEntryAmount
 * CashAccountEntrySearch5.mmEntryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5#mmEntryAmountCurrency
 * CashAccountEntrySearch5.mmEntryAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5#mmCreditDebitIndicator
 * CashAccountEntrySearch5.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5#mmEntryStatus
 * CashAccountEntrySearch5.mmEntryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5#mmEntryDate
 * CashAccountEntrySearch5.mmEntryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5#mmAccountOwner
 * CashAccountEntrySearch5.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5#mmAccountServicer
 * CashAccountEntrySearch5.mmAccountServicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountEntrySearch5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a cash entry."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule#forCashAccountEntrySearch5
 * ConstraintEntryAmountCreditDebitIndicator1Rule.forCashAccountEntrySearch5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator2Rule#forCashAccountEntrySearch5
 * ConstraintEntryAmountCreditDebitIndicator2Rule.forCashAccountEntrySearch5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4
 * CashAccountEntrySearch4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccountEntrySearch5", propOrder = {"accountIdentification", "entryAmount", "entryAmountCurrency", "creditDebitIndicator", "entryStatus", "entryDate", "accountOwner", "accountServicer"})
public class CashAccountEntrySearch5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected List<AccountIdentificationSearchCriteria2Choice> accountIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
	 * CashAccountEntrySearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmAccountIdentification
	 * CashAccountEntrySearch4.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountEntrySearch5, List<AccountIdentificationSearchCriteria2Choice>> mmAccountIdentification = new MMMessageAssociationEnd<CashAccountEntrySearch5, List<AccountIdentificationSearchCriteria2Choice>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountEntrySearch5.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> CashAccountEntrySearch4.mmAccountIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}

		@Override
		public List<AccountIdentificationSearchCriteria2Choice> getValue(CashAccountEntrySearch5 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(CashAccountEntrySearch5 obj, List<AccountIdentificationSearchCriteria2Choice> value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "NtryAmt")
	protected List<ActiveOrHistoricAmountRange2Choice> entryAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice
	 * ActiveOrHistoricAmountRange2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
	 * CashAccountEntrySearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the entry amount(s) on which the query is performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryAmount
	 * CashAccountEntrySearch4.mmEntryAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountEntrySearch5, List<ActiveOrHistoricAmountRange2Choice>> mmEntryAmount = new MMMessageAttribute<CashAccountEntrySearch5, List<ActiveOrHistoricAmountRange2Choice>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountEntrySearch5.mmObject();
			isDerived = false;
			xmlTag = "NtryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmount";
			definition = "Specifies the entry amount(s) on which the query is performed.";
			previousVersion_lazy = () -> CashAccountEntrySearch4.mmEntryAmount;
			minOccurs = 0;
			complexType_lazy = () -> ActiveOrHistoricAmountRange2Choice.mmObject();
		}

		@Override
		public List<ActiveOrHistoricAmountRange2Choice> getValue(CashAccountEntrySearch5 obj) {
			return obj.getEntryAmount();
		}

		@Override
		public void setValue(CashAccountEntrySearch5 obj, List<ActiveOrHistoricAmountRange2Choice> value) {
			obj.setEntryAmount(value);
		}
	};
	@XmlElement(name = "NtryAmtCcy")
	protected List<ActiveOrHistoricCurrencyCode> entryAmountCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
	 * CashAccountEntrySearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryAmtCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the entry amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryAmountCurrency
	 * CashAccountEntrySearch4.mmEntryAmountCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountEntrySearch5, List<ActiveOrHistoricCurrencyCode>> mmEntryAmountCurrency = new MMMessageAttribute<CashAccountEntrySearch5, List<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountEntrySearch5.mmObject();
			isDerived = false;
			xmlTag = "NtryAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryAmountCurrency";
			definition = "Currency of the entry amount.";
			previousVersion_lazy = () -> CashAccountEntrySearch4.mmEntryAmountCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyCode> getValue(CashAccountEntrySearch5 obj) {
			return obj.getEntryAmountCurrency();
		}

		@Override
		public void setValue(CashAccountEntrySearch5 obj, List<ActiveOrHistoricCurrencyCode> value) {
			obj.setEntryAmountCurrency(value);
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
	 * CashAccountEntrySearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether an entry is a credit or a debit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmCreditDebitIndicator
	 * CashAccountEntrySearch4.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountEntrySearch5, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<CashAccountEntrySearch5, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountEntrySearch5.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether an entry is a credit or a debit.";
			previousVersion_lazy = () -> CashAccountEntrySearch4.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(CashAccountEntrySearch5 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(CashAccountEntrySearch5 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NtrySts")
	protected List<EntryStatus1Code> entryStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
	 * CashAccountEntrySearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtrySts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an entry on the books of the account servicer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryStatus
	 * CashAccountEntrySearch4.mmEntryStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountEntrySearch5, List<EntryStatus1Code>> mmEntryStatus = new MMMessageAttribute<CashAccountEntrySearch5, List<EntryStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> AccountStatus.mmEntryStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountEntrySearch5.mmObject();
			isDerived = false;
			xmlTag = "NtrySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryStatus";
			definition = "Status of an entry on the books of the account servicer.";
			previousVersion_lazy = () -> CashAccountEntrySearch4.mmEntryStatus;
			minOccurs = 0;
			simpleType_lazy = () -> EntryStatus1Code.mmObject();
		}

		@Override
		public List<EntryStatus1Code> getValue(CashAccountEntrySearch5 obj) {
			return obj.getEntryStatus();
		}

		@Override
		public void setValue(CashAccountEntrySearch5 obj, List<EntryStatus1Code> value) {
			obj.setEntryStatus(value);
		}
	};
	@XmlElement(name = "NtryDt")
	protected List<DateAndDateTimeSearch3Choice> entryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch3Choice
	 * DateAndDateTimeSearch3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmEntryDate
	 * Entry.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
	 * CashAccountEntrySearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which an entry is posted to an account on the account servicer's books."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryDate
	 * CashAccountEntrySearch4.mmEntryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccountEntrySearch5, List<DateAndDateTimeSearch3Choice>> mmEntryDate = new MMMessageAttribute<CashAccountEntrySearch5, List<DateAndDateTimeSearch3Choice>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmEntryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountEntrySearch5.mmObject();
			isDerived = false;
			xmlTag = "NtryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			previousVersion_lazy = () -> CashAccountEntrySearch4.mmEntryDate;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch3Choice.mmObject();
		}

		@Override
		public List<DateAndDateTimeSearch3Choice> getValue(CashAccountEntrySearch5 obj) {
			return obj.getEntryDate();
		}

		@Override
		public void setValue(CashAccountEntrySearch5 obj, List<DateAndDateTimeSearch3Choice> value) {
			obj.setEntryDate(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification125 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
	 * CashAccountEntrySearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmAccountOwner
	 * CashAccountEntrySearch4.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountEntrySearch5, Optional<PartyIdentification125>> mmAccountOwner = new MMMessageAssociationEnd<CashAccountEntrySearch5, Optional<PartyIdentification125>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountEntrySearch5.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> CashAccountEntrySearch4.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification125.mmObject();
		}

		@Override
		public Optional<PartyIdentification125> getValue(CashAccountEntrySearch5 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(CashAccountEntrySearch5 obj, Optional<PartyIdentification125> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected BranchAndFinancialInstitutionIdentification5 accountServicer;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch5
	 * CashAccountEntrySearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmAccountServicer
	 * CashAccountEntrySearch4.mmAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccountEntrySearch5, Optional<BranchAndFinancialInstitutionIdentification5>> mmAccountServicer = new MMMessageAssociationEnd<CashAccountEntrySearch5, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccountEntrySearch5.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.\n.";
			previousVersion_lazy = () -> CashAccountEntrySearch4.mmAccountServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(CashAccountEntrySearch5 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(CashAccountEntrySearch5 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountEntrySearch5.mmAccountIdentification, com.tools20022.repository.msg.CashAccountEntrySearch5.mmEntryAmount,
						com.tools20022.repository.msg.CashAccountEntrySearch5.mmEntryAmountCurrency, com.tools20022.repository.msg.CashAccountEntrySearch5.mmCreditDebitIndicator,
						com.tools20022.repository.msg.CashAccountEntrySearch5.mmEntryStatus, com.tools20022.repository.msg.CashAccountEntrySearch5.mmEntryDate, com.tools20022.repository.msg.CashAccountEntrySearch5.mmAccountOwner,
						com.tools20022.repository.msg.CashAccountEntrySearch5.mmAccountServicer);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator1Rule.forCashAccountEntrySearch5,
						com.tools20022.repository.constraints.ConstraintEntryAmountCreditDebitIndicator2Rule.forCashAccountEntrySearch5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountEntrySearch5";
				definition = "Defines the criteria used to search for a cash entry.";
				previousVersion_lazy = () -> CashAccountEntrySearch4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountIdentificationSearchCriteria2Choice> getAccountIdentification() {
		return accountIdentification == null ? accountIdentification = new ArrayList<>() : accountIdentification;
	}

	public CashAccountEntrySearch5 setAccountIdentification(List<AccountIdentificationSearchCriteria2Choice> accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public List<ActiveOrHistoricAmountRange2Choice> getEntryAmount() {
		return entryAmount == null ? entryAmount = new ArrayList<>() : entryAmount;
	}

	public CashAccountEntrySearch5 setEntryAmount(List<ActiveOrHistoricAmountRange2Choice> entryAmount) {
		this.entryAmount = Objects.requireNonNull(entryAmount);
		return this;
	}

	public List<ActiveOrHistoricCurrencyCode> getEntryAmountCurrency() {
		return entryAmountCurrency == null ? entryAmountCurrency = new ArrayList<>() : entryAmountCurrency;
	}

	public CashAccountEntrySearch5 setEntryAmountCurrency(List<ActiveOrHistoricCurrencyCode> entryAmountCurrency) {
		this.entryAmountCurrency = Objects.requireNonNull(entryAmountCurrency);
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public CashAccountEntrySearch5 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public List<EntryStatus1Code> getEntryStatus() {
		return entryStatus == null ? entryStatus = new ArrayList<>() : entryStatus;
	}

	public CashAccountEntrySearch5 setEntryStatus(List<EntryStatus1Code> entryStatus) {
		this.entryStatus = Objects.requireNonNull(entryStatus);
		return this;
	}

	public List<DateAndDateTimeSearch3Choice> getEntryDate() {
		return entryDate == null ? entryDate = new ArrayList<>() : entryDate;
	}

	public CashAccountEntrySearch5 setEntryDate(List<DateAndDateTimeSearch3Choice> entryDate) {
		this.entryDate = Objects.requireNonNull(entryDate);
		return this;
	}

	public Optional<PartyIdentification125> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CashAccountEntrySearch5 setAccountOwner(PartyIdentification125 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public CashAccountEntrySearch5 setAccountServicer(BranchAndFinancialInstitutionIdentification5 accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}
}
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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.EntryStatus4Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.AccountStatus;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the elements of an entry in the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry1#mmAmount
 * NotificationEntry1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmCreditDebitIndicator
 * NotificationEntry1.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmReversalIndicator
 * NotificationEntry1.mmReversalIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry1#mmStatus
 * NotificationEntry1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmBookingDate
 * NotificationEntry1.mmBookingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry1#mmValueDate
 * NotificationEntry1.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmAccountServicerReference
 * NotificationEntry1.mmAccountServicerReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmAvailability
 * NotificationEntry1.mmAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmBankTransactionCode
 * NotificationEntry1.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmCommissionWaiverIndicator
 * NotificationEntry1.mmCommissionWaiverIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmAdditionalInformationIndicator
 * NotificationEntry1.mmAdditionalInformationIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry1#mmBatch
 * NotificationEntry1.mmBatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmAmountDetails
 * NotificationEntry1.mmAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry1#mmCharges
 * NotificationEntry1.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry1#mmInterest
 * NotificationEntry1.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmTransactionDetails
 * NotificationEntry1.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmAdditionalEntryInformation
 * NotificationEntry1.mmAdditionalEntryInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusAndBookingDateRule#forNotificationEntry1
 * ConstraintStatusAndBookingDateRule.forNotificationEntry1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReferenceGuideline#forNotificationEntry1
 * ConstraintReferenceGuideline.forNotificationEntry1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationEntry1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the elements of an entry in the report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NotificationEntry1", propOrder = {"amount", "creditDebitIndicator", "reversalIndicator", "status", "bookingDate", "valueDate", "accountServicerReference", "availability", "bankTransactionCode", "commissionWaiverIndicator",
		"additionalInformationIndicator", "batch", "amountDetails", "charges", "interest", "transactionDetails", "additionalEntryInformation"})
public class NotificationEntry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money in the cash entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationEntry1, CurrencyAndAmount> mmAmount = new MMMessageAttribute<NotificationEntry1, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(NotificationEntry1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(NotificationEntry1 obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
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
	 * definition} = "Specifies if an entry is a credit or a debit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationEntry1, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<NotificationEntry1, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> Entry.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if an entry is a credit or a debit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(NotificationEntry1 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(NotificationEntry1 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "RvslInd")
	protected TrueFalseIndicator reversalIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmReversalIndicator
	 * Entry.mmReversalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the entry is the result of a reversal operation.\n\nUsage: this element should only be present if the entry is the result of a reversal operation.\nIf the CreditDebitIndicator is CRDT and ReversalIndicator is Yes, the original operation was a debit entry.\nIf the CreditDebitIndicator is DBIT and ReversalIndicator is Yes, the original operation was a credit entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationEntry1, Optional<TrueFalseIndicator>> mmReversalIndicator = new MMMessageAttribute<NotificationEntry1, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmReversalIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "RvslInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalIndicator";
			definition = "Indicates whether the entry is the result of a reversal operation.\n\nUsage: this element should only be present if the entry is the result of a reversal operation.\nIf the CreditDebitIndicator is CRDT and ReversalIndicator is Yes, the original operation was a debit entry.\nIf the CreditDebitIndicator is DBIT and ReversalIndicator is Yes, the original operation was a credit entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(NotificationEntry1 obj) {
			return obj.getReversalIndicator();
		}

		@Override
		public void setValue(NotificationEntry1 obj, Optional<TrueFalseIndicator> value) {
			obj.setReversalIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected EntryStatus4Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatus4Code
	 * EntryStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmEntryStatus
	 * AccountStatus.mmEntryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an entry on the books of the account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationEntry1, EntryStatus4Code> mmStatus = new MMMessageAttribute<NotificationEntry1, EntryStatus4Code>() {
		{
			businessElementTrace_lazy = () -> AccountStatus.mmEntryStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of an entry on the books of the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EntryStatus4Code.mmObject();
		}

		@Override
		public EntryStatus4Code getValue(NotificationEntry1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(NotificationEntry1 obj, EntryStatus4Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "BookgDt")
	protected DateAndDateTimeChoice bookingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmEntryDate
	 * Entry.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when an entry is posted to an account on the account servicer's books.\n\nUsage: Booking date is only present if Status is booked."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationEntry1, Optional<DateAndDateTimeChoice>> mmBookingDate = new MMMessageAssociationEnd<NotificationEntry1, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmEntryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "BookgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingDate";
			definition = "Date and time when an entry is posted to an account on the account servicer's books.\n\nUsage: Booking date is only present if Status is booked.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(NotificationEntry1 obj) {
			return obj.getBookingDate();
		}

		@Override
		public void setValue(NotificationEntry1 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setBookingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDt")
	protected DateAndDateTimeChoice valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmValueDate
	 * Entry.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).\n\nUsage: When entry status is pending, and value date is present, value date refers to an expected/requested value date.\nFor entries which are subject to availability/float (and for which availability information is present), value date must not be used, as the availability component identifies the number of availability days."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationEntry1, Optional<DateAndDateTimeChoice>> mmValueDate = new MMMessageAssociationEnd<NotificationEntry1, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date and time assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).\n\nUsage: When entry status is pending, and value date is present, value date refers to an expected/requested value date.\nFor entries which are subject to availability/float (and for which availability information is present), value date must not be used, as the availability component identifies the number of availability days.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(NotificationEntry1 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(NotificationEntry1 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcrRef")
	protected Max35Text accountServicerReference;
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
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountServicerTransactionIdentification
	 * Entry.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account servicing institution's reference for the entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationEntry1, Optional<Max35Text>> mmAccountServicerReference = new MMMessageAttribute<NotificationEntry1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountServicerTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerReference";
			definition = "Account servicing institution's reference for the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(NotificationEntry1 obj) {
			return obj.getAccountServicerReference();
		}

		@Override
		public void setValue(NotificationEntry1 obj, Optional<Max35Text> value) {
			obj.setAccountServicerReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Avlbty")
	protected List<CashBalanceAvailability1> availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability1
	 * CashBalanceAvailability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAvailability
	 * CashEntry.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Avlbty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to indicate when the booked amount of money will become available, ie can be accessed and start generating interest. \n\nUsage: this type of info is eg used in US, and is linked to particular instruments, such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the funds will only be accessible as of the indicated availability day (according to national banking regulations)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationEntry1, List<CashBalanceAvailability1>> mmAvailability = new MMMessageAssociationEnd<NotificationEntry1, List<CashBalanceAvailability1>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAvailability;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Set of elements used to indicate when the booked amount of money will become available, ie can be accessed and start generating interest. \n\nUsage: this type of info is eg used in US, and is linked to particular instruments, such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the funds will only be accessible as of the indicated availability day (according to national banking regulations).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalanceAvailability1.mmObject();
		}

		@Override
		public List<CashBalanceAvailability1> getValue(NotificationEntry1 obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(NotificationEntry1 obj, List<CashBalanceAvailability1> value) {
			obj.setAvailability(value);
		}
	};
	@XmlElement(name = "BkTxCd", required = true)
	protected BankTransactionCodeStructure1 bankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure1
	 * BankTransactionCodeStructure1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmBankTransactionCode
	 * Entry.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements to fully identify the type of underlying transaction resulting in the entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationEntry1, BankTransactionCodeStructure1> mmBankTransactionCode = new MMMessageAssociationEnd<NotificationEntry1, BankTransactionCodeStructure1>() {
		{
			businessElementTrace_lazy = () -> Entry.mmBankTransactionCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements to fully identify the type of underlying transaction resulting in the entry.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure1.mmObject();
		}

		@Override
		public BankTransactionCodeStructure1 getValue(NotificationEntry1 obj) {
			return obj.getBankTransactionCode();
		}

		@Override
		public void setValue(NotificationEntry1 obj, BankTransactionCodeStructure1 value) {
			obj.setBankTransactionCode(value);
		}
	};
	@XmlElement(name = "ComssnWvrInd")
	protected YesNoIndicator commissionWaiverIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmCommissionWaiverIndicator
	 * Entry.mmCommissionWaiverIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnWvrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionWaiverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction is exempt from commission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationEntry1, Optional<YesNoIndicator>> mmCommissionWaiverIndicator = new MMMessageAttribute<NotificationEntry1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmCommissionWaiverIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "ComssnWvrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionWaiverIndicator";
			definition = "Indicates whether the transaction is exempt from commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(NotificationEntry1 obj) {
			return obj.getCommissionWaiverIndicator();
		}

		@Override
		public void setValue(NotificationEntry1 obj, Optional<YesNoIndicator> value) {
			obj.setCommissionWaiverIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInfInd")
	protected MessageIdentification2 additionalInformationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification2
	 * MessageIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the underlying transaction details are provided through a separate message, eg in case of aggregate bookings."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationEntry1, Optional<MessageIdentification2>> mmAdditionalInformationIndicator = new MMMessageAssociationEnd<NotificationEntry1, Optional<MessageIdentification2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationIndicator";
			definition = "Indicates whether the underlying transaction details are provided through a separate message, eg in case of aggregate bookings.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MessageIdentification2.mmObject();
		}

		@Override
		public Optional<MessageIdentification2> getValue(NotificationEntry1 obj) {
			return obj.getAdditionalInformationIndicator();
		}

		@Override
		public void setValue(NotificationEntry1 obj, Optional<MessageIdentification2> value) {
			obj.setAdditionalInformationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Btch")
	protected List<BatchInformation1> batch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BatchInformation1
	 * BatchInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Btch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Batch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing details on batched transactions.\n\nUsage: this element can be repeated in case more than one batch is included in the entry, eg, in lockbox scenarios, to specify the ID and number of transactions included in each of the batches."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationEntry1, List<BatchInformation1>> mmBatch = new MMMessageAssociationEnd<NotificationEntry1, List<BatchInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "Btch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Batch";
			definition = "Set of elements providing details on batched transactions.\n\nUsage: this element can be repeated in case more than one batch is included in the entry, eg, in lockbox scenarios, to specify the ID and number of transactions included in each of the batches.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BatchInformation1.mmObject();
		}

		@Override
		public List<BatchInformation1> getValue(NotificationEntry1 obj) {
			return obj.getBatch();
		}

		@Override
		public void setValue(NotificationEntry1 obj, List<BatchInformation1> value) {
			obj.setBatch(value);
		}
	};
	@XmlElement(name = "AmtDtls")
	protected AmountAndCurrencyExchange2 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2
	 * AmountAndCurrencyExchange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information on the original amount.\n\nUsage: This component (on entry level) should be used when a total original batch or aggregate amount has to be provided. (If required, the individual original amounts can be included in the same component on transaction details level)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationEntry1, Optional<AmountAndCurrencyExchange2>> mmAmountDetails = new MMMessageAssociationEnd<NotificationEntry1, Optional<AmountAndCurrencyExchange2>>() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Set of elements providing information on the original amount.\n\nUsage: This component (on entry level) should be used when a total original batch or aggregate amount has to be provided. (If required, the individual original amounts can be included in the same component on transaction details level).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndCurrencyExchange2.mmObject();
		}

		@Override
		public Optional<AmountAndCurrencyExchange2> getValue(NotificationEntry1 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(NotificationEntry1 obj, Optional<AmountAndCurrencyExchange2> value) {
			obj.setAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Chrgs")
	protected List<ChargesInformation3> charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ChargesInformation3
	 * ChargesInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
	 * CashEntry.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the charges included in the entry amount.\n\nUsage: this component is used on entry level in case of batch or aggregate bookings."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationEntry1, List<ChargesInformation3>> mmCharges = new MMMessageAssociationEnd<NotificationEntry1, List<ChargesInformation3>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges included in the entry amount.\n\nUsage: this component is used on entry level in case of batch or aggregate bookings.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChargesInformation3.mmObject();
		}

		@Override
		public List<ChargesInformation3> getValue(NotificationEntry1 obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(NotificationEntry1 obj, List<ChargesInformation3> value) {
			obj.setCharges(value);
		}
	};
	@XmlElement(name = "Intrst")
	protected List<TransactionInterest1> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionInterest1
	 * TransactionInterest1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing details on the interest amount included in the entry amount.\n\nUsage: This component is used on entry level in case of batch or aggregate bookings."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationEntry1, List<TransactionInterest1>> mmInterest = new MMMessageAssociationEnd<NotificationEntry1, List<TransactionInterest1>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Set of elements providing details on the interest amount included in the entry amount.\n\nUsage: This component is used on entry level in case of batch or aggregate bookings.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionInterest1.mmObject();
		}

		@Override
		public List<TransactionInterest1> getValue(NotificationEntry1 obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(NotificationEntry1 obj, List<TransactionInterest1> value) {
			obj.setInterest(value);
		}
	};
	@XmlElement(name = "TxDtls")
	protected List<EntryTransaction1> transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information on the underlying transaction (s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationEntry1, List<EntryTransaction1>> mmTransactionDetails = new MMMessageAssociationEnd<NotificationEntry1, List<EntryTransaction1>>() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Set of elements providing information on the underlying transaction (s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EntryTransaction1.mmObject();
		}

		@Override
		public List<EntryTransaction1> getValue(NotificationEntry1 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(NotificationEntry1 obj, List<EntryTransaction1> value) {
			obj.setTransactionDetails(value);
		}
	};
	@XmlElement(name = "AddtlNtryInf")
	protected Max500Text additionalEntryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1
	 * NotificationEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlNtryInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalEntryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the entry details."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NotificationEntry1, Optional<Max500Text>> mmAdditionalEntryInformation = new MMMessageAttribute<NotificationEntry1, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NotificationEntry1.mmObject();
			isDerived = false;
			xmlTag = "AddtlNtryInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalEntryInformation";
			definition = "Further details on the entry details.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(NotificationEntry1 obj) {
			return obj.getAdditionalEntryInformation();
		}

		@Override
		public void setValue(NotificationEntry1 obj, Optional<Max500Text> value) {
			obj.setAdditionalEntryInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NotificationEntry1.mmAmount, com.tools20022.repository.msg.NotificationEntry1.mmCreditDebitIndicator,
						com.tools20022.repository.msg.NotificationEntry1.mmReversalIndicator, com.tools20022.repository.msg.NotificationEntry1.mmStatus, com.tools20022.repository.msg.NotificationEntry1.mmBookingDate,
						com.tools20022.repository.msg.NotificationEntry1.mmValueDate, com.tools20022.repository.msg.NotificationEntry1.mmAccountServicerReference, com.tools20022.repository.msg.NotificationEntry1.mmAvailability,
						com.tools20022.repository.msg.NotificationEntry1.mmBankTransactionCode, com.tools20022.repository.msg.NotificationEntry1.mmCommissionWaiverIndicator,
						com.tools20022.repository.msg.NotificationEntry1.mmAdditionalInformationIndicator, com.tools20022.repository.msg.NotificationEntry1.mmBatch, com.tools20022.repository.msg.NotificationEntry1.mmAmountDetails,
						com.tools20022.repository.msg.NotificationEntry1.mmCharges, com.tools20022.repository.msg.NotificationEntry1.mmInterest, com.tools20022.repository.msg.NotificationEntry1.mmTransactionDetails,
						com.tools20022.repository.msg.NotificationEntry1.mmAdditionalEntryInformation);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusAndBookingDateRule.forNotificationEntry1, com.tools20022.repository.constraints.ConstraintReferenceGuideline.forNotificationEntry1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationEntry1";
				definition = "Specifies the elements of an entry in the report.";
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public NotificationEntry1 setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public NotificationEntry1 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<TrueFalseIndicator> getReversalIndicator() {
		return reversalIndicator == null ? Optional.empty() : Optional.of(reversalIndicator);
	}

	public NotificationEntry1 setReversalIndicator(TrueFalseIndicator reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
		return this;
	}

	public EntryStatus4Code getStatus() {
		return status;
	}

	public NotificationEntry1 setStatus(EntryStatus4Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getBookingDate() {
		return bookingDate == null ? Optional.empty() : Optional.of(bookingDate);
	}

	public NotificationEntry1 setBookingDate(DateAndDateTimeChoice bookingDate) {
		this.bookingDate = bookingDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getValueDate() {
		return valueDate == null ? Optional.empty() : Optional.of(valueDate);
	}

	public NotificationEntry1 setValueDate(DateAndDateTimeChoice valueDate) {
		this.valueDate = valueDate;
		return this;
	}

	public Optional<Max35Text> getAccountServicerReference() {
		return accountServicerReference == null ? Optional.empty() : Optional.of(accountServicerReference);
	}

	public NotificationEntry1 setAccountServicerReference(Max35Text accountServicerReference) {
		this.accountServicerReference = accountServicerReference;
		return this;
	}

	public List<CashBalanceAvailability1> getAvailability() {
		return availability == null ? availability = new ArrayList<>() : availability;
	}

	public NotificationEntry1 setAvailability(List<CashBalanceAvailability1> availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}

	public BankTransactionCodeStructure1 getBankTransactionCode() {
		return bankTransactionCode;
	}

	public NotificationEntry1 setBankTransactionCode(BankTransactionCodeStructure1 bankTransactionCode) {
		this.bankTransactionCode = Objects.requireNonNull(bankTransactionCode);
		return this;
	}

	public Optional<YesNoIndicator> getCommissionWaiverIndicator() {
		return commissionWaiverIndicator == null ? Optional.empty() : Optional.of(commissionWaiverIndicator);
	}

	public NotificationEntry1 setCommissionWaiverIndicator(YesNoIndicator commissionWaiverIndicator) {
		this.commissionWaiverIndicator = commissionWaiverIndicator;
		return this;
	}

	public Optional<MessageIdentification2> getAdditionalInformationIndicator() {
		return additionalInformationIndicator == null ? Optional.empty() : Optional.of(additionalInformationIndicator);
	}

	public NotificationEntry1 setAdditionalInformationIndicator(MessageIdentification2 additionalInformationIndicator) {
		this.additionalInformationIndicator = additionalInformationIndicator;
		return this;
	}

	public List<BatchInformation1> getBatch() {
		return batch == null ? batch = new ArrayList<>() : batch;
	}

	public NotificationEntry1 setBatch(List<BatchInformation1> batch) {
		this.batch = Objects.requireNonNull(batch);
		return this;
	}

	public Optional<AmountAndCurrencyExchange2> getAmountDetails() {
		return amountDetails == null ? Optional.empty() : Optional.of(amountDetails);
	}

	public NotificationEntry1 setAmountDetails(AmountAndCurrencyExchange2 amountDetails) {
		this.amountDetails = amountDetails;
		return this;
	}

	public List<ChargesInformation3> getCharges() {
		return charges == null ? charges = new ArrayList<>() : charges;
	}

	public NotificationEntry1 setCharges(List<ChargesInformation3> charges) {
		this.charges = Objects.requireNonNull(charges);
		return this;
	}

	public List<TransactionInterest1> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public NotificationEntry1 setInterest(List<TransactionInterest1> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public List<EntryTransaction1> getTransactionDetails() {
		return transactionDetails == null ? transactionDetails = new ArrayList<>() : transactionDetails;
	}

	public NotificationEntry1 setTransactionDetails(List<EntryTransaction1> transactionDetails) {
		this.transactionDetails = Objects.requireNonNull(transactionDetails);
		return this;
	}

	public Optional<Max500Text> getAdditionalEntryInformation() {
		return additionalEntryInformation == null ? Optional.empty() : Optional.of(additionalEntryInformation);
	}

	public NotificationEntry1 setAdditionalEntryInformation(Max500Text additionalEntryInformation) {
		this.additionalEntryInformation = additionalEntryInformation;
		return this;
	}
}
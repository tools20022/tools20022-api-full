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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount19;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the cash movement resulting from the election
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2#mmPostingIdentification
 * CorporateActionCashMovements2.mmPostingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2#mmPostingDateTime
 * CorporateActionCashMovements2.mmPostingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2#mmPostingAmount
 * CorporateActionCashMovements2.mmPostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2#mmAccountDetails
 * CorporateActionCashMovements2.mmAccountDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
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
 * "CorporateActionCashMovements2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the cash movement resulting from the election instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionCashMovements2", propOrder = {"postingIdentification", "postingDateTime", "postingAmount", "accountDetails"})
public class CorporateActionCashMovements2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PstngId")
	protected Max35Text postingIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2
	 * CorporateActionCashMovements2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Posting identification of the cash movement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionCashMovements2, Optional<Max35Text>> mmPostingIdentification = new MMMessageAttribute<CorporateActionCashMovements2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCashMovements2.mmObject();
			isDerived = false;
			xmlTag = "PstngId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingIdentification";
			definition = "Posting identification of the cash movement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CorporateActionCashMovements2 obj) {
			return obj.getPostingIdentification();
		}

		@Override
		public void setValue(CorporateActionCashMovements2 obj, Optional<Max35Text> value) {
			obj.setPostingIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PstngDtTm")
	protected DateAndDateTimeChoice postingDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2
	 * CorporateActionCashMovements2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Posting date of the cash movement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionCashMovements2, Optional<DateAndDateTimeChoice>> mmPostingDateTime = new MMMessageAttribute<CorporateActionCashMovements2, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmEntryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCashMovements2.mmObject();
			isDerived = false;
			xmlTag = "PstngDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingDateTime";
			definition = "Posting date of the cash movement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(CorporateActionCashMovements2 obj) {
			return obj.getPostingDateTime();
		}

		@Override
		public void setValue(CorporateActionCashMovements2 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setPostingDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "PstngAmt", required = true)
	protected ActiveCurrencyAndAmount postingAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2
	 * CorporateActionCashMovements2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount posted as a result of the cash movement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionCashMovements2, ActiveCurrencyAndAmount> mmPostingAmount = new MMMessageAttribute<CorporateActionCashMovements2, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCashMovements2.mmObject();
			isDerived = false;
			xmlTag = "PstngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingAmount";
			definition = "Amount posted as a result of the cash movement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CorporateActionCashMovements2 obj) {
			return obj.getPostingAmount();
		}

		@Override
		public void setValue(CorporateActionCashMovements2 obj, ActiveCurrencyAndAmount value) {
			obj.setPostingAmount(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected List<CashAccount19> accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount19
	 * CashAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCashMovements2
	 * CorporateActionCashMovements2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the account which is debited/credited as a result of the movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionCashMovements2, List<CashAccount19>> mmAccountDetails = new MMMessageAssociationEnd<CorporateActionCashMovements2, List<CashAccount19>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionCashMovements2.mmObject();
			isDerived = false;
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Provides information about the account which is debited/credited as a result of the movement.";
			maxOccurs = 2;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount19.mmObject();
		}

		@Override
		public List<CashAccount19> getValue(CorporateActionCashMovements2 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionCashMovements2 obj, List<CashAccount19> value) {
			obj.setAccountDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionCashMovements2.mmPostingIdentification, com.tools20022.repository.msg.CorporateActionCashMovements2.mmPostingDateTime,
						com.tools20022.repository.msg.CorporateActionCashMovements2.mmPostingAmount, com.tools20022.repository.msg.CorporateActionCashMovements2.mmAccountDetails);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCashMovements2";
				definition = "Provides information about the cash movement resulting from the election instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getPostingIdentification() {
		return postingIdentification == null ? Optional.empty() : Optional.of(postingIdentification);
	}

	public CorporateActionCashMovements2 setPostingIdentification(Max35Text postingIdentification) {
		this.postingIdentification = postingIdentification;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getPostingDateTime() {
		return postingDateTime == null ? Optional.empty() : Optional.of(postingDateTime);
	}

	public CorporateActionCashMovements2 setPostingDateTime(DateAndDateTimeChoice postingDateTime) {
		this.postingDateTime = postingDateTime;
		return this;
	}

	public ActiveCurrencyAndAmount getPostingAmount() {
		return postingAmount;
	}

	public CorporateActionCashMovements2 setPostingAmount(ActiveCurrencyAndAmount postingAmount) {
		this.postingAmount = Objects.requireNonNull(postingAmount);
		return this;
	}

	public List<CashAccount19> getAccountDetails() {
		return accountDetails == null ? accountDetails = new ArrayList<>() : accountDetails;
	}

	public CorporateActionCashMovements2 setAccountDetails(List<CashAccount19> accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}
}
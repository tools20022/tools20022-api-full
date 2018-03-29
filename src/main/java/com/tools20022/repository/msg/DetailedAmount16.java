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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DetailedAmount13;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amounts of the deposit transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount16#mmAccountSequenceNumber
 * DetailedAmount16.mmAccountSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount16#mmAmountToDeposit
 * DetailedAmount16.mmAmountToDeposit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#mmCurrency
 * DetailedAmount16.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount16#mmCashBackAmount
 * DetailedAmount16.mmCashBackAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#mmFees
 * DetailedAmount16.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#mmDonation
 * DetailedAmount16.mmDonation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "DetailedAmount16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amounts of the deposit transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17
 * DetailedAmount17}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DetailedAmount12 DetailedAmount12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DetailedAmount16", propOrder = {"accountSequenceNumber", "amountToDeposit", "currency", "cashBackAmount", "fees", "donation"})
public class DetailedAmount16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctSeqNb")
	protected Number accountSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16
	 * DetailedAmount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Link to the account for multi-account deposit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedAmount16, Optional<Number>> mmAccountSequenceNumber = new MMMessageAttribute<DetailedAmount16, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount16.mmObject();
			isDerived = false;
			xmlTag = "AcctSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSequenceNumber";
			definition = "Link to the account for multi-account deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(DetailedAmount16 obj) {
			return obj.getAccountSequenceNumber();
		}

		@Override
		public void setValue(DetailedAmount16 obj, Optional<Number> value) {
			obj.setAccountSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtToDpst")
	protected ImpliedCurrencyAndAmount amountToDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16
	 * DetailedAmount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the deposit to be made on the ATM after the approval of the deposit transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount17#mmAmountToTransfer
	 * DetailedAmount17.mmAmountToTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12#mmAmountToDispense
	 * DetailedAmount12.mmAmountToDispense}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedAmount16, Optional<ImpliedCurrencyAndAmount>> mmAmountToDeposit = new MMMessageAttribute<DetailedAmount16, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount16.mmObject();
			isDerived = false;
			xmlTag = "AmtToDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToDeposit";
			definition = "Amount of the deposit to be made on the ATM after the approval of the deposit transaction.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount17.mmAmountToTransfer);
			previousVersion_lazy = () -> DetailedAmount12.mmAmountToDispense;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(DetailedAmount16 obj) {
			return obj.getAmountToDeposit();
		}

		@Override
		public void setValue(DetailedAmount16 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setAmountToDeposit(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16
	 * DetailedAmount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the amount to deposit when different from the base currency of the ATM."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount17#mmCurrency
	 * DetailedAmount17.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12#mmCurrency
	 * DetailedAmount12.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedAmount16, Optional<ActiveCurrencyCode>> mmCurrency = new MMMessageAttribute<DetailedAmount16, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount16.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the amount to deposit when different from the base currency of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount17.mmCurrency);
			previousVersion_lazy = () -> DetailedAmount12.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(DetailedAmount16 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(DetailedAmount16 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "CshBckAmt")
	protected ImpliedCurrencyAndAmount cashBackAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16
	 * DetailedAmount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshBckAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBackAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cashback amount value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedAmount16, Optional<ImpliedCurrencyAndAmount>> mmCashBackAmount = new MMMessageAttribute<DetailedAmount16, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount16.mmObject();
			isDerived = false;
			xmlTag = "CshBckAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBackAmount";
			definition = "Cashback amount value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(DetailedAmount16 obj) {
			return obj.getCashBackAmount();
		}

		@Override
		public void setValue(DetailedAmount16 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setCashBackAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Fees")
	protected List<DetailedAmount13> fees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount13
	 * DetailedAmount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16
	 * DetailedAmount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposit fees, accepted by the customer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount17#mmFees
	 * DetailedAmount17.mmFees}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12#mmFees
	 * DetailedAmount12.mmFees}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedAmount16, List<DetailedAmount13>> mmFees = new MMMessageAssociationEnd<DetailedAmount16, List<DetailedAmount13>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount16.mmObject();
			isDerived = false;
			xmlTag = "Fees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fees";
			definition = "Deposit fees, accepted by the customer.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount17.mmFees);
			previousVersion_lazy = () -> DetailedAmount12.mmFees;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount13.mmObject();
		}

		@Override
		public List<DetailedAmount13> getValue(DetailedAmount16 obj) {
			return obj.getFees();
		}

		@Override
		public void setValue(DetailedAmount16 obj, List<DetailedAmount13> value) {
			obj.setFees(value);
		}
	};
	@XmlElement(name = "Dontn")
	protected List<DetailedAmount13> donation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount13
	 * DetailedAmount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16
	 * DetailedAmount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dontn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Donation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the donation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount17#mmDonation
	 * DetailedAmount17.mmDonation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12#mmDonation
	 * DetailedAmount12.mmDonation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedAmount16, List<DetailedAmount13>> mmDonation = new MMMessageAssociationEnd<DetailedAmount16, List<DetailedAmount13>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount16.mmObject();
			isDerived = false;
			xmlTag = "Dontn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Donation";
			definition = "Amount of the donation.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount17.mmDonation);
			previousVersion_lazy = () -> DetailedAmount12.mmDonation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount13.mmObject();
		}

		@Override
		public List<DetailedAmount13> getValue(DetailedAmount16 obj) {
			return obj.getDonation();
		}

		@Override
		public void setValue(DetailedAmount16 obj, List<DetailedAmount13> value) {
			obj.setDonation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DetailedAmount16.mmAccountSequenceNumber, com.tools20022.repository.msg.DetailedAmount16.mmAmountToDeposit,
						com.tools20022.repository.msg.DetailedAmount16.mmCurrency, com.tools20022.repository.msg.DetailedAmount16.mmCashBackAmount, com.tools20022.repository.msg.DetailedAmount16.mmFees,
						com.tools20022.repository.msg.DetailedAmount16.mmDonation);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DetailedAmount16";
				definition = "Amounts of the deposit transaction.";
				nextVersions_lazy = () -> Arrays.asList(DetailedAmount17.mmObject());
				previousVersion_lazy = () -> DetailedAmount12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getAccountSequenceNumber() {
		return accountSequenceNumber == null ? Optional.empty() : Optional.of(accountSequenceNumber);
	}

	public DetailedAmount16 setAccountSequenceNumber(Number accountSequenceNumber) {
		this.accountSequenceNumber = accountSequenceNumber;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getAmountToDeposit() {
		return amountToDeposit == null ? Optional.empty() : Optional.of(amountToDeposit);
	}

	public DetailedAmount16 setAmountToDeposit(ImpliedCurrencyAndAmount amountToDeposit) {
		this.amountToDeposit = amountToDeposit;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public DetailedAmount16 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getCashBackAmount() {
		return cashBackAmount == null ? Optional.empty() : Optional.of(cashBackAmount);
	}

	public DetailedAmount16 setCashBackAmount(ImpliedCurrencyAndAmount cashBackAmount) {
		this.cashBackAmount = cashBackAmount;
		return this;
	}

	public List<DetailedAmount13> getFees() {
		return fees == null ? fees = new ArrayList<>() : fees;
	}

	public DetailedAmount16 setFees(List<DetailedAmount13> fees) {
		this.fees = Objects.requireNonNull(fees);
		return this;
	}

	public List<DetailedAmount13> getDonation() {
		return donation == null ? donation = new ArrayList<>() : donation;
	}

	public DetailedAmount16 setDonation(List<DetailedAmount13> donation) {
		this.donation = Objects.requireNonNull(donation);
		return this;
	}
}
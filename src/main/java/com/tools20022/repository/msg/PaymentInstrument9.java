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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.ChequeIssue;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount4;
import com.tools20022.repository.msg.Cheque4;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Instrument that has or represents monetary value and is used to process a
 * payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#CashAccountOrChequeOrBankersDraftRule
 * PaymentInstrument9.CashAccountOrChequeOrBankersDraftRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#mmSettlementCurrency
 * PaymentInstrument9.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#mmCashAccountDetails
 * PaymentInstrument9.mmCashAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#mmChequeDetails
 * PaymentInstrument9.mmChequeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#mmBankersDraftDetails
 * PaymentInstrument9.mmBankersDraftDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstrument9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instrument that has or represents monetary value and is used to process a payment instruction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument10
 * PaymentInstrument10}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstrument9", propOrder = {"settlementCurrency", "cashAccountDetails", "chequeDetails", "bankersDraftDetails"})
public class PaymentInstrument9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmCcy", required = true)
	protected ActiveCurrencyCode settlementCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
	 * Payment.mmCurrencyOfTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9
	 * PaymentInstrument9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with the payment instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstrument9, ActiveCurrencyCode> mmSettlementCurrency = new MMMessageAttribute<PaymentInstrument9, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyOfTransfer;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument9.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency associated with the payment instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(PaymentInstrument9 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(PaymentInstrument9 obj, ActiveCurrencyCode value) {
			obj.setSettlementCurrency(value);
		}
	};
	@XmlElement(name = "CshAcctDtls", required = true)
	protected List<CashAccount4> cashAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount4
	 * CashAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9
	 * PaymentInstrument9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash account to credit for the payment of the dividends or of the redeemed investments funds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstrument9, List<CashAccount4>> mmCashAccountDetails = new MMMessageAssociationEnd<PaymentInstrument9, List<CashAccount4>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument9.mmObject();
			isDerived = false;
			xmlTag = "CshAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountDetails";
			definition = "Cash account to credit for the payment of the dividends or of the redeemed investments funds.";
			maxOccurs = 3;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount4.mmObject();
		}

		@Override
		public List<CashAccount4> getValue(PaymentInstrument9 obj) {
			return obj.getCashAccountDetails();
		}

		@Override
		public void setValue(PaymentInstrument9 obj, List<CashAccount4> value) {
			obj.setCashAccountDetails(value);
		}
	};
	@XmlElement(name = "ChqDtls", required = true)
	protected Cheque4 chequeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque4 Cheque4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9
	 * PaymentInstrument9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement instructions for a payment by cheque."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstrument9, Cheque4> mmChequeDetails = new MMMessageAssociationEnd<PaymentInstrument9, Cheque4>() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument9.mmObject();
			isDerived = false;
			xmlTag = "ChqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeDetails";
			definition = "Settlement instructions for a payment by cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Cheque4.mmObject();
		}

		@Override
		public Cheque4 getValue(PaymentInstrument9 obj) {
			return obj.getChequeDetails();
		}

		@Override
		public void setValue(PaymentInstrument9 obj, Cheque4 value) {
			obj.setChequeDetails(value);
		}
	};
	@XmlElement(name = "BkrsDrftDtls", required = true)
	protected Cheque4 bankersDraftDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque4 Cheque4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9
	 * PaymentInstrument9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkrsDrftDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankersDraftDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement instructions for a payment by draft."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstrument9, Cheque4> mmBankersDraftDetails = new MMMessageAssociationEnd<PaymentInstrument9, Cheque4>() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument9.mmObject();
			isDerived = false;
			xmlTag = "BkrsDrftDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankersDraftDetails";
			definition = "Settlement instructions for a payment by draft.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Cheque4.mmObject();
		}

		@Override
		public Cheque4 getValue(PaymentInstrument9 obj) {
			return obj.getBankersDraftDetails();
		}

		@Override
		public void setValue(PaymentInstrument9 obj, Cheque4 value) {
			obj.setBankersDraftDetails(value);
		}
	};
	/**
	 * At least one occurrence of either CashAccountDetails or ChequeDetails or
	 * BankersDraftDetails must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9
	 * PaymentInstrument9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#mmCashAccountDetails
	 * PaymentInstrument9.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#mmChequeDetails
	 * PaymentInstrument9.mmChequeDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument9#mmBankersDraftDetails
	 * PaymentInstrument9.mmBankersDraftDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountOrChequeOrBankersDraftRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of either CashAccountDetails or ChequeDetails or BankersDraftDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor CashAccountOrChequeOrBankersDraftRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountOrChequeOrBankersDraftRule";
			definition = "At least one occurrence of either CashAccountDetails or ChequeDetails or BankersDraftDetails must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PaymentInstrument9.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstrument9.mmCashAccountDetails, com.tools20022.repository.msg.PaymentInstrument9.mmChequeDetails,
					com.tools20022.repository.msg.PaymentInstrument9.mmBankersDraftDetails);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstrument9.mmSettlementCurrency, com.tools20022.repository.msg.PaymentInstrument9.mmCashAccountDetails,
						com.tools20022.repository.msg.PaymentInstrument9.mmChequeDetails, com.tools20022.repository.msg.PaymentInstrument9.mmBankersDraftDetails);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PaymentInstrument9";
				definition = "Instrument that has or represents monetary value and is used to process a payment instruction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentInstrument10.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstrument9.CashAccountOrChequeOrBankersDraftRule);
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public PaymentInstrument9 setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = Objects.requireNonNull(settlementCurrency);
		return this;
	}

	public List<CashAccount4> getCashAccountDetails() {
		return cashAccountDetails == null ? cashAccountDetails = new ArrayList<>() : cashAccountDetails;
	}

	public PaymentInstrument9 setCashAccountDetails(List<CashAccount4> cashAccountDetails) {
		this.cashAccountDetails = Objects.requireNonNull(cashAccountDetails);
		return this;
	}

	public Cheque4 getChequeDetails() {
		return chequeDetails;
	}

	public PaymentInstrument9 setChequeDetails(Cheque4 chequeDetails) {
		this.chequeDetails = Objects.requireNonNull(chequeDetails);
		return this;
	}

	public Cheque4 getBankersDraftDetails() {
		return bankersDraftDetails;
	}

	public PaymentInstrument9 setBankersDraftDetails(Cheque4 bankersDraftDetails) {
		this.bankersDraftDetails = Objects.requireNonNull(bankersDraftDetails);
		return this;
	}
}
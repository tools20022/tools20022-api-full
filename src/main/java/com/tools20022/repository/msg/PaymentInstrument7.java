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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmPaymentInstrumentRule
 * PaymentInstrument7.mmPaymentInstrumentRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmSettlementCurrency
 * PaymentInstrument7.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmCashAccount
 * PaymentInstrument7.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmCheque
 * PaymentInstrument7.mmCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmPaymentCard
 * PaymentInstrument7.mmPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmDirectDebit
 * PaymentInstrument7.mmDirectDebit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstrument7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instrument that has or represents monetary value and is used to process a payment instruction.\n"
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentInstrument7", propOrder = {"settlementCurrency", "cashAccount", "cheque", "paymentCard", "directDebit"})
public class PaymentInstrument7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode settlementCurrency;
	/**
	 * Currency associated with the payment instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
	 * Payment.mmCurrencyOfTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7
	 * PaymentInstrument7}</li>
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
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyOfTransfer;
			componentContext_lazy = () -> PaymentInstrument7.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency associated with the payment instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashAccount4> cashAccount;
	/**
	 * Cash account to debit for the payment of a subscription or of a savings
	 * plan to an investment fund.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7
	 * PaymentInstrument7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash account to debit for the payment of a subscription or of a savings plan to an investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> PaymentInstrument7.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Cash account to debit for the payment of a subscription or of a savings plan to an investment fund.";
			maxOccurs = 3;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount4.mmObject();
		}
	};
	protected YesNoIndicator cheque;
	/**
	 * Indicates whether the payment is done via cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequePayment ChequePayment}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7
	 * PaymentInstrument7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment is done via cheque."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCheque = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ChequePayment.mmObject();
			componentContext_lazy = () -> PaymentInstrument7.mmObject();
			isDerived = false;
			xmlTag = "Chq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cheque";
			definition = "Indicates whether the payment is done via cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PaymentCard2 paymentCard;
	/**
	 * Settlement instructions for a payment by card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard2
	 * PaymentCard2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7
	 * PaymentInstrument7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement instructions for a payment by card."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentCard = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> PaymentInstrument7.mmObject();
			isDerived = false;
			xmlTag = "PmtCard";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCard";
			definition = "Settlement instructions for a payment by card.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentCard2.mmObject();
		}
	};
	protected DirectDebitMandate3 directDebit;
	/**
	 * Settlement instructions for a payment by direct debit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DirectDebitMandate3
	 * DirectDebitMandate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7
	 * PaymentInstrument7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement instructions for a payment by direct debit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDirectDebit = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebit.mmObject();
			componentContext_lazy = () -> PaymentInstrument7.mmObject();
			isDerived = false;
			xmlTag = "DrctDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebit";
			definition = "Settlement instructions for a payment by direct debit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DirectDebitMandate3.mmObject();
		}
	};
	/**
	 * At least one occurrence of one and only one message element in the list
	 * (CashAccount, Cheque, PaymentCard, DirectDebit) must be present. The
	 * chosen message element may be repeated, if repetitive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7
	 * PaymentInstrument7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmCashAccount
	 * PaymentInstrument7.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmCheque
	 * PaymentInstrument7.mmCheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmPaymentCard
	 * PaymentInstrument7.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument7#mmDirectDebit
	 * PaymentInstrument7.mmDirectDebit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstrumentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one and only one message element in the list (CashAccount, Cheque, PaymentCard, DirectDebit) must be present. The chosen message element may be repeated, if repetitive."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmPaymentInstrumentRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstrumentRule";
			definition = "At least one occurrence of one and only one message element in the list (CashAccount, Cheque, PaymentCard, DirectDebit) must be present. The chosen message element may be repeated, if repetitive.";
			messageComponent_lazy = () -> PaymentInstrument7.mmObject();
			impactedElements_lazy = () -> Arrays.asList(PaymentInstrument7.mmCashAccount, PaymentInstrument7.mmCheque, PaymentInstrument7.mmPaymentCard, PaymentInstrument7.mmDirectDebit);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentInstrument7.mmSettlementCurrency, PaymentInstrument7.mmCashAccount, PaymentInstrument7.mmCheque, PaymentInstrument7.mmPaymentCard, PaymentInstrument7.mmDirectDebit);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PaymentInstrument7";
				definition = "Instrument that has or represents monetary value and is used to process a payment instruction.\n";
				xors_lazy = () -> Arrays.asList(PaymentInstrument7.mmPaymentInstrumentRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttlmCcy", required = true)
	public CurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	@XmlElement(name = "CshAcct", required = true)
	public List<CashAccount4> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<com.tools20022.repository.msg.CashAccount4> cashAccount) {
		this.cashAccount = cashAccount;
	}

	@XmlElement(name = "Chq", required = true)
	public YesNoIndicator getCheque() {
		return cheque;
	}

	public void setCheque(YesNoIndicator cheque) {
		this.cheque = cheque;
	}

	@XmlElement(name = "PmtCard", required = true)
	public PaymentCard2 getPaymentCard() {
		return paymentCard;
	}

	public void setPaymentCard(com.tools20022.repository.msg.PaymentCard2 paymentCard) {
		this.paymentCard = paymentCard;
	}

	@XmlElement(name = "DrctDbt", required = true)
	public DirectDebitMandate3 getDirectDebit() {
		return directDebit;
	}

	public void setDirectDebit(com.tools20022.repository.msg.DirectDebitMandate3 directDebit) {
		this.directDebit = directDebit;
	}
}
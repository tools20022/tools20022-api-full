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
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.ChequeIssue;
import com.tools20022.repository.entity.Payment;
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
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6#mmCashAccountOrCheque
 * PaymentInstrument6.mmCashAccountOrCheque}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6#mmSettlementCurrency
 * PaymentInstrument6.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6#mmCashAccount
 * PaymentInstrument6.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstrument6#mmCheque
 * PaymentInstrument6.mmCheque}</li>
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
 * "PaymentInstrument6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instrument that has or represents monetary value and is used to process a payment instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentInstrument6", propOrder = {"settlementCurrency", "cashAccount", "cheque"})
public class PaymentInstrument6 {

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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6
	 * PaymentInstrument6}</li>
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
			componentContext_lazy = () -> PaymentInstrument6.mmObject();
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
	 * Cash account to credit for the payment of the dividends or of the
	 * redeemed investments funds.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6
	 * PaymentInstrument6}</li>
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
	 * "Cash account to credit for the payment of the dividends or of the redeemed investments funds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> PaymentInstrument6.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Cash account to credit for the payment of the dividends or of the redeemed investments funds.";
			maxOccurs = 3;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount4.mmObject();
		}
	};
	protected Cheque4 cheque;
	/**
	 * Settlement instructions for a payment by cheque.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6
	 * PaymentInstrument6}</li>
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
	 * definition} = "Settlement instructions for a payment by cheque."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCheque = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> PaymentInstrument6.mmObject();
			isDerived = false;
			xmlTag = "Chq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cheque";
			definition = "Settlement instructions for a payment by cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Cheque4.mmObject();
		}
	};
	/**
	 * At least one occurrence of either CashAccount or Cheque must be present,
	 * but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6
	 * PaymentInstrument6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6#mmCashAccount
	 * PaymentInstrument6.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument6#mmCheque
	 * PaymentInstrument6.mmCheque}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountOrCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of either CashAccount or Cheque must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmCashAccountOrCheque = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountOrCheque";
			definition = "At least one occurrence of either CashAccount or Cheque must be present, but not both.";
			messageComponent_lazy = () -> PaymentInstrument6.mmObject();
			impactedElements_lazy = () -> Arrays.asList(PaymentInstrument6.mmCashAccount, PaymentInstrument6.mmCheque);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentInstrument6.mmSettlementCurrency, PaymentInstrument6.mmCashAccount, PaymentInstrument6.mmCheque);
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
				name = "PaymentInstrument6";
				definition = "Instrument that has or represents monetary value and is used to process a payment instruction.";
				xors_lazy = () -> Arrays.asList(PaymentInstrument6.mmCashAccountOrCheque);
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
	public Cheque4 getCheque() {
		return cheque;
	}

	public void setCheque(com.tools20022.repository.msg.Cheque4 cheque) {
		this.cheque = cheque;
	}
}
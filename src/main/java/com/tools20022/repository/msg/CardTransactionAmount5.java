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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amounts of the transaction expressed within the terminal currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#mmTotalAmount
 * CardTransactionAmount5.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#mmCardholderBillingTransactionAmount
 * CardTransactionAmount5.mmCardholderBillingTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5#mmReconciliationTransactionAmount
 * CardTransactionAmount5.mmReconciliationTransactionAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardTransactionAmount5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amounts of the transaction expressed within the terminal currency."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1
 * CardTransactionAmount1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardTransactionAmount5", propOrder = {"totalAmount", "cardholderBillingTransactionAmount", "reconciliationTransactionAmount"})
public class CardTransactionAmount5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount totalAmount;
	/**
	 * Total amount of the transaction.<br>
	 * It corresponds to ISO 8583, field number 4, completed by the field number
	 * 49 for the versions 87 and 93.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5
	 * CardTransactionAmount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the transaction.\r\nIt corresponds to ISO 8583, field number 4, completed by the field number 49 for the versions 87 and 93."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmTotalAmount
	 * CardTransactionAmount1.mmTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> CardTransactionAmount5.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of the transaction.\r\nIt corresponds to ISO 8583, field number 4, completed by the field number 49 for the versions 87 and 93.";
			previousVersion_lazy = () -> CardTransactionAmount1.mmTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected DetailedAmount8 cardholderBillingTransactionAmount;
	/**
	 * Present when cardholder billing currency differs from transaction
	 * currency expressed in TransactionAmount. It may be populated by the
	 * scheme or intermediary processor as normally Acceptor does not know
	 * cardholder billing currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount8
	 * DetailedAmount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
	 * CardPayment.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5
	 * CardTransactionAmount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrBllgTxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderBillingTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Present when cardholder billing currency differs from transaction currency expressed in TransactionAmount. It may be populated by the scheme or intermediary processor as normally Acceptor does not know cardholder billing currency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmCardholderBillingTransactionAmount
	 * CardTransactionAmount1.mmCardholderBillingTransactionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardholderBillingTransactionAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> CardTransactionAmount5.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrBllgTxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderBillingTransactionAmount";
			definition = "Present when cardholder billing currency differs from transaction currency expressed in TransactionAmount. It may be populated by the scheme or intermediary processor as normally Acceptor does not know cardholder billing currency.";
			previousVersion_lazy = () -> CardTransactionAmount1.mmCardholderBillingTransactionAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount8.mmObject();
		}
	};
	protected DetailedAmount8 reconciliationTransactionAmount;
	/**
	 * Only present within financial transactions when reconciliation currency
	 * differs from transaction currency. It may be populated by acquirers in
	 * the request or by the schemes in the responses, depending where the
	 * reconciliation point is located.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount8
	 * DetailedAmount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
	 * CardPayment.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount5
	 * CardTransactionAmount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnTxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only present within financial transactions when reconciliation currency differs from transaction currency. It may be populated by acquirers in the request or by the schemes in the responses, depending where the reconciliation point is located."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciliationTransactionAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> CardTransactionAmount5.mmObject();
			isDerived = false;
			xmlTag = "RcncltnTxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationTransactionAmount";
			definition = "Only present within financial transactions when reconciliation currency differs from transaction currency. It may be populated by acquirers in the request or by the schemes in the responses, depending where the reconciliation point is located.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount8.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardTransactionAmount5.mmTotalAmount, CardTransactionAmount5.mmCardholderBillingTransactionAmount, CardTransactionAmount5.mmReconciliationTransactionAmount);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionAmount5";
				definition = "Amounts of the transaction expressed within the terminal currency.";
				previousVersion_lazy = () -> CardTransactionAmount1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TtlAmt", required = true)
	public CurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(CurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
	}

	@XmlElement(name = "CrdhldrBllgTxAmt")
	public DetailedAmount8 getCardholderBillingTransactionAmount() {
		return cardholderBillingTransactionAmount;
	}

	public void setCardholderBillingTransactionAmount(com.tools20022.repository.msg.DetailedAmount8 cardholderBillingTransactionAmount) {
		this.cardholderBillingTransactionAmount = cardholderBillingTransactionAmount;
	}

	@XmlElement(name = "RcncltnTxAmt")
	public DetailedAmount8 getReconciliationTransactionAmount() {
		return reconciliationTransactionAmount;
	}

	public void setReconciliationTransactionAmount(com.tools20022.repository.msg.DetailedAmount8 reconciliationTransactionAmount) {
		this.reconciliationTransactionAmount = reconciliationTransactionAmount;
	}
}
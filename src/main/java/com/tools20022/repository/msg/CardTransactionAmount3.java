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
import com.tools20022.repository.codeset.TypeOfAmount1Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmTotalAmount
 * CardTransactionAmount3.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmAmountQualifier
 * CardTransactionAmount3.mmAmountQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmCardholderBillingTransactionAmount
 * CardTransactionAmount3.mmCardholderBillingTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmReconciliationTransactionAmount
 * CardTransactionAmount3.mmReconciliationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3#mmDetailedAmount
 * CardTransactionAmount3.mmDetailedAmount}</li>
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
 * "CardTransactionAmount3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amounts of the transaction expressed within the terminal currency."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1
 * CardTransactionAmount1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransactionAmount3", propOrder = {"totalAmount", "amountQualifier", "cardholderBillingTransactionAmount", "reconciliationTransactionAmount", "detailedAmount"})
public class CardTransactionAmount3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlAmt", required = true)
	protected CurrencyAndAmount totalAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3
	 * CardTransactionAmount3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionAmount3.mmObject();
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
	@XmlElement(name = "AmtQlfr")
	protected TypeOfAmount1Code amountQualifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code
	 * TypeOfAmount1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmAmountQualifier
	 * CardPayment.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3
	 * CardTransactionAmount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtQlfr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountQualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the amount of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmAmountQualifier
	 * CardTransactionAmount1.mmAmountQualifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountQualifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmAmountQualifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionAmount3.mmObject();
			isDerived = false;
			xmlTag = "AmtQlfr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountQualifier";
			definition = "Qualifies the amount of the transaction.";
			previousVersion_lazy = () -> CardTransactionAmount1.mmAmountQualifier;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfAmount1Code.mmObject();
		}
	};
	@XmlElement(name = "CrdhldrBllgTxAmt")
	protected DetailedAmount8 cardholderBillingTransactionAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3
	 * CardTransactionAmount3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionAmount3.mmObject();
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
	@XmlElement(name = "RcncltnTxAmt")
	protected DetailedAmount8 reconciliationTransactionAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3
	 * CardTransactionAmount3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionAmount3.mmObject();
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
	@XmlElement(name = "DtldAmt")
	protected List<com.tools20022.repository.msg.DetailedAmount9> detailedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount9
	 * DetailedAmount9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
	 * CardPayment.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount3
	 * CardTransactionAmount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the transaction amount, for informational purpose, for instance to be included within cardholder statement.\r\nIt corresponds partially to ISO 8583, field number 54."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionAmount1#mmDetailedAmount
	 * CardTransactionAmount1.mmDetailedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDetailedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionAmount3.mmObject();
			isDerived = false;
			xmlTag = "DtldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedAmount";
			definition = "Details of the transaction amount, for informational purpose, for instance to be included within cardholder statement.\r\nIt corresponds partially to ISO 8583, field number 54.";
			previousVersion_lazy = () -> CardTransactionAmount1.mmDetailedAmount;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransactionAmount3.mmTotalAmount, com.tools20022.repository.msg.CardTransactionAmount3.mmAmountQualifier,
						com.tools20022.repository.msg.CardTransactionAmount3.mmCardholderBillingTransactionAmount, com.tools20022.repository.msg.CardTransactionAmount3.mmReconciliationTransactionAmount,
						com.tools20022.repository.msg.CardTransactionAmount3.mmDetailedAmount);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionAmount3";
				definition = "Amounts of the transaction expressed within the terminal currency.";
				previousVersion_lazy = () -> CardTransactionAmount1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public CardTransactionAmount3 setTotalAmount(CurrencyAndAmount totalAmount) {
		this.totalAmount = Objects.requireNonNull(totalAmount);
		return this;
	}

	public Optional<TypeOfAmount1Code> getAmountQualifier() {
		return amountQualifier == null ? Optional.empty() : Optional.of(amountQualifier);
	}

	public CardTransactionAmount3 setAmountQualifier(TypeOfAmount1Code amountQualifier) {
		this.amountQualifier = amountQualifier;
		return this;
	}

	public Optional<DetailedAmount8> getCardholderBillingTransactionAmount() {
		return cardholderBillingTransactionAmount == null ? Optional.empty() : Optional.of(cardholderBillingTransactionAmount);
	}

	public CardTransactionAmount3 setCardholderBillingTransactionAmount(com.tools20022.repository.msg.DetailedAmount8 cardholderBillingTransactionAmount) {
		this.cardholderBillingTransactionAmount = cardholderBillingTransactionAmount;
		return this;
	}

	public Optional<DetailedAmount8> getReconciliationTransactionAmount() {
		return reconciliationTransactionAmount == null ? Optional.empty() : Optional.of(reconciliationTransactionAmount);
	}

	public CardTransactionAmount3 setReconciliationTransactionAmount(com.tools20022.repository.msg.DetailedAmount8 reconciliationTransactionAmount) {
		this.reconciliationTransactionAmount = reconciliationTransactionAmount;
		return this;
	}

	public List<DetailedAmount9> getDetailedAmount() {
		return detailedAmount == null ? detailedAmount = new ArrayList<>() : detailedAmount;
	}

	public CardTransactionAmount3 setDetailedAmount(List<com.tools20022.repository.msg.DetailedAmount9> detailedAmount) {
		this.detailedAmount = Objects.requireNonNull(detailedAmount);
		return this;
	}
}
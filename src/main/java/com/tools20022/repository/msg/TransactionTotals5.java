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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Total of credit or debit transactions
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals5#mmAmount
 * TransactionTotals5.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionTotals5#mmNumber
 * TransactionTotals5.mmNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals5#mmChargeBackAmount
 * TransactionTotals5.mmChargeBackAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals5#mmChargeBackNumber
 * TransactionTotals5.mmChargeBackNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals5#mmReversalAmount
 * TransactionTotals5.mmReversalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals5#mmReversalNumber
 * TransactionTotals5.mmReversalNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionTotals5#mmFeeAmounts
 * TransactionTotals5.mmFeeAmounts}</li>
 * </ul>
 * </li>
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
 * "TransactionTotals5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Total of credit or debit transactions"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionTotals4
 * TransactionTotals4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionTotals5", propOrder = {"amount", "number", "chargeBackAmount", "chargeBackNumber", "reversalAmount", "reversalNumber", "feeAmounts"})
public class TransactionTotals5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ImpliedCurrencyAndAmount amount;
	/**
	 * Cumulative amount of all financial transactions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals5
	 * TransactionTotals5}</li>
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
	 * definition} = "Cumulative amount of all financial transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionTotals5.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Cumulative amount of all financial transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected Number number;
	/**
	 * Number of all financial transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals5
	 * TransactionTotals5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of all financial transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionTotals5.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Number of all financial transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount chargeBackAmount;
	/**
	 * Cumulative amount of all chargeback transactions exclusive of any fees.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals5
	 * TransactionTotals5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBckAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBackAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cumulative amount of all chargeback transactions exclusive of any fees."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeBackAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionTotals5.mmObject();
			isDerived = false;
			xmlTag = "ChrgBckAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBackAmount";
			definition = "Cumulative amount of all chargeback transactions exclusive of any fees.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected Number chargeBackNumber;
	/**
	 * Total number of chargeback transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals5
	 * TransactionTotals5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBckNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBackNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of chargeback transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeBackNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionTotals5.mmObject();
			isDerived = false;
			xmlTag = "ChrgBckNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBackNumber";
			definition = "Total number of chargeback transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount reversalAmount;
	/**
	 * Cumulative amount of all reversal transactions exclusive of any fees.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals5
	 * TransactionTotals5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cumulative amount of all reversal transactions exclusive of any fees."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionTotals5.mmObject();
			isDerived = false;
			xmlTag = "RvslAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalAmount";
			definition = "Cumulative amount of all reversal transactions exclusive of any fees.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected Number reversalNumber;
	/**
	 * Total number of reversal transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals5
	 * TransactionTotals5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of reversal transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversalNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionTotals5.mmObject();
			isDerived = false;
			xmlTag = "RvslNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalNumber";
			definition = "Total number of reversal transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount feeAmounts;
	/**
	 * Sum amount of all fees.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals5
	 * TransactionTotals5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FeeAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum amount of all fees."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFeeAmounts = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionTotals5.mmObject();
			isDerived = false;
			xmlTag = "FeeAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeAmounts";
			definition = "Sum amount of all fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionTotals5.mmAmount, TransactionTotals5.mmNumber, TransactionTotals5.mmChargeBackAmount, TransactionTotals5.mmChargeBackNumber, TransactionTotals5.mmReversalAmount,
						TransactionTotals5.mmReversalNumber, TransactionTotals5.mmFeeAmounts);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionTotals5";
				definition = "Total of credit or debit transactions";
				previousVersion_lazy = () -> TransactionTotals4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Amt", required = true)
	public ImpliedCurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(ImpliedCurrencyAndAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "Nb", required = true)
	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	@XmlElement(name = "ChrgBckAmt", required = true)
	public ImpliedCurrencyAndAmount getChargeBackAmount() {
		return chargeBackAmount;
	}

	public void setChargeBackAmount(ImpliedCurrencyAndAmount chargeBackAmount) {
		this.chargeBackAmount = chargeBackAmount;
	}

	@XmlElement(name = "ChrgBckNb", required = true)
	public Number getChargeBackNumber() {
		return chargeBackNumber;
	}

	public void setChargeBackNumber(Number chargeBackNumber) {
		this.chargeBackNumber = chargeBackNumber;
	}

	@XmlElement(name = "RvslAmt", required = true)
	public ImpliedCurrencyAndAmount getReversalAmount() {
		return reversalAmount;
	}

	public void setReversalAmount(ImpliedCurrencyAndAmount reversalAmount) {
		this.reversalAmount = reversalAmount;
	}

	@XmlElement(name = "RvslNb", required = true)
	public Number getReversalNumber() {
		return reversalNumber;
	}

	public void setReversalNumber(Number reversalNumber) {
		this.reversalNumber = reversalNumber;
	}

	@XmlElement(name = "FeeAmts")
	public ImpliedCurrencyAndAmount getFeeAmounts() {
		return feeAmounts;
	}

	public void setFeeAmounts(ImpliedCurrencyAndAmount feeAmounts) {
		this.feeAmounts = feeAmounts;
	}
}
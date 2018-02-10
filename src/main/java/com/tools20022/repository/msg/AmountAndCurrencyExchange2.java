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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.CorporateActionDistribution;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements providing information on the original amount and currency
 * information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmInstructedAmount
 * AmountAndCurrencyExchange2.mmInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmTransactionAmount
 * AmountAndCurrencyExchange2.mmTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmCounterValueAmount
 * AmountAndCurrencyExchange2.mmCounterValueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmAnnouncedPostingAmount
 * AmountAndCurrencyExchange2.mmAnnouncedPostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmProprietaryAmount
 * AmountAndCurrencyExchange2.mmProprietaryAmount}</li>
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
 * "AmountAndCurrencyExchange2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements providing information on the original amount and currency information."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountAndCurrencyExchange2", propOrder = {"instructedAmount", "transactionAmount", "counterValueAmount", "announcedPostingAmount", "proprietaryAmount"})
public class AmountAndCurrencyExchange2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstdAmt")
	protected AmountAndCurrencyExchangeDetails1 instructedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1
	 * AmountAndCurrencyExchangeDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2
	 * AmountAndCurrencyExchange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party and provides currency exchange info in case the instructed amount and/or currency is/are different from the entry amount and/or currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Identifies the amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party and provides currency exchange info in case the instructed amount and/or currency is/are different from the entry amount and/or currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1.mmObject();
		}
	};
	@XmlElement(name = "TxAmt")
	protected AmountAndCurrencyExchangeDetails1 transactionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1
	 * AmountAndCurrencyExchangeDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
	 * CurrencyExchange.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2
	 * AmountAndCurrencyExchange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmObject();
			isDerived = false;
			xmlTag = "TxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmount";
			definition = "Amount of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1.mmObject();
		}
	};
	@XmlElement(name = "CntrValAmt")
	protected AmountAndCurrencyExchangeDetails1 counterValueAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1
	 * AmountAndCurrencyExchangeDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmResultingAmount
	 * CurrencyExchange.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2
	 * AmountAndCurrencyExchange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrValAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterValueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the countervalue amount and provides currency exchange information. Either the counter amount quoted in an FX deal, or the result of the currency information applied to an instructed amount, before deduction of charges."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterValueAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmResultingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmObject();
			isDerived = false;
			xmlTag = "CntrValAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterValueAmount";
			definition = "Identifies the countervalue amount and provides currency exchange information. Either the counter amount quoted in an FX deal, or the result of the currency information applied to an instructed amount, before deduction of charges.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1.mmObject();
		}
	};
	@XmlElement(name = "AnncdPstngAmt")
	protected AmountAndCurrencyExchangeDetails1 announcedPostingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1
	 * AmountAndCurrencyExchangeDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingAmount
	 * CorporateActionDistribution.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2
	 * AmountAndCurrencyExchange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncdPstngAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncedPostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the amount of money, based on terms of corporate action event and balance of underlying securities, entitled to/from the account owner.\n\nAmount of money, based on terms of corporate action event and balance of underlying securities, entitled to/from the account owner.\nIn those situations, this amount may alternatively be called entitled amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAnnouncedPostingAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmPostingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmObject();
			isDerived = false;
			xmlTag = "AnncdPstngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncedPostingAmount";
			definition = "Information on the amount of money, based on terms of corporate action event and balance of underlying securities, entitled to/from the account owner.\n\nAmount of money, based on terms of corporate action event and balance of underlying securities, entitled to/from the account owner.\nIn those situations, this amount may alternatively be called entitled amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1.mmObject();
		}
	};
	@XmlElement(name = "PrtryAmt")
	protected List<com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2> proprietaryAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2
	 * AmountAndCurrencyExchangeDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2
	 * AmountAndCurrencyExchange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides proprietary amount information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryAmount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmObject();
			isDerived = false;
			xmlTag = "PrtryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryAmount";
			definition = "Provides proprietary amount information.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmInstructedAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmTransactionAmount,
						com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmCounterValueAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmAnnouncedPostingAmount,
						com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmProprietaryAmount);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountAndCurrencyExchange2";
				definition = "Set of elements providing information on the original amount and currency information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndCurrencyExchangeDetails1> getInstructedAmount() {
		return instructedAmount == null ? Optional.empty() : Optional.of(instructedAmount);
	}

	public AmountAndCurrencyExchange2 setInstructedAmount(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1 instructedAmount) {
		this.instructedAmount = instructedAmount;
		return this;
	}

	public Optional<AmountAndCurrencyExchangeDetails1> getTransactionAmount() {
		return transactionAmount == null ? Optional.empty() : Optional.of(transactionAmount);
	}

	public AmountAndCurrencyExchange2 setTransactionAmount(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1 transactionAmount) {
		this.transactionAmount = transactionAmount;
		return this;
	}

	public Optional<AmountAndCurrencyExchangeDetails1> getCounterValueAmount() {
		return counterValueAmount == null ? Optional.empty() : Optional.of(counterValueAmount);
	}

	public AmountAndCurrencyExchange2 setCounterValueAmount(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1 counterValueAmount) {
		this.counterValueAmount = counterValueAmount;
		return this;
	}

	public Optional<AmountAndCurrencyExchangeDetails1> getAnnouncedPostingAmount() {
		return announcedPostingAmount == null ? Optional.empty() : Optional.of(announcedPostingAmount);
	}

	public AmountAndCurrencyExchange2 setAnnouncedPostingAmount(com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails1 announcedPostingAmount) {
		this.announcedPostingAmount = announcedPostingAmount;
		return this;
	}

	public List<AmountAndCurrencyExchangeDetails2> getProprietaryAmount() {
		return proprietaryAmount == null ? proprietaryAmount = new ArrayList<>() : proprietaryAmount;
	}

	public AmountAndCurrencyExchange2 setProprietaryAmount(List<com.tools20022.repository.msg.AmountAndCurrencyExchangeDetails2> proprietaryAmount) {
		this.proprietaryAmount = Objects.requireNonNull(proprietaryAmount);
		return this;
	}
}
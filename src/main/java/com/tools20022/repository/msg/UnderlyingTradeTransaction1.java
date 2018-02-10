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
import com.tools20022.repository.choice.UnderlyingTradeTransactionType1Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.UnderlyingTransaction;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1#mmType
 * UnderlyingTradeTransaction1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1#mmIdentification
 * UnderlyingTradeTransaction1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1#mmTransactionDate
 * UnderlyingTradeTransaction1.mmTransactionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1#mmTenderClosingDate
 * UnderlyingTradeTransaction1.mmTenderClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1#mmTransactionAmount
 * UnderlyingTradeTransaction1.mmTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1#mmContractAmountPercentage
 * UnderlyingTradeTransaction1.mmContractAmountPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1#mmAdditionalInformation
 * UnderlyingTradeTransaction1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
 * UnderlyingTransaction}</li>
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
 * "UnderlyingTradeTransaction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingTradeTransaction1", propOrder = {"type", "identification", "transactionDate", "tenderClosingDate", "transactionAmount", "contractAmountPercentage", "additionalInformation"})
public class UnderlyingTradeTransaction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected UnderlyingTradeTransactionType1Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTradeTransactionType1Choice
	 * UnderlyingTradeTransactionType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmType
	 * UnderlyingTransaction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1
	 * UnderlyingTradeTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of underlying transaction such as a tender, order, contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UnderlyingTransaction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of underlying transaction such as a tender, order, contract.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTradeTransactionType1Choice.mmObject();
		}
	};
	@XmlElement(name = "Id")
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmIdentification
	 * UnderlyingTransaction.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1
	 * UnderlyingTradeTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UnderlyingTransaction.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TxDt")
	protected ISODate transactionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmIssueDate
	 * UnderlyingTransaction.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1
	 * UnderlyingTradeTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the underlying transaction was issued or awarded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UnderlyingTransaction.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TxDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDate";
			definition = "Date the underlying transaction was issued or awarded.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "TndrClsgDt")
	protected ISODate tenderClosingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmTenderClosingDate
	 * UnderlyingTransaction.mmTenderClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1
	 * UnderlyingTradeTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TndrClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the tender closes."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTenderClosingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UnderlyingTransaction.mmTenderClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TndrClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderClosingDate";
			definition = "Date the tender closes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "TxAmt")
	protected ActiveCurrencyAndAmount transactionAmount;
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
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmTotalAmount
	 * UnderlyingTransaction.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1
	 * UnderlyingTradeTransaction1}</li>
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
	public static final MMMessageAttribute mmTransactionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UnderlyingTransaction.mmTotalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmount";
			definition = "Amount of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "CtrctAmtPctg")
	protected PercentageRate contractAmountPercentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmContractAmountPercentage
	 * UnderlyingTransaction.mmContractAmountPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1
	 * UnderlyingTradeTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctAmtPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractAmountPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying contract covered by the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractAmountPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UnderlyingTransaction.mmContractAmountPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmObject();
			isDerived = false;
			xmlTag = "CtrctAmtPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractAmountPercentage";
			definition = "Percentage of the underlying contract covered by the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<Max2000Text> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTradeTransaction1
	 * UnderlyingTradeTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the underlying transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the underlying transaction.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmType, com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmIdentification,
						com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmTransactionDate, com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmTenderClosingDate,
						com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmTransactionAmount, com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmContractAmountPercentage,
						com.tools20022.repository.msg.UnderlyingTradeTransaction1.mmAdditionalInformation);
				trace_lazy = () -> UnderlyingTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTradeTransaction1";
				definition = "Information about a transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public UnderlyingTradeTransactionType1Choice getType() {
		return type;
	}

	public UnderlyingTradeTransaction1 setType(UnderlyingTradeTransactionType1Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<Max35Text> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public UnderlyingTradeTransaction1 setIdentification(Max35Text identification) {
		this.identification = identification;
		return this;
	}

	public Optional<ISODate> getTransactionDate() {
		return transactionDate == null ? Optional.empty() : Optional.of(transactionDate);
	}

	public UnderlyingTradeTransaction1 setTransactionDate(ISODate transactionDate) {
		this.transactionDate = transactionDate;
		return this;
	}

	public Optional<ISODate> getTenderClosingDate() {
		return tenderClosingDate == null ? Optional.empty() : Optional.of(tenderClosingDate);
	}

	public UnderlyingTradeTransaction1 setTenderClosingDate(ISODate tenderClosingDate) {
		this.tenderClosingDate = tenderClosingDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTransactionAmount() {
		return transactionAmount == null ? Optional.empty() : Optional.of(transactionAmount);
	}

	public UnderlyingTradeTransaction1 setTransactionAmount(ActiveCurrencyAndAmount transactionAmount) {
		this.transactionAmount = transactionAmount;
		return this;
	}

	public Optional<PercentageRate> getContractAmountPercentage() {
		return contractAmountPercentage == null ? Optional.empty() : Optional.of(contractAmountPercentage);
	}

	public UnderlyingTradeTransaction1 setContractAmountPercentage(PercentageRate contractAmountPercentage) {
		this.contractAmountPercentage = contractAmountPercentage;
		return this;
	}

	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public UnderlyingTradeTransaction1 setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}
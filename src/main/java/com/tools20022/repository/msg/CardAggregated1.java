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
import com.tools20022.repository.choice.DateOrDateTimePeriodChoice;
import com.tools20022.repository.codeset.CardPaymentServiceType2Code;
import com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardSequenceNumberRange1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Globalised card transaction entry details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAggregated1#mmAdditionalService
 * CardAggregated1.mmAdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAggregated1#mmTransactionCategory
 * CardAggregated1.mmTransactionCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAggregated1#mmSaleReconciliationIdentification
 * CardAggregated1.mmSaleReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAggregated1#mmSequenceNumberRange
 * CardAggregated1.mmSequenceNumberRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAggregated1#mmTransactionDateRange
 * CardAggregated1.mmTransactionDateRange}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardAggregated1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Globalised card transaction entry details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardAggregated2
 * CardAggregated2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardAggregated1", propOrder = {"additionalService", "transactionCategory", "saleReconciliationIdentification", "sequenceNumberRange", "transactionDateRange"})
public class CardAggregated1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlSvc")
	protected CardPaymentServiceType2Code additionalService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSvc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service in addition to the main service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated2#mmAdditionalService
	 * CardAggregated2.mmAdditionalService}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAggregated1, Optional<CardPaymentServiceType2Code>> mmAdditionalService = new MMMessageAttribute<CardAggregated1, Optional<CardPaymentServiceType2Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAggregated1.mmObject();
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service.";
			nextVersions_lazy = () -> Arrays.asList(CardAggregated2.mmAdditionalService);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}

		@Override
		public Optional<CardPaymentServiceType2Code> getValue(CardAggregated1 obj) {
			return obj.getAdditionalService();
		}

		@Override
		public void setValue(CardAggregated1 obj, Optional<CardPaymentServiceType2Code> value) {
			obj.setAdditionalService(value.orElse(null));
		}
	};
	@XmlElement(name = "TxCtgy")
	protected ExternalCardTransactionCategory1Code transactionCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code
	 * ExternalCardTransactionCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmType
	 * Payment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCtgy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated2#mmTransactionCategory
	 * CardAggregated2.mmTransactionCategory}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAggregated1, Optional<ExternalCardTransactionCategory1Code>> mmTransactionCategory = new MMMessageAttribute<CardAggregated1, Optional<ExternalCardTransactionCategory1Code>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAggregated1.mmObject();
			isDerived = false;
			xmlTag = "TxCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCategory";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardAggregated2.mmTransactionCategory);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalCardTransactionCategory1Code.mmObject();
		}

		@Override
		public Optional<ExternalCardTransactionCategory1Code> getValue(CardAggregated1 obj) {
			return obj.getTransactionCategory();
		}

		@Override
		public void setValue(CardAggregated1 obj, Optional<ExternalCardTransactionCategory1Code> value) {
			obj.setTransactionCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "SaleRcncltnId")
	protected Max35Text saleReconciliationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRcncltnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the sales reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated2#mmSaleReconciliationIdentification
	 * CardAggregated2.mmSaleReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardAggregated1, Optional<Max35Text>> mmSaleReconciliationIdentification = new MMMessageAttribute<CardAggregated1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAggregated1.mmObject();
			isDerived = false;
			xmlTag = "SaleRcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReconciliationIdentification";
			definition = "Unique identification of the sales reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			nextVersions_lazy = () -> Arrays.asList(CardAggregated2.mmSaleReconciliationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardAggregated1 obj) {
			return obj.getSaleReconciliationIdentification();
		}

		@Override
		public void setValue(CardAggregated1 obj, Optional<Max35Text> value) {
			obj.setSaleReconciliationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqNbRg")
	protected CardSequenceNumberRange1 sequenceNumberRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardSequenceNumberRange1
	 * CardSequenceNumberRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNbRg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumberRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of sequence numbers on which the globalisation applies."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated2#mmSequenceNumberRange
	 * CardAggregated2.mmSequenceNumberRange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAggregated1, Optional<CardSequenceNumberRange1>> mmSequenceNumberRange = new MMMessageAssociationEnd<CardAggregated1, Optional<CardSequenceNumberRange1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAggregated1.mmObject();
			isDerived = false;
			xmlTag = "SeqNbRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumberRange";
			definition = "Range of sequence numbers on which the globalisation applies.";
			nextVersions_lazy = () -> Arrays.asList(CardAggregated2.mmSequenceNumberRange);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardSequenceNumberRange1.mmObject();
		}

		@Override
		public Optional<CardSequenceNumberRange1> getValue(CardAggregated1 obj) {
			return obj.getSequenceNumberRange();
		}

		@Override
		public void setValue(CardAggregated1 obj, Optional<CardSequenceNumberRange1> value) {
			obj.setSequenceNumberRange(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtRg")
	protected DateOrDateTimePeriodChoice transactionDateRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice
	 * DateOrDateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtRg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDateRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date range on which the globalisation applies."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAggregated2#mmTransactionDateRange
	 * CardAggregated2.mmTransactionDateRange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardAggregated1, Optional<DateOrDateTimePeriodChoice>> mmTransactionDateRange = new MMMessageAssociationEnd<CardAggregated1, Optional<DateOrDateTimePeriodChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardAggregated1.mmObject();
			isDerived = false;
			xmlTag = "TxDtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDateRange";
			definition = "Date range on which the globalisation applies.";
			nextVersions_lazy = () -> Arrays.asList(CardAggregated2.mmTransactionDateRange);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateOrDateTimePeriodChoice> getValue(CardAggregated1 obj) {
			return obj.getTransactionDateRange();
		}

		@Override
		public void setValue(CardAggregated1 obj, Optional<DateOrDateTimePeriodChoice> value) {
			obj.setTransactionDateRange(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardAggregated1.mmAdditionalService, com.tools20022.repository.msg.CardAggregated1.mmTransactionCategory,
						com.tools20022.repository.msg.CardAggregated1.mmSaleReconciliationIdentification, com.tools20022.repository.msg.CardAggregated1.mmSequenceNumberRange,
						com.tools20022.repository.msg.CardAggregated1.mmTransactionDateRange);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardAggregated1";
				definition = "Globalised card transaction entry details.";
				nextVersions_lazy = () -> Arrays.asList(CardAggregated2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CardPaymentServiceType2Code> getAdditionalService() {
		return additionalService == null ? Optional.empty() : Optional.of(additionalService);
	}

	public CardAggregated1 setAdditionalService(CardPaymentServiceType2Code additionalService) {
		this.additionalService = additionalService;
		return this;
	}

	public Optional<ExternalCardTransactionCategory1Code> getTransactionCategory() {
		return transactionCategory == null ? Optional.empty() : Optional.of(transactionCategory);
	}

	public CardAggregated1 setTransactionCategory(ExternalCardTransactionCategory1Code transactionCategory) {
		this.transactionCategory = transactionCategory;
		return this;
	}

	public Optional<Max35Text> getSaleReconciliationIdentification() {
		return saleReconciliationIdentification == null ? Optional.empty() : Optional.of(saleReconciliationIdentification);
	}

	public CardAggregated1 setSaleReconciliationIdentification(Max35Text saleReconciliationIdentification) {
		this.saleReconciliationIdentification = saleReconciliationIdentification;
		return this;
	}

	public Optional<CardSequenceNumberRange1> getSequenceNumberRange() {
		return sequenceNumberRange == null ? Optional.empty() : Optional.of(sequenceNumberRange);
	}

	public CardAggregated1 setSequenceNumberRange(CardSequenceNumberRange1 sequenceNumberRange) {
		this.sequenceNumberRange = sequenceNumberRange;
		return this;
	}

	public Optional<DateOrDateTimePeriodChoice> getTransactionDateRange() {
		return transactionDateRange == null ? Optional.empty() : Optional.of(transactionDateRange);
	}

	public CardAggregated1 setTransactionDateRange(DateOrDateTimePeriodChoice transactionDateRange) {
		this.transactionDateRange = transactionDateRange;
		return this;
	}
}
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
import com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Result of the captured set of transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2#mmDataSetIdentification
 * CardPaymentDataSet2.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2#mmDataSetResult
 * CardPaymentDataSet2.mmDataSetResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2#mmRemoveDataSet
 * CardPaymentDataSet2.mmRemoveDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2#mmDataSetInitiator
 * CardPaymentDataSet2.mmDataSetInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2#mmTransactionTotals
 * CardPaymentDataSet2.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2#mmRejectedTransaction
 * CardPaymentDataSet2.mmRejectedTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01#mmDataSet
 * AcceptorBatchTransferResponseV01.mmDataSet}</li>
 * </ul>
 * </li>
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
 * "CardPaymentDataSet2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of the captured set of transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSet5
 * CardPaymentDataSet5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSet2", propOrder = {"dataSetIdentification", "dataSetResult", "removeDataSet", "dataSetInitiator", "transactionTotals", "rejectedTransaction"})
public class CardPaymentDataSet2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetId", required = true)
	protected DataSetIdentification1 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification1
	 * DataSetIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2
	 * CardPaymentDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the data set."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet2.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identification of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DataSetIdentification1.mmObject();
		}
	};
	@XmlElement(name = "DataSetRslt", required = true)
	protected ResponseType1 dataSetResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType1
	 * ResponseType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2
	 * CardPaymentDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the data set capture."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet2.mmObject();
			isDerived = false;
			xmlTag = "DataSetRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetResult";
			definition = "Result of the data set capture.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType1.mmObject();
		}
	};
	@XmlElement(name = "RmvDataSet", required = true)
	protected TrueFalseIndicator removeDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2
	 * CardPaymentDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmvDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemoveDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the data set must be removed from the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemoveDataSet = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet2.mmObject();
			isDerived = false;
			xmlTag = "RmvDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoveDataSet";
			definition = "Indicates if the data set must be removed from the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "DataSetInitr")
	protected GenericIdentification32 dataSetInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2
	 * CardPaymentDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetInitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initiator of the data set."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetInitiator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet2.mmObject();
			isDerived = false;
			xmlTag = "DataSetInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetInitiator";
			definition = "Initiator of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification32.mmObject();
		}
	};
	@XmlElement(name = "TxTtls", required = true)
	protected List<com.tools20022.repository.msg.TransactionTotals1> transactionTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals1
	 * TransactionTotals1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2
	 * CardPaymentDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction totals of the batch."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionTotals = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet2.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Transaction totals of the batch.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionTotals1.mmObject();
		}
	};
	@XmlElement(name = "RjctdTx")
	protected List<com.tools20022.repository.msg.CardPaymentDataSet3> rejectedTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentDataSet3
	 * CardPaymentDataSet3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2
	 * CardPaymentDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction in the batch, whose capture has been rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejectedTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet2.mmObject();
			isDerived = false;
			xmlTag = "RjctdTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedTransaction";
			definition = "Transaction in the batch, whose capture has been rejected.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentDataSet2.mmDataSetIdentification, com.tools20022.repository.msg.CardPaymentDataSet2.mmDataSetResult,
						com.tools20022.repository.msg.CardPaymentDataSet2.mmRemoveDataSet, com.tools20022.repository.msg.CardPaymentDataSet2.mmDataSetInitiator, com.tools20022.repository.msg.CardPaymentDataSet2.mmTransactionTotals,
						com.tools20022.repository.msg.CardPaymentDataSet2.mmRejectedTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorBatchTransferResponseV01.mmDataSet);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSet2";
				definition = "Result of the captured set of transactions.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DataSetIdentification1 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public CardPaymentDataSet2 setDataSetIdentification(com.tools20022.repository.msg.DataSetIdentification1 dataSetIdentification) {
		this.dataSetIdentification = Objects.requireNonNull(dataSetIdentification);
		return this;
	}

	public ResponseType1 getDataSetResult() {
		return dataSetResult;
	}

	public CardPaymentDataSet2 setDataSetResult(com.tools20022.repository.msg.ResponseType1 dataSetResult) {
		this.dataSetResult = Objects.requireNonNull(dataSetResult);
		return this;
	}

	public TrueFalseIndicator getRemoveDataSet() {
		return removeDataSet;
	}

	public CardPaymentDataSet2 setRemoveDataSet(TrueFalseIndicator removeDataSet) {
		this.removeDataSet = Objects.requireNonNull(removeDataSet);
		return this;
	}

	public Optional<GenericIdentification32> getDataSetInitiator() {
		return dataSetInitiator == null ? Optional.empty() : Optional.of(dataSetInitiator);
	}

	public CardPaymentDataSet2 setDataSetInitiator(com.tools20022.repository.msg.GenericIdentification32 dataSetInitiator) {
		this.dataSetInitiator = dataSetInitiator;
		return this;
	}

	public List<TransactionTotals1> getTransactionTotals() {
		return transactionTotals == null ? transactionTotals = new ArrayList<>() : transactionTotals;
	}

	public CardPaymentDataSet2 setTransactionTotals(List<com.tools20022.repository.msg.TransactionTotals1> transactionTotals) {
		this.transactionTotals = Objects.requireNonNull(transactionTotals);
		return this;
	}

	public List<CardPaymentDataSet3> getRejectedTransaction() {
		return rejectedTransaction == null ? rejectedTransaction = new ArrayList<>() : rejectedTransaction;
	}

	public CardPaymentDataSet2 setRejectedTransaction(List<com.tools20022.repository.msg.CardPaymentDataSet3> rejectedTransaction) {
		this.rejectedTransaction = Objects.requireNonNull(rejectedTransaction);
		return this;
	}
}
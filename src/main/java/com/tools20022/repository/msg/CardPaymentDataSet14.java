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
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmDataSetIdentification
 * CardPaymentDataSet14.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmDataSetResult
 * CardPaymentDataSet14.mmDataSetResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmRemoveDataSet
 * CardPaymentDataSet14.mmRemoveDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmDataSetInitiator
 * CardPaymentDataSet14.mmDataSetInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmTransactionTotals
 * CardPaymentDataSet14.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmRejectedTransaction
 * CardPaymentDataSet14.mmRejectedTransaction}</li>
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
 * "CardPaymentDataSet14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of the captured set of transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSet18
 * CardPaymentDataSet18}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12
 * CardPaymentDataSet12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSet14", propOrder = {"dataSetIdentification", "dataSetResult", "removeDataSet", "dataSetInitiator", "transactionTotals", "rejectedTransaction"})
public class CardPaymentDataSet14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetId", required = true)
	protected DataSetIdentification5 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification5
	 * DataSetIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14
	 * CardPaymentDataSet14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmDataSetIdentification
	 * CardPaymentDataSet18.mmDataSetIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmDataSetIdentification
	 * CardPaymentDataSet12.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet14.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identification of the data set.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet18.mmDataSetIdentification);
			previousVersion_lazy = () -> CardPaymentDataSet12.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DataSetIdentification5.mmObject();
		}
	};
	@XmlElement(name = "DataSetRslt", required = true)
	protected ResponseType5 dataSetResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType5
	 * ResponseType5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14
	 * CardPaymentDataSet14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmDataSetResult
	 * CardPaymentDataSet18.mmDataSetResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmDataSetResult
	 * CardPaymentDataSet12.mmDataSetResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet14.mmObject();
			isDerived = false;
			xmlTag = "DataSetRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetResult";
			definition = "Result of the data set capture.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet18.mmDataSetResult);
			previousVersion_lazy = () -> CardPaymentDataSet12.mmDataSetResult;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType5.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14
	 * CardPaymentDataSet14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmRemoveDataSet
	 * CardPaymentDataSet18.mmRemoveDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmRemoveDataSet
	 * CardPaymentDataSet12.mmRemoveDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemoveDataSet = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet14.mmObject();
			isDerived = false;
			xmlTag = "RmvDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoveDataSet";
			definition = "Indicates if the data set must be removed from the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet18.mmRemoveDataSet);
			previousVersion_lazy = () -> CardPaymentDataSet12.mmRemoveDataSet;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "DataSetInitr")
	protected GenericIdentification53 dataSetInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53
	 * GenericIdentification53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14
	 * CardPaymentDataSet14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmDataSetInitiator
	 * CardPaymentDataSet18.mmDataSetInitiator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmDataSetInitiator
	 * CardPaymentDataSet12.mmDataSetInitiator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetInitiator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet14.mmObject();
			isDerived = false;
			xmlTag = "DataSetInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetInitiator";
			definition = "Initiator of the data set.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet18.mmDataSetInitiator);
			previousVersion_lazy = () -> CardPaymentDataSet12.mmDataSetInitiator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification53.mmObject();
		}
	};
	@XmlElement(name = "TxTtls", required = true)
	protected List<com.tools20022.repository.msg.TransactionTotals7> transactionTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals7
	 * TransactionTotals7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14
	 * CardPaymentDataSet14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmTransactionTotals
	 * CardPaymentDataSet18.mmTransactionTotals}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmTransactionTotals
	 * CardPaymentDataSet12.mmTransactionTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionTotals = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet14.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Transaction totals of the batch.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet18.mmTransactionTotals);
			previousVersion_lazy = () -> CardPaymentDataSet12.mmTransactionTotals;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionTotals7.mmObject();
		}
	};
	@XmlElement(name = "RjctdTx")
	protected List<com.tools20022.repository.msg.CardPaymentDataSet15> rejectedTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentDataSet15
	 * CardPaymentDataSet15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14
	 * CardPaymentDataSet14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmRejectedTransaction
	 * CardPaymentDataSet18.mmRejectedTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmRejectedTransaction
	 * CardPaymentDataSet12.mmRejectedTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejectedTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet14.mmObject();
			isDerived = false;
			xmlTag = "RjctdTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedTransaction";
			definition = "Transaction in the batch, whose capture has been rejected.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet18.mmRejectedTransaction);
			previousVersion_lazy = () -> CardPaymentDataSet12.mmRejectedTransaction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet15.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentDataSet14.mmDataSetIdentification, com.tools20022.repository.msg.CardPaymentDataSet14.mmDataSetResult,
						com.tools20022.repository.msg.CardPaymentDataSet14.mmRemoveDataSet, com.tools20022.repository.msg.CardPaymentDataSet14.mmDataSetInitiator, com.tools20022.repository.msg.CardPaymentDataSet14.mmTransactionTotals,
						com.tools20022.repository.msg.CardPaymentDataSet14.mmRejectedTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSet14";
				definition = "Result of the captured set of transactions.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet18.mmObject());
				previousVersion_lazy = () -> CardPaymentDataSet12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DataSetIdentification5 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public CardPaymentDataSet14 setDataSetIdentification(com.tools20022.repository.msg.DataSetIdentification5 dataSetIdentification) {
		this.dataSetIdentification = Objects.requireNonNull(dataSetIdentification);
		return this;
	}

	public ResponseType5 getDataSetResult() {
		return dataSetResult;
	}

	public CardPaymentDataSet14 setDataSetResult(com.tools20022.repository.msg.ResponseType5 dataSetResult) {
		this.dataSetResult = Objects.requireNonNull(dataSetResult);
		return this;
	}

	public TrueFalseIndicator getRemoveDataSet() {
		return removeDataSet;
	}

	public CardPaymentDataSet14 setRemoveDataSet(TrueFalseIndicator removeDataSet) {
		this.removeDataSet = Objects.requireNonNull(removeDataSet);
		return this;
	}

	public Optional<GenericIdentification53> getDataSetInitiator() {
		return dataSetInitiator == null ? Optional.empty() : Optional.of(dataSetInitiator);
	}

	public CardPaymentDataSet14 setDataSetInitiator(com.tools20022.repository.msg.GenericIdentification53 dataSetInitiator) {
		this.dataSetInitiator = dataSetInitiator;
		return this;
	}

	public List<TransactionTotals7> getTransactionTotals() {
		return transactionTotals == null ? transactionTotals = new ArrayList<>() : transactionTotals;
	}

	public CardPaymentDataSet14 setTransactionTotals(List<com.tools20022.repository.msg.TransactionTotals7> transactionTotals) {
		this.transactionTotals = Objects.requireNonNull(transactionTotals);
		return this;
	}

	public List<CardPaymentDataSet15> getRejectedTransaction() {
		return rejectedTransaction == null ? rejectedTransaction = new ArrayList<>() : rejectedTransaction;
	}

	public CardPaymentDataSet14 setRejectedTransaction(List<com.tools20022.repository.msg.CardPaymentDataSet15> rejectedTransaction) {
		this.rejectedTransaction = Objects.requireNonNull(rejectedTransaction);
		return this;
	}
}
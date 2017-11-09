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
import com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV04;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Status of the transactions sent in a previous batch of card payment
 * transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse3#mmTransactionTotals
 * CardPaymentBatchTransferResponse3.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse3#mmDataSet
 * CardPaymentBatchTransferResponse3.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV04#mmBatchTransferResponse
 * AcceptorBatchTransferResponseV04.mmBatchTransferResponse}</li>
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
 * "CardPaymentBatchTransferResponse3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of the transactions sent in a previous batch of card payment transactions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse4
 * CardPaymentBatchTransferResponse4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse2
 * CardPaymentBatchTransferResponse2}</li>
 * </ul>
 */
public class CardPaymentBatchTransferResponse3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.TransactionTotals3> transactionTotals;
	/**
	 * Totals of transactions of all the data sets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals3
	 * TransactionTotals3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse3
	 * CardPaymentBatchTransferResponse3}</li>
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
	 * definition} = "Totals of transactions of all the data sets."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse4#mmTransactionTotals
	 * CardPaymentBatchTransferResponse4.mmTransactionTotals}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse2#mmTransactionTotals
	 * CardPaymentBatchTransferResponse2.mmTransactionTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionTotals = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentBatchTransferResponse3.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Totals of transactions of all the data sets.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentBatchTransferResponse4.mmTransactionTotals);
			previousVersion_lazy = () -> CardPaymentBatchTransferResponse2.mmTransactionTotals;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TransactionTotals3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CardPaymentDataSet12> dataSet;
	/**
	 * Information related to the previously sent set of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12
	 * CardPaymentDataSet12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse3
	 * CardPaymentBatchTransferResponse3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the previously sent set of transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse4#mmDataSet
	 * CardPaymentBatchTransferResponse4.mmDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse2#mmDataSet
	 * CardPaymentBatchTransferResponse2.mmDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDataSet = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentBatchTransferResponse3.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Information related to the previously sent set of transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentBatchTransferResponse4.mmDataSet);
			previousVersion_lazy = () -> CardPaymentBatchTransferResponse2.mmDataSet;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet12.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentBatchTransferResponse3.mmTransactionTotals, CardPaymentBatchTransferResponse3.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorBatchTransferResponseV04.mmBatchTransferResponse);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentBatchTransferResponse3";
				definition = "Status of the transactions sent in a previous batch of card payment transactions.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentBatchTransferResponse4.mmObject());
				previousVersion_lazy = () -> CardPaymentBatchTransferResponse2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<TransactionTotals3> getTransactionTotals() {
		return transactionTotals;
	}

	public void setTransactionTotals(List<com.tools20022.repository.msg.TransactionTotals3> transactionTotals) {
		this.transactionTotals = transactionTotals;
	}

	public List<CardPaymentDataSet12> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<com.tools20022.repository.msg.CardPaymentDataSet12> dataSet) {
		this.dataSet = dataSet;
	}
}
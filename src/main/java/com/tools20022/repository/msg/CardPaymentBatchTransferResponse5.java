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
import com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse5#mmTransactionTotals
 * CardPaymentBatchTransferResponse5.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse5#mmDataSet
 * CardPaymentBatchTransferResponse5.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06#mmBatchTransferResponse
 * AcceptorBatchTransferResponseV06.mmBatchTransferResponse}</li>
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
 * "CardPaymentBatchTransferResponse5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of the transactions sent in a previous batch of card payment transactions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse4
 * CardPaymentBatchTransferResponse4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentBatchTransferResponse5", propOrder = {"transactionTotals", "dataSet"})
public class CardPaymentBatchTransferResponse5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.TransactionTotals7> transactionTotals;
	/**
	 * Totals of transactions of all the data sets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7
	 * TransactionTotals7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse5
	 * CardPaymentBatchTransferResponse5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse4#mmTransactionTotals
	 * CardPaymentBatchTransferResponse4.mmTransactionTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionTotals = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentBatchTransferResponse5.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Totals of transactions of all the data sets.";
			previousVersion_lazy = () -> CardPaymentBatchTransferResponse4.mmTransactionTotals;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TransactionTotals7.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CardPaymentDataSet18> dataSet;
	/**
	 * Information related to the previously sent set of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18
	 * CardPaymentDataSet18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse5
	 * CardPaymentBatchTransferResponse5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse4#mmDataSet
	 * CardPaymentBatchTransferResponse4.mmDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDataSet = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentBatchTransferResponse5.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Information related to the previously sent set of transaction.";
			previousVersion_lazy = () -> CardPaymentBatchTransferResponse4.mmDataSet;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet18.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentBatchTransferResponse5.mmTransactionTotals, CardPaymentBatchTransferResponse5.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorBatchTransferResponseV06.mmBatchTransferResponse);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentBatchTransferResponse5";
				definition = "Status of the transactions sent in a previous batch of card payment transactions.";
				previousVersion_lazy = () -> CardPaymentBatchTransferResponse4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxTtls")
	public List<TransactionTotals7> getTransactionTotals() {
		return transactionTotals;
	}

	public void setTransactionTotals(List<com.tools20022.repository.msg.TransactionTotals7> transactionTotals) {
		this.transactionTotals = transactionTotals;
	}

	@XmlElement(name = "DataSet")
	public List<CardPaymentDataSet18> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<com.tools20022.repository.msg.CardPaymentDataSet18> dataSet) {
		this.dataSet = dataSet;
	}
}
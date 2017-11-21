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
import com.tools20022.repository.area.caaa.AcceptorBatchTransferV03;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card payment transactions from one or several data set of transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer2#mmTransactionTotals
 * CardPaymentBatchTransfer2.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer2#mmDataSet
 * CardPaymentBatchTransfer2.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV03#mmBatchTransfer
 * AcceptorBatchTransferV03.mmBatchTransfer}</li>
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
 * "CardPaymentBatchTransfer2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card payment transactions from one or several data set of transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer3
 * CardPaymentBatchTransfer3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer1
 * CardPaymentBatchTransfer1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentBatchTransfer2", propOrder = {"transactionTotals", "dataSet"})
public class CardPaymentBatchTransfer2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.TransactionTotals2> transactionTotals;
	/**
	 * Totals of transactions of all the data sets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2
	 * TransactionTotals2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer2
	 * CardPaymentBatchTransfer2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer3#mmTransactionTotals
	 * CardPaymentBatchTransfer3.mmTransactionTotals}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer1#mmTransactionTotals
	 * CardPaymentBatchTransfer1.mmTransactionTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionTotals = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentBatchTransfer2.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Totals of transactions of all the data sets.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentBatchTransfer3.mmTransactionTotals);
			previousVersion_lazy = () -> CardPaymentBatchTransfer1.mmTransactionTotals;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TransactionTotals2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CardPaymentDataSet7> dataSet;
	/**
	 * Card payment transactions from one data set of transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet7
	 * CardPaymentDataSet7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer2
	 * CardPaymentBatchTransfer2}</li>
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
	 * "Card payment transactions from one data set of transactions."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer3#mmDataSet
	 * CardPaymentBatchTransfer3.mmDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer1#mmDataSet
	 * CardPaymentBatchTransfer1.mmDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDataSet = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentBatchTransfer2.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Card payment transactions from one data set of transactions.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentBatchTransfer3.mmDataSet);
			previousVersion_lazy = () -> CardPaymentBatchTransfer1.mmDataSet;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentBatchTransfer2.mmTransactionTotals, CardPaymentBatchTransfer2.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorBatchTransferV03.mmBatchTransfer);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentBatchTransfer2";
				definition = "Card payment transactions from one or several data set of transactions.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentBatchTransfer3.mmObject());
				previousVersion_lazy = () -> CardPaymentBatchTransfer1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxTtls")
	public List<TransactionTotals2> getTransactionTotals() {
		return transactionTotals;
	}

	public void setTransactionTotals(List<com.tools20022.repository.msg.TransactionTotals2> transactionTotals) {
		this.transactionTotals = transactionTotals;
	}

	@XmlElement(name = "DataSet")
	public List<CardPaymentDataSet7> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<com.tools20022.repository.msg.CardPaymentDataSet7> dataSet) {
		this.dataSet = dataSet;
	}
}
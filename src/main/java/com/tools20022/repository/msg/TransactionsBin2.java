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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies aggregated details on transactions within a defined numeric range
 * bin.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionsBin2#mmNumberOfTransactions
 * TransactionsBin2.mmNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionsBin2#mmTotalNotionalAmount
 * TransactionsBin2.mmTotalNotionalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionsBin2#mmRange
 * TransactionsBin2.mmRange}</li>
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
 * "TransactionsBin2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies aggregated details on transactions within a defined numeric range bin."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionsBin2", propOrder = {"numberOfTransactions", "totalNotionalAmount", "range"})
public class TransactionsBin2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number numberOfTransactions;
	/**
	 * Total number of transactions executed for that bin. Transactions that
	 * have been cancelled should be excluded from the reported figure.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionsBin2
	 * TransactionsBin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of transactions executed for that bin. Transactions that have been cancelled should be excluded from the reported figure."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionsBin2.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Total number of transactions executed for that bin. Transactions that have been cancelled should be excluded from the reported figure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected DecimalNumber totalNotionalAmount;
	/**
	 * Total notional amount traded represented by all transactions executed on
	 * the reporting day which size lies in the bin's range, expressed in the
	 * currency as specified in the local regulation (except for emission
	 * allowances and emission allowance derivatives : tons of carbon dioxide).
	 * Transactions that have been cancelled should be excluded from the
	 * reported figure.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionsBin2
	 * TransactionsBin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNtnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNotionalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total notional amount traded represented by all transactions executed on the reporting day which size lies in the bin's range, expressed in the currency as specified in the local regulation (except for emission allowances and emission allowance derivatives : tons of carbon dioxide). Transactions that have been cancelled should be excluded from the reported figure.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNotionalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionsBin2.mmObject();
			isDerived = false;
			xmlTag = "TtlNtnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNotionalAmount";
			definition = "Total notional amount traded represented by all transactions executed on the reporting day which size lies in the bin's range, expressed in the currency as specified in the local regulation (except for emission allowances and emission allowance derivatives : tons of carbon dioxide). Transactions that have been cancelled should be excluded from the reported figure.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected FromToQuantityRange2 range;
	/**
	 * Specific range the quantitative data relates to. Only allowed ranges must
	 * be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FromToQuantityRange2
	 * FromToQuantityRange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionsBin2
	 * TransactionsBin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Range"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific range the quantitative data relates to.  Only allowed ranges must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionsBin2.mmObject();
			isDerived = false;
			xmlTag = "Rg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Range";
			definition = "Specific range the quantitative data relates to.  Only allowed ranges must be used.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FromToQuantityRange2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionsBin2.mmNumberOfTransactions, TransactionsBin2.mmTotalNotionalAmount, TransactionsBin2.mmRange);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionsBin2";
				definition = "Specifies aggregated details on transactions within a defined numeric range bin.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NbOfTxs", required = true)
	public Number getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public void setNumberOfTransactions(Number numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}

	@XmlElement(name = "TtlNtnlAmt", required = true)
	public DecimalNumber getTotalNotionalAmount() {
		return totalNotionalAmount;
	}

	public void setTotalNotionalAmount(DecimalNumber totalNotionalAmount) {
		this.totalNotionalAmount = totalNotionalAmount;
	}

	@XmlElement(name = "Rg", required = true)
	public FromToQuantityRange2 getRange() {
		return range;
	}

	public void setRange(com.tools20022.repository.msg.FromToQuantityRange2 range) {
		this.range = range;
	}
}
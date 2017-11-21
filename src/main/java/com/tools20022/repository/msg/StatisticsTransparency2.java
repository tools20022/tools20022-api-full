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
 * Statistics for a financial instrument generated as part of transparency
 * calculations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency2#mmTotalNumberOfTransactionsExecuted
 * StatisticsTransparency2.mmTotalNumberOfTransactionsExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency2#mmTotalVolumeOfTransactionsExecuted
 * StatisticsTransparency2.mmTotalVolumeOfTransactionsExecuted}</li>
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
 * "StatisticsTransparency2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Statistics for a financial instrument generated as part of transparency calculations."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatisticsTransparency2", propOrder = {"totalNumberOfTransactionsExecuted", "totalVolumeOfTransactionsExecuted"})
public class StatisticsTransparency2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number totalNumberOfTransactionsExecuted;
	/**
	 * Total number of transactions that have been performed on this market.
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency2
	 * StatisticsTransparency2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfTxsExctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfTransactionsExecuted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of transactions that have been performed on this market."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfTransactionsExecuted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency2.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfTxsExctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfTransactionsExecuted";
			definition = "Total number of transactions that have been performed on this market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected DecimalNumber totalVolumeOfTransactionsExecuted;
	/**
	 * Total volume of transactions that have been performed on this market.
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency2
	 * StatisticsTransparency2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlVolOfTxsExctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalVolumeOfTransactionsExecuted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total volume of transactions that have been performed on this market."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalVolumeOfTransactionsExecuted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency2.mmObject();
			isDerived = false;
			xmlTag = "TtlVolOfTxsExctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalVolumeOfTransactionsExecuted";
			definition = "Total volume of transactions that have been performed on this market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatisticsTransparency2.mmTotalNumberOfTransactionsExecuted, StatisticsTransparency2.mmTotalVolumeOfTransactionsExecuted);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatisticsTransparency2";
				definition = "Statistics for a financial instrument generated as part of transparency calculations.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TtlNbOfTxsExctd", required = true)
	public Number getTotalNumberOfTransactionsExecuted() {
		return totalNumberOfTransactionsExecuted;
	}

	public void setTotalNumberOfTransactionsExecuted(Number totalNumberOfTransactionsExecuted) {
		this.totalNumberOfTransactionsExecuted = totalNumberOfTransactionsExecuted;
	}

	@XmlElement(name = "TtlVolOfTxsExctd", required = true)
	public DecimalNumber getTotalVolumeOfTransactionsExecuted() {
		return totalVolumeOfTransactionsExecuted;
	}

	public void setTotalVolumeOfTransactionsExecuted(DecimalNumber totalVolumeOfTransactionsExecuted) {
		this.totalVolumeOfTransactionsExecuted = totalVolumeOfTransactionsExecuted;
	}
}
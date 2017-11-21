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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
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
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#mmAverageDailyTurnover
 * StatisticsTransparency3.mmAverageDailyTurnover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#mmAverageTransactionValue
 * StatisticsTransparency3.mmAverageTransactionValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#mmLargeInScale
 * StatisticsTransparency3.mmLargeInScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#mmStandardMarketSize
 * StatisticsTransparency3.mmStandardMarketSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#mmAverageDailyNumberOfTransactions
 * StatisticsTransparency3.mmAverageDailyNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#mmTotalNumberOfTransactionsExecuted
 * StatisticsTransparency3.mmTotalNumberOfTransactionsExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#mmTotalVolumeOfTransactionsExecuted
 * StatisticsTransparency3.mmTotalVolumeOfTransactionsExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#mmTotalNumberOfTradingDays
 * StatisticsTransparency3.mmTotalNumberOfTradingDays}</li>
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
 * "StatisticsTransparency3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Statistics for a financial instrument generated as part of transparency calculations."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatisticsTransparency3", propOrder = {"averageDailyTurnover", "averageTransactionValue", "largeInScale", "standardMarketSize", "averageDailyNumberOfTransactions", "totalNumberOfTransactionsExecuted",
		"totalVolumeOfTransactionsExecuted", "totalNumberOfTradingDays"})
public class StatisticsTransparency3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount averageDailyTurnover;
	/**
	 * Average Daily Turnover for the instrument in Euros.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3
	 * StatisticsTransparency3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgDalyTrnvr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageDailyTurnover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Average Daily Turnover for the instrument in Euros."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAverageDailyTurnover = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "AvrgDalyTrnvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageDailyTurnover";
			definition = "Average Daily Turnover for the instrument in Euros.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount averageTransactionValue;
	/**
	 * Average value of the transactions for the instrument in Euro.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3
	 * StatisticsTransparency3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgTxVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageTransactionValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average value of the transactions for the instrument in Euro."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAverageTransactionValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "AvrgTxVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageTransactionValue";
			definition = "Average value of the transactions for the instrument in Euro.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected DecimalNumber largeInScale;
	/**
	 * Large in scale order in respect of a share, depositary receipt,
	 * certificate or other similar financial instrument shall be considered
	 * large in scale compared with normal market size if, on the basis of the
	 * average daily turnover for that financial instrument, the order is equal
	 * to or larger than the minimum size of orders set out in the local
	 * regulation.
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3
	 * StatisticsTransparency3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LrgInScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LargeInScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Large in scale order in respect of a share, depositary receipt, certificate or other similar financial instrument shall be considered large in scale compared with normal market size if, on the basis of the average daily turnover for that financial instrument, the order is equal to or larger than the minimum size of orders set out in the local regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLargeInScale = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "LrgInScale";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LargeInScale";
			definition = "Large in scale order in respect of a share, depositary receipt, certificate or other similar financial instrument shall be considered large in scale compared with normal market size if, on the basis of the average daily turnover for that financial instrument, the order is equal to or larger than the minimum size of orders set out in the local regulation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber standardMarketSize;
	/**
	 * Standard market size for shares, depositary receipts, ETFs, certificates
	 * and other similar financial instruments for which there is a liquid
	 * market shall be determined on the basis of the average value of
	 * transactions for each financial instrument and in accordance with the
	 * local regulation.
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3
	 * StatisticsTransparency3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdMktSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardMarketSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standard market size for shares, depositary receipts, ETFs, certificates and other similar financial instruments for which there is a liquid market shall be determined on the basis of the average value of transactions for each financial instrument and in accordance with the local regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandardMarketSize = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "StdMktSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardMarketSize";
			definition = "Standard market size for shares, depositary receipts, ETFs, certificates and other similar financial instruments for which there is a liquid market shall be determined on the basis of the average value of transactions for each financial instrument and in accordance with the local regulation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber averageDailyNumberOfTransactions;
	/**
	 * Average daily number of transactions that have been performed on this
	 * market.
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3
	 * StatisticsTransparency3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgDalyNbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageDailyNumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average daily number of transactions that have been performed on this market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAverageDailyNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "AvrgDalyNbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageDailyNumberOfTransactions";
			definition = "Average daily number of transactions that have been performed on this market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber totalNumberOfTransactionsExecuted;
	/**
	 * Total number of transactions that have been performed on this market.
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3
	 * StatisticsTransparency3}</li>
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
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfTxsExctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfTransactionsExecuted";
			definition = "Total number of transactions that have been performed on this market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3
	 * StatisticsTransparency3}</li>
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
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "TtlVolOfTxsExctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalVolumeOfTransactionsExecuted";
			definition = "Total volume of transactions that have been performed on this market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected Number totalNumberOfTradingDays;
	/**
	 * The total number of trading days for which the data is provided.
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
	 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3
	 * StatisticsTransparency3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfTradgDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfTradingDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The total number of trading days for which the data is provided."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfTradingDays = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfTradgDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfTradingDays";
			definition = "The total number of trading days for which the data is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatisticsTransparency3.mmAverageDailyTurnover, StatisticsTransparency3.mmAverageTransactionValue, StatisticsTransparency3.mmLargeInScale,
						StatisticsTransparency3.mmStandardMarketSize, StatisticsTransparency3.mmAverageDailyNumberOfTransactions, StatisticsTransparency3.mmTotalNumberOfTransactionsExecuted,
						StatisticsTransparency3.mmTotalVolumeOfTransactionsExecuted, StatisticsTransparency3.mmTotalNumberOfTradingDays);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatisticsTransparency3";
				definition = "Statistics for a financial instrument generated as part of transparency calculations.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AvrgDalyTrnvr")
	public ActiveCurrencyAndAmount getAverageDailyTurnover() {
		return averageDailyTurnover;
	}

	public void setAverageDailyTurnover(ActiveCurrencyAndAmount averageDailyTurnover) {
		this.averageDailyTurnover = averageDailyTurnover;
	}

	@XmlElement(name = "AvrgTxVal")
	public ActiveCurrencyAndAmount getAverageTransactionValue() {
		return averageTransactionValue;
	}

	public void setAverageTransactionValue(ActiveCurrencyAndAmount averageTransactionValue) {
		this.averageTransactionValue = averageTransactionValue;
	}

	@XmlElement(name = "LrgInScale")
	public DecimalNumber getLargeInScale() {
		return largeInScale;
	}

	public void setLargeInScale(DecimalNumber largeInScale) {
		this.largeInScale = largeInScale;
	}

	@XmlElement(name = "StdMktSz")
	public DecimalNumber getStandardMarketSize() {
		return standardMarketSize;
	}

	public void setStandardMarketSize(DecimalNumber standardMarketSize) {
		this.standardMarketSize = standardMarketSize;
	}

	@XmlElement(name = "AvrgDalyNbOfTxs")
	public DecimalNumber getAverageDailyNumberOfTransactions() {
		return averageDailyNumberOfTransactions;
	}

	public void setAverageDailyNumberOfTransactions(DecimalNumber averageDailyNumberOfTransactions) {
		this.averageDailyNumberOfTransactions = averageDailyNumberOfTransactions;
	}

	@XmlElement(name = "TtlNbOfTxsExctd")
	public DecimalNumber getTotalNumberOfTransactionsExecuted() {
		return totalNumberOfTransactionsExecuted;
	}

	public void setTotalNumberOfTransactionsExecuted(DecimalNumber totalNumberOfTransactionsExecuted) {
		this.totalNumberOfTransactionsExecuted = totalNumberOfTransactionsExecuted;
	}

	@XmlElement(name = "TtlVolOfTxsExctd")
	public DecimalNumber getTotalVolumeOfTransactionsExecuted() {
		return totalVolumeOfTransactionsExecuted;
	}

	public void setTotalVolumeOfTransactionsExecuted(DecimalNumber totalVolumeOfTransactionsExecuted) {
		this.totalVolumeOfTransactionsExecuted = totalVolumeOfTransactionsExecuted;
	}

	@XmlElement(name = "TtlNbOfTradgDays")
	public Number getTotalNumberOfTradingDays() {
		return totalNumberOfTradingDays;
	}

	public void setTotalNumberOfTradingDays(Number totalNumberOfTradingDays) {
		this.totalNumberOfTradingDays = totalNumberOfTradingDays;
	}
}
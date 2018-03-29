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
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatisticsTransparency3", propOrder = {"averageDailyTurnover", "averageTransactionValue", "largeInScale", "standardMarketSize", "averageDailyNumberOfTransactions", "totalNumberOfTransactionsExecuted",
		"totalVolumeOfTransactionsExecuted", "totalNumberOfTradingDays"})
public class StatisticsTransparency3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AvrgDalyTrnvr")
	protected ActiveCurrencyAndAmount averageDailyTurnover;
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
	public static final MMMessageAttribute<StatisticsTransparency3, Optional<ActiveCurrencyAndAmount>> mmAverageDailyTurnover = new MMMessageAttribute<StatisticsTransparency3, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "AvrgDalyTrnvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageDailyTurnover";
			definition = "Average Daily Turnover for the instrument in Euros.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(StatisticsTransparency3 obj) {
			return obj.getAverageDailyTurnover();
		}

		@Override
		public void setValue(StatisticsTransparency3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAverageDailyTurnover(value.orElse(null));
		}
	};
	@XmlElement(name = "AvrgTxVal")
	protected ActiveCurrencyAndAmount averageTransactionValue;
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
	public static final MMMessageAttribute<StatisticsTransparency3, Optional<ActiveCurrencyAndAmount>> mmAverageTransactionValue = new MMMessageAttribute<StatisticsTransparency3, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "AvrgTxVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageTransactionValue";
			definition = "Average value of the transactions for the instrument in Euro.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(StatisticsTransparency3 obj) {
			return obj.getAverageTransactionValue();
		}

		@Override
		public void setValue(StatisticsTransparency3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAverageTransactionValue(value.orElse(null));
		}
	};
	@XmlElement(name = "LrgInScale")
	protected DecimalNumber largeInScale;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<StatisticsTransparency3, Optional<DecimalNumber>> mmLargeInScale = new MMMessageAttribute<StatisticsTransparency3, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "LrgInScale";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LargeInScale";
			definition = "Large in scale order in respect of a share, depositary receipt, certificate or other similar financial instrument shall be considered large in scale compared with normal market size if, on the basis of the average daily turnover for that financial instrument, the order is equal to or larger than the minimum size of orders set out in the local regulation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(StatisticsTransparency3 obj) {
			return obj.getLargeInScale();
		}

		@Override
		public void setValue(StatisticsTransparency3 obj, Optional<DecimalNumber> value) {
			obj.setLargeInScale(value.orElse(null));
		}
	};
	@XmlElement(name = "StdMktSz")
	protected DecimalNumber standardMarketSize;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<StatisticsTransparency3, Optional<DecimalNumber>> mmStandardMarketSize = new MMMessageAttribute<StatisticsTransparency3, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "StdMktSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardMarketSize";
			definition = "Standard market size for shares, depositary receipts, ETFs, certificates and other similar financial instruments for which there is a liquid market shall be determined on the basis of the average value of transactions for each financial instrument and in accordance with the local regulation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(StatisticsTransparency3 obj) {
			return obj.getStandardMarketSize();
		}

		@Override
		public void setValue(StatisticsTransparency3 obj, Optional<DecimalNumber> value) {
			obj.setStandardMarketSize(value.orElse(null));
		}
	};
	@XmlElement(name = "AvrgDalyNbOfTxs")
	protected DecimalNumber averageDailyNumberOfTransactions;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<StatisticsTransparency3, Optional<DecimalNumber>> mmAverageDailyNumberOfTransactions = new MMMessageAttribute<StatisticsTransparency3, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "AvrgDalyNbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageDailyNumberOfTransactions";
			definition = "Average daily number of transactions that have been performed on this market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(StatisticsTransparency3 obj) {
			return obj.getAverageDailyNumberOfTransactions();
		}

		@Override
		public void setValue(StatisticsTransparency3 obj, Optional<DecimalNumber> value) {
			obj.setAverageDailyNumberOfTransactions(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbOfTxsExctd")
	protected DecimalNumber totalNumberOfTransactionsExecuted;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<StatisticsTransparency3, Optional<DecimalNumber>> mmTotalNumberOfTransactionsExecuted = new MMMessageAttribute<StatisticsTransparency3, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfTxsExctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfTransactionsExecuted";
			definition = "Total number of transactions that have been performed on this market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(StatisticsTransparency3 obj) {
			return obj.getTotalNumberOfTransactionsExecuted();
		}

		@Override
		public void setValue(StatisticsTransparency3 obj, Optional<DecimalNumber> value) {
			obj.setTotalNumberOfTransactionsExecuted(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlVolOfTxsExctd")
	protected DecimalNumber totalVolumeOfTransactionsExecuted;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<StatisticsTransparency3, Optional<DecimalNumber>> mmTotalVolumeOfTransactionsExecuted = new MMMessageAttribute<StatisticsTransparency3, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "TtlVolOfTxsExctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalVolumeOfTransactionsExecuted";
			definition = "Total volume of transactions that have been performed on this market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(StatisticsTransparency3 obj) {
			return obj.getTotalVolumeOfTransactionsExecuted();
		}

		@Override
		public void setValue(StatisticsTransparency3 obj, Optional<DecimalNumber> value) {
			obj.setTotalVolumeOfTransactionsExecuted(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbOfTradgDays")
	protected Number totalNumberOfTradingDays;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<StatisticsTransparency3, Optional<Number>> mmTotalNumberOfTradingDays = new MMMessageAttribute<StatisticsTransparency3, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfTradgDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfTradingDays";
			definition = "The total number of trading days for which the data is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(StatisticsTransparency3 obj) {
			return obj.getTotalNumberOfTradingDays();
		}

		@Override
		public void setValue(StatisticsTransparency3 obj, Optional<Number> value) {
			obj.setTotalNumberOfTradingDays(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatisticsTransparency3.mmAverageDailyTurnover, com.tools20022.repository.msg.StatisticsTransparency3.mmAverageTransactionValue,
						com.tools20022.repository.msg.StatisticsTransparency3.mmLargeInScale, com.tools20022.repository.msg.StatisticsTransparency3.mmStandardMarketSize,
						com.tools20022.repository.msg.StatisticsTransparency3.mmAverageDailyNumberOfTransactions, com.tools20022.repository.msg.StatisticsTransparency3.mmTotalNumberOfTransactionsExecuted,
						com.tools20022.repository.msg.StatisticsTransparency3.mmTotalVolumeOfTransactionsExecuted, com.tools20022.repository.msg.StatisticsTransparency3.mmTotalNumberOfTradingDays);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatisticsTransparency3";
				definition = "Statistics for a financial instrument generated as part of transparency calculations.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getAverageDailyTurnover() {
		return averageDailyTurnover == null ? Optional.empty() : Optional.of(averageDailyTurnover);
	}

	public StatisticsTransparency3 setAverageDailyTurnover(ActiveCurrencyAndAmount averageDailyTurnover) {
		this.averageDailyTurnover = averageDailyTurnover;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAverageTransactionValue() {
		return averageTransactionValue == null ? Optional.empty() : Optional.of(averageTransactionValue);
	}

	public StatisticsTransparency3 setAverageTransactionValue(ActiveCurrencyAndAmount averageTransactionValue) {
		this.averageTransactionValue = averageTransactionValue;
		return this;
	}

	public Optional<DecimalNumber> getLargeInScale() {
		return largeInScale == null ? Optional.empty() : Optional.of(largeInScale);
	}

	public StatisticsTransparency3 setLargeInScale(DecimalNumber largeInScale) {
		this.largeInScale = largeInScale;
		return this;
	}

	public Optional<DecimalNumber> getStandardMarketSize() {
		return standardMarketSize == null ? Optional.empty() : Optional.of(standardMarketSize);
	}

	public StatisticsTransparency3 setStandardMarketSize(DecimalNumber standardMarketSize) {
		this.standardMarketSize = standardMarketSize;
		return this;
	}

	public Optional<DecimalNumber> getAverageDailyNumberOfTransactions() {
		return averageDailyNumberOfTransactions == null ? Optional.empty() : Optional.of(averageDailyNumberOfTransactions);
	}

	public StatisticsTransparency3 setAverageDailyNumberOfTransactions(DecimalNumber averageDailyNumberOfTransactions) {
		this.averageDailyNumberOfTransactions = averageDailyNumberOfTransactions;
		return this;
	}

	public Optional<DecimalNumber> getTotalNumberOfTransactionsExecuted() {
		return totalNumberOfTransactionsExecuted == null ? Optional.empty() : Optional.of(totalNumberOfTransactionsExecuted);
	}

	public StatisticsTransparency3 setTotalNumberOfTransactionsExecuted(DecimalNumber totalNumberOfTransactionsExecuted) {
		this.totalNumberOfTransactionsExecuted = totalNumberOfTransactionsExecuted;
		return this;
	}

	public Optional<DecimalNumber> getTotalVolumeOfTransactionsExecuted() {
		return totalVolumeOfTransactionsExecuted == null ? Optional.empty() : Optional.of(totalVolumeOfTransactionsExecuted);
	}

	public StatisticsTransparency3 setTotalVolumeOfTransactionsExecuted(DecimalNumber totalVolumeOfTransactionsExecuted) {
		this.totalVolumeOfTransactionsExecuted = totalVolumeOfTransactionsExecuted;
		return this;
	}

	public Optional<Number> getTotalNumberOfTradingDays() {
		return totalNumberOfTradingDays == null ? Optional.empty() : Optional.of(totalNumberOfTradingDays);
	}

	public StatisticsTransparency3 setTotalNumberOfTradingDays(Number totalNumberOfTradingDays) {
		this.totalNumberOfTradingDays = totalNumberOfTradingDays;
		return this;
	}
}
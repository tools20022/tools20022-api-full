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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#AverageDailyTurnover
 * StatisticsTransparency3.AverageDailyTurnover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#AverageTransactionValue
 * StatisticsTransparency3.AverageTransactionValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#LargeInScale
 * StatisticsTransparency3.LargeInScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#StandardMarketSize
 * StatisticsTransparency3.StandardMarketSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#AverageDailyNumberOfTransactions
 * StatisticsTransparency3.AverageDailyNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#TotalNumberOfTransactionsExecuted
 * StatisticsTransparency3.TotalNumberOfTransactionsExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#TotalVolumeOfTransactionsExecuted
 * StatisticsTransparency3.TotalVolumeOfTransactionsExecuted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatisticsTransparency3#TotalNumberOfTradingDays
 * StatisticsTransparency3.TotalNumberOfTradingDays}</li>
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
public class StatisticsTransparency3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMMessageAttribute AverageDailyTurnover = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "AvrgDalyTrnvr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageDailyTurnover";
			definition = "Average Daily Turnover for the instrument in Euros.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMMessageAttribute AverageTransactionValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "AvrgTxVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageTransactionValue";
			definition = "Average value of the transactions for the instrument in Euro.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
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
	public static final MMMessageAttribute LargeInScale = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "LrgInScale";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LargeInScale";
			definition = "Large in scale order in respect of a share, depositary receipt, certificate or other similar financial instrument shall be considered large in scale compared with normal market size if, on the basis of the average daily turnover for that financial instrument, the order is equal to or larger than the minimum size of orders set out in the local regulation.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
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
	public static final MMMessageAttribute StandardMarketSize = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "StdMktSz";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardMarketSize";
			definition = "Standard market size for shares, depositary receipts, ETFs, certificates and other similar financial instruments for which there is a liquid market shall be determined on the basis of the average value of transactions for each financial instrument and in accordance with the local regulation.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
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
	public static final MMMessageAttribute AverageDailyNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "AvrgDalyNbOfTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageDailyNumberOfTransactions";
			definition = "Average daily number of transactions that have been performed on this market.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
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
	public static final MMMessageAttribute TotalNumberOfTransactionsExecuted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfTxsExctd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfTransactionsExecuted";
			definition = "Total number of transactions that have been performed on this market.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
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
	public static final MMMessageAttribute TotalVolumeOfTransactionsExecuted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "TtlVolOfTxsExctd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalVolumeOfTransactionsExecuted";
			definition = "Total volume of transactions that have been performed on this market.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
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
	public static final MMMessageAttribute TotalNumberOfTradingDays = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatisticsTransparency3.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfTradgDays";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfTradingDays";
			definition = "The total number of trading days for which the data is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatisticsTransparency3.AverageDailyTurnover, com.tools20022.repository.msg.StatisticsTransparency3.AverageTransactionValue,
						com.tools20022.repository.msg.StatisticsTransparency3.LargeInScale, com.tools20022.repository.msg.StatisticsTransparency3.StandardMarketSize,
						com.tools20022.repository.msg.StatisticsTransparency3.AverageDailyNumberOfTransactions, com.tools20022.repository.msg.StatisticsTransparency3.TotalNumberOfTransactionsExecuted,
						com.tools20022.repository.msg.StatisticsTransparency3.TotalVolumeOfTransactionsExecuted, com.tools20022.repository.msg.StatisticsTransparency3.TotalNumberOfTradingDays);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatisticsTransparency3";
				definition = "Statistics for a financial instrument generated as part of transparency calculations.";
			}
		});
		return mmObject_lazy.get();
	}
}
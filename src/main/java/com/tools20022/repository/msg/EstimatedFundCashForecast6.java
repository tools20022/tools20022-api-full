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
import com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Cash movements from or to a fund as a result of investment funds
 * transactions, eg, subscriptions or redemptions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmIdentification
 * EstimatedFundCashForecast6.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmTradeDateTime
 * EstimatedFundCashForecast6.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTradeDateTime
 * EstimatedFundCashForecast6.mmPreviousTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmFinancialInstrumentDetails
 * EstimatedFundCashForecast6.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalNAV
 * EstimatedFundCashForecast6.mmEstimatedTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTotalNAV
 * EstimatedFundCashForecast6.mmPreviousTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalUnitsNumber
 * EstimatedFundCashForecast6.mmEstimatedTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTotalUnitsNumber
 * EstimatedFundCashForecast6.mmPreviousTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalNAVChangeRate
 * EstimatedFundCashForecast6.mmEstimatedTotalNAVChangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmInvestmentCurrency
 * EstimatedFundCashForecast6.mmInvestmentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmCurrencyStatus
 * EstimatedFundCashForecast6.mmCurrencyStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmExceptionalNetCashFlowIndicator
 * EstimatedFundCashForecast6.mmExceptionalNetCashFlowIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPrice
 * EstimatedFundCashForecast6.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmForeignExchangeRate
 * EstimatedFundCashForecast6.mmForeignExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedPercentageOfShareClassTotalNAV
 * EstimatedFundCashForecast6.mmEstimatedPercentageOfShareClassTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedCashInForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedCashOutForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedNetCashForecastDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmEstimatedFundCashForecastDetails
 * FundEstimatedCashForecastReportV04.mmEstimatedFundCashForecastDetails}</li>
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
 * "EstimatedFundCashForecast6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3
 * EstimatedFundCashForecast3}</li>
 * </ul>
 */
public class EstimatedFundCashForecast6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Unique technical identifier for an instance of a fund cash forecast
	 * within a fund cash forecast report as assigned by the issuer of the
	 * report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for an instance of a fund cash forecast within a fund cash forecast report as assigned by the issuer of the report."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmIdentification
	 * EstimatedFundCashForecast3.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique technical identifier for an instance of a fund cash forecast within a fund cash forecast report as assigned by the issuer of the report.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice tradeDateTime;
	/**
	 * Date and, if required, the time, at which the price will be applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and, if required, the time, at which the price will be applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmTradeDateTime
	 * EstimatedFundCashForecast3.mmTradeDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and, if required, the time, at which the price will be applied.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmTradeDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice previousTradeDateTime;
	/**
	 * Previous date and time at which the price was applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsTradDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousTradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Previous date and time at which the price was applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmPreviousTradeDateTime
	 * EstimatedFundCashForecast3.mmPreviousTradeDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "PrvsTradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTradeDateTime";
			definition = "Previous date and time at which the price was applied.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmPreviousTradeDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected FinancialInstrument9 financialInstrumentDetails;
	/**
	 * Investment fund class to which the cash flow is related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument9
	 * FinancialInstrument9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFund
	 * InvestmentFundClass.mmInvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund class to which the cash flow is related."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmFinancialInstrumentDetails
	 * EstimatedFundCashForecast3.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentFund;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class to which the cash flow is related.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmFinancialInstrumentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument9.mmObject();
		}
	};
	protected List<ActiveOrHistoricCurrencyAndAmount> estimatedTotalNAV;
	/**
	 * Estimated total value of all the holdings, less the fund's liabilities,
	 * attributable to a specific investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmNetAssetValue
	 * NetAssetValueCalculation.mmNetAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdTtlNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedTotalNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated total value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedTotalNAV
	 * EstimatedFundCashForecast3.mmEstimatedTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedTotalNAV = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalNAV";
			definition = "Estimated total value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmEstimatedTotalNAV;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected List<ActiveOrHistoricCurrencyAndAmount> previousTotalNAV;
	/**
	 * Previous value of all the holdings, less the fund's liabilities,
	 * attributable to a specific investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmNetAssetValue
	 * NetAssetValueCalculation.mmNetAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsTtlNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousTotalNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmPreviousTotalNAV
	 * EstimatedFundCashForecast3.mmPreviousTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTotalNAV = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalNAV";
			definition = "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmPreviousTotalNAV;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 estimatedTotalUnitsNumber;
	/**
	 * Estimated total number of investment fund class units that have been
	 * issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdTtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedTotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated total number of investment fund class units that have been issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast3.mmEstimatedTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalUnitsNumber";
			definition = "Estimated total number of investment fund class units that have been issued.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmEstimatedTotalUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 previousTotalUnitsNumber;
	/**
	 * Previous value of all the holdings, less the fund's liabilities,
	 * attributable to a specific investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsTtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousTotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast3.mmPreviousTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalUnitsNumber";
			definition = "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmPreviousTotalUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected PercentageRate estimatedTotalNAVChangeRate;
	/**
	 * Rate of change of the net asset value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmNetAssetValueChangeRate
	 * ValuationStatistics.mmNetAssetValueChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdTtlNAVChngRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedTotalNAVChangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of change of the net asset value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedTotalNAVChangeRate
	 * EstimatedFundCashForecast3.mmEstimatedTotalNAVChangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedTotalNAVChangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmNetAssetValueChangeRate;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlNAVChngRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalNAVChangeRate";
			definition = "Rate of change of the net asset value.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmEstimatedTotalNAVChangeRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<ActiveOrHistoricCurrencyCode> investmentCurrency;
	/**
	 * Currency of the investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmTradingCurrency
	 * InvestmentFundClass.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the investment fund class."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmInvestmentCurrency
	 * EstimatedFundCashForecast3.mmInvestmentCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestmentCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmTradingCurrency;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "InvstmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentCurrency";
			definition = "Currency of the investment fund class.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmInvestmentCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected CurrencyDesignation1 currencyStatus;
	/**
	 * Information about the designation of the share class currency, that is,
	 * whether it is for onshore or offshore purposes and other information that
	 * may be required. This is typically only required for CNY funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyDesignation1
	 * CurrencyDesignation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the designation of the share class currency, that is, whether it is for onshore or offshore purposes and other information that may be required. This is typically only required for CNY funds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrencyStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "CcySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyStatus";
			definition = "Information about the designation of the share class currency, that is, whether it is for onshore or offshore purposes and other information that may be required. This is typically only required for CNY funds.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyDesignation1.mmObject();
		}
	};
	protected YesNoIndicator exceptionalNetCashFlowIndicator;
	/**
	 * Indicates whether the estimated net cash flow is exceptional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmExceptionalCashFlowIndicator
	 * FundsCashFlow.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcptnlNetCshFlowInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalNetCashFlowIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the estimated net cash flow is exceptional."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmExceptionalNetCashFlowIndicator
	 * EstimatedFundCashForecast3.mmExceptionalNetCashFlowIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExceptionalNetCashFlowIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> FundsCashFlow.mmExceptionalCashFlowIndicator;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "XcptnlNetCshFlowInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalNetCashFlowIndicator";
			definition = "Indicates whether the estimated net cash flow is exceptional.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmExceptionalNetCashFlowIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected UnitPrice19 price;
	/**
	 * Price per unit of the previous trade date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice19
	 * UnitPrice19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price per unit of the previous trade date."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Price per unit of the previous trade date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnitPrice19.mmObject();
		}
	};
	protected ForeignExchangeTerms19 foreignExchangeRate;
	/**
	 * Foreign exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19
	 * ForeignExchangeTerms19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign exchange rate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "FXRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeRate";
			definition = "Foreign exchange rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms19.mmObject();
		}
	};
	protected PercentageRate estimatedPercentageOfShareClassTotalNAV;
	/**
	 * Estimated net cash flow expressed as a percentage of the previous total
	 * NAV for the share class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdPctgOfShrClssTtlNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedPercentageOfShareClassTotalNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated net cash flow expressed as a percentage of the previous total NAV for the share class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedPercentageOfShareClassTotalNAV = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdPctgOfShrClssTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedPercentageOfShareClassTotalNAV";
			definition = "Estimated net cash flow expressed as a percentage of the previous total NAV for the share class.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashInForecast6> estimatedCashInForecastDetails;
	/**
	 * Estimated cash movements into the fund as a result of transactions in
	 * shares in an investment fund, for example, subscriptions or switch-ins.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast6
	 * CashInForecast6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdCshInFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedCashInForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated cash movements into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedCashInForecastDetails
	 * EstimatedFundCashForecast3.mmEstimatedCashInForecastDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEstimatedCashInForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdCshInFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedCashInForecastDetails";
			definition = "Estimated cash movements into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmEstimatedCashInForecastDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashInForecast6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashOutForecast6> estimatedCashOutForecastDetails;
	/**
	 * Estimated cash movements out of the fund as a result of transactions in
	 * shares in an investment fund, for example, redemptions or switch-outs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast6
	 * CashOutForecast6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdCshOutFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedCashOutForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated cash movements out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedCashOutForecastDetails
	 * EstimatedFundCashForecast3.mmEstimatedCashOutForecastDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEstimatedCashOutForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdCshOutFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedCashOutForecastDetails";
			definition = "Estimated cash movements out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmEstimatedCashOutForecastDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOutForecast6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.NetCashForecast4> estimatedNetCashForecastDetails;
	/**
	 * Net cash as a result of the cash-in and cash-out flows.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdNetCshFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedNetCashForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net cash as a result of the cash-in and cash-out flows."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedNetCashForecastDetails
	 * EstimatedFundCashForecast3.mmEstimatedNetCashForecastDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEstimatedNetCashForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdNetCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedNetCashForecastDetails";
			definition = "Net cash as a result of the cash-in and cash-out flows.";
			previousVersion_lazy = () -> EstimatedFundCashForecast3.mmEstimatedNetCashForecastDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(EstimatedFundCashForecast6.mmIdentification, EstimatedFundCashForecast6.mmTradeDateTime, EstimatedFundCashForecast6.mmPreviousTradeDateTime,
						EstimatedFundCashForecast6.mmFinancialInstrumentDetails, EstimatedFundCashForecast6.mmEstimatedTotalNAV, EstimatedFundCashForecast6.mmPreviousTotalNAV, EstimatedFundCashForecast6.mmEstimatedTotalUnitsNumber,
						EstimatedFundCashForecast6.mmPreviousTotalUnitsNumber, EstimatedFundCashForecast6.mmEstimatedTotalNAVChangeRate, EstimatedFundCashForecast6.mmInvestmentCurrency, EstimatedFundCashForecast6.mmCurrencyStatus,
						EstimatedFundCashForecast6.mmExceptionalNetCashFlowIndicator, EstimatedFundCashForecast6.mmPrice, EstimatedFundCashForecast6.mmForeignExchangeRate,
						EstimatedFundCashForecast6.mmEstimatedPercentageOfShareClassTotalNAV, EstimatedFundCashForecast6.mmEstimatedCashInForecastDetails, EstimatedFundCashForecast6.mmEstimatedCashOutForecastDetails,
						EstimatedFundCashForecast6.mmEstimatedNetCashForecastDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmEstimatedFundCashForecastDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EstimatedFundCashForecast6";
				definition = "Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions.";
				previousVersion_lazy = () -> EstimatedFundCashForecast3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public DateAndDateTimeChoice getTradeDateTime() {
		return tradeDateTime;
	}

	public void setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
	}

	public DateAndDateTimeChoice getPreviousTradeDateTime() {
		return previousTradeDateTime;
	}

	public void setPreviousTradeDateTime(DateAndDateTimeChoice previousTradeDateTime) {
		this.previousTradeDateTime = previousTradeDateTime;
	}

	public FinancialInstrument9 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument9 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
	}

	public List<ActiveOrHistoricCurrencyAndAmount> getEstimatedTotalNAV() {
		return estimatedTotalNAV;
	}

	public void setEstimatedTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> estimatedTotalNAV) {
		this.estimatedTotalNAV = estimatedTotalNAV;
	}

	public List<ActiveOrHistoricCurrencyAndAmount> getPreviousTotalNAV() {
		return previousTotalNAV;
	}

	public void setPreviousTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> previousTotalNAV) {
		this.previousTotalNAV = previousTotalNAV;
	}

	public FinancialInstrumentQuantity1 getEstimatedTotalUnitsNumber() {
		return estimatedTotalUnitsNumber;
	}

	public void setEstimatedTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 estimatedTotalUnitsNumber) {
		this.estimatedTotalUnitsNumber = estimatedTotalUnitsNumber;
	}

	public FinancialInstrumentQuantity1 getPreviousTotalUnitsNumber() {
		return previousTotalUnitsNumber;
	}

	public void setPreviousTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 previousTotalUnitsNumber) {
		this.previousTotalUnitsNumber = previousTotalUnitsNumber;
	}

	public PercentageRate getEstimatedTotalNAVChangeRate() {
		return estimatedTotalNAVChangeRate;
	}

	public void setEstimatedTotalNAVChangeRate(PercentageRate estimatedTotalNAVChangeRate) {
		this.estimatedTotalNAVChangeRate = estimatedTotalNAVChangeRate;
	}

	public List<ActiveOrHistoricCurrencyCode> getInvestmentCurrency() {
		return investmentCurrency;
	}

	public void setInvestmentCurrency(List<ActiveOrHistoricCurrencyCode> investmentCurrency) {
		this.investmentCurrency = investmentCurrency;
	}

	public CurrencyDesignation1 getCurrencyStatus() {
		return currencyStatus;
	}

	public void setCurrencyStatus(com.tools20022.repository.msg.CurrencyDesignation1 currencyStatus) {
		this.currencyStatus = currencyStatus;
	}

	public YesNoIndicator getExceptionalNetCashFlowIndicator() {
		return exceptionalNetCashFlowIndicator;
	}

	public void setExceptionalNetCashFlowIndicator(YesNoIndicator exceptionalNetCashFlowIndicator) {
		this.exceptionalNetCashFlowIndicator = exceptionalNetCashFlowIndicator;
	}

	public UnitPrice19 getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.msg.UnitPrice19 price) {
		this.price = price;
	}

	public ForeignExchangeTerms19 getForeignExchangeRate() {
		return foreignExchangeRate;
	}

	public void setForeignExchangeRate(com.tools20022.repository.msg.ForeignExchangeTerms19 foreignExchangeRate) {
		this.foreignExchangeRate = foreignExchangeRate;
	}

	public PercentageRate getEstimatedPercentageOfShareClassTotalNAV() {
		return estimatedPercentageOfShareClassTotalNAV;
	}

	public void setEstimatedPercentageOfShareClassTotalNAV(PercentageRate estimatedPercentageOfShareClassTotalNAV) {
		this.estimatedPercentageOfShareClassTotalNAV = estimatedPercentageOfShareClassTotalNAV;
	}

	public List<CashInForecast6> getEstimatedCashInForecastDetails() {
		return estimatedCashInForecastDetails;
	}

	public void setEstimatedCashInForecastDetails(List<com.tools20022.repository.msg.CashInForecast6> estimatedCashInForecastDetails) {
		this.estimatedCashInForecastDetails = estimatedCashInForecastDetails;
	}

	public List<CashOutForecast6> getEstimatedCashOutForecastDetails() {
		return estimatedCashOutForecastDetails;
	}

	public void setEstimatedCashOutForecastDetails(List<com.tools20022.repository.msg.CashOutForecast6> estimatedCashOutForecastDetails) {
		this.estimatedCashOutForecastDetails = estimatedCashOutForecastDetails;
	}

	public List<NetCashForecast4> getEstimatedNetCashForecastDetails() {
		return estimatedNetCashForecastDetails;
	}

	public void setEstimatedNetCashForecastDetails(List<com.tools20022.repository.msg.NetCashForecast4> estimatedNetCashForecastDetails) {
		this.estimatedNetCashForecastDetails = estimatedNetCashForecastDetails;
	}
}
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
import com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04;
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
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmIdentification
 * FundCashForecast6.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmTradeDateTime
 * FundCashForecast6.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPreviousTradeDateTime
 * FundCashForecast6.mmPreviousTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmFinancialInstrumentDetails
 * FundCashForecast6.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast6#mmTotalNAV
 * FundCashForecast6.mmTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPreviousTotalNAV
 * FundCashForecast6.mmPreviousTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmTotalUnitsNumber
 * FundCashForecast6.mmTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPreviousTotalUnitsNumber
 * FundCashForecast6.mmPreviousTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmTotalNAVChangeRate
 * FundCashForecast6.mmTotalNAVChangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmInvestmentCurrency
 * FundCashForecast6.mmInvestmentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmCurrencyStatus
 * FundCashForecast6.mmCurrencyStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmExceptionalNetCashFlowIndicator
 * FundCashForecast6.mmExceptionalNetCashFlowIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPrice
 * FundCashForecast6.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmForeignExchangeRate
 * FundCashForecast6.mmForeignExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPercentageOfShareClassTotalNAV
 * FundCashForecast6.mmPercentageOfShareClassTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmBreakdownByParty
 * FundCashForecast6.mmBreakdownByParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmBreakdownByCountry
 * FundCashForecast6.mmBreakdownByCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmBreakdownByCurrency
 * FundCashForecast6.mmBreakdownByCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmBreakdownByUserDefinedParameter
 * FundCashForecast6.mmBreakdownByUserDefinedParameter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmNetCashForecastDetails
 * FundCashForecast6.mmNetCashForecastDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmFundCashForecastDetails
 * FundDetailedConfirmedCashForecastReportV04.mmFundCashForecastDetails}</li>
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
 * "FundCashForecast6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FundCashForecast4
 * FundCashForecast4}</li>
 * </ul>
 */
public class FundCashForecast6 {

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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmIdentification
	 * FundCashForecast4.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique technical identifier for an instance of a fund cash forecast within a fund cash forecast report as assigned by the issuer of the report.";
			previousVersion_lazy = () -> FundCashForecast4.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice tradeDateTime;
	/**
	 * Date and, if required, the time, at which the price has been applied.
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
	 * "Date and, if required, the time, at which the price has been applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmTradeDateTime
	 * FundCashForecast4.mmTradeDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and, if required, the time, at which the price has been applied.";
			previousVersion_lazy = () -> FundCashForecast4.mmTradeDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmPreviousTradeDateTime
	 * FundCashForecast4.mmPreviousTradeDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "PrvsTradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTradeDateTime";
			definition = "Previous date and time at which the price was applied.";
			previousVersion_lazy = () -> FundCashForecast4.mmPreviousTradeDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmFinancialInstrumentDetails
	 * FundCashForecast4.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentFund;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class to which the cash flow is related.";
			previousVersion_lazy = () -> FundCashForecast4.mmFinancialInstrumentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument9.mmObject();
		}
	};
	protected List<ActiveOrHistoricCurrencyAndAmount> totalNAV;
	/**
	 * Total value of all the holdings, less the fund's liabilities,
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmTotalNAV
	 * FundCashForecast4.mmTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNAV = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "TtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNAV";
			definition = "Total value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			previousVersion_lazy = () -> FundCashForecast4.mmTotalNAV;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmPreviousTotalNAV
	 * FundCashForecast4.mmPreviousTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTotalNAV = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalNAV";
			definition = "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			previousVersion_lazy = () -> FundCashForecast4.mmPreviousTotalNAV;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 totalUnitsNumber;
	/**
	 * Total number of investment fund class units that have been issued.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmOrder
	 * InvestmentFundOrderExecution.mmOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of investment fund class units that have been issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmTotalUnitsNumber
	 * FundCashForecast4.mmTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmOrder;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumber";
			definition = "Total number of investment fund class units that have been issued.";
			previousVersion_lazy = () -> FundCashForecast4.mmTotalUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 previousTotalUnitsNumber;
	/**
	 * Previous total number of investment fund class units that have been
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
	 * NetAssetValueCalculation.mmRelatedFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
	 * "Previous total number of investment fund class units that have been issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmPreviousTotalUnitsNumber
	 * FundCashForecast4.mmPreviousTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmRelatedFund;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalUnitsNumber";
			definition = "Previous total number of investment fund class units that have been issued.";
			previousVersion_lazy = () -> FundCashForecast4.mmPreviousTotalUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected PercentageRate totalNAVChangeRate;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNAVChngRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNAVChangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of change of the net asset value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmTotalNAVChangeRate
	 * FundCashForecast4.mmTotalNAVChangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNAVChangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmNetAssetValueChangeRate;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "TtlNAVChngRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNAVChangeRate";
			definition = "Rate of change of the net asset value.";
			previousVersion_lazy = () -> FundCashForecast4.mmTotalNAVChangeRate;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmInvestmentCurrency
	 * FundCashForecast4.mmInvestmentCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestmentCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmTradingCurrency;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "InvstmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentCurrency";
			definition = "Currency of the investment fund class.";
			previousVersion_lazy = () -> FundCashForecast4.mmInvestmentCurrency;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
			componentContext_lazy = () -> FundCashForecast6.mmObject();
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
	 * Indicates whether the net cash flow is exceptional.
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
	 * definition} = "Indicates whether the net cash flow is exceptional."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmExceptionalNetCashFlowIndicator
	 * FundCashForecast4.mmExceptionalNetCashFlowIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExceptionalNetCashFlowIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> FundsCashFlow.mmExceptionalCashFlowIndicator;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "XcptnlNetCshFlowInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalNetCashFlowIndicator";
			definition = "Indicates whether the net cash flow is exceptional.";
			previousVersion_lazy = () -> FundCashForecast4.mmExceptionalNetCashFlowIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected UnitPrice19 price;
	/**
	 * Price per unit of the trade date.
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
	 * definition} = "Price per unit of the trade date."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Price per unit of the trade date.";
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
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
			componentContext_lazy = () -> FundCashForecast6.mmObject();
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
	protected PercentageRate percentageOfShareClassTotalNAV;
	/**
	 * Net cash flow expressed as a percentage of the total NAV for the share
	 * class.
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgOfShrClssTtlNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfShareClassTotalNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash flow expressed as a percentage of the total NAV for the share class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageOfShareClassTotalNAV = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "PctgOfShrClssTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfShareClassTotalNAV";
			definition = "Net cash flow expressed as a percentage of the total NAV for the share class.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BreakdownByParty3> breakdownByParty;
	/**
	 * Cash flow by party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BreakdownByParty3
	 * BreakdownByParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkdwnByPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BreakdownByParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash flow by party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmBreakdownByParty
	 * FundCashForecast4.mmBreakdownByParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBreakdownByParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "BrkdwnByPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BreakdownByParty";
			definition = "Cash flow by party.";
			previousVersion_lazy = () -> FundCashForecast4.mmBreakdownByParty;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BreakdownByParty3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BreakdownByCountry2> breakdownByCountry;
	/**
	 * Cash flow by country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BreakdownByCountry2
	 * BreakdownByCountry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkdwnByCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BreakdownByCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash flow by country."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmBreakdownByCountry
	 * FundCashForecast4.mmBreakdownByCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBreakdownByCountry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "BrkdwnByCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BreakdownByCountry";
			definition = "Cash flow by country.";
			previousVersion_lazy = () -> FundCashForecast4.mmBreakdownByCountry;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BreakdownByCountry2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BreakdownByCurrency2> breakdownByCurrency;
	/**
	 * Cash flow by currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2
	 * BreakdownByCurrency2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkdwnByCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BreakdownByCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash flow by currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmBreakdownByCurrency
	 * FundCashForecast4.mmBreakdownByCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBreakdownByCurrency = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "BrkdwnByCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BreakdownByCurrency";
			definition = "Cash flow by currency.";
			previousVersion_lazy = () -> FundCashForecast4.mmBreakdownByCurrency;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BreakdownByCurrency2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BreakdownByUserDefinedParameter3> breakdownByUserDefinedParameter;
	/**
	 * Cash flow by a user defined parameter/s.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkdwnByUsrDfndParam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BreakdownByUserDefinedParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash flow by a user defined parameter/s."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmBreakdownByUserDefinedParameter
	 * FundCashForecast4.mmBreakdownByUserDefinedParameter}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBreakdownByUserDefinedParameter = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "BrkdwnByUsrDfndParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BreakdownByUserDefinedParameter";
			definition = "Cash flow by a user defined parameter/s.";
			previousVersion_lazy = () -> FundCashForecast4.mmBreakdownByUserDefinedParameter;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.NetCashForecast4> netCashForecastDetails;
	/**
	 * Net cash movements per financial instrument.
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6
	 * FundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetCshFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net cash movements per financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmNetCashForecastDetails
	 * FundCashForecast4.mmNetCashForecastDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetCashForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> FundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecastDetails";
			definition = "Net cash movements per financial instrument.";
			previousVersion_lazy = () -> FundCashForecast4.mmNetCashForecastDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FundCashForecast6.mmIdentification, FundCashForecast6.mmTradeDateTime, FundCashForecast6.mmPreviousTradeDateTime, FundCashForecast6.mmFinancialInstrumentDetails,
						FundCashForecast6.mmTotalNAV, FundCashForecast6.mmPreviousTotalNAV, FundCashForecast6.mmTotalUnitsNumber, FundCashForecast6.mmPreviousTotalUnitsNumber, FundCashForecast6.mmTotalNAVChangeRate,
						FundCashForecast6.mmInvestmentCurrency, FundCashForecast6.mmCurrencyStatus, FundCashForecast6.mmExceptionalNetCashFlowIndicator, FundCashForecast6.mmPrice, FundCashForecast6.mmForeignExchangeRate,
						FundCashForecast6.mmPercentageOfShareClassTotalNAV, FundCashForecast6.mmBreakdownByParty, FundCashForecast6.mmBreakdownByCountry, FundCashForecast6.mmBreakdownByCurrency,
						FundCashForecast6.mmBreakdownByUserDefinedParameter, FundCashForecast6.mmNetCashForecastDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundDetailedConfirmedCashForecastReportV04.mmFundCashForecastDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundCashForecast6";
				definition = "Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions.";
				previousVersion_lazy = () -> FundCashForecast4.mmObject();
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

	public List<ActiveOrHistoricCurrencyAndAmount> getTotalNAV() {
		return totalNAV;
	}

	public void setTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> totalNAV) {
		this.totalNAV = totalNAV;
	}

	public List<ActiveOrHistoricCurrencyAndAmount> getPreviousTotalNAV() {
		return previousTotalNAV;
	}

	public void setPreviousTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> previousTotalNAV) {
		this.previousTotalNAV = previousTotalNAV;
	}

	public FinancialInstrumentQuantity1 getTotalUnitsNumber() {
		return totalUnitsNumber;
	}

	public void setTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 totalUnitsNumber) {
		this.totalUnitsNumber = totalUnitsNumber;
	}

	public FinancialInstrumentQuantity1 getPreviousTotalUnitsNumber() {
		return previousTotalUnitsNumber;
	}

	public void setPreviousTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 previousTotalUnitsNumber) {
		this.previousTotalUnitsNumber = previousTotalUnitsNumber;
	}

	public PercentageRate getTotalNAVChangeRate() {
		return totalNAVChangeRate;
	}

	public void setTotalNAVChangeRate(PercentageRate totalNAVChangeRate) {
		this.totalNAVChangeRate = totalNAVChangeRate;
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

	public PercentageRate getPercentageOfShareClassTotalNAV() {
		return percentageOfShareClassTotalNAV;
	}

	public void setPercentageOfShareClassTotalNAV(PercentageRate percentageOfShareClassTotalNAV) {
		this.percentageOfShareClassTotalNAV = percentageOfShareClassTotalNAV;
	}

	public List<BreakdownByParty3> getBreakdownByParty() {
		return breakdownByParty;
	}

	public void setBreakdownByParty(List<com.tools20022.repository.msg.BreakdownByParty3> breakdownByParty) {
		this.breakdownByParty = breakdownByParty;
	}

	public List<BreakdownByCountry2> getBreakdownByCountry() {
		return breakdownByCountry;
	}

	public void setBreakdownByCountry(List<com.tools20022.repository.msg.BreakdownByCountry2> breakdownByCountry) {
		this.breakdownByCountry = breakdownByCountry;
	}

	public List<BreakdownByCurrency2> getBreakdownByCurrency() {
		return breakdownByCurrency;
	}

	public void setBreakdownByCurrency(List<com.tools20022.repository.msg.BreakdownByCurrency2> breakdownByCurrency) {
		this.breakdownByCurrency = breakdownByCurrency;
	}

	public List<BreakdownByUserDefinedParameter3> getBreakdownByUserDefinedParameter() {
		return breakdownByUserDefinedParameter;
	}

	public void setBreakdownByUserDefinedParameter(List<com.tools20022.repository.msg.BreakdownByUserDefinedParameter3> breakdownByUserDefinedParameter) {
		this.breakdownByUserDefinedParameter = breakdownByUserDefinedParameter;
	}

	public List<NetCashForecast4> getNetCashForecastDetails() {
		return netCashForecastDetails;
	}

	public void setNetCashForecastDetails(List<com.tools20022.repository.msg.NetCashForecast4> netCashForecastDetails) {
		this.netCashForecastDetails = netCashForecastDetails;
	}
}
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
import com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04;
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
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmIdentification
 * FundCashForecast7.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmTradeDateTime
 * FundCashForecast7.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPreviousTradeDateTime
 * FundCashForecast7.mmPreviousTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmFinancialInstrumentDetails
 * FundCashForecast7.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast7#mmTotalNAV
 * FundCashForecast7.mmTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPreviousTotalNAV
 * FundCashForecast7.mmPreviousTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmTotalUnitsNumber
 * FundCashForecast7.mmTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPreviousTotalUnitsNumber
 * FundCashForecast7.mmPreviousTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmTotalNAVChangeRate
 * FundCashForecast7.mmTotalNAVChangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmInvestmentCurrency
 * FundCashForecast7.mmInvestmentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmCurrencyStatus
 * FundCashForecast7.mmCurrencyStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmExceptionalNetCashFlowIndicator
 * FundCashForecast7.mmExceptionalNetCashFlowIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPrice
 * FundCashForecast7.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmForeignExchangeRate
 * FundCashForecast7.mmForeignExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPercentageOfShareClassTotalNAV
 * FundCashForecast7.mmPercentageOfShareClassTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmCashInForecastDetails
 * FundCashForecast7.mmCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmCashOutForecastDetails
 * FundCashForecast7.mmCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmNetCashForecastDetails
 * FundCashForecast7.mmNetCashForecastDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmFundCashForecastDetails
 * FundConfirmedCashForecastReportV04.mmFundCashForecastDetails}</li>
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
 * "FundCashForecast7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FundCashForecast3
 * FundCashForecast3}</li>
 * </ul>
 */
public class FundCashForecast7 {

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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmIdentification
	 * FundCashForecast3.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique technical identifier for an instance of a fund cash forecast within a fund cash forecast report as assigned by the issuer of the report.";
			previousVersion_lazy = () -> FundCashForecast3.mmIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmTradeDateTime
	 * FundCashForecast3.mmTradeDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and, if required, the time, at which the price has been applied.";
			previousVersion_lazy = () -> FundCashForecast3.mmTradeDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmPreviousTradeDateTime
	 * FundCashForecast3.mmPreviousTradeDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "PrvsTradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTradeDateTime";
			definition = "Previous date and time at which the price was applied.";
			previousVersion_lazy = () -> FundCashForecast3.mmPreviousTradeDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected FinancialInstrument9 financialInstrumentDetails;
	/**
	 * Investment fund class to which a cash flow is related.
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * definition} = "Investment fund class to which a cash flow is related."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmFinancialInstrumentDetails
	 * FundCashForecast3.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentFund;
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class to which a cash flow is related.";
			previousVersion_lazy = () -> FundCashForecast3.mmFinancialInstrumentDetails;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmTotalNAV
	 * FundCashForecast3.mmTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNAV = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "TtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNAV";
			definition = "Total value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			previousVersion_lazy = () -> FundCashForecast3.mmTotalNAV;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmPreviousTotalNAV
	 * FundCashForecast3.mmPreviousTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTotalNAV = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalNAV";
			definition = "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			previousVersion_lazy = () -> FundCashForecast3.mmPreviousTotalNAV;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmTotalUnitsNumber
	 * FundCashForecast3.mmTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmOrder;
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumber";
			definition = "Total number of investment fund class units that have been issued.";
			previousVersion_lazy = () -> FundCashForecast3.mmTotalUnitsNumber;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmPreviousTotalUnitsNumber
	 * FundCashForecast3.mmPreviousTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmRelatedFund;
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalUnitsNumber";
			definition = "Previous total number of investment fund class units that have been issued.";
			previousVersion_lazy = () -> FundCashForecast3.mmPreviousTotalUnitsNumber;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmTotalNAVChangeRate
	 * FundCashForecast3.mmTotalNAVChangeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNAVChangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmNetAssetValueChangeRate;
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "TtlNAVChngRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNAVChangeRate";
			definition = "Rate of change of the net asset value.";
			previousVersion_lazy = () -> FundCashForecast3.mmTotalNAVChangeRate;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmInvestmentCurrency
	 * FundCashForecast3.mmInvestmentCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestmentCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmTradingCurrency;
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "InvstmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentCurrency";
			definition = "Currency of the investment fund class.";
			previousVersion_lazy = () -> FundCashForecast3.mmInvestmentCurrency;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
			componentContext_lazy = () -> FundCashForecast7.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmExceptionalNetCashFlowIndicator
	 * FundCashForecast3.mmExceptionalNetCashFlowIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExceptionalNetCashFlowIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> FundsCashFlow.mmExceptionalCashFlowIndicator;
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "XcptnlNetCshFlowInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalNetCashFlowIndicator";
			definition = "Indicates whether the net cash flow is exceptional.";
			previousVersion_lazy = () -> FundCashForecast3.mmExceptionalNetCashFlowIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
			componentContext_lazy = () -> FundCashForecast7.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
			componentContext_lazy = () -> FundCashForecast7.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
			componentContext_lazy = () -> FundCashForecast7.mmObject();
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
	protected List<com.tools20022.repository.msg.CashInForecast6> cashInForecastDetails;
	/**
	 * Cash movements into the fund as a result of transactions in shares in an
	 * investment fund, for example, subscriptions or switch-ins.
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movements into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmCashInForecastDetails
	 * FundCashForecast3.mmCashInForecastDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashInForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "CshInFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecastDetails";
			definition = "Cash movements into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins.";
			previousVersion_lazy = () -> FundCashForecast3.mmCashInForecastDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashInForecast6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashOutForecast6> cashOutForecastDetails;
	/**
	 * Cash movements out of the fund as a result of transactions in shares in
	 * an investment fund, for example, redemptions or switch-outs.
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshOutFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOutForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movements out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmCashOutForecastDetails
	 * FundCashForecast3.mmCashOutForecastDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashOutForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecastDetails";
			definition = "Cash movements out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs.";
			previousVersion_lazy = () -> FundCashForecast3.mmCashOutForecastDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOutForecast6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.NetCashForecast4> netCashForecastDetails;
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
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7
	 * FundCashForecast7}</li>
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
	 * definition} = "Net cash as a result of the cash-in and cash-out flows."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmNetCashForecastDetails
	 * FundCashForecast3.mmNetCashForecastDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetCashForecastDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> FundCashForecast7.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecastDetails";
			definition = "Net cash as a result of the cash-in and cash-out flows.";
			previousVersion_lazy = () -> FundCashForecast3.mmNetCashForecastDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FundCashForecast7.mmIdentification, FundCashForecast7.mmTradeDateTime, FundCashForecast7.mmPreviousTradeDateTime, FundCashForecast7.mmFinancialInstrumentDetails,
						FundCashForecast7.mmTotalNAV, FundCashForecast7.mmPreviousTotalNAV, FundCashForecast7.mmTotalUnitsNumber, FundCashForecast7.mmPreviousTotalUnitsNumber, FundCashForecast7.mmTotalNAVChangeRate,
						FundCashForecast7.mmInvestmentCurrency, FundCashForecast7.mmCurrencyStatus, FundCashForecast7.mmExceptionalNetCashFlowIndicator, FundCashForecast7.mmPrice, FundCashForecast7.mmForeignExchangeRate,
						FundCashForecast7.mmPercentageOfShareClassTotalNAV, FundCashForecast7.mmCashInForecastDetails, FundCashForecast7.mmCashOutForecastDetails, FundCashForecast7.mmNetCashForecastDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportV04.mmFundCashForecastDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundCashForecast7";
				definition = "Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions.";
				previousVersion_lazy = () -> FundCashForecast3.mmObject();
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

	public List<CashInForecast6> getCashInForecastDetails() {
		return cashInForecastDetails;
	}

	public void setCashInForecastDetails(List<com.tools20022.repository.msg.CashInForecast6> cashInForecastDetails) {
		this.cashInForecastDetails = cashInForecastDetails;
	}

	public List<CashOutForecast6> getCashOutForecastDetails() {
		return cashOutForecastDetails;
	}

	public void setCashOutForecastDetails(List<com.tools20022.repository.msg.CashOutForecast6> cashOutForecastDetails) {
		this.cashOutForecastDetails = cashOutForecastDetails;
	}

	public List<NetCashForecast4> getNetCashForecastDetails() {
		return netCashForecastDetails;
	}

	public void setNetCashForecastDetails(List<com.tools20022.repository.msg.NetCashForecast4> netCashForecastDetails) {
		this.netCashForecastDetails = netCashForecastDetails;
	}
}
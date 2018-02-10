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
import com.tools20022.repository.area.reda.PriceReportV02;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.ValuationTiming1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFund;
import com.tools20022.repository.entity.NetAssetValueCalculation;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Calculation of the net asset value for an investment fund/fund class.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmIdentification
 * PriceValuation2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmValuationDateTime
 * PriceValuation2.mmValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmTradeDateTime
 * PriceValuation2.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmFinancialInstrumentDetails
 * PriceValuation2.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation2#mmTotalNAV
 * PriceValuation2.mmTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmTotalUnitsNumber
 * PriceValuation2.mmTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmNextValuationDateTime
 * PriceValuation2.mmNextValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmPreviousValuationDateTime
 * PriceValuation2.mmPreviousValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmValuationCycle
 * PriceValuation2.mmValuationCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmSuspendedIndicator
 * PriceValuation2.mmSuspendedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation2#mmPriceDetails
 * PriceValuation2.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmValuationStatistics
 * PriceValuation2.mmValuationStatistics}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
 * NetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV02#mmPriceValuationDetails
 * PriceReportV02.mmPriceValuationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDetailsRule#forPriceValuation2
 * ConstraintPriceDetailsRule.forPriceValuation2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceValuation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the net asset value for an investment fund/fund class."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceValuation2", propOrder = {"identification", "valuationDateTime", "tradeDateTime", "financialInstrumentDetails", "totalNAV", "totalUnitsNumber", "nextValuationDateTime", "previousValuationDateTime", "valuationCycle",
		"suspendedIndicator", "priceDetails", "valuationStatistics"})
public class PriceValuation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
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
	 * "Unique technical identifier for an instance of a price valuation within a price report, as assigned by the issuer of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique technical identifier for an instance of a price valuation within a price report, as assigned by the issuer of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ValtnDtTm")
	protected DateAndDateTimeChoice valuationDateTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
	 * NetAssetValueCalculation.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the price valuation for the investment fund/fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "ValtnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDateTime";
			definition = "Date and time of the price valuation for the investment fund/fund class.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "TradDtTm", required = true)
	protected DateAndDateTimeChoice tradeDateTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
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
	 * "Date and time at which a price is applied, according to the terms stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and time at which a price is applied, according to the terms stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument5 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument5
	 * FinancialInstrument5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
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
	 * definition} =
	 * "Investment fund class for which the net asset value is calculated."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFund.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class for which the net asset value is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument5.mmObject();
		}
	};
	@XmlElement(name = "TtlNAV")
	protected List<ActiveOrHistoricCurrencyAndAmount> totalNAV;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
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
	 * "Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNAV = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "TtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNAV";
			definition = "Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlUnitsNb")
	protected FinancialInstrumentQuantity1 totalUnitsNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmRelatedFund;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumber";
			definition = "Total number of investment fund class units that have been issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	@XmlElement(name = "NxtValtnDtTm")
	protected DateAndDateTimeChoice nextValuationDateTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
	 * NetAssetValueCalculation.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtValtnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextValuationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the next price valuation for the investment fund/fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextValuationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "NxtValtnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextValuationDateTime";
			definition = "Date and time of the next price valuation for the investment fund/fund class.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "PrvsValtnDtTm")
	protected DateAndDateTimeChoice previousValuationDateTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
	 * NetAssetValueCalculation.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsValtnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousValuationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the previous price valuation for the investment fund/fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousValuationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "PrvsValtnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousValuationDateTime";
			definition = "Date and time of the previous price valuation for the investment fund/fund class.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "ValtnCycl", required = true)
	protected ValuationTiming1Code valuationCycle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ValuationTiming1Code
	 * ValuationTiming1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationType
	 * NetAssetValueCalculation.mmValuationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnCycl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the valuation is done, based on the schedule stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationCycle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "ValtnCycl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationCycle";
			definition = "Specifies how the valuation is done, based on the schedule stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValuationTiming1Code.mmObject();
		}
	};
	@XmlElement(name = "SspdInd", required = true)
	protected YesNoIndicator suspendedIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSuspendedIndicator
	 * NetAssetValueCalculation.mmSuspendedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SspdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the valuation of the investment fund class is suspended."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSuspendedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmSuspendedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "SspdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspendedIndicator";
			definition = "Indicates whether the valuation of the investment fund class is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PricDtls")
	protected List<com.tools20022.repository.msg.UnitPrice6> priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice6 UnitPrice6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money for which goods or services are offered, sold, or bought."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnitPrice6.mmObject();
		}
	};
	@XmlElement(name = "ValtnSttstcs")
	protected List<com.tools20022.repository.msg.ValuationStatistics2> valuationStatistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ValuationStatistics2
	 * ValuationStatistics2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2
	 * PriceValuation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnSttstcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the price variations of an investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValuationStatistics = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation2.mmObject();
			isDerived = false;
			xmlTag = "ValtnSttstcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationStatistics";
			definition = "Information related to the price variations of an investment fund class.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ValuationStatistics2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceValuation2.mmIdentification, com.tools20022.repository.msg.PriceValuation2.mmValuationDateTime,
						com.tools20022.repository.msg.PriceValuation2.mmTradeDateTime, com.tools20022.repository.msg.PriceValuation2.mmFinancialInstrumentDetails, com.tools20022.repository.msg.PriceValuation2.mmTotalNAV,
						com.tools20022.repository.msg.PriceValuation2.mmTotalUnitsNumber, com.tools20022.repository.msg.PriceValuation2.mmNextValuationDateTime, com.tools20022.repository.msg.PriceValuation2.mmPreviousValuationDateTime,
						com.tools20022.repository.msg.PriceValuation2.mmValuationCycle, com.tools20022.repository.msg.PriceValuation2.mmSuspendedIndicator, com.tools20022.repository.msg.PriceValuation2.mmPriceDetails,
						com.tools20022.repository.msg.PriceValuation2.mmValuationStatistics);
				messageBuildingBlock_lazy = () -> Arrays.asList(PriceReportV02.mmPriceValuationDetails);
				trace_lazy = () -> NetAssetValueCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPriceDetailsRule.forPriceValuation2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceValuation2";
				definition = "Calculation of the net asset value for an investment fund/fund class.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public PriceValuation2 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getValuationDateTime() {
		return valuationDateTime == null ? Optional.empty() : Optional.of(valuationDateTime);
	}

	public PriceValuation2 setValuationDateTime(DateAndDateTimeChoice valuationDateTime) {
		this.valuationDateTime = valuationDateTime;
		return this;
	}

	public DateAndDateTimeChoice getTradeDateTime() {
		return tradeDateTime;
	}

	public PriceValuation2 setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public FinancialInstrument5 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public PriceValuation2 setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument5 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public List<ActiveOrHistoricCurrencyAndAmount> getTotalNAV() {
		return totalNAV == null ? totalNAV = new ArrayList<>() : totalNAV;
	}

	public PriceValuation2 setTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> totalNAV) {
		this.totalNAV = Objects.requireNonNull(totalNAV);
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getTotalUnitsNumber() {
		return totalUnitsNumber == null ? Optional.empty() : Optional.of(totalUnitsNumber);
	}

	public PriceValuation2 setTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 totalUnitsNumber) {
		this.totalUnitsNumber = totalUnitsNumber;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getNextValuationDateTime() {
		return nextValuationDateTime == null ? Optional.empty() : Optional.of(nextValuationDateTime);
	}

	public PriceValuation2 setNextValuationDateTime(DateAndDateTimeChoice nextValuationDateTime) {
		this.nextValuationDateTime = nextValuationDateTime;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getPreviousValuationDateTime() {
		return previousValuationDateTime == null ? Optional.empty() : Optional.of(previousValuationDateTime);
	}

	public PriceValuation2 setPreviousValuationDateTime(DateAndDateTimeChoice previousValuationDateTime) {
		this.previousValuationDateTime = previousValuationDateTime;
		return this;
	}

	public ValuationTiming1Code getValuationCycle() {
		return valuationCycle;
	}

	public PriceValuation2 setValuationCycle(ValuationTiming1Code valuationCycle) {
		this.valuationCycle = Objects.requireNonNull(valuationCycle);
		return this;
	}

	public YesNoIndicator getSuspendedIndicator() {
		return suspendedIndicator;
	}

	public PriceValuation2 setSuspendedIndicator(YesNoIndicator suspendedIndicator) {
		this.suspendedIndicator = Objects.requireNonNull(suspendedIndicator);
		return this;
	}

	public List<UnitPrice6> getPriceDetails() {
		return priceDetails == null ? priceDetails = new ArrayList<>() : priceDetails;
	}

	public PriceValuation2 setPriceDetails(List<com.tools20022.repository.msg.UnitPrice6> priceDetails) {
		this.priceDetails = Objects.requireNonNull(priceDetails);
		return this;
	}

	public List<ValuationStatistics2> getValuationStatistics() {
		return valuationStatistics == null ? valuationStatistics = new ArrayList<>() : valuationStatistics;
	}

	public PriceValuation2 setValuationStatistics(List<com.tools20022.repository.msg.ValuationStatistics2> valuationStatistics) {
		this.valuationStatistics = Objects.requireNonNull(valuationStatistics);
		return this;
	}
}
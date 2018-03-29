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
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashInOutForecast7;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import com.tools20022.repository.msg.NetCashForecast5;
import com.tools20022.repository.msg.OtherIdentification4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about an investment fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmName Fund1.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmLegalEntityIdentifier
 * Fund1.mmLegalEntityIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmIdentification
 * Fund1.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmCurrency
 * Fund1.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmTradeDateTime
 * Fund1.mmTradeDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTradeDateTime
 * Fund1.mmPreviousTradeDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedTotalNAV
 * Fund1.mmEstimatedTotalNAV}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTotalNAV
 * Fund1.mmPreviousTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedTotalUnitsNumber
 * Fund1.mmEstimatedTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTotalUnitsNumber
 * Fund1.mmPreviousTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedPercentageOfFundTotalNAV
 * Fund1.mmEstimatedPercentageOfFundTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedCashInForecastDetails
 * Fund1.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedCashOutForecastDetails
 * Fund1.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedNetCashForecastDetails
 * Fund1.mmEstimatedNetCashForecastDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmFundOrSubFundDetails
 * FundEstimatedCashForecastReportV04.mmFundOrSubFundDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintFundIdentification1Rule#forFund1
 * ConstraintFundIdentification1Rule.forFund1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFundIdentification2Rule#forFund1
 * ConstraintFundIdentification2Rule.forFund1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFundIdentification3Rule#forFund1
 * ConstraintFundIdentification3Rule.forFund1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Fund1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about an investment fund."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Fund2 Fund2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund3 Fund3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
 * EstimatedFundCashForecast5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Fund1", propOrder = {"name", "legalEntityIdentifier", "identification", "currency", "tradeDateTime", "previousTradeDateTime", "estimatedTotalNAV", "previousTotalNAV", "estimatedTotalUnitsNumber",
		"previousTotalUnitsNumber", "estimatedPercentageOfFundTotalNAV", "estimatedCashInForecastDetails", "estimatedCashOutForecastDetails", "estimatedNetCashForecastDetails"})
public class Fund1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm")
	protected Max350Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the fund/sub fund."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmName Fund3.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fund1, Optional<Max350Text>> mmName = new MMMessageAttribute<Fund1, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the fund/sub fund.";
			nextVersions_lazy = () -> Arrays.asList(Fund3.mmName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(Fund1 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(Fund1 obj, Optional<Max350Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "LglNttyIdr")
	protected LEIIdentifier legalEntityIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglNttyIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalEntityIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the fund/sub fund with a Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\"."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmLegalEntityIdentifier
	 * Fund3.mmLegalEntityIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fund1, Optional<LEIIdentifier>> mmLegalEntityIdentifier = new MMMessageAttribute<Fund1, Optional<LEIIdentifier>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "LglNttyIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalEntityIdentifier";
			definition = "Identification of the fund/sub fund with a Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			nextVersions_lazy = () -> Arrays.asList(Fund3.mmLegalEntityIdentifier);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public Optional<LEIIdentifier> getValue(Fund1 obj) {
			return obj.getLegalEntityIdentifier();
		}

		@Override
		public void setValue(Fund1 obj, Optional<LEIIdentifier> value) {
			obj.setLegalEntityIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "Id")
	protected OtherIdentification4 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherIdentification4
	 * OtherIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
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
	 * "Unique and unambiguous identifier for the fund/sub fund, assigned under a formal or proprietary identification scheme."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmIdentification
	 * Fund3.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Fund1, Optional<OtherIdentification4>> mmIdentification = new MMMessageAssociationEnd<Fund1, Optional<OtherIdentification4>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for the fund/sub fund, assigned under a formal or proprietary identification scheme.";
			nextVersions_lazy = () -> Arrays.asList(Fund3.mmIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherIdentification4.mmObject();
		}

		@Override
		public Optional<OtherIdentification4> getValue(Fund1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Fund1 obj, Optional<OtherIdentification4> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the fund/sub fund."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmCurrency
	 * Fund2.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmCurrency
	 * Fund3.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmInvestmentCurrency
	 * EstimatedFundCashForecast5.mmInvestmentCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fund1, Optional<ActiveOrHistoricCurrencyCode>> mmCurrency = new MMMessageAttribute<Fund1, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmTradingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the fund/sub fund.";
			nextVersions_lazy = () -> Arrays.asList(Fund2.mmCurrency, Fund3.mmCurrency);
			previousVersion_lazy = () -> EstimatedFundCashForecast5.mmInvestmentCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(Fund1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(Fund1 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtTm")
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<Fund1, Optional<DateAndDateTimeChoice>> mmTradeDateTime = new MMMessageAttribute<Fund1, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and, if required, the time, at which the price will be applied.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(Fund1 obj) {
			return obj.getTradeDateTime();
		}

		@Override
		public void setValue(Fund1 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setTradeDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsTradDtTm")
	protected DateAndDateTimeChoice previousTradeDateTime;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
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
	 * definition} = "Previous date and time at which a price was applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fund1, Optional<DateAndDateTimeChoice>> mmPreviousTradeDateTime = new MMMessageAttribute<Fund1, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "PrvsTradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTradeDateTime";
			definition = "Previous date and time at which a price was applied.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(Fund1 obj) {
			return obj.getPreviousTradeDateTime();
		}

		@Override
		public void setValue(Fund1 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setPreviousTradeDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdTtlNAV")
	protected ActiveOrHistoricCurrencyAndAmount estimatedTotalNAV;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
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
	 * "Estimated total value of all the holdings, less the fund's liabilities, of the fund/sub fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmTotalNAV
	 * Fund2.mmTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmEstimatedTotalNAV
	 * Fund3.mmEstimatedTotalNAV}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedTotalNAV
	 * EstimatedFundCashForecast5.mmEstimatedTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fund1, Optional<ActiveOrHistoricCurrencyAndAmount>> mmEstimatedTotalNAV = new MMMessageAttribute<Fund1, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalNAV";
			definition = "Estimated total value of all the holdings, less the fund's liabilities, of the fund/sub fund.";
			nextVersions_lazy = () -> Arrays.asList(Fund2.mmTotalNAV, Fund3.mmEstimatedTotalNAV);
			previousVersion_lazy = () -> EstimatedFundCashForecast5.mmEstimatedTotalNAV;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(Fund1 obj) {
			return obj.getEstimatedTotalNAV();
		}

		@Override
		public void setValue(Fund1 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setEstimatedTotalNAV(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsTtlNAV")
	protected ActiveOrHistoricCurrencyAndAmount previousTotalNAV;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
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
	 * "Previous total value of all the holdings, less the fund's liabilities, of the fund/sub fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmPreviousTotalNAV
	 * Fund2.mmPreviousTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmPreviousTotalNAV
	 * Fund3.mmPreviousTotalNAV}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPreviousTotalNAV
	 * EstimatedFundCashForecast5.mmPreviousTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fund1, Optional<ActiveOrHistoricCurrencyAndAmount>> mmPreviousTotalNAV = new MMMessageAttribute<Fund1, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalNAV";
			definition = "Previous total value of all the holdings, less the fund's liabilities, of the fund/sub fund.";
			nextVersions_lazy = () -> Arrays.asList(Fund2.mmPreviousTotalNAV, Fund3.mmPreviousTotalNAV);
			previousVersion_lazy = () -> EstimatedFundCashForecast5.mmPreviousTotalNAV;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(Fund1 obj) {
			return obj.getPreviousTotalNAV();
		}

		@Override
		public void setValue(Fund1 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setPreviousTotalNAV(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdTtlUnitsNb")
	protected FinancialInstrumentQuantity1 estimatedTotalUnitsNumber;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
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
	 * definition} = "Estimated total number of units of the fund/sub fund."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmTotalUnitsNumber
	 * Fund2.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmEstimatedTotalUnitsNumber
	 * Fund3.mmEstimatedTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast5.mmEstimatedTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fund1, Optional<FinancialInstrumentQuantity1>> mmEstimatedTotalUnitsNumber = new MMMessageAttribute<Fund1, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalUnitsNumber";
			definition = "Estimated total number of units of the fund/sub fund.";
			nextVersions_lazy = () -> Arrays.asList(Fund2.mmTotalUnitsNumber, Fund3.mmEstimatedTotalUnitsNumber);
			previousVersion_lazy = () -> EstimatedFundCashForecast5.mmEstimatedTotalUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(Fund1 obj) {
			return obj.getEstimatedTotalUnitsNumber();
		}

		@Override
		public void setValue(Fund1 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setEstimatedTotalUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsTtlUnitsNb")
	protected FinancialInstrumentQuantity1 previousTotalUnitsNumber;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
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
	 * definition} = "Previous total number of units of the fund/sub fund."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund2#mmPreviousTotalUnitsNumber
	 * Fund2.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmPreviousTotalUnitsNumber
	 * Fund3.mmPreviousTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast5.mmPreviousTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fund1, Optional<FinancialInstrumentQuantity1>> mmPreviousTotalUnitsNumber = new MMMessageAttribute<Fund1, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalUnitsNumber";
			definition = "Previous total number of units of the fund/sub fund.";
			nextVersions_lazy = () -> Arrays.asList(Fund2.mmPreviousTotalUnitsNumber, Fund3.mmPreviousTotalUnitsNumber);
			previousVersion_lazy = () -> EstimatedFundCashForecast5.mmPreviousTotalUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(Fund1 obj) {
			return obj.getPreviousTotalUnitsNumber();
		}

		@Override
		public void setValue(Fund1 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setPreviousTotalUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdPctgOfFndTtlNAV")
	protected PercentageRate estimatedPercentageOfFundTotalNAV;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdPctgOfFndTtlNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedPercentageOfFundTotalNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated consolidated net cash flow expressed as a percentage of the previous total NAV for the fund/sub fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmEstimatedPercentageOfFundTotalNAV
	 * Fund3.mmEstimatedPercentageOfFundTotalNAV}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Fund1, Optional<PercentageRate>> mmEstimatedPercentageOfFundTotalNAV = new MMMessageAttribute<Fund1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "EstmtdPctgOfFndTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedPercentageOfFundTotalNAV";
			definition = "Estimated consolidated net cash flow expressed as a percentage of the previous total NAV for the fund/sub fund.";
			nextVersions_lazy = () -> Arrays.asList(Fund3.mmEstimatedPercentageOfFundTotalNAV);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Fund1 obj) {
			return obj.getEstimatedPercentageOfFundTotalNAV();
		}

		@Override
		public void setValue(Fund1 obj, Optional<PercentageRate> value) {
			obj.setEstimatedPercentageOfFundTotalNAV(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdCshInFcstDtls")
	protected List<CashInOutForecast7> estimatedCashInForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInOutForecast7
	 * CashInOutForecast7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
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
	 * definition} = "Estimated cash movement into the fund/sub fund."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Fund1, List<CashInOutForecast7>> mmEstimatedCashInForecastDetails = new MMMessageAssociationEnd<Fund1, List<CashInOutForecast7>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "EstmtdCshInFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedCashInForecastDetails";
			definition = "Estimated cash movement into the fund/sub fund.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashInOutForecast7.mmObject();
		}

		@Override
		public List<CashInOutForecast7> getValue(Fund1 obj) {
			return obj.getEstimatedCashInForecastDetails();
		}

		@Override
		public void setValue(Fund1 obj, List<CashInOutForecast7> value) {
			obj.setEstimatedCashInForecastDetails(value);
		}
	};
	@XmlElement(name = "EstmtdCshOutFcstDtls")
	protected List<CashInOutForecast7> estimatedCashOutForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInOutForecast7
	 * CashInOutForecast7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
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
	 * definition} = "Estimated cash movement out of the fund/sub fund."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Fund1, List<CashInOutForecast7>> mmEstimatedCashOutForecastDetails = new MMMessageAssociationEnd<Fund1, List<CashInOutForecast7>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "EstmtdCshOutFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedCashOutForecastDetails";
			definition = "Estimated cash movement out of the fund/sub fund.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashInOutForecast7.mmObject();
		}

		@Override
		public List<CashInOutForecast7> getValue(Fund1 obj) {
			return obj.getEstimatedCashOutForecastDetails();
		}

		@Override
		public void setValue(Fund1 obj, List<CashInOutForecast7> value) {
			obj.setEstimatedCashOutForecastDetails(value);
		}
	};
	@XmlElement(name = "EstmtdNetCshFcstDtls")
	protected List<NetCashForecast5> estimatedNetCashForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast5
	 * NetCashForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund1
	 * Fund1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Fund1, List<NetCashForecast5>> mmEstimatedNetCashForecastDetails = new MMMessageAssociationEnd<Fund1, List<NetCashForecast5>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Fund1.mmObject();
			isDerived = false;
			xmlTag = "EstmtdNetCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedNetCashForecastDetails";
			definition = "Net cash as a result of the cash-in and cash-out flows.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetCashForecast5.mmObject();
		}

		@Override
		public List<NetCashForecast5> getValue(Fund1 obj) {
			return obj.getEstimatedNetCashForecastDetails();
		}

		@Override
		public void setValue(Fund1 obj, List<NetCashForecast5> value) {
			obj.setEstimatedNetCashForecastDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Fund1.mmName, com.tools20022.repository.msg.Fund1.mmLegalEntityIdentifier, com.tools20022.repository.msg.Fund1.mmIdentification,
						com.tools20022.repository.msg.Fund1.mmCurrency, com.tools20022.repository.msg.Fund1.mmTradeDateTime, com.tools20022.repository.msg.Fund1.mmPreviousTradeDateTime,
						com.tools20022.repository.msg.Fund1.mmEstimatedTotalNAV, com.tools20022.repository.msg.Fund1.mmPreviousTotalNAV, com.tools20022.repository.msg.Fund1.mmEstimatedTotalUnitsNumber,
						com.tools20022.repository.msg.Fund1.mmPreviousTotalUnitsNumber, com.tools20022.repository.msg.Fund1.mmEstimatedPercentageOfFundTotalNAV, com.tools20022.repository.msg.Fund1.mmEstimatedCashInForecastDetails,
						com.tools20022.repository.msg.Fund1.mmEstimatedCashOutForecastDetails, com.tools20022.repository.msg.Fund1.mmEstimatedNetCashForecastDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmFundOrSubFundDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundIdentification1Rule.forFund1, com.tools20022.repository.constraints.ConstraintFundIdentification2Rule.forFund1,
						com.tools20022.repository.constraints.ConstraintFundIdentification3Rule.forFund1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Fund1";
				definition = "Information about an investment fund.";
				nextVersions_lazy = () -> Arrays.asList(Fund2.mmObject(), Fund3.mmObject());
				previousVersion_lazy = () -> EstimatedFundCashForecast5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public Fund1 setName(Max350Text name) {
		this.name = name;
		return this;
	}

	public Optional<LEIIdentifier> getLegalEntityIdentifier() {
		return legalEntityIdentifier == null ? Optional.empty() : Optional.of(legalEntityIdentifier);
	}

	public Fund1 setLegalEntityIdentifier(LEIIdentifier legalEntityIdentifier) {
		this.legalEntityIdentifier = legalEntityIdentifier;
		return this;
	}

	public Optional<OtherIdentification4> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public Fund1 setIdentification(OtherIdentification4 identification) {
		this.identification = identification;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public Fund1 setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getTradeDateTime() {
		return tradeDateTime == null ? Optional.empty() : Optional.of(tradeDateTime);
	}

	public Fund1 setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getPreviousTradeDateTime() {
		return previousTradeDateTime == null ? Optional.empty() : Optional.of(previousTradeDateTime);
	}

	public Fund1 setPreviousTradeDateTime(DateAndDateTimeChoice previousTradeDateTime) {
		this.previousTradeDateTime = previousTradeDateTime;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getEstimatedTotalNAV() {
		return estimatedTotalNAV == null ? Optional.empty() : Optional.of(estimatedTotalNAV);
	}

	public Fund1 setEstimatedTotalNAV(ActiveOrHistoricCurrencyAndAmount estimatedTotalNAV) {
		this.estimatedTotalNAV = estimatedTotalNAV;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getPreviousTotalNAV() {
		return previousTotalNAV == null ? Optional.empty() : Optional.of(previousTotalNAV);
	}

	public Fund1 setPreviousTotalNAV(ActiveOrHistoricCurrencyAndAmount previousTotalNAV) {
		this.previousTotalNAV = previousTotalNAV;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getEstimatedTotalUnitsNumber() {
		return estimatedTotalUnitsNumber == null ? Optional.empty() : Optional.of(estimatedTotalUnitsNumber);
	}

	public Fund1 setEstimatedTotalUnitsNumber(FinancialInstrumentQuantity1 estimatedTotalUnitsNumber) {
		this.estimatedTotalUnitsNumber = estimatedTotalUnitsNumber;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getPreviousTotalUnitsNumber() {
		return previousTotalUnitsNumber == null ? Optional.empty() : Optional.of(previousTotalUnitsNumber);
	}

	public Fund1 setPreviousTotalUnitsNumber(FinancialInstrumentQuantity1 previousTotalUnitsNumber) {
		this.previousTotalUnitsNumber = previousTotalUnitsNumber;
		return this;
	}

	public Optional<PercentageRate> getEstimatedPercentageOfFundTotalNAV() {
		return estimatedPercentageOfFundTotalNAV == null ? Optional.empty() : Optional.of(estimatedPercentageOfFundTotalNAV);
	}

	public Fund1 setEstimatedPercentageOfFundTotalNAV(PercentageRate estimatedPercentageOfFundTotalNAV) {
		this.estimatedPercentageOfFundTotalNAV = estimatedPercentageOfFundTotalNAV;
		return this;
	}

	public List<CashInOutForecast7> getEstimatedCashInForecastDetails() {
		return estimatedCashInForecastDetails == null ? estimatedCashInForecastDetails = new ArrayList<>() : estimatedCashInForecastDetails;
	}

	public Fund1 setEstimatedCashInForecastDetails(List<CashInOutForecast7> estimatedCashInForecastDetails) {
		this.estimatedCashInForecastDetails = Objects.requireNonNull(estimatedCashInForecastDetails);
		return this;
	}

	public List<CashInOutForecast7> getEstimatedCashOutForecastDetails() {
		return estimatedCashOutForecastDetails == null ? estimatedCashOutForecastDetails = new ArrayList<>() : estimatedCashOutForecastDetails;
	}

	public Fund1 setEstimatedCashOutForecastDetails(List<CashInOutForecast7> estimatedCashOutForecastDetails) {
		this.estimatedCashOutForecastDetails = Objects.requireNonNull(estimatedCashOutForecastDetails);
		return this;
	}

	public List<NetCashForecast5> getEstimatedNetCashForecastDetails() {
		return estimatedNetCashForecastDetails == null ? estimatedNetCashForecastDetails = new ArrayList<>() : estimatedNetCashForecastDetails;
	}

	public Fund1 setEstimatedNetCashForecastDetails(List<NetCashForecast5> estimatedNetCashForecastDetails) {
		this.estimatedNetCashForecastDetails = Objects.requireNonNull(estimatedNetCashForecastDetails);
		return this;
	}
}
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
import com.tools20022.repository.area.reda.PriceReportV03;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.EventFrequency1Code;
import com.tools20022.repository.codeset.ValuationTiming1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.FundManagerRole;
import com.tools20022.repository.entity.InvestmentFund;
import com.tools20022.repository.entity.NetAssetValueCalculation;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmIdentification
 * PriceValuation3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmValuationDateTime
 * PriceValuation3.mmValuationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation3#mmNAVDateTime
 * PriceValuation3.mmNAVDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmFinancialInstrumentDetails
 * PriceValuation3.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmFundManagementCompany
 * PriceValuation3.mmFundManagementCompany}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation3#mmTotalNAV
 * PriceValuation3.mmTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmTotalUnitsNumber
 * PriceValuation3.mmTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmNextValuationDateTime
 * PriceValuation3.mmNextValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmPreviousValuationDateTime
 * PriceValuation3.mmPreviousValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmValuationType
 * PriceValuation3.mmValuationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmValuationFrequency
 * PriceValuation3.mmValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmOfficialValuationIndicator
 * PriceValuation3.mmOfficialValuationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmSuspendedIndicator
 * PriceValuation3.mmSuspendedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation3#mmPriceDetails
 * PriceValuation3.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmValuationStatistics
 * PriceValuation3.mmValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmPerformanceDetails
 * PriceValuation3.mmPerformanceDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#mmPriceValuationDetails
 * PriceReportV03.mmPriceValuationDetails}</li>
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
 * "PriceValuation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the net asset value for an investment fund/fund class."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation4
 * PriceValuation4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PriceValuation3", propOrder = {"identification", "valuationDateTime", "NAVDateTime", "financialInstrumentDetails", "fundManagementCompany", "totalNAV", "totalUnitsNumber", "nextValuationDateTime",
		"previousValuationDateTime", "valuationType", "valuationFrequency", "officialValuationIndicator", "suspendedIndicator", "priceDetails", "valuationStatistics", "performanceDetails"})
public class PriceValuation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Unique technical identifier for an instance of a price valuation within a
	 * price report, as assigned by the issuer of the report.
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
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
			componentContext_lazy = () -> PriceValuation3.mmObject();
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
	protected DateAndDateTimeChoice valuationDateTime;
	/**
	 * Date and time of the price valuation for the investment fund/fund class.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
	 * NetAssetValueCalculation.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
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
			componentContext_lazy = () -> PriceValuation3.mmObject();
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
	protected DateAndDateTimeChoice nAVDateTime;
	/**
	 * Date and time at which a price is applied, according to the terms stated
	 * in the prospectus. The NAV date is also known as the trade date. The NAV
	 * date becomes the trade date in an order.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
	 * NetAssetValueCalculation.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NAVDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NAVDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a price is applied, according to the terms stated in the prospectus. The NAV date is also known as the trade date. The NAV date becomes the trade date in an order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNAVDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> PriceValuation3.mmObject();
			isDerived = false;
			xmlTag = "NAVDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NAVDateTime";
			definition = "Date and time at which a price is applied, according to the terms stated in the prospectus. The NAV date is also known as the trade date. The NAV date becomes the trade date in an order.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected FinancialInstrument8 financialInstrumentDetails;
	/**
	 * Investment fund class for which the net asset value is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument8
	 * FinancialInstrument8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
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
			componentContext_lazy = () -> PriceValuation3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class for which the net asset value is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument8.mmObject();
		}
	};
	protected PartyIdentification2Choice fundManagementCompany;
	/**
	 * Issuer of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundManagerRole
	 * FundManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndMgmtCpny"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundManagementCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer of the fund."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundManagementCompany = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FundManagerRole.mmObject();
			componentContext_lazy = () -> PriceValuation3.mmObject();
			isDerived = false;
			xmlTag = "FndMgmtCpny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundManagementCompany";
			definition = "Issuer of the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected List<ActiveOrHistoricCurrencyAndAmount> totalNAV;
	/**
	 * Value of all the holdings, less the fund's liabilities, attributable to a
	 * specific investment fund class.
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
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
			componentContext_lazy = () -> PriceValuation3.mmObject();
			isDerived = false;
			xmlTag = "TtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNAV";
			definition = "Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
	 * NetAssetValueCalculation.mmRelatedFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
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
			componentContext_lazy = () -> PriceValuation3.mmObject();
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
	protected DateAndDateTimeChoice nextValuationDateTime;
	/**
	 * Date and time of the next price valuation for the investment fund/fund
	 * class.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
	 * NetAssetValueCalculation.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
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
			componentContext_lazy = () -> PriceValuation3.mmObject();
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
	protected DateAndDateTimeChoice previousValuationDateTime;
	/**
	 * Date and time of the previous price valuation for the investment
	 * fund/fund class.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
	 * NetAssetValueCalculation.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
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
			componentContext_lazy = () -> PriceValuation3.mmObject();
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
	protected ValuationTiming1Code valuationType;
	/**
	 * Specifies how the valuation is done, based on the schedule stated in the
	 * prospectus.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the valuation is done, based on the schedule stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationType;
			componentContext_lazy = () -> PriceValuation3.mmObject();
			isDerived = false;
			xmlTag = "ValtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationType";
			definition = "Specifies how the valuation is done, based on the schedule stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValuationTiming1Code.mmObject();
		}
	};
	protected EventFrequency1Code valuationFrequency;
	/**
	 * Frequency of the valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationFrequency
	 * NetAssetValueCalculation.mmValuationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the valuation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationFrequency;
			componentContext_lazy = () -> PriceValuation3.mmObject();
			isDerived = false;
			xmlTag = "ValtnFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationFrequency";
			definition = "Frequency of the valuation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventFrequency1Code.mmObject();
		}
	};
	protected YesNoIndicator officialValuationIndicator;
	/**
	 * Indicates whether the valuation is an official valuation.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmOfficialValuationIndicator
	 * NetAssetValueCalculation.mmOfficialValuationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffclValtnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialValuationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the valuation is an official valuation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOfficialValuationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmOfficialValuationIndicator;
			componentContext_lazy = () -> PriceValuation3.mmObject();
			isDerived = false;
			xmlTag = "OffclValtnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialValuationIndicator";
			definition = "Indicates whether the valuation is an official valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator suspendedIndicator;
	/**
	 * Indicates whether the valuation of the investment fund class is
	 * suspended.
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSuspendedIndicator
	 * NetAssetValueCalculation.mmSuspendedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
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
			componentContext_lazy = () -> PriceValuation3.mmObject();
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
	protected List<com.tools20022.repository.msg.UnitPrice15> priceDetails;
	/**
	 * Amount of money for which goods or services are offered, sold, or bought.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice15
	 * UnitPrice15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
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
			componentContext_lazy = () -> PriceValuation3.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnitPrice15.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ValuationStatistics3> valuationStatistics;
	/**
	 * Information related to the price variations of an investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ValuationStatistics3
	 * ValuationStatistics3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationStatistics
	 * NetAssetValueCalculation.mmValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
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
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationStatistics;
			componentContext_lazy = () -> PriceValuation3.mmObject();
			isDerived = false;
			xmlTag = "ValtnSttstcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationStatistics";
			definition = "Information related to the price variations of an investment fund class.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ValuationStatistics3.mmObject();
		}
	};
	protected PerformanceFactors1 performanceDetails;
	/**
	 * Factors that give indications about the performance of a fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PerformanceFactors1
	 * PerformanceFactors1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInvestmentFundPerformanceFactors
	 * NetAssetValueCalculation.mmInvestmentFundPerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3
	 * PriceValuation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrfrmncDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerformanceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factors that give indications about the performance of a fund."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPerformanceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmInvestmentFundPerformanceFactors;
			componentContext_lazy = () -> PriceValuation3.mmObject();
			isDerived = false;
			xmlTag = "PrfrmncDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerformanceDetails";
			definition = "Factors that give indications about the performance of a fund.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PerformanceFactors1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PriceValuation3.mmIdentification, PriceValuation3.mmValuationDateTime, PriceValuation3.mmNAVDateTime, PriceValuation3.mmFinancialInstrumentDetails,
						PriceValuation3.mmFundManagementCompany, PriceValuation3.mmTotalNAV, PriceValuation3.mmTotalUnitsNumber, PriceValuation3.mmNextValuationDateTime, PriceValuation3.mmPreviousValuationDateTime,
						PriceValuation3.mmValuationType, PriceValuation3.mmValuationFrequency, PriceValuation3.mmOfficialValuationIndicator, PriceValuation3.mmSuspendedIndicator, PriceValuation3.mmPriceDetails,
						PriceValuation3.mmValuationStatistics, PriceValuation3.mmPerformanceDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(PriceReportV03.mmPriceValuationDetails);
				trace_lazy = () -> NetAssetValueCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceValuation3";
				definition = "Calculation of the net asset value for an investment fund/fund class.";
				nextVersions_lazy = () -> Arrays.asList(PriceValuation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "ValtnDtTm")
	public DateAndDateTimeChoice getValuationDateTime() {
		return valuationDateTime;
	}

	public void setValuationDateTime(DateAndDateTimeChoice valuationDateTime) {
		this.valuationDateTime = valuationDateTime;
	}

	@XmlElement(name = "NAVDtTm", required = true)
	public DateAndDateTimeChoice getNAVDateTime() {
		return nAVDateTime;
	}

	public void setNAVDateTime(DateAndDateTimeChoice nAVDateTime) {
		this.nAVDateTime = nAVDateTime;
	}

	@XmlElement(name = "FinInstrmDtls", required = true)
	public FinancialInstrument8 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument8 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
	}

	@XmlElement(name = "FndMgmtCpny")
	public PartyIdentification2Choice getFundManagementCompany() {
		return fundManagementCompany;
	}

	public void setFundManagementCompany(PartyIdentification2Choice fundManagementCompany) {
		this.fundManagementCompany = fundManagementCompany;
	}

	@XmlElement(name = "TtlNAV")
	public List<ActiveOrHistoricCurrencyAndAmount> getTotalNAV() {
		return totalNAV;
	}

	public void setTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> totalNAV) {
		this.totalNAV = totalNAV;
	}

	@XmlElement(name = "TtlUnitsNb")
	public FinancialInstrumentQuantity1 getTotalUnitsNumber() {
		return totalUnitsNumber;
	}

	public void setTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 totalUnitsNumber) {
		this.totalUnitsNumber = totalUnitsNumber;
	}

	@XmlElement(name = "NxtValtnDtTm")
	public DateAndDateTimeChoice getNextValuationDateTime() {
		return nextValuationDateTime;
	}

	public void setNextValuationDateTime(DateAndDateTimeChoice nextValuationDateTime) {
		this.nextValuationDateTime = nextValuationDateTime;
	}

	@XmlElement(name = "PrvsValtnDtTm")
	public DateAndDateTimeChoice getPreviousValuationDateTime() {
		return previousValuationDateTime;
	}

	public void setPreviousValuationDateTime(DateAndDateTimeChoice previousValuationDateTime) {
		this.previousValuationDateTime = previousValuationDateTime;
	}

	@XmlElement(name = "ValtnTp", required = true)
	public ValuationTiming1Code getValuationType() {
		return valuationType;
	}

	public void setValuationType(ValuationTiming1Code valuationType) {
		this.valuationType = valuationType;
	}

	@XmlElement(name = "ValtnFrqcy")
	public EventFrequency1Code getValuationFrequency() {
		return valuationFrequency;
	}

	public void setValuationFrequency(EventFrequency1Code valuationFrequency) {
		this.valuationFrequency = valuationFrequency;
	}

	@XmlElement(name = "OffclValtnInd", required = true)
	public YesNoIndicator getOfficialValuationIndicator() {
		return officialValuationIndicator;
	}

	public void setOfficialValuationIndicator(YesNoIndicator officialValuationIndicator) {
		this.officialValuationIndicator = officialValuationIndicator;
	}

	@XmlElement(name = "SspdInd", required = true)
	public YesNoIndicator getSuspendedIndicator() {
		return suspendedIndicator;
	}

	public void setSuspendedIndicator(YesNoIndicator suspendedIndicator) {
		this.suspendedIndicator = suspendedIndicator;
	}

	@XmlElement(name = "PricDtls")
	public List<UnitPrice15> getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(List<com.tools20022.repository.msg.UnitPrice15> priceDetails) {
		this.priceDetails = priceDetails;
	}

	@XmlElement(name = "ValtnSttstcs")
	public List<ValuationStatistics3> getValuationStatistics() {
		return valuationStatistics;
	}

	public void setValuationStatistics(List<com.tools20022.repository.msg.ValuationStatistics3> valuationStatistics) {
		this.valuationStatistics = valuationStatistics;
	}

	@XmlElement(name = "PrfrmncDtls")
	public PerformanceFactors1 getPerformanceDetails() {
		return performanceDetails;
	}

	public void setPerformanceDetails(com.tools20022.repository.msg.PerformanceFactors1 performanceDetails) {
		this.performanceDetails = performanceDetails;
	}
}
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
import com.tools20022.repository.area.reda.PriceReportV04;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.EventFrequency1Code;
import com.tools20022.repository.codeset.ValuationTiming1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.NetAssetValueCalculation;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmIdentification
 * PriceValuation4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmValuationDateTime
 * PriceValuation4.mmValuationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation4#mmNAVDateTime
 * PriceValuation4.mmNAVDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmFinancialInstrumentDetails
 * PriceValuation4.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmFundManagementCompany
 * PriceValuation4.mmFundManagementCompany}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation4#mmTotalNAV
 * PriceValuation4.mmTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmTotalUnitsNumber
 * PriceValuation4.mmTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmNextValuationDateTime
 * PriceValuation4.mmNextValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmPreviousValuationDateTime
 * PriceValuation4.mmPreviousValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmValuationType
 * PriceValuation4.mmValuationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmValuationFrequency
 * PriceValuation4.mmValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmOfficialValuationIndicator
 * PriceValuation4.mmOfficialValuationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmSuspendedIndicator
 * PriceValuation4.mmSuspendedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation4#mmPriceDetails
 * PriceValuation4.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmValuationStatistics
 * PriceValuation4.mmValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmPerformanceDetails
 * PriceValuation4.mmPerformanceDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmPriceValuationDetails
 * PriceReportV04.mmPriceValuationDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDetailsRule#forPriceValuation4
 * ConstraintPriceDetailsRule.forPriceValuation4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceValuation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the net asset value for an investment fund/fund class."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PriceValuation3
 * PriceValuation3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceValuation4", propOrder = {"identification", "valuationDateTime", "nAVDateTime", "financialInstrumentDetails", "fundManagementCompany", "totalNAV", "totalUnitsNumber", "nextValuationDateTime",
		"previousValuationDateTime", "valuationType", "valuationFrequency", "officialValuationIndicator", "suspendedIndicator", "priceDetails", "valuationStatistics", "performanceDetails"})
public class PriceValuation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, Optional<Max35Text>> mmIdentification = new MMMessageAttribute<PriceValuation4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique technical identifier for an instance of a price valuation within a price report, as assigned by the issuer of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PriceValuation4 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PriceValuation4 obj, Optional<Max35Text> value) {
			obj.setIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, Optional<DateAndDateTimeChoice>> mmValuationDateTime = new MMMessageAttribute<PriceValuation4, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "ValtnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDateTime";
			definition = "Date and time of the price valuation for the investment fund/fund class.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(PriceValuation4 obj) {
			return obj.getValuationDateTime();
		}

		@Override
		public void setValue(PriceValuation4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setValuationDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "NAVDtTm", required = true)
	protected DateAndDateTimeChoice nAVDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, DateAndDateTimeChoice> mmNAVDateTime = new MMMessageAttribute<PriceValuation4, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "NAVDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NAVDateTime";
			definition = "Date and time at which a price is applied, according to the terms stated in the prospectus. The NAV date is also known as the trade date. The NAV date becomes the trade date in an order.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(PriceValuation4 obj) {
			return obj.getNAVDateTime();
		}

		@Override
		public void setValue(PriceValuation4 obj, DateAndDateTimeChoice value) {
			obj.setNAVDateTime(value);
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument8 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument8
	 * FinancialInstrument8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
	 * NetAssetValueCalculation.mmRelatedFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAssociationEnd<PriceValuation4, FinancialInstrument8> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<PriceValuation4, FinancialInstrument8>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmRelatedFund;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class for which the net asset value is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument8.mmObject();
		}

		@Override
		public FinancialInstrument8 getValue(PriceValuation4 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(PriceValuation4 obj, FinancialInstrument8 value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "FndMgmtCpny")
	protected PartyIdentification2Choice fundManagementCompany;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAssociationEnd<PriceValuation4, Optional<PartyIdentification2Choice>> mmFundManagementCompany = new MMMessageAssociationEnd<PriceValuation4, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
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

		@Override
		public Optional<PartyIdentification2Choice> getValue(PriceValuation4 obj) {
			return obj.getFundManagementCompany();
		}

		@Override
		public void setValue(PriceValuation4 obj, Optional<PartyIdentification2Choice> value) {
			obj.setFundManagementCompany(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, List<ActiveOrHistoricCurrencyAndAmount>> mmTotalNAV = new MMMessageAttribute<PriceValuation4, List<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "TtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNAV";
			definition = "Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyAndAmount> getValue(PriceValuation4 obj) {
			return obj.getTotalNAV();
		}

		@Override
		public void setValue(PriceValuation4 obj, List<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalNAV(value);
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSecuritiesQuantity
	 * NetAssetValueCalculation.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, Optional<FinancialInstrumentQuantity1>> mmTotalUnitsNumber = new MMMessageAttribute<PriceValuation4, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumber";
			definition = "Total number of investment fund class units that have been issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(PriceValuation4 obj) {
			return obj.getTotalUnitsNumber();
		}

		@Override
		public void setValue(PriceValuation4 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setTotalUnitsNumber(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, Optional<DateAndDateTimeChoice>> mmNextValuationDateTime = new MMMessageAttribute<PriceValuation4, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "NxtValtnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextValuationDateTime";
			definition = "Date and time of the next price valuation for the investment fund/fund class.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(PriceValuation4 obj) {
			return obj.getNextValuationDateTime();
		}

		@Override
		public void setValue(PriceValuation4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setNextValuationDateTime(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, Optional<DateAndDateTimeChoice>> mmPreviousValuationDateTime = new MMMessageAttribute<PriceValuation4, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "PrvsValtnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousValuationDateTime";
			definition = "Date and time of the previous price valuation for the investment fund/fund class.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(PriceValuation4 obj) {
			return obj.getPreviousValuationDateTime();
		}

		@Override
		public void setValue(PriceValuation4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setPreviousValuationDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "ValtnTp", required = true)
	protected ValuationTiming1Code valuationType;
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, ValuationTiming1Code> mmValuationType = new MMMessageAttribute<PriceValuation4, ValuationTiming1Code>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "ValtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationType";
			definition = "Specifies how the valuation is done, based on the schedule stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValuationTiming1Code.mmObject();
		}

		@Override
		public ValuationTiming1Code getValue(PriceValuation4 obj) {
			return obj.getValuationType();
		}

		@Override
		public void setValue(PriceValuation4 obj, ValuationTiming1Code value) {
			obj.setValuationType(value);
		}
	};
	@XmlElement(name = "ValtnFrqcy")
	protected EventFrequency1Code valuationFrequency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, Optional<EventFrequency1Code>> mmValuationFrequency = new MMMessageAttribute<PriceValuation4, Optional<EventFrequency1Code>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "ValtnFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationFrequency";
			definition = "Frequency of the valuation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventFrequency1Code.mmObject();
		}

		@Override
		public Optional<EventFrequency1Code> getValue(PriceValuation4 obj) {
			return obj.getValuationFrequency();
		}

		@Override
		public void setValue(PriceValuation4 obj, Optional<EventFrequency1Code> value) {
			obj.setValuationFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "OffclValtnInd", required = true)
	protected YesNoIndicator officialValuationIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmOfficialValuationIndicator
	 * NetAssetValueCalculation.mmOfficialValuationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, YesNoIndicator> mmOfficialValuationIndicator = new MMMessageAttribute<PriceValuation4, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmOfficialValuationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "OffclValtnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialValuationIndicator";
			definition = "Indicates whether the valuation is an official valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PriceValuation4 obj) {
			return obj.getOfficialValuationIndicator();
		}

		@Override
		public void setValue(PriceValuation4 obj, YesNoIndicator value) {
			obj.setOfficialValuationIndicator(value);
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAttribute<PriceValuation4, YesNoIndicator> mmSuspendedIndicator = new MMMessageAttribute<PriceValuation4, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmSuspendedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "SspdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspendedIndicator";
			definition = "Indicates whether the valuation of the investment fund class is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PriceValuation4 obj) {
			return obj.getSuspendedIndicator();
		}

		@Override
		public void setValue(PriceValuation4 obj, YesNoIndicator value) {
			obj.setSuspendedIndicator(value);
		}
	};
	@XmlElement(name = "PricDtls")
	protected List<UnitPrice15> priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice15
	 * UnitPrice15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmPrice
	 * NetAssetValueCalculation.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAssociationEnd<PriceValuation4, List<UnitPrice15>> mmPriceDetails = new MMMessageAssociationEnd<PriceValuation4, List<UnitPrice15>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitPrice15.mmObject();
		}

		@Override
		public List<UnitPrice15> getValue(PriceValuation4 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(PriceValuation4 obj, List<UnitPrice15> value) {
			obj.setPriceDetails(value);
		}
	};
	@XmlElement(name = "ValtnSttstcs")
	protected List<ValuationStatistics3> valuationStatistics;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAssociationEnd<PriceValuation4, List<ValuationStatistics3>> mmValuationStatistics = new MMMessageAssociationEnd<PriceValuation4, List<ValuationStatistics3>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmValuationStatistics;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "ValtnSttstcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationStatistics";
			definition = "Information related to the price variations of an investment fund class.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ValuationStatistics3.mmObject();
		}

		@Override
		public List<ValuationStatistics3> getValue(PriceValuation4 obj) {
			return obj.getValuationStatistics();
		}

		@Override
		public void setValue(PriceValuation4 obj, List<ValuationStatistics3> value) {
			obj.setValuationStatistics(value);
		}
	};
	@XmlElement(name = "PrfrmncDtls")
	protected PerformanceFactors1 performanceDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
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
	public static final MMMessageAssociationEnd<PriceValuation4, Optional<PerformanceFactors1>> mmPerformanceDetails = new MMMessageAssociationEnd<PriceValuation4, Optional<PerformanceFactors1>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmInvestmentFundPerformanceFactors;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceValuation4.mmObject();
			isDerived = false;
			xmlTag = "PrfrmncDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerformanceDetails";
			definition = "Factors that give indications about the performance of a fund.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PerformanceFactors1.mmObject();
		}

		@Override
		public Optional<PerformanceFactors1> getValue(PriceValuation4 obj) {
			return obj.getPerformanceDetails();
		}

		@Override
		public void setValue(PriceValuation4 obj, Optional<PerformanceFactors1> value) {
			obj.setPerformanceDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceValuation4.mmIdentification, com.tools20022.repository.msg.PriceValuation4.mmValuationDateTime,
						com.tools20022.repository.msg.PriceValuation4.mmNAVDateTime, com.tools20022.repository.msg.PriceValuation4.mmFinancialInstrumentDetails, com.tools20022.repository.msg.PriceValuation4.mmFundManagementCompany,
						com.tools20022.repository.msg.PriceValuation4.mmTotalNAV, com.tools20022.repository.msg.PriceValuation4.mmTotalUnitsNumber, com.tools20022.repository.msg.PriceValuation4.mmNextValuationDateTime,
						com.tools20022.repository.msg.PriceValuation4.mmPreviousValuationDateTime, com.tools20022.repository.msg.PriceValuation4.mmValuationType, com.tools20022.repository.msg.PriceValuation4.mmValuationFrequency,
						com.tools20022.repository.msg.PriceValuation4.mmOfficialValuationIndicator, com.tools20022.repository.msg.PriceValuation4.mmSuspendedIndicator, com.tools20022.repository.msg.PriceValuation4.mmPriceDetails,
						com.tools20022.repository.msg.PriceValuation4.mmValuationStatistics, com.tools20022.repository.msg.PriceValuation4.mmPerformanceDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(PriceReportV04.mmPriceValuationDetails);
				trace_lazy = () -> NetAssetValueCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPriceDetailsRule.forPriceValuation4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceValuation4";
				definition = "Calculation of the net asset value for an investment fund/fund class.";
				previousVersion_lazy = () -> PriceValuation3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public PriceValuation4 setIdentification(Max35Text identification) {
		this.identification = identification;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getValuationDateTime() {
		return valuationDateTime == null ? Optional.empty() : Optional.of(valuationDateTime);
	}

	public PriceValuation4 setValuationDateTime(DateAndDateTimeChoice valuationDateTime) {
		this.valuationDateTime = valuationDateTime;
		return this;
	}

	public DateAndDateTimeChoice getNAVDateTime() {
		return nAVDateTime;
	}

	public PriceValuation4 setNAVDateTime(DateAndDateTimeChoice nAVDateTime) {
		this.nAVDateTime = Objects.requireNonNull(nAVDateTime);
		return this;
	}

	public FinancialInstrument8 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public PriceValuation4 setFinancialInstrumentDetails(FinancialInstrument8 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<PartyIdentification2Choice> getFundManagementCompany() {
		return fundManagementCompany == null ? Optional.empty() : Optional.of(fundManagementCompany);
	}

	public PriceValuation4 setFundManagementCompany(PartyIdentification2Choice fundManagementCompany) {
		this.fundManagementCompany = fundManagementCompany;
		return this;
	}

	public List<ActiveOrHistoricCurrencyAndAmount> getTotalNAV() {
		return totalNAV == null ? totalNAV = new ArrayList<>() : totalNAV;
	}

	public PriceValuation4 setTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> totalNAV) {
		this.totalNAV = Objects.requireNonNull(totalNAV);
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getTotalUnitsNumber() {
		return totalUnitsNumber == null ? Optional.empty() : Optional.of(totalUnitsNumber);
	}

	public PriceValuation4 setTotalUnitsNumber(FinancialInstrumentQuantity1 totalUnitsNumber) {
		this.totalUnitsNumber = totalUnitsNumber;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getNextValuationDateTime() {
		return nextValuationDateTime == null ? Optional.empty() : Optional.of(nextValuationDateTime);
	}

	public PriceValuation4 setNextValuationDateTime(DateAndDateTimeChoice nextValuationDateTime) {
		this.nextValuationDateTime = nextValuationDateTime;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getPreviousValuationDateTime() {
		return previousValuationDateTime == null ? Optional.empty() : Optional.of(previousValuationDateTime);
	}

	public PriceValuation4 setPreviousValuationDateTime(DateAndDateTimeChoice previousValuationDateTime) {
		this.previousValuationDateTime = previousValuationDateTime;
		return this;
	}

	public ValuationTiming1Code getValuationType() {
		return valuationType;
	}

	public PriceValuation4 setValuationType(ValuationTiming1Code valuationType) {
		this.valuationType = Objects.requireNonNull(valuationType);
		return this;
	}

	public Optional<EventFrequency1Code> getValuationFrequency() {
		return valuationFrequency == null ? Optional.empty() : Optional.of(valuationFrequency);
	}

	public PriceValuation4 setValuationFrequency(EventFrequency1Code valuationFrequency) {
		this.valuationFrequency = valuationFrequency;
		return this;
	}

	public YesNoIndicator getOfficialValuationIndicator() {
		return officialValuationIndicator;
	}

	public PriceValuation4 setOfficialValuationIndicator(YesNoIndicator officialValuationIndicator) {
		this.officialValuationIndicator = Objects.requireNonNull(officialValuationIndicator);
		return this;
	}

	public YesNoIndicator getSuspendedIndicator() {
		return suspendedIndicator;
	}

	public PriceValuation4 setSuspendedIndicator(YesNoIndicator suspendedIndicator) {
		this.suspendedIndicator = Objects.requireNonNull(suspendedIndicator);
		return this;
	}

	public List<UnitPrice15> getPriceDetails() {
		return priceDetails == null ? priceDetails = new ArrayList<>() : priceDetails;
	}

	public PriceValuation4 setPriceDetails(List<UnitPrice15> priceDetails) {
		this.priceDetails = Objects.requireNonNull(priceDetails);
		return this;
	}

	public List<ValuationStatistics3> getValuationStatistics() {
		return valuationStatistics == null ? valuationStatistics = new ArrayList<>() : valuationStatistics;
	}

	public PriceValuation4 setValuationStatistics(List<ValuationStatistics3> valuationStatistics) {
		this.valuationStatistics = Objects.requireNonNull(valuationStatistics);
		return this;
	}

	public Optional<PerformanceFactors1> getPerformanceDetails() {
		return performanceDetails == null ? Optional.empty() : Optional.of(performanceDetails);
	}

	public PriceValuation4 setPerformanceDetails(PerformanceFactors1 performanceDetails) {
		this.performanceDetails = performanceDetails;
		return this;
	}
}
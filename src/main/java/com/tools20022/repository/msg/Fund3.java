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
import com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmName Fund3.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmLegalEntityIdentifier
 * Fund3.mmLegalEntityIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmIdentification
 * Fund3.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmCurrency
 * Fund3.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmEstimatedTotalNAV
 * Fund3.mmEstimatedTotalNAV}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmPreviousTotalNAV
 * Fund3.mmPreviousTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund3#mmEstimatedTotalUnitsNumber
 * Fund3.mmEstimatedTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund3#mmPreviousTotalUnitsNumber
 * Fund3.mmPreviousTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Fund3#mmEstimatedPercentageOfFundTotalNAV
 * Fund3.mmEstimatedPercentageOfFundTotalNAV}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmFundOrSubFundDetails
 * FundDetailedEstimatedCashForecastReportV04.mmFundOrSubFundDetails}</li>
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
 * "Fund3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about an investment fund."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Fund1 Fund1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Fund3", propOrder = {"name", "legalEntityIdentifier", "identification", "currency", "estimatedTotalNAV", "previousTotalNAV", "estimatedTotalUnitsNumber", "previousTotalUnitsNumber", "estimatedPercentageOfFundTotalNAV"})
public class Fund3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text name;
	/**
	 * Name of the fund/sub fund.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund3
	 * Fund3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmName Fund1.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> Fund3.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the fund/sub fund.";
			previousVersion_lazy = () -> Fund1.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected LEIIdentifier legalEntityIdentifier;
	/**
	 * Identification of the fund/sub fund with a Legal Entity Identifier. This
	 * is a code allocated to a party as described in ISO 17442
	 * "Financial Services - Legal Entity Identifier (LEI)".
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund3
	 * Fund3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmLegalEntityIdentifier
	 * Fund1.mmLegalEntityIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalEntityIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> Fund3.mmObject();
			isDerived = false;
			xmlTag = "LglNttyIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalEntityIdentifier";
			definition = "Identification of the fund/sub fund with a Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			previousVersion_lazy = () -> Fund1.mmLegalEntityIdentifier;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected OtherIdentification4 identification;
	/**
	 * Unique and unambiguous identifier for the fund/sub fund, assigned under a
	 * formal or proprietary identification scheme.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund3
	 * Fund3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmIdentification
	 * Fund1.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> Fund3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for the fund/sub fund, assigned under a formal or proprietary identification scheme.";
			previousVersion_lazy = () -> Fund1.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherIdentification4.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * Currency of the fund/sub fund.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund3
	 * Fund3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmCurrency
	 * Fund1.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmTradingCurrency;
			componentContext_lazy = () -> Fund3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the fund/sub fund.";
			previousVersion_lazy = () -> Fund1.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount estimatedTotalNAV;
	/**
	 * Estimated total value of all the holdings, less the fund's liabilities,
	 * of the fund/sub fund.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund3
	 * Fund3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedTotalNAV
	 * Fund1.mmEstimatedTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedTotalNAV = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> Fund3.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalNAV";
			definition = "Estimated total value of all the holdings, less the fund's liabilities, of the fund/sub fund.";
			previousVersion_lazy = () -> Fund1.mmEstimatedTotalNAV;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount previousTotalNAV;
	/**
	 * Previous total value of all the holdings, less the fund's liabilities, of
	 * the fund/sub fund
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund3
	 * Fund3}</li>
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
	 * "Previous total value of all the holdings, less the fund's liabilities, of the fund/sub fund"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTotalNAV
	 * Fund1.mmPreviousTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTotalNAV = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> Fund3.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalNAV";
			definition = "Previous total value of all the holdings, less the fund's liabilities, of the fund/sub fund";
			previousVersion_lazy = () -> Fund1.mmPreviousTotalNAV;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 estimatedTotalUnitsNumber;
	/**
	 * Estimated total number of units of the fund/sub fund.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund3
	 * Fund3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedTotalUnitsNumber
	 * Fund1.mmEstimatedTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> Fund3.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalUnitsNumber";
			definition = "Estimated total number of units of the fund/sub fund.";
			previousVersion_lazy = () -> Fund1.mmEstimatedTotalUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 previousTotalUnitsNumber;
	/**
	 * Previous total number of units of the fund/sub fund.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund3
	 * Fund3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTotalUnitsNumber
	 * Fund1.mmPreviousTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> Fund3.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalUnitsNumber";
			definition = "Previous total number of units of the fund/sub fund.";
			previousVersion_lazy = () -> Fund1.mmPreviousTotalUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected PercentageRate estimatedPercentageOfFundTotalNAV;
	/**
	 * Estimated consolidated net cash flow expressed as a percentage of the
	 * previous total NAV for the fund/sub fund.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fund3
	 * Fund3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedPercentageOfFundTotalNAV
	 * Fund1.mmEstimatedPercentageOfFundTotalNAV}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedPercentageOfFundTotalNAV = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Fund3.mmObject();
			isDerived = false;
			xmlTag = "EstmtdPctgOfFndTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedPercentageOfFundTotalNAV";
			definition = "Estimated consolidated net cash flow expressed as a percentage of the previous total NAV for the fund/sub fund.";
			previousVersion_lazy = () -> Fund1.mmEstimatedPercentageOfFundTotalNAV;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Fund3.mmName, Fund3.mmLegalEntityIdentifier, Fund3.mmIdentification, Fund3.mmCurrency, Fund3.mmEstimatedTotalNAV, Fund3.mmPreviousTotalNAV, Fund3.mmEstimatedTotalUnitsNumber,
						Fund3.mmPreviousTotalUnitsNumber, Fund3.mmEstimatedPercentageOfFundTotalNAV);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundDetailedEstimatedCashForecastReportV04.mmFundOrSubFundDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Fund3";
				definition = "Information about an investment fund.";
				previousVersion_lazy = () -> Fund1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Nm")
	public Max350Text getName() {
		return name;
	}

	public void setName(Max350Text name) {
		this.name = name;
	}

	@XmlElement(name = "LglNttyIdr")
	public LEIIdentifier getLegalEntityIdentifier() {
		return legalEntityIdentifier;
	}

	public void setLegalEntityIdentifier(LEIIdentifier legalEntityIdentifier) {
		this.legalEntityIdentifier = legalEntityIdentifier;
	}

	@XmlElement(name = "Id")
	public OtherIdentification4 getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.msg.OtherIdentification4 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Ccy")
	public ActiveOrHistoricCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "EstmtdTtlNAV")
	public ActiveOrHistoricCurrencyAndAmount getEstimatedTotalNAV() {
		return estimatedTotalNAV;
	}

	public void setEstimatedTotalNAV(ActiveOrHistoricCurrencyAndAmount estimatedTotalNAV) {
		this.estimatedTotalNAV = estimatedTotalNAV;
	}

	@XmlElement(name = "PrvsTtlNAV")
	public ActiveOrHistoricCurrencyAndAmount getPreviousTotalNAV() {
		return previousTotalNAV;
	}

	public void setPreviousTotalNAV(ActiveOrHistoricCurrencyAndAmount previousTotalNAV) {
		this.previousTotalNAV = previousTotalNAV;
	}

	@XmlElement(name = "EstmtdTtlUnitsNb")
	public FinancialInstrumentQuantity1 getEstimatedTotalUnitsNumber() {
		return estimatedTotalUnitsNumber;
	}

	public void setEstimatedTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 estimatedTotalUnitsNumber) {
		this.estimatedTotalUnitsNumber = estimatedTotalUnitsNumber;
	}

	@XmlElement(name = "PrvsTtlUnitsNb")
	public FinancialInstrumentQuantity1 getPreviousTotalUnitsNumber() {
		return previousTotalUnitsNumber;
	}

	public void setPreviousTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 previousTotalUnitsNumber) {
		this.previousTotalUnitsNumber = previousTotalUnitsNumber;
	}

	@XmlElement(name = "EstmtdPctgOfFndTtlNAV")
	public PercentageRate getEstimatedPercentageOfFundTotalNAV() {
		return estimatedPercentageOfFundTotalNAV;
	}

	public void setEstimatedPercentageOfFundTotalNAV(PercentageRate estimatedPercentageOfFundTotalNAV) {
		this.estimatedPercentageOfFundTotalNAV = estimatedPercentageOfFundTotalNAV;
	}
}
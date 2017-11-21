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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Description of the financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmFinancialInstrumentIdentification
 * FinancialInstrumentAttributes67.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmPlaceOfListing
 * FinancialInstrumentAttributes67.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmDayCountBasis
 * FinancialInstrumentAttributes67.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmClassificationType
 * FinancialInstrumentAttributes67.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmOptionStyle
 * FinancialInstrumentAttributes67.mmOptionStyle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmDenominationCurrency
 * FinancialInstrumentAttributes67.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmNextCouponDate
 * FinancialInstrumentAttributes67.mmNextCouponDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmFloatingRateFixingDate
 * FinancialInstrumentAttributes67.mmFloatingRateFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmMaturityDate
 * FinancialInstrumentAttributes67.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmIssueDate
 * FinancialInstrumentAttributes67.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmNextCallableDate
 * FinancialInstrumentAttributes67.mmNextCallableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmPutableDate
 * FinancialInstrumentAttributes67.mmPutableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmDatedDate
 * FinancialInstrumentAttributes67.mmDatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmConversionDate
 * FinancialInstrumentAttributes67.mmConversionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmPreviousFactor
 * FinancialInstrumentAttributes67.mmPreviousFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmNextFactor
 * FinancialInstrumentAttributes67.mmNextFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmInterestRate
 * FinancialInstrumentAttributes67.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmNextInterestRate
 * FinancialInstrumentAttributes67.mmNextInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmMinimumNominalQuantity
 * FinancialInstrumentAttributes67.mmMinimumNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmMinimumQuantityToInstruct
 * FinancialInstrumentAttributes67.mmMinimumQuantityToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmMinimumMultipleQuantityToInstruct
 * FinancialInstrumentAttributes67.mmMinimumMultipleQuantityToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmContractSize
 * FinancialInstrumentAttributes67.mmContractSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmIssuePrice
 * FinancialInstrumentAttributes67.mmIssuePrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
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
 * "FinancialInstrumentAttributes67"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Description of the financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80
 * FinancialInstrumentAttributes80}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49
 * FinancialInstrumentAttributes49}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentAttributes67", propOrder = {"financialInstrumentIdentification", "placeOfListing", "dayCountBasis", "classificationType", "optionStyle", "denominationCurrency", "nextCouponDate",
		"floatingRateFixingDate", "maturityDate", "issueDate", "nextCallableDate", "putableDate", "datedDate", "conversionDate", "previousFactor", "nextFactor", "interestRate", "nextInterestRate", "minimumNominalQuantity",
		"minimumQuantityToInstruct", "minimumMultipleQuantityToInstruct", "contractSize", "issuePrice"})
public class FinancialInstrumentAttributes67 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * Identification of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes80.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes49.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of the financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
		}
	};
	protected MarketIdentification3Choice placeOfListing;
	/**
	 * Place where the referenced financial instrument is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentification3Choice
	 * MarketIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the referenced financial instrument is listed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmPlaceOfListing
	 * FinancialInstrumentAttributes80.mmPlaceOfListing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmPlaceOfListing
	 * FinancialInstrumentAttributes49.mmPlaceOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfListing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Place where the referenced financial instrument is listed.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmPlaceOfListing);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmPlaceOfListing;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification3Choice.mmObject();
		}
	};
	protected InterestComputationMethodFormat4Choice dayCountBasis;
	/**
	 * Specifies the computation method of (accrued) interest of the financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat4Choice
	 * InterestComputationMethodFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayCntBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the computation method of (accrued) interest of the financial instrument."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmDayCountBasis
	 * FinancialInstrumentAttributes80.mmDayCountBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmDayCountBasis
	 * FinancialInstrumentAttributes49.mmDayCountBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDayCountBasis = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmDayCountBasis);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmDayCountBasis;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestComputationMethodFormat4Choice.mmObject();
		}
	};
	protected ClassificationType32Choice classificationType;
	/**
	 * Classification type of the financial instrument, as per the ISO
	 * Classification of Financial Instrument (CFI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClassificationType32Choice
	 * ClassificationType32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmClassificationType
	 * FinancialInstrumentAttributes80.mmClassificationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmClassificationType
	 * FinancialInstrumentAttributes49.mmClassificationType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClassificationType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmClassificationType);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmClassificationType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClassificationType32Choice.mmObject();
		}
	};
	protected OptionStyle8Choice optionStyle;
	/**
	 * Specifies how an option can be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionStyle8Choice
	 * OptionStyle8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
	 * Option.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how an option can be exercised."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmOptionStyle
	 * FinancialInstrumentAttributes80.mmOptionStyle}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmOptionStyle
	 * FinancialInstrumentAttributes49.mmOptionStyle}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionStyle = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "OptnStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmOptionStyle);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmOptionStyle;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionStyle8Choice.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode denominationCurrency;
	/**
	 * Currency in which a financial instrument is currently denominated.
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
	 * Security.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which a financial instrument is currently denominated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmDenominationCurrency
	 * FinancialInstrumentAttributes80.mmDenominationCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmDenominationCurrency
	 * FinancialInstrumentAttributes49.mmDenominationCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDenominationCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a financial instrument is currently denominated.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmDenominationCurrency);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmDenominationCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected ISODate nextCouponDate;
	/**
	 * Next payment date of an interest bearing financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmNextCouponDate
	 * Debt.mmNextCouponDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtCpnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCouponDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next payment date of an interest bearing financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmNextCouponDate
	 * FinancialInstrumentAttributes80.mmNextCouponDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmNextCouponDate
	 * FinancialInstrumentAttributes49.mmNextCouponDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextCouponDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCouponDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "NxtCpnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmNextCouponDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmNextCouponDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate floatingRateFixingDate;
	/**
	 * Date on which the interest rate or redemption price will be/was
	 * calculated according to the terms of the issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmFixingDate
	 * VariableInterest.mmFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FltgRateFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the interest rate or redemption price will be/was calculated according to the terms of the issue."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmFloatingRateFixingDate
	 * FinancialInstrumentAttributes80.mmFloatingRateFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmFloatingRateFixingDate
	 * FinancialInstrumentAttributes49.mmFloatingRateFixingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFloatingRateFixingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmFixingDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "FltgRateFxgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateFixingDate";
			definition = "Date on which the interest rate or redemption price will be/was calculated according to the terms of the issue.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmFloatingRateFixingDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmFloatingRateFixingDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate maturityDate;
	/**
	 * Date on which a financial instrument becomes due and assets are to be
	 * repaid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a financial instrument becomes due and assets are to be repaid."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmMaturityDate
	 * FinancialInstrumentAttributes80.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmMaturityDate
	 * FinancialInstrumentAttributes49.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which a financial instrument becomes due and assets are to be repaid.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmMaturityDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmMaturityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate issueDate;
	/**
	 * Date at which the security was made available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the security was made available."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmIssueDate
	 * FinancialInstrumentAttributes80.mmIssueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmIssueDate
	 * FinancialInstrumentAttributes49.mmIssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date at which the security was made available.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmIssueDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate nextCallableDate;
	/**
	 * Date on which a financial instrument is called away/redeemed before its
	 * scheduled maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmNextCallableDate
	 * Debt.mmNextCallableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtCllblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextCallableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a financial instrument is called away/redeemed before its scheduled maturity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmNextCallableDate
	 * FinancialInstrumentAttributes80.mmNextCallableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmNextCallableDate
	 * FinancialInstrumentAttributes49.mmNextCallableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextCallableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCallableDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "NxtCllblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCallableDate";
			definition = "Date on which a financial instrument is called away/redeemed before its scheduled maturity.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmNextCallableDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmNextCallableDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate putableDate;
	/**
	 * Date on which a holder of a financial instrument has the right to request
	 * redemption of the principal amount prior to its scheduled maturity date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPutableDate
	 * Debt.mmPutableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a holder of a financial instrument has the right to request redemption of the principal amount prior to its scheduled maturity date."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmPutableDate
	 * FinancialInstrumentAttributes80.mmPutableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmPutableDate
	 * FinancialInstrumentAttributes49.mmPutableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPutableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "PutblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDate";
			definition = "Date on which a holder of a financial instrument has the right to request redemption of the principal amount prior to its scheduled maturity date.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmPutableDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmPutableDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate datedDate;
	/**
	 * Date on which an interest bearing financial instrument begins to accrue
	 * interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmDatedDate
	 * Debt.mmDatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which an interest bearing financial instrument begins to accrue interest."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmDatedDate
	 * FinancialInstrumentAttributes80.mmDatedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmDatedDate
	 * FinancialInstrumentAttributes49.mmDatedDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDatedDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmDatedDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "DtdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatedDate";
			definition = "Date on which an interest bearing financial instrument begins to accrue interest.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmDatedDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmDatedDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate conversionDate;
	/**
	 * Deadline by which a convertible security must be converted, according to
	 * the terms of the issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionDate
	 * SecuritiesConversion.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which a convertible security must be converted, according to the terms of the issue."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmConversionDate
	 * FinancialInstrumentAttributes80.mmConversionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmConversionDate
	 * FinancialInstrumentAttributes49.mmConversionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConversionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionDate;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "ConvsDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionDate";
			definition = "Deadline by which a convertible security must be converted, according to the terms of the issue.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmConversionDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmConversionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected RateFormat12Choice previousFactor;
	/**
	 * Factor used to calculate the value of the outstanding principal of the
	 * financial instrument (for factored securities) until the next redemption
	 * (factor) date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat12Choice
	 * RateFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) until the next redemption (factor) date."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmPreviousFactor
	 * FinancialInstrumentAttributes80.mmPreviousFactor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmPreviousFactor
	 * FinancialInstrumentAttributes49.mmPreviousFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviousFactor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) until the next redemption (factor) date.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmPreviousFactor);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmPreviousFactor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat12Choice.mmObject();
		}
	};
	protected RateFormat12Choice nextFactor;
	/**
	 * Factor used to calculate the value of the outstanding principal of the
	 * financial instrument (for factored securities) that will applicable after
	 * the redemption (factor) date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat12Choice
	 * RateFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmFactor Debt.mmFactor}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) that will applicable after the redemption (factor) date."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmNextFactor
	 * FinancialInstrumentAttributes80.mmNextFactor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmNextFactor
	 * FinancialInstrumentAttributes49.mmNextFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNextFactor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) that will applicable after the redemption (factor) date.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmNextFactor);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmNextFactor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat12Choice.mmObject();
		}
	};
	protected RateFormat3Choice interestRate;
	/**
	 * Annual rate of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
	 * InterestCalculation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Annual rate of a financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmInterestRate
	 * FinancialInstrumentAttributes80.mmInterestRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmInterestRate
	 * FinancialInstrumentAttributes49.mmInterestRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Annual rate of a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmInterestRate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmInterestRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	protected RateFormat3Choice nextInterestRate;
	/**
	 * Interest rate applicable to the next interest payment period in relation
	 * to variable rate instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
	 * InterestCalculation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtIntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate applicable to the next interest payment period in relation to variable rate instruments."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmNextInterestRate
	 * FinancialInstrumentAttributes80.mmNextInterestRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmNextInterestRate
	 * FinancialInstrumentAttributes49.mmNextInterestRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNextInterestRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "NxtIntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextInterestRate";
			definition = "Interest rate applicable to the next interest payment period in relation to variable rate instruments.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmNextInterestRate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmNextInterestRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice minimumNominalQuantity;
	/**
	 * Minimum nominal quantity of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumQuantity
	 * Security.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinNmnlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum nominal quantity of financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes80.mmMinimumNominalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes49.mmMinimumNominalQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumNominalQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmMinimumQuantity;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "MinNmnlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumNominalQuantity";
			definition = "Minimum nominal quantity of financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmMinimumNominalQuantity);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmMinimumNominalQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice minimumQuantityToInstruct;
	/**
	 * Minimum quantity of financial instrument that may be instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
	 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinQtyToInst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantityToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of financial instrument that may be instructed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmMinimumQuantityToInstruct
	 * FinancialInstrumentAttributes80.mmMinimumQuantityToInstruct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmMinimumExercisableQuantity
	 * FinancialInstrumentAttributes49.mmMinimumExercisableQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumQuantityToInstruct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableQuantity;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "MinQtyToInst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumQuantityToInstruct";
			definition = "Minimum quantity of financial instrument that may be instructed.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmMinimumQuantityToInstruct);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmMinimumExercisableQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice minimumMultipleQuantityToInstruct;
	/**
	 * Minimum multiple quantity of financial instrument that may be instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
	 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinMltplQtyToInst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMultipleQuantityToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity of financial instrument that may be instructed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmMinimumMultipleQuantityToInstruct
	 * FinancialInstrumentAttributes80.mmMinimumMultipleQuantityToInstruct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmMinimumExercisableMultipleQuantity
	 * FinancialInstrumentAttributes49.mmMinimumExercisableMultipleQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumMultipleQuantityToInstruct = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "MinMltplQtyToInst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMultipleQuantityToInstruct";
			definition = "Minimum multiple quantity of financial instrument that may be instructed.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmMinimumMultipleQuantityToInstruct);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmMinimumExercisableMultipleQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice contractSize;
	/**
	 * Ratio or multiplying factor used to convert one contract into a financial
	 * instrument quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmContractSize
	 * SecuritiesConversion.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio or multiplying factor used to convert one contract into a financial instrument quantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmContractSize
	 * FinancialInstrumentAttributes80.mmContractSize}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmContractSize
	 * FinancialInstrumentAttributes49.mmContractSize}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContractSize = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmContractSize;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "CtrctSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a financial instrument quantity.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmContractSize);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmContractSize;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected PriceFormat45Choice issuePrice;
	/**
	 * Initial issue/valuation price of a resulting security under a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat45Choice
	 * PriceFormat45Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
	 * FinancialInstrumentAttributes67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssePric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Initial issue/valuation price of a resulting security under a corporate action."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmIssuePrice
	 * FinancialInstrumentAttributes80.mmIssuePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmIssuePrice
	 * FinancialInstrumentAttributes49.mmIssuePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> FinancialInstrumentAttributes67.mmObject();
			isDerived = false;
			xmlTag = "IssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue/valuation price of a resulting security under a corporate action.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmIssuePrice);
			previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmIssuePrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat45Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentAttributes67.mmFinancialInstrumentIdentification, FinancialInstrumentAttributes67.mmPlaceOfListing, FinancialInstrumentAttributes67.mmDayCountBasis,
						FinancialInstrumentAttributes67.mmClassificationType, FinancialInstrumentAttributes67.mmOptionStyle, FinancialInstrumentAttributes67.mmDenominationCurrency, FinancialInstrumentAttributes67.mmNextCouponDate,
						FinancialInstrumentAttributes67.mmFloatingRateFixingDate, FinancialInstrumentAttributes67.mmMaturityDate, FinancialInstrumentAttributes67.mmIssueDate, FinancialInstrumentAttributes67.mmNextCallableDate,
						FinancialInstrumentAttributes67.mmPutableDate, FinancialInstrumentAttributes67.mmDatedDate, FinancialInstrumentAttributes67.mmConversionDate, FinancialInstrumentAttributes67.mmPreviousFactor,
						FinancialInstrumentAttributes67.mmNextFactor, FinancialInstrumentAttributes67.mmInterestRate, FinancialInstrumentAttributes67.mmNextInterestRate, FinancialInstrumentAttributes67.mmMinimumNominalQuantity,
						FinancialInstrumentAttributes67.mmMinimumQuantityToInstruct, FinancialInstrumentAttributes67.mmMinimumMultipleQuantityToInstruct, FinancialInstrumentAttributes67.mmContractSize,
						FinancialInstrumentAttributes67.mmIssuePrice);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributes67";
				definition = "Description of the financial instrument.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes80.mmObject());
				previousVersion_lazy = () -> FinancialInstrumentAttributes49.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "PlcOfListg")
	public MarketIdentification3Choice getPlaceOfListing() {
		return placeOfListing;
	}

	public void setPlaceOfListing(MarketIdentification3Choice placeOfListing) {
		this.placeOfListing = placeOfListing;
	}

	@XmlElement(name = "DayCntBsis")
	public InterestComputationMethodFormat4Choice getDayCountBasis() {
		return dayCountBasis;
	}

	public void setDayCountBasis(InterestComputationMethodFormat4Choice dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
	}

	@XmlElement(name = "ClssfctnTp")
	public ClassificationType32Choice getClassificationType() {
		return classificationType;
	}

	public void setClassificationType(ClassificationType32Choice classificationType) {
		this.classificationType = classificationType;
	}

	@XmlElement(name = "OptnStyle")
	public OptionStyle8Choice getOptionStyle() {
		return optionStyle;
	}

	public void setOptionStyle(OptionStyle8Choice optionStyle) {
		this.optionStyle = optionStyle;
	}

	@XmlElement(name = "DnmtnCcy")
	public ActiveOrHistoricCurrencyCode getDenominationCurrency() {
		return denominationCurrency;
	}

	public void setDenominationCurrency(ActiveOrHistoricCurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
	}

	@XmlElement(name = "NxtCpnDt")
	public ISODate getNextCouponDate() {
		return nextCouponDate;
	}

	public void setNextCouponDate(ISODate nextCouponDate) {
		this.nextCouponDate = nextCouponDate;
	}

	@XmlElement(name = "FltgRateFxgDt")
	public ISODate getFloatingRateFixingDate() {
		return floatingRateFixingDate;
	}

	public void setFloatingRateFixingDate(ISODate floatingRateFixingDate) {
		this.floatingRateFixingDate = floatingRateFixingDate;
	}

	@XmlElement(name = "MtrtyDt")
	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
	}

	@XmlElement(name = "IsseDt")
	public ISODate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
	}

	@XmlElement(name = "NxtCllblDt")
	public ISODate getNextCallableDate() {
		return nextCallableDate;
	}

	public void setNextCallableDate(ISODate nextCallableDate) {
		this.nextCallableDate = nextCallableDate;
	}

	@XmlElement(name = "PutblDt")
	public ISODate getPutableDate() {
		return putableDate;
	}

	public void setPutableDate(ISODate putableDate) {
		this.putableDate = putableDate;
	}

	@XmlElement(name = "DtdDt")
	public ISODate getDatedDate() {
		return datedDate;
	}

	public void setDatedDate(ISODate datedDate) {
		this.datedDate = datedDate;
	}

	@XmlElement(name = "ConvsDt")
	public ISODate getConversionDate() {
		return conversionDate;
	}

	public void setConversionDate(ISODate conversionDate) {
		this.conversionDate = conversionDate;
	}

	@XmlElement(name = "PrvsFctr")
	public RateFormat12Choice getPreviousFactor() {
		return previousFactor;
	}

	public void setPreviousFactor(RateFormat12Choice previousFactor) {
		this.previousFactor = previousFactor;
	}

	@XmlElement(name = "NxtFctr")
	public RateFormat12Choice getNextFactor() {
		return nextFactor;
	}

	public void setNextFactor(RateFormat12Choice nextFactor) {
		this.nextFactor = nextFactor;
	}

	@XmlElement(name = "IntrstRate")
	public RateFormat3Choice getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(RateFormat3Choice interestRate) {
		this.interestRate = interestRate;
	}

	@XmlElement(name = "NxtIntrstRate")
	public RateFormat3Choice getNextInterestRate() {
		return nextInterestRate;
	}

	public void setNextInterestRate(RateFormat3Choice nextInterestRate) {
		this.nextInterestRate = nextInterestRate;
	}

	@XmlElement(name = "MinNmnlQty")
	public FinancialInstrumentQuantity1Choice getMinimumNominalQuantity() {
		return minimumNominalQuantity;
	}

	public void setMinimumNominalQuantity(FinancialInstrumentQuantity1Choice minimumNominalQuantity) {
		this.minimumNominalQuantity = minimumNominalQuantity;
	}

	@XmlElement(name = "MinQtyToInst")
	public FinancialInstrumentQuantity1Choice getMinimumQuantityToInstruct() {
		return minimumQuantityToInstruct;
	}

	public void setMinimumQuantityToInstruct(FinancialInstrumentQuantity1Choice minimumQuantityToInstruct) {
		this.minimumQuantityToInstruct = minimumQuantityToInstruct;
	}

	@XmlElement(name = "MinMltplQtyToInst")
	public FinancialInstrumentQuantity1Choice getMinimumMultipleQuantityToInstruct() {
		return minimumMultipleQuantityToInstruct;
	}

	public void setMinimumMultipleQuantityToInstruct(FinancialInstrumentQuantity1Choice minimumMultipleQuantityToInstruct) {
		this.minimumMultipleQuantityToInstruct = minimumMultipleQuantityToInstruct;
	}

	@XmlElement(name = "CtrctSz")
	public FinancialInstrumentQuantity1Choice getContractSize() {
		return contractSize;
	}

	public void setContractSize(FinancialInstrumentQuantity1Choice contractSize) {
		this.contractSize = contractSize;
	}

	@XmlElement(name = "IssePric")
	public PriceFormat45Choice getIssuePrice() {
		return issuePrice;
	}

	public void setIssuePrice(PriceFormat45Choice issuePrice) {
		this.issuePrice = issuePrice;
	}
}
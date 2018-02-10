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

import com.tools20022.metamodel.ext.ISO15022Synonym;
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
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmFinancialInstrumentIdentification
 * FinancialInstrumentAttributes66.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmPlaceOfListing
 * FinancialInstrumentAttributes66.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmDayCountBasis
 * FinancialInstrumentAttributes66.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmClassificationType
 * FinancialInstrumentAttributes66.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmOptionStyle
 * FinancialInstrumentAttributes66.mmOptionStyle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmDenominationCurrency
 * FinancialInstrumentAttributes66.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmNextCouponDate
 * FinancialInstrumentAttributes66.mmNextCouponDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmExpiryDate
 * FinancialInstrumentAttributes66.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmFloatingRateFixingDate
 * FinancialInstrumentAttributes66.mmFloatingRateFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmMaturityDate
 * FinancialInstrumentAttributes66.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmIssueDate
 * FinancialInstrumentAttributes66.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmNextCallableDate
 * FinancialInstrumentAttributes66.mmNextCallableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmPutableDate
 * FinancialInstrumentAttributes66.mmPutableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmDatedDate
 * FinancialInstrumentAttributes66.mmDatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmConversionDate
 * FinancialInstrumentAttributes66.mmConversionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmInterestRate
 * FinancialInstrumentAttributes66.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmNextInterestRate
 * FinancialInstrumentAttributes66.mmNextInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmPercentageOfDebtClaim
 * FinancialInstrumentAttributes66.mmPercentageOfDebtClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmPreviousFactor
 * FinancialInstrumentAttributes66.mmPreviousFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmNextFactor
 * FinancialInstrumentAttributes66.mmNextFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmWarrantParity
 * FinancialInstrumentAttributes66.mmWarrantParity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmMinimumNominalQuantity
 * FinancialInstrumentAttributes66.mmMinimumNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmContractSize
 * FinancialInstrumentAttributes66.mmContractSize}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule#forFinancialInstrumentAttributes66
 * ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes66}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMaturityDateRule#forFinancialInstrumentAttributes66
 * ConstraintMaturityDateRule.forFinancialInstrumentAttributes66}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributes66"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Description of the financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79
 * FinancialInstrumentAttributes79}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48
 * FinancialInstrumentAttributes48}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributes66", propOrder = {"financialInstrumentIdentification", "placeOfListing", "dayCountBasis", "classificationType", "optionStyle", "denominationCurrency", "nextCouponDate", "expiryDate",
		"floatingRateFixingDate", "maturityDate", "issueDate", "nextCallableDate", "putableDate", "datedDate", "conversionDate", "interestRate", "nextInterestRate", "percentageOfDebtClaim", "previousFactor", "nextFactor", "warrantParity",
		"minimumNominalQuantity", "contractSize"})
public class FinancialInstrumentAttributes66 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes79.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmFinancialInstrumentIdentification
	 * FinancialInstrumentAttributes48.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identifies the financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
		}
	};
	@XmlElement(name = "PlcOfListg")
	protected MarketIdentification3Choice placeOfListing;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94B::PLIS</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmPlaceOfListing
	 * FinancialInstrumentAttributes79.mmPlaceOfListing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmPlaceOfListing
	 * FinancialInstrumentAttributes48.mmPlaceOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfListing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::PLIS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Place where the referenced financial instrument is listed.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmPlaceOfListing);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmPlaceOfListing;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification3Choice.mmObject();
		}
	};
	@XmlElement(name = "DayCntBsis")
	protected InterestComputationMethodFormat4Choice dayCountBasis;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayCntBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::MICO</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmDayCountBasis
	 * FinancialInstrumentAttributes79.mmDayCountBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmDayCountBasis
	 * FinancialInstrumentAttributes48.mmDayCountBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDayCountBasis = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::MICO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmDayCountBasis);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmDayCountBasis;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestComputationMethodFormat4Choice.mmObject();
		}
	};
	@XmlElement(name = "ClssfctnTp")
	protected ClassificationType32Choice classificationType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :12a::CLAS</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmClassificationType
	 * FinancialInstrumentAttributes79.mmClassificationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmClassificationType
	 * FinancialInstrumentAttributes48.mmClassificationType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClassificationType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":12a::CLAS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmClassificationType);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmClassificationType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClassificationType32Choice.mmObject();
		}
	};
	@XmlElement(name = "OptnStyle")
	protected OptionStyle8Choice optionStyle;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :12B::OPST</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmOptionStyle
	 * FinancialInstrumentAttributes79.mmOptionStyle}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmOptionStyle
	 * FinancialInstrumentAttributes48.mmOptionStyle}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionStyle = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "OptnStyle";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":12B::OPST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmOptionStyle);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmOptionStyle;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionStyle8Choice.mmObject();
		}
	};
	@XmlElement(name = "DnmtnCcy")
	protected ActiveOrHistoricCurrencyCode denominationCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
	 * Security.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :11A::DENO</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmDenominationCurrency
	 * FinancialInstrumentAttributes79.mmDenominationCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmDenominationCurrency
	 * FinancialInstrumentAttributes48.mmDenominationCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDenominationCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::DENO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a financial instrument is currently denominated.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmDenominationCurrency);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmDenominationCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "NxtCpnDt")
	protected ISODate nextCouponDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtCpnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::COUP</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmNextCouponDate
	 * FinancialInstrumentAttributes79.mmNextCouponDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmNextCouponDate
	 * FinancialInstrumentAttributes48.mmNextCouponDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextCouponDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCouponDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "NxtCpnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::COUP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmNextCouponDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmNextCouponDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "XpryDt")
	protected ISODate expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EXPI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which an order expires or at which a privilege or offer terminates."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmExpiryDate
	 * FinancialInstrumentAttributes79.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmExpiryDate
	 * FinancialInstrumentAttributes48.mmExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EXPI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which an order expires or at which a privilege or offer terminates.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmExpiryDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmExpiryDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "FltgRateFxgDt")
	protected ISODate floatingRateFixingDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FltgRateFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::FRNR</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmFloatingRateFixingDate
	 * FinancialInstrumentAttributes79.mmFloatingRateFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmFloatingRateFixingDate
	 * FinancialInstrumentAttributes48.mmFloatingRateFixingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFloatingRateFixingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmFixingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "FltgRateFxgDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::FRNR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateFixingDate";
			definition = "Date on which the interest rate or redemption price will be/was calculated according to the terms of the issue.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmFloatingRateFixingDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmFloatingRateFixingDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISODate maturityDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::MATU</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmMaturityDate
	 * FinancialInstrumentAttributes79.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmMaturityDate
	 * FinancialInstrumentAttributes48.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::MATU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which a financial instrument becomes due and assets are to be repaid.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmMaturityDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmMaturityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "IsseDt")
	protected ISODate issueDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::ISSU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the financial instrument is issued."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmIssueDate
	 * FinancialInstrumentAttributes79.mmIssueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmIssueDate
	 * FinancialInstrumentAttributes48.mmIssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::ISSU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date on which the financial instrument is issued.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmIssueDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "NxtCllblDt")
	protected ISODate nextCallableDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtCllblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::CALD</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmNextCallableDate
	 * FinancialInstrumentAttributes79.mmNextCallableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmNextCallableDate
	 * FinancialInstrumentAttributes48.mmNextCallableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNextCallableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmNextCallableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "NxtCllblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::CALD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextCallableDate";
			definition = "Date on which a financial instrument is called away/redeemed before its scheduled maturity.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmNextCallableDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmNextCallableDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "PutblDt")
	protected ISODate putableDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::PUTT</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmPutableDate
	 * FinancialInstrumentAttributes79.mmPutableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmPutableDate
	 * FinancialInstrumentAttributes48.mmPutableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPutableDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPutableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "PutblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::PUTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutableDate";
			definition = "Date on which a holder of a financial instrument has the right to request redemption of the principal amount prior to its scheduled maturity date.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmPutableDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmPutableDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "DtdDt")
	protected ISODate datedDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98A::DDTE</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmDatedDate
	 * FinancialInstrumentAttributes79.mmDatedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmDatedDate
	 * FinancialInstrumentAttributes48.mmDatedDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDatedDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmDatedDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "DtdDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98A::DDTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatedDate";
			definition = "Date on which an interest bearing financial instrument begins to accrue interest.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmDatedDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmDatedDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "ConvsDt")
	protected ISODate conversionDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: 98A::CONV</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmConversionDate
	 * FinancialInstrumentAttributes79.mmConversionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmConversionDate
	 * FinancialInstrumentAttributes48.mmConversionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConversionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "ConvsDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "98A::CONV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionDate";
			definition = "Deadline by which a convertible security must be converted, according to the terms of the issue.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmConversionDate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmConversionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "IntrstRate")
	protected RateFormat3Choice interestRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::INTR</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmInterestRate
	 * FinancialInstrumentAttributes79.mmInterestRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmInterestRate
	 * FinancialInstrumentAttributes48.mmInterestRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::INTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Annual rate of a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmInterestRate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmInterestRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "NxtIntrstRate")
	protected RateFormat3Choice nextInterestRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtIntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::NXTR</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmNextInterestRate
	 * FinancialInstrumentAttributes79.mmNextInterestRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmNextInterestRate
	 * FinancialInstrumentAttributes48.mmNextInterestRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNextInterestRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "NxtIntrstRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::NXTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextInterestRate";
			definition = "Interest rate applicable to the next interest payment period in relation to variable rate instruments.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmNextInterestRate);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmNextInterestRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "PctgOfDebtClm")
	protected RateFormat3Choice percentageOfDebtClaim;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPercentageOfDebtClaim
	 * Security.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgOfDebtClm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a:DECL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfDebtClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying assets of a fund that represents a debt, for example, in the context of the EU Savings directive."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes79.mmPercentageOfDebtClaim}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmPercentageOfDebtClaim
	 * FinancialInstrumentAttributes48.mmPercentageOfDebtClaim}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPercentageOfDebtClaim = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmPercentageOfDebtClaim;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "PctgOfDebtClm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a:DECL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of a fund that represents a debt, for example, in the context of the EU Savings directive.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmPercentageOfDebtClaim);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmPercentageOfDebtClaim;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}
	};
	@XmlElement(name = "PrvsFctr")
	protected RateFormat12Choice previousFactor;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::PRFC</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmPreviousFactor
	 * FinancialInstrumentAttributes79.mmPreviousFactor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmPreviousFactor
	 * FinancialInstrumentAttributes48.mmPreviousFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviousFactor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "PrvsFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::PRFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousFactor";
			definition = "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) until the next redemption (factor) date.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmPreviousFactor);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmPreviousFactor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat12Choice.mmObject();
		}
	};
	@XmlElement(name = "NxtFctr")
	protected RateFormat12Choice nextFactor;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::NWFC</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmNextFactor
	 * FinancialInstrumentAttributes79.mmNextFactor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmNextFactor
	 * FinancialInstrumentAttributes48.mmNextFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNextFactor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Debt.mmFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "NxtFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::NWFC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextFactor";
			definition = "Factor used to calculate the value of the outstanding principal of the financial instrument (for factored securities) that will applicable after the redemption (factor) date.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmNextFactor);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmNextFactor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat12Choice.mmObject();
		}
	};
	@XmlElement(name = "WarrtParity")
	protected QuantityToQuantityRatio1 warrantParity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1
	 * QuantityToQuantityRatio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmWarrantParity
	 * Warrant.mmWarrantParity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WarrtParity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantParity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the ratio between the quantity of warrants and the quantity of underlying securities. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmWarrantParity
	 * FinancialInstrumentAttributes79.mmWarrantParity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmWarrantParity
	 * FinancialInstrumentAttributes48.mmWarrantParity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWarrantParity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Warrant.mmWarrantParity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "WarrtParity";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantParity";
			definition = "Provides the ratio between the quantity of warrants and the quantity of underlying securities. ";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmWarrantParity);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmWarrantParity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.QuantityToQuantityRatio1.mmObject();
		}
	};
	@XmlElement(name = "MinNmnlQty")
	protected FinancialInstrumentQuantity1Choice minimumNominalQuantity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinNmnlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::MINO</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes79.mmMinimumNominalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmMinimumNominalQuantity
	 * FinancialInstrumentAttributes48.mmMinimumNominalQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMinimumNominalQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmMinimumQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "MinNmnlQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::MINO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumNominalQuantity";
			definition = "Minimum nominal quantity of financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmMinimumNominalQuantity);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmMinimumNominalQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "CtrctSz")
	protected FinancialInstrumentQuantity1Choice contractSize;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
	 * FinancialInstrumentAttributes66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::SIZE</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmContractSize
	 * FinancialInstrumentAttributes79.mmContractSize}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmContractSize
	 * FinancialInstrumentAttributes48.mmContractSize}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContractSize = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmContractSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmObject();
			isDerived = false;
			xmlTag = "CtrctSz";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::SIZE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a financial instrument quantity.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmContractSize);
			previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmContractSize;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmPlaceOfListing,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmDayCountBasis, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmClassificationType,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmDenominationCurrency,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmNextCouponDate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmExpiryDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmFloatingRateFixingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmMaturityDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmIssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmNextCallableDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmPutableDate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmDatedDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmConversionDate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmInterestRate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmNextInterestRate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmPercentageOfDebtClaim,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmPreviousFactor, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmNextFactor,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmWarrantParity, com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmMinimumNominalQuantity,
						com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmContractSize);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPreviousNextFactorRule.forFinancialInstrumentAttributes66,
						com.tools20022.repository.constraints.ConstraintMaturityDateRule.forFinancialInstrumentAttributes66);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributes66";
				definition = "Description of the financial instrument.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstrumentAttributes79.mmObject());
				previousVersion_lazy = () -> FinancialInstrumentAttributes48.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public FinancialInstrumentAttributes66 setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<MarketIdentification3Choice> getPlaceOfListing() {
		return placeOfListing == null ? Optional.empty() : Optional.of(placeOfListing);
	}

	public FinancialInstrumentAttributes66 setPlaceOfListing(MarketIdentification3Choice placeOfListing) {
		this.placeOfListing = placeOfListing;
		return this;
	}

	public Optional<InterestComputationMethodFormat4Choice> getDayCountBasis() {
		return dayCountBasis == null ? Optional.empty() : Optional.of(dayCountBasis);
	}

	public FinancialInstrumentAttributes66 setDayCountBasis(InterestComputationMethodFormat4Choice dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
		return this;
	}

	public Optional<ClassificationType32Choice> getClassificationType() {
		return classificationType == null ? Optional.empty() : Optional.of(classificationType);
	}

	public FinancialInstrumentAttributes66 setClassificationType(ClassificationType32Choice classificationType) {
		this.classificationType = classificationType;
		return this;
	}

	public Optional<OptionStyle8Choice> getOptionStyle() {
		return optionStyle == null ? Optional.empty() : Optional.of(optionStyle);
	}

	public FinancialInstrumentAttributes66 setOptionStyle(OptionStyle8Choice optionStyle) {
		this.optionStyle = optionStyle;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getDenominationCurrency() {
		return denominationCurrency == null ? Optional.empty() : Optional.of(denominationCurrency);
	}

	public FinancialInstrumentAttributes66 setDenominationCurrency(ActiveOrHistoricCurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
		return this;
	}

	public Optional<ISODate> getNextCouponDate() {
		return nextCouponDate == null ? Optional.empty() : Optional.of(nextCouponDate);
	}

	public FinancialInstrumentAttributes66 setNextCouponDate(ISODate nextCouponDate) {
		this.nextCouponDate = nextCouponDate;
		return this;
	}

	public Optional<ISODate> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public FinancialInstrumentAttributes66 setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<ISODate> getFloatingRateFixingDate() {
		return floatingRateFixingDate == null ? Optional.empty() : Optional.of(floatingRateFixingDate);
	}

	public FinancialInstrumentAttributes66 setFloatingRateFixingDate(ISODate floatingRateFixingDate) {
		this.floatingRateFixingDate = floatingRateFixingDate;
		return this;
	}

	public Optional<ISODate> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public FinancialInstrumentAttributes66 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<ISODate> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public FinancialInstrumentAttributes66 setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<ISODate> getNextCallableDate() {
		return nextCallableDate == null ? Optional.empty() : Optional.of(nextCallableDate);
	}

	public FinancialInstrumentAttributes66 setNextCallableDate(ISODate nextCallableDate) {
		this.nextCallableDate = nextCallableDate;
		return this;
	}

	public Optional<ISODate> getPutableDate() {
		return putableDate == null ? Optional.empty() : Optional.of(putableDate);
	}

	public FinancialInstrumentAttributes66 setPutableDate(ISODate putableDate) {
		this.putableDate = putableDate;
		return this;
	}

	public Optional<ISODate> getDatedDate() {
		return datedDate == null ? Optional.empty() : Optional.of(datedDate);
	}

	public FinancialInstrumentAttributes66 setDatedDate(ISODate datedDate) {
		this.datedDate = datedDate;
		return this;
	}

	public Optional<ISODate> getConversionDate() {
		return conversionDate == null ? Optional.empty() : Optional.of(conversionDate);
	}

	public FinancialInstrumentAttributes66 setConversionDate(ISODate conversionDate) {
		this.conversionDate = conversionDate;
		return this;
	}

	public Optional<RateFormat3Choice> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public FinancialInstrumentAttributes66 setInterestRate(RateFormat3Choice interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<RateFormat3Choice> getNextInterestRate() {
		return nextInterestRate == null ? Optional.empty() : Optional.of(nextInterestRate);
	}

	public FinancialInstrumentAttributes66 setNextInterestRate(RateFormat3Choice nextInterestRate) {
		this.nextInterestRate = nextInterestRate;
		return this;
	}

	public Optional<RateFormat3Choice> getPercentageOfDebtClaim() {
		return percentageOfDebtClaim == null ? Optional.empty() : Optional.of(percentageOfDebtClaim);
	}

	public FinancialInstrumentAttributes66 setPercentageOfDebtClaim(RateFormat3Choice percentageOfDebtClaim) {
		this.percentageOfDebtClaim = percentageOfDebtClaim;
		return this;
	}

	public Optional<RateFormat12Choice> getPreviousFactor() {
		return previousFactor == null ? Optional.empty() : Optional.of(previousFactor);
	}

	public FinancialInstrumentAttributes66 setPreviousFactor(RateFormat12Choice previousFactor) {
		this.previousFactor = previousFactor;
		return this;
	}

	public Optional<RateFormat12Choice> getNextFactor() {
		return nextFactor == null ? Optional.empty() : Optional.of(nextFactor);
	}

	public FinancialInstrumentAttributes66 setNextFactor(RateFormat12Choice nextFactor) {
		this.nextFactor = nextFactor;
		return this;
	}

	public Optional<QuantityToQuantityRatio1> getWarrantParity() {
		return warrantParity == null ? Optional.empty() : Optional.of(warrantParity);
	}

	public FinancialInstrumentAttributes66 setWarrantParity(com.tools20022.repository.msg.QuantityToQuantityRatio1 warrantParity) {
		this.warrantParity = warrantParity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getMinimumNominalQuantity() {
		return minimumNominalQuantity == null ? Optional.empty() : Optional.of(minimumNominalQuantity);
	}

	public FinancialInstrumentAttributes66 setMinimumNominalQuantity(FinancialInstrumentQuantity1Choice minimumNominalQuantity) {
		this.minimumNominalQuantity = minimumNominalQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getContractSize() {
		return contractSize == null ? Optional.empty() : Optional.of(contractSize);
	}

	public FinancialInstrumentAttributes66 setContractSize(FinancialInstrumentQuantity1Choice contractSize) {
		this.contractSize = contractSize;
		return this;
	}
}
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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Financial instruments representing a sum of rights of the investor vis-a-vis
 * the issuer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmCertificateNumber
 * FinancialInstrumentAttributes1.mmCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmProperties
 * FinancialInstrumentAttributes1.mmProperties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmClassificationType
 * FinancialInstrumentAttributes1.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmContractVersionNumber
 * FinancialInstrumentAttributes1.mmContractVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmCountryOfIssue
 * FinancialInstrumentAttributes1.mmCountryOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmCouponAttachedNumber
 * FinancialInstrumentAttributes1.mmCouponAttachedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmCoveredIndicator
 * FinancialInstrumentAttributes1.mmCoveredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmDenominationCurrency
 * FinancialInstrumentAttributes1.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmAppearance
 * FinancialInstrumentAttributes1.mmAppearance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmIssueDate
 * FinancialInstrumentAttributes1.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmLegalRestrictions
 * FinancialInstrumentAttributes1.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmTaxLotNumber
 * FinancialInstrumentAttributes1.mmTaxLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmTradeLotSize
 * FinancialInstrumentAttributes1.mmTradeLotSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmMinimumTradedNominalQuantity
 * FinancialInstrumentAttributes1.mmMinimumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmName
 * FinancialInstrumentAttributes1.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPlaceOfIssueIdentification
 * FinancialInstrumentAttributes1.mmPlaceOfIssueIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPlaceOfRegistry
 * FinancialInstrumentAttributes1.mmPlaceOfRegistry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPoolNumber
 * FinancialInstrumentAttributes1.mmPoolNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPrimaryPlaceOfListingIdentification
 * FinancialInstrumentAttributes1.mmPrimaryPlaceOfListingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPositionLimit
 * FinancialInstrumentAttributes1.mmPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmListingDate
 * FinancialInstrumentAttributes1.mmListingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmNTPositionLimit
 * FinancialInstrumentAttributes1.mmNTPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmProductType
 * FinancialInstrumentAttributes1.mmProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmContractSettlementMonth
 * FinancialInstrumentAttributes1.mmContractSettlementMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmMinimumTradingPricingIncrement
 * FinancialInstrumentAttributes1.mmMinimumTradingPricingIncrement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPurpose
 * FinancialInstrumentAttributes1.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmRating
 * FinancialInstrumentAttributes1.mmRating}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmSecurityStatus
 * FinancialInstrumentAttributes1.mmSecurityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmSecondaryPlaceOfListing
 * FinancialInstrumentAttributes1.mmSecondaryPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmSettleStyle
 * FinancialInstrumentAttributes1.mmSettleStyle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmIssuer
 * FinancialInstrumentAttributes1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmRegistrationForm
 * FinancialInstrumentAttributes1.mmRegistrationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmLegAttributes
 * FinancialInstrumentAttributes1.mmLegAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmEventGroupDetails
 * FinancialInstrumentAttributes1.mmEventGroupDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmAdditionalUnderlyingAttributes
 * FinancialInstrumentAttributes1.mmAdditionalUnderlyingAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributes1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributes1", propOrder = {"certificateNumber", "properties", "classificationType", "contractVersionNumber", "countryOfIssue", "couponAttachedNumber", "coveredIndicator", "denominationCurrency",
		"appearance", "issueDate", "legalRestrictions", "taxLotNumber", "tradeLotSize", "minimumTradedNominalQuantity", "name", "placeOfIssueIdentification", "placeOfRegistry", "poolNumber", "primaryPlaceOfListingIdentification",
		"positionLimit", "listingDate", "nTPositionLimit", "productType", "contractSettlementMonth", "minimumTradingPricingIncrement", "purpose", "rating", "securityStatus", "secondaryPlaceOfListing", "settleStyle", "issuer",
		"registrationForm", "legAttributes", "eventGroupDetails", "additionalUnderlyingAttributes"})
public class FinancialInstrumentAttributes1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CertNb")
	protected Max35Text certificateNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
	 * SecuritiesCertificate.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a certificate assigned by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificateNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesCertificate.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "CertNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			definition = "Unique and unambiguous identifier of a certificate assigned by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Props")
	protected FinancialInstrumentProperties1Choice properties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice
	 * FinancialInstrumentProperties1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Props"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Properties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details about the financial insrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProperties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "Props";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Properties";
			definition = "Provides additional details about the financial insrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentProperties1Choice.mmObject();
		}
	};
	@XmlElement(name = "ClssfctnTp")
	protected SecurityClassificationType1Choice classificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityClassificationType1Choice
	 * SecurityClassificationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 461, FIXSynonym: 167</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, eg, common share with voting rights, fully paid, or registered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClassificationType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "461"), new FIXSynonym(this, "167"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, eg, common share with voting rights, fully paid, or registered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityClassificationType1Choice.mmObject();
		}
	};
	@XmlElement(name = "CtrctVrsnNb")
	protected Number contractVersionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctVrsnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractVersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version number assigned to the contract associated with the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractVersionNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "CtrctVrsnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractVersionNumber";
			definition = "Version number assigned to the contract associated with the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "CtryOfIsse")
	protected CountryCode countryOfIssue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIsse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 470</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Primary market or country where a security is issued by the issuer or its agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfIssue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "470"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Primary market or country where a security is issued by the issuer or its agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "CpnAttchdNb")
	protected Max3NumericText couponAttachedNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
	 * CouponAttached.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnAttchdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponAttachedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached to the physical security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCouponAttachedNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "CpnAttchdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponAttachedNumber";
			definition = "Number of the coupon attached to the physical security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "CvrdInd")
	protected YesNoIndicator coveredIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmDerivativeCovered
	 * Derivative.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CvrdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative product is covered or not by an underlying financial instrument position."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCoveredIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmDerivativeCovered;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "CvrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredIndicator";
			definition = "Indicates whether the derivative product is covered or not by an underlying financial instrument position.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DnmtnCcy")
	protected CurrencyCode denominationCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
	 * Security.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 15</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDenominationCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "15"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "Apprnc")
	protected Appearance1Code appearance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Appearance1Code
	 * Appearance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmAppearance
	 * Security.mmAppearance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Apprnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Appearance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the deliverability of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAppearance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmAppearance;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "Apprnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Appearance";
			definition = "Specifies the deliverability of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Appearance1Code.mmObject();
		}
	};
	@XmlElement(name = "IsseDt")
	protected ISODateTime issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 225</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the security was made available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "225"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "LglRstrctns")
	protected LegalRestrictions1Code legalRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code
	 * LegalRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRestriction#mmLegalRestrictionType
	 * SecuritiesRestriction.mmLegalRestrictionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the regulatory restrictions applicable to a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalRestrictions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRestriction.mmLegalRestrictionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Specifies the regulatory restrictions applicable to a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LegalRestrictions1Code.mmObject();
		}
	};
	@XmlElement(name = "TaxLotNb")
	protected Max15NumericText taxLotNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxLotNumber
	 * SecuritiesTax.mmTaxLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxLotNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxLotNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxLotNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "TaxLotNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxLotNumber";
			definition = "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	@XmlElement(name = "TradLotSz")
	protected FinancialInstrumentQuantityChoice tradeLotSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradeLotSize
	 * TradingMarket.mmTradeLotSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradLotSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLotSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum number of securities that can be traded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeLotSize = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmTradeLotSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "TradLotSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeLotSize";
			definition = "Minimum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "MinTraddNmnlQty")
	protected UnitOrFaceAmountChoice minimumTradedNominalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice
	 * UnitOrFaceAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMinimumTradedNominalQuantity
	 * TradingMarket.mmMinimumTradedNominalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinTraddNmnlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradedNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum number of securities that can be traded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumTradedNominalQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmMinimumTradedNominalQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "MinTraddNmnlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTradedNominalQuantity";
			definition = "Minimum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmountChoice.mmObject();
		}
	};
	@XmlElement(name = "Nm")
	protected Max140Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
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
	 * definition} =
	 * "Name of the security linked to this security identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the security linked to this security identification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "PlcOfIsseId")
	protected MICIdentifier placeOfIssueIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfIsseId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 471, FIXSynonym: 472</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIssueIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates where the financial instrument was issued in a place other than the country of issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfIssueIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfIsseId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "471"), new FIXSynonym(this, "472"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIssueIdentification";
			definition = "Indicates where the financial instrument was issued in a place other than the country of issue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	@XmlElement(name = "PlcOfRegy")
	protected BICOrCountryCodeChoice placeOfRegistry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BICOrCountryCodeChoice
	 * BICOrCountryCodeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfRegy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 543</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfRegistry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The location at which records of ownership are maintained for this instrument, and at which ownership changes must be recorded. This can be either the depository /custodian who maintains ownership Records or the country in which registry is kept."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfRegistry = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfRegy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "543"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfRegistry";
			definition = "The location at which records of ownership are maintained for this instrument, and at which ownership changes must be recorded. This can be either the depository /custodian who maintains ownership Records or the country in which registry is kept.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BICOrCountryCodeChoice.mmObject();
		}
	};
	@XmlElement(name = "PoolNb")
	protected Max15NumericText poolNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPoolNumber
	 * Debt.mmPoolNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 691</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a group of underlying assets assigned by the issuer of a factored security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPoolNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "PoolNb";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "691"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	@XmlElement(name = "PmryPlcOfListgId")
	protected MICIdentifier primaryPlaceOfListingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryPlcOfListgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 207</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryPlaceOfListingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is listed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrimaryPlaceOfListingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "PmryPlcOfListgId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "207"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryPlaceOfListingIdentification";
			definition = "Market(s) on which the security is listed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	@XmlElement(name = "PosLmt")
	protected FinancialInstrumentQuantityChoice positionLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmPositionLimit
	 * Option.mmPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 970</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position limits are created for the purpose of maintaining stable and fair markets. Contracts held by one individual investor with different brokers may be combined in order to gauge accurately the level of control held by one party. \n\nEach option and futures contract will have varying position limits."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPositionLimit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmPositionLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "PosLmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "970"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionLimit";
			definition = "Position limits are created for the purpose of maintaining stable and fair markets. Contracts held by one individual investor with different brokers may be combined in order to gauge accurately the level of control held by one party. \n\nEach option and futures contract will have varying position limits.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "ListgDt")
	protected ISODateTime listingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListingDate
	 * TradingMarket.mmListingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the security is listed at the specific exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmListingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "ListgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListingDate";
			definition = "Date/time at which the security is listed at the specific exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "NTPosLmt")
	protected FinancialInstrumentQuantityChoice nTPositionLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmNearTermPositionLimit
	 * Security.mmNearTermPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NTPosLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 971</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NTPositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Near-term Position Limit for the instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNTPositionLimit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmNearTermPositionLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "NTPosLmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "971"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NTPositionLimit";
			definition = "Near-term Position Limit for the instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "PdctTp")
	protected ProductType1Code productType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductType1Code
	 * ProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
	 * Asset.mmAssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 460</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classification type of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmAssetClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "PdctTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "460"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductType";
			definition = "Classification type of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ProductType1Code.mmObject();
		}
	};
	@XmlElement(name = "CtrctSttlmMnth")
	protected ISOYearMonth contractSettlementMonth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmContractSettlementMonth
	 * Security.mmContractSettlementMonth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSttlmMnth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 667</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSettlementMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies when the contract (i.e. MBS/TBA) will settle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractSettlementMonth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmContractSettlementMonth;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "CtrctSttlmMnth";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "667"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}
	};
	@XmlElement(name = "MinTradgPricgIncrmt")
	protected Number minimumTradingPricingIncrement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmMinimumTradingPricingIncrement
	 * Security.mmMinimumTradingPricingIncrement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinTradgPricgIncrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 969</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradingPricingIncrement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the minimum or smallest movement (up or down) in the price allowed for the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumTradingPricingIncrement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmMinimumTradingPricingIncrement;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "MinTradgPricgIncrmt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "969"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTradingPricingIncrement";
			definition = "Indicates the minimum or smallest movement (up or down) in the price allowed for the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "Purp")
	protected Max256Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmPurpose
	 * Issuance.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for which money is raised through the issuance of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	@XmlElement(name = "Ratg")
	protected Rating1 rating;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rating1 Rating1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRating
	 * Security.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ratg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 255</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Assessment of securities credit and investment risk."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRating = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmRating;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "Ratg";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "255"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rating";
			definition = "Assessment of securities credit and investment risk.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rating1.mmObject();
		}
	};
	@XmlElement(name = "SctySts")
	protected SecurityStatus1Code securityStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecurityStatus1Code
	 * SecurityStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmStatus
	 * SecuritiesStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 965</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "SctySts";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "965"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SecurityStatus1Code.mmObject();
		}
	};
	@XmlElement(name = "ScndryPlcOfListg")
	protected List<MICIdentifier> secondaryPlaceOfListing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryPlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryPlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the security is listed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondaryPlaceOfListing = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "ScndryPlcOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryPlaceOfListing";
			definition = "Market(s) on which the security is listed.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	@XmlElement(name = "SttlStyle")
	protected SettleStyle1Code settleStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettleStyle1Code
	 * SettleStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmSettleStyle
	 * Option.mmSettleStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 966</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettleStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For Settle on Open index options, the exercise settlement value is calculated using the opening (first) reported sales price in the primary market of each component stock on the last business day (usually a Friday) before the expiration date. The last trading day for Settle on Open index options is the business day (usually a Thursday) preceding the day on which the exercise settlement value is determined. It is the listing exchange's responsibility to calculate the exercise settlement value and they must provide this price to the clearinghouse. In the case of a dually listed index option each exchange must provide a value. These prices are compared by the clearinghouse and any discrepancies are resolved. Disagreements are rare because the index proprietor calculates the price for the exchange(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettleStyle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmSettleStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "SttlStyle";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "966"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettleStyle";
			definition = "For Settle on Open index options, the exercise settlement value is calculated using the opening (first) reported sales price in the primary market of each component stock on the last business day (usually a Friday) before the expiration date. The last trading day for Settle on Open index options is the business day (usually a Thursday) preceding the day on which the exercise settlement value is determined. It is the listing exchange's responsibility to calculate the exercise settlement value and they must provide this price to the clearinghouse. In the case of a dually listed index option each exchange must provide a value. These prices are compared by the clearinghouse and any discrepancies are resolved. Disagreements are rare because the index proprietor calculates the price for the exchange(s).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettleStyle1Code.mmObject();
		}
	};
	@XmlElement(name = "Issr")
	protected PartyIdentification12Choice issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification12Choice
	 * PartyIdentification12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 106</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal entity that has the right to issue securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "106"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Legal entity that has the right to issue securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification12Choice.mmObject();
		}
	};
	@XmlElement(name = "RegnForm")
	protected FormOfSecurity1Code registrationForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurity1Code
	 * FormOfSecurity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the form, ie, ownership, of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "RegnForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationForm";
			definition = "Specifies the form, ie, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}
	};
	@XmlElement(name = "LegAttrbts")
	protected LegDetails1 legAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LegDetails1
	 * LegDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmLegAdditionalInformation
	 * Asset.mmLegAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the leg."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmLegAdditionalInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "LegAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegAttributes";
			definition = "Provides details about the leg.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LegDetails1.mmObject();
		}
	};
	@XmlElement(name = "EvtGrpDtls")
	protected List<com.tools20022.repository.msg.EventGroup1> eventGroupDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EventGroup1
	 * EventGroup1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtGrpDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventGroupDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the event scheduled during the life of a security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEventGroupDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "EvtGrpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventGroupDetails";
			definition = "Provides details about the event scheduled during the life of a security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EventGroup1.mmObject();
		}
	};
	@XmlElement(name = "AddtlUndrlygAttrbts")
	protected UnderlyingAttributes additionalUnderlyingAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnderlyingAttributes
	 * UnderlyingAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlUndrlygAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalUnderlyingAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides more information about the underlying instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalUnderlyingAttributes = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmObject();
			isDerived = false;
			xmlTag = "AddtlUndrlygAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalUnderlyingAttributes";
			definition = "Provides more information about the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmCertificateNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmProperties,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmContractVersionNumber,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmCountryOfIssue, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmCouponAttachedNumber,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmCoveredIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmDenominationCurrency,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmAppearance, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmIssueDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmLegalRestrictions, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmTaxLotNumber,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmTradeLotSize, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmMinimumTradedNominalQuantity,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmName, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmPlaceOfIssueIdentification,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmPlaceOfRegistry, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmPoolNumber,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmPrimaryPlaceOfListingIdentification, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmPositionLimit,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmListingDate, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmNTPositionLimit,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmProductType, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmContractSettlementMonth,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmMinimumTradingPricingIncrement, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmPurpose,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmRating, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmSecurityStatus,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmSecondaryPlaceOfListing, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmSettleStyle,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmIssuer, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmRegistrationForm,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmLegAttributes, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmEventGroupDetails,
						com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmAdditionalUnderlyingAttributes);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FinancialInstrumentAttributes1";
				definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getCertificateNumber() {
		return certificateNumber == null ? Optional.empty() : Optional.of(certificateNumber);
	}

	public FinancialInstrumentAttributes1 setCertificateNumber(Max35Text certificateNumber) {
		this.certificateNumber = certificateNumber;
		return this;
	}

	public Optional<FinancialInstrumentProperties1Choice> getProperties() {
		return properties == null ? Optional.empty() : Optional.of(properties);
	}

	public FinancialInstrumentAttributes1 setProperties(FinancialInstrumentProperties1Choice properties) {
		this.properties = properties;
		return this;
	}

	public Optional<SecurityClassificationType1Choice> getClassificationType() {
		return classificationType == null ? Optional.empty() : Optional.of(classificationType);
	}

	public FinancialInstrumentAttributes1 setClassificationType(SecurityClassificationType1Choice classificationType) {
		this.classificationType = classificationType;
		return this;
	}

	public Optional<Number> getContractVersionNumber() {
		return contractVersionNumber == null ? Optional.empty() : Optional.of(contractVersionNumber);
	}

	public FinancialInstrumentAttributes1 setContractVersionNumber(Number contractVersionNumber) {
		this.contractVersionNumber = contractVersionNumber;
		return this;
	}

	public Optional<CountryCode> getCountryOfIssue() {
		return countryOfIssue == null ? Optional.empty() : Optional.of(countryOfIssue);
	}

	public FinancialInstrumentAttributes1 setCountryOfIssue(CountryCode countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
		return this;
	}

	public Optional<Max3NumericText> getCouponAttachedNumber() {
		return couponAttachedNumber == null ? Optional.empty() : Optional.of(couponAttachedNumber);
	}

	public FinancialInstrumentAttributes1 setCouponAttachedNumber(Max3NumericText couponAttachedNumber) {
		this.couponAttachedNumber = couponAttachedNumber;
		return this;
	}

	public Optional<YesNoIndicator> getCoveredIndicator() {
		return coveredIndicator == null ? Optional.empty() : Optional.of(coveredIndicator);
	}

	public FinancialInstrumentAttributes1 setCoveredIndicator(YesNoIndicator coveredIndicator) {
		this.coveredIndicator = coveredIndicator;
		return this;
	}

	public Optional<CurrencyCode> getDenominationCurrency() {
		return denominationCurrency == null ? Optional.empty() : Optional.of(denominationCurrency);
	}

	public FinancialInstrumentAttributes1 setDenominationCurrency(CurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
		return this;
	}

	public Optional<Appearance1Code> getAppearance() {
		return appearance == null ? Optional.empty() : Optional.of(appearance);
	}

	public FinancialInstrumentAttributes1 setAppearance(Appearance1Code appearance) {
		this.appearance = appearance;
		return this;
	}

	public Optional<ISODateTime> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public FinancialInstrumentAttributes1 setIssueDate(ISODateTime issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<LegalRestrictions1Code> getLegalRestrictions() {
		return legalRestrictions == null ? Optional.empty() : Optional.of(legalRestrictions);
	}

	public FinancialInstrumentAttributes1 setLegalRestrictions(LegalRestrictions1Code legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
		return this;
	}

	public Optional<Max15NumericText> getTaxLotNumber() {
		return taxLotNumber == null ? Optional.empty() : Optional.of(taxLotNumber);
	}

	public FinancialInstrumentAttributes1 setTaxLotNumber(Max15NumericText taxLotNumber) {
		this.taxLotNumber = taxLotNumber;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getTradeLotSize() {
		return tradeLotSize == null ? Optional.empty() : Optional.of(tradeLotSize);
	}

	public FinancialInstrumentAttributes1 setTradeLotSize(FinancialInstrumentQuantityChoice tradeLotSize) {
		this.tradeLotSize = tradeLotSize;
		return this;
	}

	public Optional<UnitOrFaceAmountChoice> getMinimumTradedNominalQuantity() {
		return minimumTradedNominalQuantity == null ? Optional.empty() : Optional.of(minimumTradedNominalQuantity);
	}

	public FinancialInstrumentAttributes1 setMinimumTradedNominalQuantity(UnitOrFaceAmountChoice minimumTradedNominalQuantity) {
		this.minimumTradedNominalQuantity = minimumTradedNominalQuantity;
		return this;
	}

	public Optional<Max140Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public FinancialInstrumentAttributes1 setName(Max140Text name) {
		this.name = name;
		return this;
	}

	public Optional<MICIdentifier> getPlaceOfIssueIdentification() {
		return placeOfIssueIdentification == null ? Optional.empty() : Optional.of(placeOfIssueIdentification);
	}

	public FinancialInstrumentAttributes1 setPlaceOfIssueIdentification(MICIdentifier placeOfIssueIdentification) {
		this.placeOfIssueIdentification = placeOfIssueIdentification;
		return this;
	}

	public Optional<BICOrCountryCodeChoice> getPlaceOfRegistry() {
		return placeOfRegistry == null ? Optional.empty() : Optional.of(placeOfRegistry);
	}

	public FinancialInstrumentAttributes1 setPlaceOfRegistry(BICOrCountryCodeChoice placeOfRegistry) {
		this.placeOfRegistry = placeOfRegistry;
		return this;
	}

	public Optional<Max15NumericText> getPoolNumber() {
		return poolNumber == null ? Optional.empty() : Optional.of(poolNumber);
	}

	public FinancialInstrumentAttributes1 setPoolNumber(Max15NumericText poolNumber) {
		this.poolNumber = poolNumber;
		return this;
	}

	public Optional<MICIdentifier> getPrimaryPlaceOfListingIdentification() {
		return primaryPlaceOfListingIdentification == null ? Optional.empty() : Optional.of(primaryPlaceOfListingIdentification);
	}

	public FinancialInstrumentAttributes1 setPrimaryPlaceOfListingIdentification(MICIdentifier primaryPlaceOfListingIdentification) {
		this.primaryPlaceOfListingIdentification = primaryPlaceOfListingIdentification;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getPositionLimit() {
		return positionLimit == null ? Optional.empty() : Optional.of(positionLimit);
	}

	public FinancialInstrumentAttributes1 setPositionLimit(FinancialInstrumentQuantityChoice positionLimit) {
		this.positionLimit = positionLimit;
		return this;
	}

	public Optional<ISODateTime> getListingDate() {
		return listingDate == null ? Optional.empty() : Optional.of(listingDate);
	}

	public FinancialInstrumentAttributes1 setListingDate(ISODateTime listingDate) {
		this.listingDate = listingDate;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getNTPositionLimit() {
		return nTPositionLimit == null ? Optional.empty() : Optional.of(nTPositionLimit);
	}

	public FinancialInstrumentAttributes1 setNTPositionLimit(FinancialInstrumentQuantityChoice nTPositionLimit) {
		this.nTPositionLimit = nTPositionLimit;
		return this;
	}

	public Optional<ProductType1Code> getProductType() {
		return productType == null ? Optional.empty() : Optional.of(productType);
	}

	public FinancialInstrumentAttributes1 setProductType(ProductType1Code productType) {
		this.productType = productType;
		return this;
	}

	public Optional<ISOYearMonth> getContractSettlementMonth() {
		return contractSettlementMonth == null ? Optional.empty() : Optional.of(contractSettlementMonth);
	}

	public FinancialInstrumentAttributes1 setContractSettlementMonth(ISOYearMonth contractSettlementMonth) {
		this.contractSettlementMonth = contractSettlementMonth;
		return this;
	}

	public Optional<Number> getMinimumTradingPricingIncrement() {
		return minimumTradingPricingIncrement == null ? Optional.empty() : Optional.of(minimumTradingPricingIncrement);
	}

	public FinancialInstrumentAttributes1 setMinimumTradingPricingIncrement(Number minimumTradingPricingIncrement) {
		this.minimumTradingPricingIncrement = minimumTradingPricingIncrement;
		return this;
	}

	public Optional<Max256Text> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public FinancialInstrumentAttributes1 setPurpose(Max256Text purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<Rating1> getRating() {
		return rating == null ? Optional.empty() : Optional.of(rating);
	}

	public FinancialInstrumentAttributes1 setRating(com.tools20022.repository.msg.Rating1 rating) {
		this.rating = rating;
		return this;
	}

	public Optional<SecurityStatus1Code> getSecurityStatus() {
		return securityStatus == null ? Optional.empty() : Optional.of(securityStatus);
	}

	public FinancialInstrumentAttributes1 setSecurityStatus(SecurityStatus1Code securityStatus) {
		this.securityStatus = securityStatus;
		return this;
	}

	public List<MICIdentifier> getSecondaryPlaceOfListing() {
		return secondaryPlaceOfListing == null ? secondaryPlaceOfListing = new ArrayList<>() : secondaryPlaceOfListing;
	}

	public FinancialInstrumentAttributes1 setSecondaryPlaceOfListing(List<MICIdentifier> secondaryPlaceOfListing) {
		this.secondaryPlaceOfListing = Objects.requireNonNull(secondaryPlaceOfListing);
		return this;
	}

	public Optional<SettleStyle1Code> getSettleStyle() {
		return settleStyle == null ? Optional.empty() : Optional.of(settleStyle);
	}

	public FinancialInstrumentAttributes1 setSettleStyle(SettleStyle1Code settleStyle) {
		this.settleStyle = settleStyle;
		return this;
	}

	public Optional<PartyIdentification12Choice> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public FinancialInstrumentAttributes1 setIssuer(PartyIdentification12Choice issuer) {
		this.issuer = issuer;
		return this;
	}

	public Optional<FormOfSecurity1Code> getRegistrationForm() {
		return registrationForm == null ? Optional.empty() : Optional.of(registrationForm);
	}

	public FinancialInstrumentAttributes1 setRegistrationForm(FormOfSecurity1Code registrationForm) {
		this.registrationForm = registrationForm;
		return this;
	}

	public Optional<LegDetails1> getLegAttributes() {
		return legAttributes == null ? Optional.empty() : Optional.of(legAttributes);
	}

	public FinancialInstrumentAttributes1 setLegAttributes(com.tools20022.repository.msg.LegDetails1 legAttributes) {
		this.legAttributes = legAttributes;
		return this;
	}

	public List<EventGroup1> getEventGroupDetails() {
		return eventGroupDetails == null ? eventGroupDetails = new ArrayList<>() : eventGroupDetails;
	}

	public FinancialInstrumentAttributes1 setEventGroupDetails(List<com.tools20022.repository.msg.EventGroup1> eventGroupDetails) {
		this.eventGroupDetails = Objects.requireNonNull(eventGroupDetails);
		return this;
	}

	public Optional<UnderlyingAttributes> getAdditionalUnderlyingAttributes() {
		return additionalUnderlyingAttributes == null ? Optional.empty() : Optional.of(additionalUnderlyingAttributes);
	}

	public FinancialInstrumentAttributes1 setAdditionalUnderlyingAttributes(com.tools20022.repository.msg.UnderlyingAttributes additionalUnderlyingAttributes) {
		this.additionalUnderlyingAttributes = additionalUnderlyingAttributes;
		return this;
	}
}
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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.QualifiedDividendTax1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionSD6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmPlaceAndName
 * CorporateActionSD4.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmNewParValue
 * CorporateActionSD4.mmNewParValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmOldParValue
 * CorporateActionSD4.mmOldParValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmExchangeFeeRequiredFlag
 * CorporateActionSD4.mmExchangeFeeRequiredFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmCustodianShellFlag
 * CorporateActionSD4.mmCustodianShellFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmMustAllSharesBeSubmittedFlag
 * CorporateActionSD4.mmMustAllSharesBeSubmittedFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmLotteryDetails
 * CorporateActionSD4.mmLotteryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmQualifiedDividendTaxIndicator
 * CorporateActionSD4.mmQualifiedDividendTaxIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmSurvivingCompany
 * CorporateActionSD4.mmSurvivingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4#mmForeignIncomeSourceFlag
 * CorporateActionSD4.mmForeignIncomeSourceFlag}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionSD4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionSD4", propOrder = {"placeAndName", "newParValue", "oldParValue", "exchangeFeeRequiredFlag", "custodianShellFlag", "mustAllSharesBeSubmittedFlag", "lotteryDetails", "qualifiedDividendTaxIndicator",
		"survivingCompany", "foreignIncomeSourceFlag"})
public class CorporateActionSD4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD4, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionSD4, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionSD4 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionSD4 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "NewParVal")
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount newParValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewParVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: New Par Value</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New par value of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD4, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>> mmNewParValue = new MMMessageAttribute<CorporateActionSD4, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "NewParVal";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "New Par Value"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewParValue";
			definition = "New par value of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getValue(CorporateActionSD4 obj) {
			return obj.getNewParValue();
		}

		@Override
		public void setValue(CorporateActionSD4 obj, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> value) {
			obj.setNewParValue(value.orElse(null));
		}
	};
	@XmlElement(name = "OdParVal")
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount oldParValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OdParVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Old Par Value</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OldParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Old par value of the event security represents the previously established par value that has changed in par value event. Used in combination with new par value element to represent the difference."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD4, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>> mmOldParValue = new MMMessageAttribute<CorporateActionSD4, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "OdParVal";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Old Par Value"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OldParValue";
			definition = "Old par value of the event security represents the previously established par value that has changed in par value event. Used in combination with new par value element to represent the difference.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getValue(CorporateActionSD4 obj) {
			return obj.getOldParValue();
		}

		@Override
		public void setValue(CorporateActionSD4 obj, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> value) {
			obj.setOldParValue(value.orElse(null));
		}
	};
	@XmlElement(name = "XchgFeeReqrdFlg")
	protected YesNoIndicator exchangeFeeRequiredFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgFeeReqrdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Exchange Fee Required Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeFeeRequiredFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event agent is charging a cancellation and or issuance fee upon the exchange of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD4, Optional<YesNoIndicator>> mmExchangeFeeRequiredFlag = new MMMessageAttribute<CorporateActionSD4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "XchgFeeReqrdFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Exchange Fee Required Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeFeeRequiredFlag";
			definition = "Indicates whether the event agent is charging a cancellation and or issuance fee upon the exchange of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD4 obj) {
			return obj.getExchangeFeeRequiredFlag();
		}

		@Override
		public void setValue(CorporateActionSD4 obj, Optional<YesNoIndicator> value) {
			obj.setExchangeFeeRequiredFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "CtdnShellFlg")
	protected YesNoIndicator custodianShellFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnShellFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Custodian Shell Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianShellFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GCA VS-specific flag that indicates whether a composite record has been generated as a result of custodian information that has not yet been confirmed in the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD4, Optional<YesNoIndicator>> mmCustodianShellFlag = new MMMessageAttribute<CorporateActionSD4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "CtdnShellFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Custodian Shell Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianShellFlag";
			definition = "GCA VS-specific flag that indicates whether a composite record has been generated as a result of custodian information that has not yet been confirmed in the market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD4 obj) {
			return obj.getCustodianShellFlag();
		}

		@Override
		public void setValue(CorporateActionSD4 obj, Optional<YesNoIndicator> value) {
			obj.setCustodianShellFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "MustAllShrsBeSubmittdFlg")
	protected YesNoIndicator mustAllSharesBeSubmittedFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MustAllShrsBeSubmittdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Must All Shares be Submitted Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MustAllSharesBeSubmittedFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the issuer requires a holder to present the entire account balance in order to be eligible for the offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD4, Optional<YesNoIndicator>> mmMustAllSharesBeSubmittedFlag = new MMMessageAttribute<CorporateActionSD4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "MustAllShrsBeSubmittdFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Must All Shares be Submitted Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MustAllSharesBeSubmittedFlag";
			definition = "Indicates whether the issuer requires a holder to present the entire account balance in order to be eligible for the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD4 obj) {
			return obj.getMustAllSharesBeSubmittedFlag();
		}

		@Override
		public void setValue(CorporateActionSD4 obj, Optional<YesNoIndicator> value) {
			obj.setMustAllSharesBeSubmittedFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "LtryDtls")
	protected CorporateActionSD6 lotteryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionSD6
	 * CorporateActionSD6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Lottery Details</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the lottery that has been drawn as a part of the corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionSD4, Optional<CorporateActionSD6>> mmLotteryDetails = new MMMessageAssociationEnd<CorporateActionSD4, Optional<CorporateActionSD6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "LtryDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Lottery Details"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryDetails";
			definition = "Provides details about the lottery that has been drawn as a part of the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionSD6.mmObject();
		}

		@Override
		public Optional<CorporateActionSD6> getValue(CorporateActionSD4 obj) {
			return obj.getLotteryDetails();
		}

		@Override
		public void setValue(CorporateActionSD4 obj, Optional<CorporateActionSD6> value) {
			obj.setLotteryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "QlfdDvddTaxInd")
	protected QualifiedDividendTax1Code qualifiedDividendTaxIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QualifiedDividendTax1Code
	 * QualifiedDividendTax1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QlfdDvddTaxInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Qualified Dividend Tax Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedDividendTaxIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend as whole or in part qualifies for lower/ favourable tax rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD4, Optional<QualifiedDividendTax1Code>> mmQualifiedDividendTaxIndicator = new MMMessageAttribute<CorporateActionSD4, Optional<QualifiedDividendTax1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "QlfdDvddTaxInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Qualified Dividend Tax Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedDividendTaxIndicator";
			definition = "Indicates whether the dividend as whole or in part qualifies for lower/ favourable tax rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QualifiedDividendTax1Code.mmObject();
		}

		@Override
		public Optional<QualifiedDividendTax1Code> getValue(CorporateActionSD4 obj) {
			return obj.getQualifiedDividendTaxIndicator();
		}

		@Override
		public void setValue(CorporateActionSD4 obj, Optional<QualifiedDividendTax1Code> value) {
			obj.setQualifiedDividendTaxIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "SrvvgCpny")
	protected Max70Text survivingCompany;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrvvgCpny"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Surviving Company</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurvivingCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the company that will remain (possibly a new name), usually designated after a merger."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD4, Optional<Max70Text>> mmSurvivingCompany = new MMMessageAttribute<CorporateActionSD4, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "SrvvgCpny";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Surviving Company"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurvivingCompany";
			definition = "Name of the company that will remain (possibly a new name), usually designated after a merger.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CorporateActionSD4 obj) {
			return obj.getSurvivingCompany();
		}

		@Override
		public void setValue(CorporateActionSD4 obj, Optional<Max70Text> value) {
			obj.setSurvivingCompany(value.orElse(null));
		}
	};
	@XmlElement(name = "FrgnIncmSrcFlg")
	protected YesNoIndicator foreignIncomeSourceFlag;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD4
	 * CorporateActionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnIncmSrcFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignIncomeSourceFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates when all or part of the distribution is paid from foreign sourced income of the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionSD4, Optional<YesNoIndicator>> mmForeignIncomeSourceFlag = new MMMessageAttribute<CorporateActionSD4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionSD4.mmObject();
			isDerived = false;
			xmlTag = "FrgnIncmSrcFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignIncomeSourceFlag";
			definition = "Indicates when all or part of the distribution is paid from foreign sourced income of the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionSD4 obj) {
			return obj.getForeignIncomeSourceFlag();
		}

		@Override
		public void setValue(CorporateActionSD4 obj, Optional<YesNoIndicator> value) {
			obj.setForeignIncomeSourceFlag(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionSD4.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionSD4.mmNewParValue,
						com.tools20022.repository.msg.CorporateActionSD4.mmOldParValue, com.tools20022.repository.msg.CorporateActionSD4.mmExchangeFeeRequiredFlag, com.tools20022.repository.msg.CorporateActionSD4.mmCustodianShellFlag,
						com.tools20022.repository.msg.CorporateActionSD4.mmMustAllSharesBeSubmittedFlag, com.tools20022.repository.msg.CorporateActionSD4.mmLotteryDetails,
						com.tools20022.repository.msg.CorporateActionSD4.mmQualifiedDividendTaxIndicator, com.tools20022.repository.msg.CorporateActionSD4.mmSurvivingCompany,
						com.tools20022.repository.msg.CorporateActionSD4.mmForeignIncomeSourceFlag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionSD4";
				definition = "Provides additional information regarding corporate action details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionSD4 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getNewParValue() {
		return newParValue == null ? Optional.empty() : Optional.of(newParValue);
	}

	public CorporateActionSD4 setNewParValue(RestrictedFINActiveCurrencyAnd13DecimalAmount newParValue) {
		this.newParValue = newParValue;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getOldParValue() {
		return oldParValue == null ? Optional.empty() : Optional.of(oldParValue);
	}

	public CorporateActionSD4 setOldParValue(RestrictedFINActiveCurrencyAnd13DecimalAmount oldParValue) {
		this.oldParValue = oldParValue;
		return this;
	}

	public Optional<YesNoIndicator> getExchangeFeeRequiredFlag() {
		return exchangeFeeRequiredFlag == null ? Optional.empty() : Optional.of(exchangeFeeRequiredFlag);
	}

	public CorporateActionSD4 setExchangeFeeRequiredFlag(YesNoIndicator exchangeFeeRequiredFlag) {
		this.exchangeFeeRequiredFlag = exchangeFeeRequiredFlag;
		return this;
	}

	public Optional<YesNoIndicator> getCustodianShellFlag() {
		return custodianShellFlag == null ? Optional.empty() : Optional.of(custodianShellFlag);
	}

	public CorporateActionSD4 setCustodianShellFlag(YesNoIndicator custodianShellFlag) {
		this.custodianShellFlag = custodianShellFlag;
		return this;
	}

	public Optional<YesNoIndicator> getMustAllSharesBeSubmittedFlag() {
		return mustAllSharesBeSubmittedFlag == null ? Optional.empty() : Optional.of(mustAllSharesBeSubmittedFlag);
	}

	public CorporateActionSD4 setMustAllSharesBeSubmittedFlag(YesNoIndicator mustAllSharesBeSubmittedFlag) {
		this.mustAllSharesBeSubmittedFlag = mustAllSharesBeSubmittedFlag;
		return this;
	}

	public Optional<CorporateActionSD6> getLotteryDetails() {
		return lotteryDetails == null ? Optional.empty() : Optional.of(lotteryDetails);
	}

	public CorporateActionSD4 setLotteryDetails(CorporateActionSD6 lotteryDetails) {
		this.lotteryDetails = lotteryDetails;
		return this;
	}

	public Optional<QualifiedDividendTax1Code> getQualifiedDividendTaxIndicator() {
		return qualifiedDividendTaxIndicator == null ? Optional.empty() : Optional.of(qualifiedDividendTaxIndicator);
	}

	public CorporateActionSD4 setQualifiedDividendTaxIndicator(QualifiedDividendTax1Code qualifiedDividendTaxIndicator) {
		this.qualifiedDividendTaxIndicator = qualifiedDividendTaxIndicator;
		return this;
	}

	public Optional<Max70Text> getSurvivingCompany() {
		return survivingCompany == null ? Optional.empty() : Optional.of(survivingCompany);
	}

	public CorporateActionSD4 setSurvivingCompany(Max70Text survivingCompany) {
		this.survivingCompany = survivingCompany;
		return this;
	}

	public Optional<YesNoIndicator> getForeignIncomeSourceFlag() {
		return foreignIncomeSourceFlag == null ? Optional.empty() : Optional.of(foreignIncomeSourceFlag);
	}

	public CorporateActionSD4 setForeignIncomeSourceFlag(YesNoIndicator foreignIncomeSourceFlag) {
		this.foreignIncomeSourceFlag = foreignIncomeSourceFlag;
		return this;
	}
}
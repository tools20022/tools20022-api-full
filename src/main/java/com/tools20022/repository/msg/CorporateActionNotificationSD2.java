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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code;
import com.tools20022.repository.datatype.*;
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
 * Provides additional information regarding corporate action notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmPlaceAndName
 * CorporateActionNotificationSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmDerivativeWorkflowStatus
 * CorporateActionNotificationSD2.mmDerivativeWorkflowStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmDerivativeExchange
 * CorporateActionNotificationSD2.mmDerivativeExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmDerivativePublicationDate
 * CorporateActionNotificationSD2.mmDerivativePublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmDerivativeAdjustmentDate
 * CorporateActionNotificationSD2.mmDerivativeAdjustmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmDerivativeCalculationMethod
 * CorporateActionNotificationSD2.mmDerivativeCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmDerivativeFactor
 * CorporateActionNotificationSD2.mmDerivativeFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmLotSizeChangeFlag
 * CorporateActionNotificationSD2.mmLotSizeChangeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmLotAdjustmentMethod
 * CorporateActionNotificationSD2.mmLotAdjustmentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmStrikePriceChangeFlag
 * CorporateActionNotificationSD2.mmStrikePriceChangeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmStrikePriceRoundingMethod
 * CorporateActionNotificationSD2.mmStrikePriceRoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmResidualCashFlag
 * CorporateActionNotificationSD2.mmResidualCashFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmReferencePrice
 * CorporateActionNotificationSD2.mmReferencePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmReferencePriceCurrency
 * CorporateActionNotificationSD2.mmReferencePriceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#mmApprovedFlag
 * CorporateActionNotificationSD2.mmApprovedFlag}</li>
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
 * "CorporateActionNotificationSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action notification."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNotificationSD2", propOrder = {"placeAndName", "derivativeWorkflowStatus", "derivativeExchange", "derivativePublicationDate", "derivativeAdjustmentDate", "derivativeCalculationMethod", "derivativeFactor",
		"lotSizeChangeFlag", "lotAdjustmentMethod", "strikePriceChangeFlag", "strikePriceRoundingMethod", "residualCashFlag", "referencePrice", "referencePriceCurrency", "approvedFlag"})
public class CorporateActionNotificationSD2 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
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
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionNotificationSD2, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
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
		public Max350Text getValue(CorporateActionNotificationSD2 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "DerivWorkflwSts", required = true)
	protected DerivativeWorkflowStatus1Code derivativeWorkflowStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code
	 * DerivativeWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivWorkflwSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Derivative Workflow Status</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeWorkflowStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of a notice of change."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, DerivativeWorkflowStatus1Code> mmDerivativeWorkflowStatus = new MMMessageAttribute<CorporateActionNotificationSD2, DerivativeWorkflowStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivWorkflwSts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Derivative Workflow Status"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeWorkflowStatus";
			definition = "Status of a notice of change.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DerivativeWorkflowStatus1Code.mmObject();
		}

		@Override
		public DerivativeWorkflowStatus1Code getValue(CorporateActionNotificationSD2 obj) {
			return obj.getDerivativeWorkflowStatus();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, DerivativeWorkflowStatus1Code value) {
			obj.setDerivativeWorkflowStatus(value);
		}
	};
	@XmlElement(name = "DerivXchg", required = true)
	protected Max4AlphaNumericText derivativeExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Derivative Exchange</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange where the derivative is traded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Max4AlphaNumericText> mmDerivativeExchange = new MMMessageAttribute<CorporateActionNotificationSD2, Max4AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivXchg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Derivative Exchange"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeExchange";
			definition = "Exchange where the derivative is traded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(CorporateActionNotificationSD2 obj) {
			return obj.getDerivativeExchange();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Max4AlphaNumericText value) {
			obj.setDerivativeExchange(value);
		}
	};
	@XmlElement(name = "DerivPblctnDt")
	protected ISODate derivativePublicationDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivPblctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Derivative Publication Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativePublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the notice of change to the derivative is published by the exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<ISODate>> mmDerivativePublicationDate = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivPblctnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Derivative Publication Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativePublicationDate";
			definition = "Date when the notice of change to the derivative is published by the exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getDerivativePublicationDate();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<ISODate> value) {
			obj.setDerivativePublicationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DerivAdjstmntDt", required = true)
	protected ISODate derivativeAdjustmentDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivAdjstmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Derivative Adjustment Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeAdjustmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Effective date of the adjustment to the derivative contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, ISODate> mmDerivativeAdjustmentDate = new MMMessageAttribute<CorporateActionNotificationSD2, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivAdjstmntDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Derivative Adjustment Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeAdjustmentDate";
			definition = "Effective date of the adjustment to the derivative contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CorporateActionNotificationSD2 obj) {
			return obj.getDerivativeAdjustmentDate();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, ISODate value) {
			obj.setDerivativeAdjustmentDate(value);
		}
	};
	@XmlElement(name = "DerivClctnMtd")
	protected Max1025Text derivativeCalculationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Derivative Calculation Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeCalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method (usually a formula) that will be used to calculate the adjustment factor that will be applied to the derivative to account for the impact of a corporate action event on the underlying equity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<Max1025Text>> mmDerivativeCalculationMethod = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<Max1025Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivClctnMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Derivative Calculation Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeCalculationMethod";
			definition = "Method (usually a formula) that will be used to calculate the adjustment factor that will be applied to the derivative to account for the impact of a corporate action event on the underlying equity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}

		@Override
		public Optional<Max1025Text> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getDerivativeCalculationMethod();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<Max1025Text> value) {
			obj.setDerivativeCalculationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "DerivFctr")
	protected DecimalNumber derivativeFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Derivative Factor</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment factor to be applied to the derivative contract to account for the impact of a corporate action event on the underlying equity. Derived by using the calculation method."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<DecimalNumber>> mmDerivativeFactor = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Derivative Factor"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeFactor";
			definition = "Adjustment factor to be applied to the derivative contract to account for the impact of a corporate action event on the underlying equity. Derived by using the calculation method.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getDerivativeFactor();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<DecimalNumber> value) {
			obj.setDerivativeFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "LotSzChngFlg")
	protected YesNoIndicator lotSizeChangeFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotSzChngFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Lot Size Change Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotSizeChangeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the deliverable stock amount on the derivative contract will be changed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<YesNoIndicator>> mmLotSizeChangeFlag = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "LotSzChngFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Lot Size Change Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotSizeChangeFlag";
			definition = "Indicates whether the deliverable stock amount on the derivative contract will be changed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getLotSizeChangeFlag();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<YesNoIndicator> value) {
			obj.setLotSizeChangeFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "LotAdjstmntMtd")
	protected Max1025Text lotAdjustmentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotAdjstmntMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Lot Adjustment Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotAdjustmentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method that is used to calculate the new stock deliverable on the derivative contract. Usually multiplication or division by a stated figure but may include explanatory text and examples."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<Max1025Text>> mmLotAdjustmentMethod = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<Max1025Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "LotAdjstmntMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Lot Adjustment Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotAdjustmentMethod";
			definition = "Method that is used to calculate the new stock deliverable on the derivative contract. Usually multiplication or division by a stated figure but may include explanatory text and examples.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}

		@Override
		public Optional<Max1025Text> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getLotAdjustmentMethod();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<Max1025Text> value) {
			obj.setLotAdjustmentMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "StrkPricChngFlg")
	protected YesNoIndicator strikePriceChangeFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPricChngFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Strike Price Change Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePriceChangeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is a new strike price for the change of the derivative contract as a result of the corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<YesNoIndicator>> mmStrikePriceChangeFlag = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "StrkPricChngFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Strike Price Change Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePriceChangeFlag";
			definition = "Indicates whether there is a new strike price for the change of the derivative contract as a result of the corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getStrikePriceChangeFlag();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<YesNoIndicator> value) {
			obj.setStrikePriceChangeFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "StrkPricRndgMtd")
	protected Max500Text strikePriceRoundingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPricRndgMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Strike Price Rounding Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePriceRoundingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method that will be used to adjust the strike price. May include the number of decimal places and rounding rules, example up or down."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<Max500Text>> mmStrikePriceRoundingMethod = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "StrkPricRndgMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Strike Price Rounding Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePriceRoundingMethod";
			definition = "Method that will be used to adjust the strike price. May include the number of decimal places and rounding rules, example up or down.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getStrikePriceRoundingMethod();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<Max500Text> value) {
			obj.setStrikePriceRoundingMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "RsdlCshFlg")
	protected YesNoIndicator residualCashFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsdlCshFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Residual Cash Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidualCashFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a residual cash is paid on the derivative contract. For example, this may be a cash element that is included in the terms of a takeover that the underlying equity is subject to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<YesNoIndicator>> mmResidualCashFlag = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "RsdlCshFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Residual Cash Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCashFlag";
			definition = "Indicates whether a residual cash is paid on the derivative contract. For example, this may be a cash element that is included in the terms of a takeover that the underlying equity is subject to.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getResidualCashFlag();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<YesNoIndicator> value) {
			obj.setResidualCashFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "RefPric")
	protected DecimalNumber referencePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Reference Price</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferencePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price of the security to be used in factor calculations. Usually the closing price of the underlying equity on the effective date of the contract adjustment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<DecimalNumber>> mmReferencePrice = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "RefPric";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Reference Price"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePrice";
			definition = "Price of the security to be used in factor calculations. Usually the closing price of the underlying equity on the effective date of the contract adjustment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getReferencePrice();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<DecimalNumber> value) {
			obj.setReferencePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "RefPricCcy")
	protected ActiveCurrencyCode referencePriceCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefPricCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Reference Price Currency</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferencePriceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with the reference price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<ActiveCurrencyCode>> mmReferencePriceCurrency = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<ActiveCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "RefPricCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Reference Price Currency"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePriceCurrency";
			definition = "Currency associated with the reference price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getReferencePriceCurrency();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<ActiveCurrencyCode> value) {
			obj.setReferencePriceCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "ApprvdFlg")
	protected YesNoIndicator approvedFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2
	 * CorporateActionNotificationSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApprvdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Approved Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative data has/hasn't been approved by a validation service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotificationSD2, Optional<YesNoIndicator>> mmApprovedFlag = new MMMessageAttribute<CorporateActionNotificationSD2, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "ApprvdFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Approved Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedFlag";
			definition = "Indicates whether the derivative data has/hasn't been approved by a validation service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionNotificationSD2 obj) {
			return obj.getApprovedFlag();
		}

		@Override
		public void setValue(CorporateActionNotificationSD2 obj, Optional<YesNoIndicator> value) {
			obj.setApprovedFlag(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNotificationSD2.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionNotificationSD2.mmDerivativeWorkflowStatus,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.mmDerivativeExchange, com.tools20022.repository.msg.CorporateActionNotificationSD2.mmDerivativePublicationDate,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.mmDerivativeAdjustmentDate, com.tools20022.repository.msg.CorporateActionNotificationSD2.mmDerivativeCalculationMethod,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.mmDerivativeFactor, com.tools20022.repository.msg.CorporateActionNotificationSD2.mmLotSizeChangeFlag,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.mmLotAdjustmentMethod, com.tools20022.repository.msg.CorporateActionNotificationSD2.mmStrikePriceChangeFlag,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.mmStrikePriceRoundingMethod, com.tools20022.repository.msg.CorporateActionNotificationSD2.mmResidualCashFlag,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.mmReferencePrice, com.tools20022.repository.msg.CorporateActionNotificationSD2.mmReferencePriceCurrency,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.mmApprovedFlag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionNotificationSD2";
				definition = "Provides additional information regarding corporate action notification.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionNotificationSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public DerivativeWorkflowStatus1Code getDerivativeWorkflowStatus() {
		return derivativeWorkflowStatus;
	}

	public CorporateActionNotificationSD2 setDerivativeWorkflowStatus(DerivativeWorkflowStatus1Code derivativeWorkflowStatus) {
		this.derivativeWorkflowStatus = Objects.requireNonNull(derivativeWorkflowStatus);
		return this;
	}

	public Max4AlphaNumericText getDerivativeExchange() {
		return derivativeExchange;
	}

	public CorporateActionNotificationSD2 setDerivativeExchange(Max4AlphaNumericText derivativeExchange) {
		this.derivativeExchange = Objects.requireNonNull(derivativeExchange);
		return this;
	}

	public Optional<ISODate> getDerivativePublicationDate() {
		return derivativePublicationDate == null ? Optional.empty() : Optional.of(derivativePublicationDate);
	}

	public CorporateActionNotificationSD2 setDerivativePublicationDate(ISODate derivativePublicationDate) {
		this.derivativePublicationDate = derivativePublicationDate;
		return this;
	}

	public ISODate getDerivativeAdjustmentDate() {
		return derivativeAdjustmentDate;
	}

	public CorporateActionNotificationSD2 setDerivativeAdjustmentDate(ISODate derivativeAdjustmentDate) {
		this.derivativeAdjustmentDate = Objects.requireNonNull(derivativeAdjustmentDate);
		return this;
	}

	public Optional<Max1025Text> getDerivativeCalculationMethod() {
		return derivativeCalculationMethod == null ? Optional.empty() : Optional.of(derivativeCalculationMethod);
	}

	public CorporateActionNotificationSD2 setDerivativeCalculationMethod(Max1025Text derivativeCalculationMethod) {
		this.derivativeCalculationMethod = derivativeCalculationMethod;
		return this;
	}

	public Optional<DecimalNumber> getDerivativeFactor() {
		return derivativeFactor == null ? Optional.empty() : Optional.of(derivativeFactor);
	}

	public CorporateActionNotificationSD2 setDerivativeFactor(DecimalNumber derivativeFactor) {
		this.derivativeFactor = derivativeFactor;
		return this;
	}

	public Optional<YesNoIndicator> getLotSizeChangeFlag() {
		return lotSizeChangeFlag == null ? Optional.empty() : Optional.of(lotSizeChangeFlag);
	}

	public CorporateActionNotificationSD2 setLotSizeChangeFlag(YesNoIndicator lotSizeChangeFlag) {
		this.lotSizeChangeFlag = lotSizeChangeFlag;
		return this;
	}

	public Optional<Max1025Text> getLotAdjustmentMethod() {
		return lotAdjustmentMethod == null ? Optional.empty() : Optional.of(lotAdjustmentMethod);
	}

	public CorporateActionNotificationSD2 setLotAdjustmentMethod(Max1025Text lotAdjustmentMethod) {
		this.lotAdjustmentMethod = lotAdjustmentMethod;
		return this;
	}

	public Optional<YesNoIndicator> getStrikePriceChangeFlag() {
		return strikePriceChangeFlag == null ? Optional.empty() : Optional.of(strikePriceChangeFlag);
	}

	public CorporateActionNotificationSD2 setStrikePriceChangeFlag(YesNoIndicator strikePriceChangeFlag) {
		this.strikePriceChangeFlag = strikePriceChangeFlag;
		return this;
	}

	public Optional<Max500Text> getStrikePriceRoundingMethod() {
		return strikePriceRoundingMethod == null ? Optional.empty() : Optional.of(strikePriceRoundingMethod);
	}

	public CorporateActionNotificationSD2 setStrikePriceRoundingMethod(Max500Text strikePriceRoundingMethod) {
		this.strikePriceRoundingMethod = strikePriceRoundingMethod;
		return this;
	}

	public Optional<YesNoIndicator> getResidualCashFlag() {
		return residualCashFlag == null ? Optional.empty() : Optional.of(residualCashFlag);
	}

	public CorporateActionNotificationSD2 setResidualCashFlag(YesNoIndicator residualCashFlag) {
		this.residualCashFlag = residualCashFlag;
		return this;
	}

	public Optional<DecimalNumber> getReferencePrice() {
		return referencePrice == null ? Optional.empty() : Optional.of(referencePrice);
	}

	public CorporateActionNotificationSD2 setReferencePrice(DecimalNumber referencePrice) {
		this.referencePrice = referencePrice;
		return this;
	}

	public Optional<ActiveCurrencyCode> getReferencePriceCurrency() {
		return referencePriceCurrency == null ? Optional.empty() : Optional.of(referencePriceCurrency);
	}

	public CorporateActionNotificationSD2 setReferencePriceCurrency(ActiveCurrencyCode referencePriceCurrency) {
		this.referencePriceCurrency = referencePriceCurrency;
		return this;
	}

	public Optional<YesNoIndicator> getApprovedFlag() {
		return approvedFlag == null ? Optional.empty() : Optional.of(approvedFlag);
	}

	public CorporateActionNotificationSD2 setApprovedFlag(YesNoIndicator approvedFlag) {
		this.approvedFlag = approvedFlag;
		return this;
	}
}
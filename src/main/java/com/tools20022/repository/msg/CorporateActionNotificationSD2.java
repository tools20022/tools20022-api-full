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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CorporateActionNotificationSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
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
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected DerivativeWorkflowStatus1Code derivativeWorkflowStatus;
	/**
	 * Status of a notice of change.
	 * <p>
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
	public static final MMMessageAttribute mmDerivativeWorkflowStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivWorkflwSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeWorkflowStatus";
			definition = "Status of a notice of change.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DerivativeWorkflowStatus1Code.mmObject();
		}
	};
	protected Max4AlphaNumericText derivativeExchange;
	/**
	 * Exchange where the derivative is traded.
	 * <p>
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
	public static final MMMessageAttribute mmDerivativeExchange = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeExchange";
			definition = "Exchange where the derivative is traded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected ISODate derivativePublicationDate;
	/**
	 * Date when the notice of change to the derivative is published by the
	 * exchange.
	 * <p>
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
	public static final MMMessageAttribute mmDerivativePublicationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivPblctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativePublicationDate";
			definition = "Date when the notice of change to the derivative is published by the exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate derivativeAdjustmentDate;
	/**
	 * Effective date of the adjustment to the derivative contract.
	 * <p>
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
	public static final MMMessageAttribute mmDerivativeAdjustmentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivAdjstmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeAdjustmentDate";
			definition = "Effective date of the adjustment to the derivative contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max1025Text derivativeCalculationMethod;
	/**
	 * Method (usually a formula) that will be used to calculate the adjustment
	 * factor that will be applied to the derivative to account for the impact
	 * of a corporate action event on the underlying equity.
	 * <p>
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
	public static final MMMessageAttribute mmDerivativeCalculationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeCalculationMethod";
			definition = "Method (usually a formula) that will be used to calculate the adjustment factor that will be applied to the derivative to account for the impact of a corporate action event on the underlying equity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
	protected DecimalNumber derivativeFactor;
	/**
	 * Adjustment factor to be applied to the derivative contract to account for
	 * the impact of a corporate action event on the underlying equity. Derived
	 * by using the calculation method.
	 * <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment factor to be applied to the derivative contract to account for the impact of a corporate action event on the underlying equity. Derived by using the calculation method. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDerivativeFactor = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeFactor";
			definition = "Adjustment factor to be applied to the derivative contract to account for the impact of a corporate action event on the underlying equity. Derived by using the calculation method. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected YesNoIndicator lotSizeChangeFlag;
	/**
	 * Indicates whether the deliverable stock amount on the derivative contract
	 * will be changed.
	 * <p>
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
	public static final MMMessageAttribute mmLotSizeChangeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "LotSzChngFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotSizeChangeFlag";
			definition = "Indicates whether the deliverable stock amount on the derivative contract will be changed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max1025Text lotAdjustmentMethod;
	/**
	 * Method that is used to calculate the new stock deliverable on the
	 * derivative contract. Usually multiplication or division by a stated
	 * figure but may include explanatory text and examples.
	 * <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotAdjustmentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method that is used to calculate the new stock deliverable on the derivative contract. Usually multiplication or division by a stated figure but may include explanatory text and examples. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLotAdjustmentMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "LotAdjstmntMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotAdjustmentMethod";
			definition = "Method that is used to calculate the new stock deliverable on the derivative contract. Usually multiplication or division by a stated figure but may include explanatory text and examples. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
	protected YesNoIndicator strikePriceChangeFlag;
	/**
	 * Indicates whether there is a new strike price for the change of the
	 * derivative contract as a result of the corporate action.
	 * <p>
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
	public static final MMMessageAttribute mmStrikePriceChangeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "StrkPricChngFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePriceChangeFlag";
			definition = "Indicates whether there is a new strike price for the change of the derivative contract as a result of the corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max500Text strikePriceRoundingMethod;
	/**
	 * Method that will be used to adjust the strike price. May include the
	 * number of decimal places and rounding rules, example up or down.
	 * <p>
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
	public static final MMMessageAttribute mmStrikePriceRoundingMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "StrkPricRndgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePriceRoundingMethod";
			definition = "Method that will be used to adjust the strike price. May include the number of decimal places and rounding rules, example up or down.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	protected YesNoIndicator residualCashFlag;
	/**
	 * Indicates whether a residual cash is paid on the derivative contract. For
	 * example, this may be a cash element that is included in the terms of a
	 * takeover that the underlying equity is subject to.
	 * <p>
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
	public static final MMMessageAttribute mmResidualCashFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "RsdlCshFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCashFlag";
			definition = "Indicates whether a residual cash is paid on the derivative contract. For example, this may be a cash element that is included in the terms of a takeover that the underlying equity is subject to.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected DecimalNumber referencePrice;
	/**
	 * Price of the security to be used in factor calculations. Usually the
	 * closing price of the underlying equity on the effective date of the
	 * contract adjustment.
	 * <p>
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
	public static final MMMessageAttribute mmReferencePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "RefPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePrice";
			definition = "Price of the security to be used in factor calculations. Usually the closing price of the underlying equity on the effective date of the contract adjustment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected ActiveCurrencyCode referencePriceCurrency;
	/**
	 * Currency associated with the reference price.
	 * <p>
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
	public static final MMMessageAttribute mmReferencePriceCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "RefPricCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePriceCurrency";
			definition = "Currency associated with the reference price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected YesNoIndicator approvedFlag;
	/**
	 * Indicates whether the derivative data has/hasn't been approved by a
	 * validation service.
	 * <p>
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
	public static final MMMessageAttribute mmApprovedFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "ApprvdFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedFlag";
			definition = "Indicates whether the derivative data has/hasn't been approved by a validation service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionNotificationSD2.mmPlaceAndName, CorporateActionNotificationSD2.mmDerivativeWorkflowStatus, CorporateActionNotificationSD2.mmDerivativeExchange,
						CorporateActionNotificationSD2.mmDerivativePublicationDate, CorporateActionNotificationSD2.mmDerivativeAdjustmentDate, CorporateActionNotificationSD2.mmDerivativeCalculationMethod,
						CorporateActionNotificationSD2.mmDerivativeFactor, CorporateActionNotificationSD2.mmLotSizeChangeFlag, CorporateActionNotificationSD2.mmLotAdjustmentMethod, CorporateActionNotificationSD2.mmStrikePriceChangeFlag,
						CorporateActionNotificationSD2.mmStrikePriceRoundingMethod, CorporateActionNotificationSD2.mmResidualCashFlag, CorporateActionNotificationSD2.mmReferencePrice,
						CorporateActionNotificationSD2.mmReferencePriceCurrency, CorporateActionNotificationSD2.mmApprovedFlag);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public DerivativeWorkflowStatus1Code getDerivativeWorkflowStatus() {
		return derivativeWorkflowStatus;
	}

	public void setDerivativeWorkflowStatus(DerivativeWorkflowStatus1Code derivativeWorkflowStatus) {
		this.derivativeWorkflowStatus = derivativeWorkflowStatus;
	}

	public Max4AlphaNumericText getDerivativeExchange() {
		return derivativeExchange;
	}

	public void setDerivativeExchange(Max4AlphaNumericText derivativeExchange) {
		this.derivativeExchange = derivativeExchange;
	}

	public ISODate getDerivativePublicationDate() {
		return derivativePublicationDate;
	}

	public void setDerivativePublicationDate(ISODate derivativePublicationDate) {
		this.derivativePublicationDate = derivativePublicationDate;
	}

	public ISODate getDerivativeAdjustmentDate() {
		return derivativeAdjustmentDate;
	}

	public void setDerivativeAdjustmentDate(ISODate derivativeAdjustmentDate) {
		this.derivativeAdjustmentDate = derivativeAdjustmentDate;
	}

	public Max1025Text getDerivativeCalculationMethod() {
		return derivativeCalculationMethod;
	}

	public void setDerivativeCalculationMethod(Max1025Text derivativeCalculationMethod) {
		this.derivativeCalculationMethod = derivativeCalculationMethod;
	}

	public DecimalNumber getDerivativeFactor() {
		return derivativeFactor;
	}

	public void setDerivativeFactor(DecimalNumber derivativeFactor) {
		this.derivativeFactor = derivativeFactor;
	}

	public YesNoIndicator getLotSizeChangeFlag() {
		return lotSizeChangeFlag;
	}

	public void setLotSizeChangeFlag(YesNoIndicator lotSizeChangeFlag) {
		this.lotSizeChangeFlag = lotSizeChangeFlag;
	}

	public Max1025Text getLotAdjustmentMethod() {
		return lotAdjustmentMethod;
	}

	public void setLotAdjustmentMethod(Max1025Text lotAdjustmentMethod) {
		this.lotAdjustmentMethod = lotAdjustmentMethod;
	}

	public YesNoIndicator getStrikePriceChangeFlag() {
		return strikePriceChangeFlag;
	}

	public void setStrikePriceChangeFlag(YesNoIndicator strikePriceChangeFlag) {
		this.strikePriceChangeFlag = strikePriceChangeFlag;
	}

	public Max500Text getStrikePriceRoundingMethod() {
		return strikePriceRoundingMethod;
	}

	public void setStrikePriceRoundingMethod(Max500Text strikePriceRoundingMethod) {
		this.strikePriceRoundingMethod = strikePriceRoundingMethod;
	}

	public YesNoIndicator getResidualCashFlag() {
		return residualCashFlag;
	}

	public void setResidualCashFlag(YesNoIndicator residualCashFlag) {
		this.residualCashFlag = residualCashFlag;
	}

	public DecimalNumber getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(DecimalNumber referencePrice) {
		this.referencePrice = referencePrice;
	}

	public ActiveCurrencyCode getReferencePriceCurrency() {
		return referencePriceCurrency;
	}

	public void setReferencePriceCurrency(ActiveCurrencyCode referencePriceCurrency) {
		this.referencePriceCurrency = referencePriceCurrency;
	}

	public YesNoIndicator getApprovedFlag() {
		return approvedFlag;
	}

	public void setApprovedFlag(YesNoIndicator approvedFlag) {
		this.approvedFlag = approvedFlag;
	}
}
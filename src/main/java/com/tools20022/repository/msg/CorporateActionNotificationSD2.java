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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code;
import com.tools20022.repository.datatype.*;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#PlaceAndName
 * CorporateActionNotificationSD2.PlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#DerivativeWorkflowStatus
 * CorporateActionNotificationSD2.DerivativeWorkflowStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#DerivativeExchange
 * CorporateActionNotificationSD2.DerivativeExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#DerivativePublicationDate
 * CorporateActionNotificationSD2.DerivativePublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#DerivativeAdjustmentDate
 * CorporateActionNotificationSD2.DerivativeAdjustmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#DerivativeCalculationMethod
 * CorporateActionNotificationSD2.DerivativeCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#DerivativeFactor
 * CorporateActionNotificationSD2.DerivativeFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#LotSizeChangeFlag
 * CorporateActionNotificationSD2.LotSizeChangeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#LotAdjustmentMethod
 * CorporateActionNotificationSD2.LotAdjustmentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#StrikePriceChangeFlag
 * CorporateActionNotificationSD2.StrikePriceChangeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#StrikePriceRoundingMethod
 * CorporateActionNotificationSD2.StrikePriceRoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#ResidualCashFlag
 * CorporateActionNotificationSD2.ResidualCashFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#ReferencePrice
 * CorporateActionNotificationSD2.ReferencePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#ReferencePriceCurrency
 * CorporateActionNotificationSD2.ReferencePriceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD2#ApprovedFlag
 * CorporateActionNotificationSD2.ApprovedFlag}</li>
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
public class CorporateActionNotificationSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMMessageAttribute PlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	public static final MMMessageAttribute DerivativeWorkflowStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivWorkflwSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeWorkflowStatus";
			definition = "Status of a notice of change.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DerivativeWorkflowStatus1Code.mmObject();
		}
	};
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
	public static final MMMessageAttribute DerivativeExchange = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivXchg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeExchange";
			definition = "Exchange where the derivative is traded.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
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
	public static final MMMessageAttribute DerivativePublicationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivPblctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativePublicationDate";
			definition = "Date when the notice of change to the derivative is published by the exchange.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	public static final MMMessageAttribute DerivativeAdjustmentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivAdjstmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeAdjustmentDate";
			definition = "Effective date of the adjustment to the derivative contract.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	public static final MMMessageAttribute DerivativeCalculationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivClctnMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeCalculationMethod";
			definition = "Method (usually a formula) that will be used to calculate the adjustment factor that will be applied to the derivative to account for the impact of a corporate action event on the underlying equity.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
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
	public static final MMMessageAttribute DerivativeFactor = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "DerivFctr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeFactor";
			definition = "Adjustment factor to be applied to the derivative contract to account for the impact of a corporate action event on the underlying equity. Derived by using the calculation method. ";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
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
	public static final MMMessageAttribute LotSizeChangeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "LotSzChngFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotSizeChangeFlag";
			definition = "Indicates whether the deliverable stock amount on the derivative contract will be changed.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMMessageAttribute LotAdjustmentMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "LotAdjstmntMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotAdjustmentMethod";
			definition = "Method that is used to calculate the new stock deliverable on the derivative contract. Usually multiplication or division by a stated figure but may include explanatory text and examples. ";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
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
	public static final MMMessageAttribute StrikePriceChangeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "StrkPricChngFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePriceChangeFlag";
			definition = "Indicates whether there is a new strike price for the change of the derivative contract as a result of the corporate action.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMMessageAttribute StrikePriceRoundingMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "StrkPricRndgMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePriceRoundingMethod";
			definition = "Method that will be used to adjust the strike price. May include the number of decimal places and rounding rules, example up or down.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
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
	public static final MMMessageAttribute ResidualCashFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "RsdlCshFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCashFlag";
			definition = "Indicates whether a residual cash is paid on the derivative contract. For example, this may be a cash element that is included in the terms of a takeover that the underlying equity is subject to.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	public static final MMMessageAttribute ReferencePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "RefPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePrice";
			definition = "Price of the security to be used in factor calculations. Usually the closing price of the underlying equity on the effective date of the contract adjustment.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
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
	public static final MMMessageAttribute ReferencePriceCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "RefPricCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferencePriceCurrency";
			definition = "Currency associated with the reference price.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
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
	public static final MMMessageAttribute ApprovedFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionNotificationSD2.mmObject();
			isDerived = false;
			xmlTag = "ApprvdFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedFlag";
			definition = "Indicates whether the derivative data has/hasn't been approved by a validation service.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNotificationSD2.PlaceAndName, com.tools20022.repository.msg.CorporateActionNotificationSD2.DerivativeWorkflowStatus,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.DerivativeExchange, com.tools20022.repository.msg.CorporateActionNotificationSD2.DerivativePublicationDate,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.DerivativeAdjustmentDate, com.tools20022.repository.msg.CorporateActionNotificationSD2.DerivativeCalculationMethod,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.DerivativeFactor, com.tools20022.repository.msg.CorporateActionNotificationSD2.LotSizeChangeFlag,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.LotAdjustmentMethod, com.tools20022.repository.msg.CorporateActionNotificationSD2.StrikePriceChangeFlag,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.StrikePriceRoundingMethod, com.tools20022.repository.msg.CorporateActionNotificationSD2.ResidualCashFlag,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.ReferencePrice, com.tools20022.repository.msg.CorporateActionNotificationSD2.ReferencePriceCurrency,
						com.tools20022.repository.msg.CorporateActionNotificationSD2.ApprovedFlag);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionNotificationSD2";
				definition = "Provides additional information regarding corporate action notification.";
			}
		});
		return mmObject_lazy.get();
	}
}
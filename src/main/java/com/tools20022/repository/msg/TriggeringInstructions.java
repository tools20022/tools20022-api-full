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
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.DirectionIndicator;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.entity.TradingSession;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the conditions under which an order will be triggered/activated by
 * market events as well as it specifies the order's behavior in the market once
 * it has been triggered.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TriggeringInstructions#Type
 * TriggeringInstructions.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TriggeringInstructions#Action
 * TriggeringInstructions.Action}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TriggeringInstructions#Price
 * TriggeringInstructions.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#PriceProtectionScope
 * TriggeringInstructions.PriceProtectionScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#PriceDirection
 * TriggeringInstructions.PriceDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#NewPrice
 * TriggeringInstructions.NewPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#OrderType
 * TriggeringInstructions.OrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#NewQuantity
 * TriggeringInstructions.NewQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#PriceType
 * TriggeringInstructions.PriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#TriggerSecurityDetails
 * TriggeringInstructions.TriggerSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#TradingSessionDetails
 * TriggeringInstructions.TradingSessionDetails}</li>
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
 * "TriggeringInstructions"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which an order will be triggered/activated by market events as well as it specifies the order's behavior in the market once it has been triggered."
 * </li>
 * </ul>
 */
public class TriggeringInstructions {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Defines when the trigger will hit, i.e. the action specified by the
	 * trigger instructions will come into effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerType1Code
	 * TriggerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines when the trigger will hit, i.e. the action specified by the trigger instructions will come into effect."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Defines when the trigger will hit, i.e. the action specified by the trigger instructions will come into effect.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TriggerType1Code.mmObject();
		}
	};
	/**
	 * Defines the type of action to take when the trigger hits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerAction1Code
	 * TriggerAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Actn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Action"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of action to take when the trigger hits."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Action = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Defines the type of action to take when the trigger hits.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TriggerAction1Code.mmObject();
		}
	};
	/**
	 * The price at which the trigger should hit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The price at which the trigger should hit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Price = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "The price at which the trigger should hit.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price1.mmObject();
		}
	};
	/**
	 * Defines the type of price protection the customer requires on their
	 * order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code
	 * PriceProtectionScope2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricPrtcnScp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceProtectionScope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the type of price protection the customer requires on their order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PriceProtectionScope = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "PricPrtcnScp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceProtectionScope";
			definition = "Defines the type of price protection the customer requires on their order.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceProtectionScope2Code.mmObject();
		}
	};
	/**
	 * Indicates the side from which the trigger price is reached.
	 * 
	 * Up -Trigger if the price of the specified type goes up to or through the
	 * specified trigger price.
	 * 
	 * Down - Trigger if the price of the specified type goes down to or through
	 * the specified trigger price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DirectionIndicator
	 * DirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the side from which the trigger price is reached.\n\nUp -Trigger if the price of the specified type goes up to or through the specified trigger price.\n\nDown - Trigger if the price of the specified type goes down to or through the specified trigger price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PriceDirection = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "PricDrctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDirection";
			definition = "Indicates the side from which the trigger price is reached.\n\nUp -Trigger if the price of the specified type goes up to or through the specified trigger price.\n\nDown - Trigger if the price of the specified type goes down to or through the specified trigger price.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DirectionIndicator.mmObject();
		}
	};
	/**
	 * The price that the order should have after the trigger has hit. Could be
	 * applicable for any trigger type, but must be specified for Trigger Type =
	 * PAEX
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The price that the order should have after the trigger has hit. Could be applicable for any trigger type, but must be specified for Trigger Type = PAEX"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute NewPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "NewPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPrice";
			definition = "The price that the order should have after the trigger has hit. Could be applicable for any trigger type, but must be specified for Trigger Type = PAEX";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> Price1.mmObject();
		}
	};
	/**
	 * The order type that the order should have after the trigger has hit.
	 * Required to express orders that change from limit to market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#Type
	 * SecuritiesOrder.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The order type that the order should have after the trigger has hit. Required to express orders that change from limit to market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute OrderType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.Type;
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "The order type that the order should have after the trigger has hit. Required to express orders that change from limit to market.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> OrderType2Code.mmObject();
		}
	};
	/**
	 * The quantity the order should have after the trigger has hit.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderedQuantity
	 * SecuritiesOrder.OrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The quantity the order should have after the trigger has hit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NewQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderedQuantity;
			isDerived = false;
			xmlTag = "NewQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewQuantity";
			definition = "The quantity the order should have after the trigger has hit.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	/**
	 * Type of price that the trigger is compared to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerPriceType1Code
	 * TriggerPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of price that the trigger is compared to."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PriceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "PricTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceType";
			definition = "Type of price that the trigger is compared to.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> TriggerPriceType1Code.mmObject();
		}
	};
	/**
	 * Defines the identification of the security whose prices will be tracked
	 * by the trigger logic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrggrSctyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TriggerSecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the identification of the security whose prices will be tracked by the trigger logic."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TriggerSecurityDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			xmlTag = "TrggrSctyDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TriggerSecurityDetails";
			definition = "Defines the identification of the security whose prices will be tracked by the trigger logic.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecurityIdentification7.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides details about the trading session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradingSession1
	 * TradingSession1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions
	 * TriggeringInstructions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSsnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the trading session."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TradingSessionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			businessComponentTrace_lazy = () -> TradingSession.mmObject();
			isDerived = false;
			xmlTag = "TradgSsnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSessionDetails";
			definition = "Provides details about the trading session.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TradingSession1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TriggeringInstructions.Type, com.tools20022.repository.msg.TriggeringInstructions.Action, com.tools20022.repository.msg.TriggeringInstructions.Price,
						com.tools20022.repository.msg.TriggeringInstructions.PriceProtectionScope, com.tools20022.repository.msg.TriggeringInstructions.PriceDirection, com.tools20022.repository.msg.TriggeringInstructions.NewPrice,
						com.tools20022.repository.msg.TriggeringInstructions.OrderType, com.tools20022.repository.msg.TriggeringInstructions.NewQuantity, com.tools20022.repository.msg.TriggeringInstructions.PriceType,
						com.tools20022.repository.msg.TriggeringInstructions.TriggerSecurityDetails, com.tools20022.repository.msg.TriggeringInstructions.TradingSessionDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TriggeringInstructions";
				definition = "Specifies the conditions under which an order will be triggered/activated by market events as well as it specifies the order's behavior in the market once it has been triggered.";
			}
		});
		return mmObject_lazy.get();
	}
}
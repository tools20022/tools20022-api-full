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
 * <li>{@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmType
 * TriggeringInstructions.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmAction
 * TriggeringInstructions.mmAction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmPrice
 * TriggeringInstructions.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmPriceProtectionScope
 * TriggeringInstructions.mmPriceProtectionScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmPriceDirection
 * TriggeringInstructions.mmPriceDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmNewPrice
 * TriggeringInstructions.mmNewPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmOrderType
 * TriggeringInstructions.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmNewQuantity
 * TriggeringInstructions.mmNewQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmPriceType
 * TriggeringInstructions.mmPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmTriggerSecurityDetails
 * TriggeringInstructions.mmTriggerSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmTradingSessionDetails
 * TriggeringInstructions.mmTradingSessionDetails}</li>
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
 * "TriggeringInstructions"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which an order will be triggered/activated by market events as well as it specifies the order's behavior in the market once it has been triggered."
 * </li>
 * </ul>
 */
public class TriggeringInstructions {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TriggerType1Code type;
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
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Defines when the trigger will hit, i.e. the action specified by the trigger instructions will come into effect.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TriggerType1Code.mmObject();
		}
	};
	protected TriggerAction1Code action;
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
	public static final MMMessageAttribute mmAction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Defines the type of action to take when the trigger hits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TriggerAction1Code.mmObject();
		}
	};
	protected Price1 price;
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
	public static final MMMessageAttribute mmPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "The price at which the trigger should hit.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected PriceProtectionScope2Code priceProtectionScope;
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
	public static final MMMessageAttribute mmPriceProtectionScope = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "PricPrtcnScp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceProtectionScope";
			definition = "Defines the type of price protection the customer requires on their order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PriceProtectionScope2Code.mmObject();
		}
	};
	protected DirectionIndicator priceDirection;
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
	public static final MMMessageAttribute mmPriceDirection = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "PricDrctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDirection";
			definition = "Indicates the side from which the trigger price is reached.\n\nUp -Trigger if the price of the specified type goes up to or through the specified trigger price.\n\nDown - Trigger if the price of the specified type goes down to or through the specified trigger price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DirectionIndicator.mmObject();
		}
	};
	protected Price1 newPrice;
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
	public static final MMMessageAttribute mmNewPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "NewPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPrice";
			definition = "The price that the order should have after the trigger has hit. Could be applicable for any trigger type, but must be specified for Trigger Type = PAEX";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected OrderType2Code orderType;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmType
	 * SecuritiesOrder.mmType}</li>
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
	public static final MMMessageAttribute mmOrderType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmType;
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "The order type that the order should have after the trigger has hit. Required to express orders that change from limit to market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OrderType2Code.mmObject();
		}
	};
	protected FinancialInstrumentQuantityChoice newQuantity;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
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
	public static final MMMessageAttribute mmNewQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "NewQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewQuantity";
			definition = "The quantity the order should have after the trigger has hit.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	protected TriggerPriceType1Code priceType;
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
	public static final MMMessageAttribute mmPriceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "PricTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceType";
			definition = "Type of price that the trigger is compared to.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TriggerPriceType1Code.mmObject();
		}
	};
	protected SecurityIdentification7 triggerSecurityDetails;
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
	public static final MMMessageAssociationEnd mmTriggerSecurityDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "TrggrSctyDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TriggerSecurityDetails";
			definition = "Defines the identification of the security whose prices will be tracked by the trigger logic.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	protected TradingSession1 tradingSessionDetails;
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
	public static final MMMessageAssociationEnd mmTradingSessionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TradingSession.mmObject();
			componentContext_lazy = () -> TriggeringInstructions.mmObject();
			isDerived = false;
			xmlTag = "TradgSsnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSessionDetails";
			definition = "Provides details about the trading session.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradingSession1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TriggeringInstructions.mmType, com.tools20022.repository.msg.TriggeringInstructions.mmAction,
						com.tools20022.repository.msg.TriggeringInstructions.mmPrice, com.tools20022.repository.msg.TriggeringInstructions.mmPriceProtectionScope, com.tools20022.repository.msg.TriggeringInstructions.mmPriceDirection,
						com.tools20022.repository.msg.TriggeringInstructions.mmNewPrice, com.tools20022.repository.msg.TriggeringInstructions.mmOrderType, com.tools20022.repository.msg.TriggeringInstructions.mmNewQuantity,
						com.tools20022.repository.msg.TriggeringInstructions.mmPriceType, com.tools20022.repository.msg.TriggeringInstructions.mmTriggerSecurityDetails,
						com.tools20022.repository.msg.TriggeringInstructions.mmTradingSessionDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TriggeringInstructions";
				definition = "Specifies the conditions under which an order will be triggered/activated by market events as well as it specifies the order's behavior in the market once it has been triggered.";
			}
		});
		return mmObject_lazy.get();
	}

	public TriggerType1Code getType() {
		return type;
	}

	public void setType(TriggerType1Code type) {
		this.type = type;
	}

	public TriggerAction1Code getAction() {
		return action;
	}

	public void setAction(TriggerAction1Code action) {
		this.action = action;
	}

	public Price1 getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.msg.Price1 price) {
		this.price = price;
	}

	public PriceProtectionScope2Code getPriceProtectionScope() {
		return priceProtectionScope;
	}

	public void setPriceProtectionScope(PriceProtectionScope2Code priceProtectionScope) {
		this.priceProtectionScope = priceProtectionScope;
	}

	public DirectionIndicator getPriceDirection() {
		return priceDirection;
	}

	public void setPriceDirection(DirectionIndicator priceDirection) {
		this.priceDirection = priceDirection;
	}

	public Price1 getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(com.tools20022.repository.msg.Price1 newPrice) {
		this.newPrice = newPrice;
	}

	public OrderType2Code getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType2Code orderType) {
		this.orderType = orderType;
	}

	public FinancialInstrumentQuantityChoice getNewQuantity() {
		return newQuantity;
	}

	public void setNewQuantity(FinancialInstrumentQuantityChoice newQuantity) {
		this.newQuantity = newQuantity;
	}

	public TriggerPriceType1Code getPriceType() {
		return priceType;
	}

	public void setPriceType(TriggerPriceType1Code priceType) {
		this.priceType = priceType;
	}

	public SecurityIdentification7 getTriggerSecurityDetails() {
		return triggerSecurityDetails;
	}

	public void setTriggerSecurityDetails(com.tools20022.repository.msg.SecurityIdentification7 triggerSecurityDetails) {
		this.triggerSecurityDetails = triggerSecurityDetails;
	}

	public TradingSession1 getTradingSessionDetails() {
		return tradingSessionDetails;
	}

	public void setTradingSessionDetails(com.tools20022.repository.msg.TradingSession1 tradingSessionDetails) {
		this.tradingSessionDetails = tradingSessionDetails;
	}
}
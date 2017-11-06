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
import com.tools20022.repository.codeset.StayOnSideType1Code;
import com.tools20022.repository.datatype.AllOrNoneIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the instructions for order handling.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmAllOrNone
 * SecuritiesExecutionInstructions1.mmAllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCallFirst
 * SecuritiesExecutionInstructions1.mmCallFirst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCross
 * SecuritiesExecutionInstructions1.mmCross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCustomerDisplay
 * SecuritiesExecutionInstructions1.mmCustomerDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmHold
 * SecuritiesExecutionInstructions1.mmHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmIncrease
 * SecuritiesExecutionInstructions1.mmIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmInstitutionsOnly
 * SecuritiesExecutionInstructions1.mmInstitutionsOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmNonNegotiable
 * SecuritiesExecutionInstructions1.mmNonNegotiable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmOverTheDay
 * SecuritiesExecutionInstructions1.mmOverTheDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmParticipateDontInitiate
 * SecuritiesExecutionInstructions1.mmParticipateDontInitiate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmPercentOfVolume
 * SecuritiesExecutionInstructions1.mmPercentOfVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmScale
 * SecuritiesExecutionInstructions1.mmScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmStayOnSide
 * SecuritiesExecutionInstructions1.mmStayOnSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmWork
 * SecuritiesExecutionInstructions1.mmWork}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmGoAlong
 * SecuritiesExecutionInstructions1.mmGoAlong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmTryScale
 * SecuritiesExecutionInstructions1.mmTryScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmDoNotReduce
 * SecuritiesExecutionInstructions1.mmDoNotReduce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCancelOnSystemFailure
 * SecuritiesExecutionInstructions1.mmCancelOnSystemFailure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCancelOnTradingHalt
 * SecuritiesExecutionInstructions1.mmCancelOnTradingHalt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmTradeAlong
 * SecuritiesExecutionInstructions1.mmTradeAlong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmStrictLimit
 * SecuritiesExecutionInstructions1.mmStrictLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmIgnorePriceValidityChecks
 * SecuritiesExecutionInstructions1.mmIgnorePriceValidityChecks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmReinstateOnSystemFailure
 * SecuritiesExecutionInstructions1.mmReinstateOnSystemFailure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmReinstateOnTradingHalt
 * SecuritiesExecutionInstructions1.mmReinstateOnTradingHalt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCancelIfNotBest
 * SecuritiesExecutionInstructions1.mmCancelIfNotBest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmExternalRoutingAllowed
 * SecuritiesExecutionInstructions1.mmExternalRoutingAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmExternalRoutingNotAllowed
 * SecuritiesExecutionInstructions1.mmExternalRoutingNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmImbalanceOnly
 * SecuritiesExecutionInstructions1.mmImbalanceOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmIntermarketSweep
 * SecuritiesExecutionInstructions1.mmIntermarketSweep}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmNetting
 * SecuritiesExecutionInstructions1.mmNetting}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
 * SecuritiesOrderExecutionInstruction}</li>
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
 * "SecuritiesExecutionInstructions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the instructions for order handling."</li>
 * </ul>
 */
public class SecuritiesExecutionInstructions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AllOrNoneIndicator allOrNone;
	/**
	 * Round-lot market or limit-price order that must be executed in its
	 * entirety or not at all; unlike Fill or Kill orders, AON orders are not
	 * treated as canceled if they are not executed as soon as represented in
	 * the Trading Crowd.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AllOrNoneIndicator
	 * AllOrNoneIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmAllOrNone
	 * SecuritiesOrderExecutionInstruction.mmAllOrNone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllOrNn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, AON orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllOrNone = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmAllOrNone;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "AllOrNn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			definition = "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, AON orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AllOrNoneIndicator.mmObject();
		}
	};
	protected YesNoIndicator callFirst;
	/**
	 * Refers to the client before trading in order to catch all verbal
	 * instructions on trading strategy usually because the strategy is too
	 * complex or cannot be represented in the trading application.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCallFirst
	 * SecuritiesOrderExecutionInstruction.mmCallFirst}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CallFrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallFirst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refers to the client before trading in order to catch all verbal instructions on trading strategy usually because the strategy is too complex or cannot be represented in the trading application."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCallFirst = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCallFirst;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "CallFrst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallFirst";
			definition = "Refers to the client before trading in order to catch all verbal instructions on trading strategy usually because the strategy is too complex or cannot be represented in the trading application.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator cross;
	/**
	 * Allow crossing of an order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCross
	 * SecuritiesOrderExecutionInstruction.mmCross}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allow crossing of an order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCross = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCross;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Cross";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cross";
			definition = "Allow crossing of an order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator customerDisplay;
	/**
	 * Exchange or ECN required by the SEC to display limit orders in the public
	 * order book. A customer can choose not to have his limit order displayed
	 * to the public.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCustomerDisplay
	 * SecuritiesOrderExecutionInstruction.mmCustomerDisplay}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrDisp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDisplay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange or ECN required by the SEC to display limit orders in the public order book. A customer can choose not to have his limit order displayed to the public."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerDisplay = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCustomerDisplay;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "CstmrDisp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDisplay";
			definition = "Exchange or ECN required by the SEC to display limit orders in the public order book. A customer can choose not to have his limit order displayed to the public.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator hold;
	/**
	 * Indicates whether the firm executing the order is held to best execution
	 * requirements and may be able to make some discretionary decisions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmHold
	 * SecuritiesOrderExecutionInstruction.mmHold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the firm executing the order is held to best execution requirements and may be able to make some discretionary decisions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHold = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmHold;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Hld";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hold";
			definition = "Indicates whether the firm executing the order is held to best execution requirements and may be able to make some discretionary decisions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator increase;
	/**
	 * Indicates whether the order is to be increased in shares on the
	 * ex-dividend date as a result of a stock dividend or distribution.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmIncrease
	 * SecuritiesOrderExecutionInstruction.mmIncrease}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Increase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order is to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncrease = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmIncrease;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Incr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Increase";
			definition = "Indicates whether the order is to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator institutionsOnly;
	/**
	 * Identifies that the broker is restricted to dealing with other buy side
	 * firms.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmInstitutionsOnly
	 * SecuritiesOrderExecutionInstruction.mmInstitutionsOnly}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstnsOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionsOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies that the broker is restricted to dealing with other buy side firms."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstitutionsOnly = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmInstitutionsOnly;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "InstnsOnly";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionsOnly";
			definition = "Identifies that the broker is restricted to dealing with other buy side firms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator nonNegotiable;
	/**
	 * Qualifies an asset (usually a payment instrument) of which rights cannot
	 * be transferred to a party other then the original debtor and creditor.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmNonNegotiable
	 * SecuritiesOrderExecutionInstruction.mmNonNegotiable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonNgtbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonNegotiable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Qualifies an asset (usually a payment instrument) of which rights cannot be transferred to a party other then the original debtor and creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonNegotiable = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmNonNegotiable;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "NonNgtbl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonNegotiable";
			definition = "Qualifies an asset (usually a payment instrument) of which rights cannot be transferred to a party other then the original debtor and creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator overTheDay;
	/**
	 * Indicates whether to execute parts of the order over the course of the
	 * day. Usually done with large block orders.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmOverTheDay
	 * SecuritiesOrderExecutionInstruction.mmOverTheDay}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OverTheDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverTheDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether to execute parts of the order over the course of the day. Usually done with large block orders."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOverTheDay = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmOverTheDay;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "OverTheDay";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverTheDay";
			definition = "Indicates whether to execute parts of the order over the course of the day. Usually done with large block orders.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator participateDontInitiate;
	/**
	 * An order that may participate in a transaction initiated by another
	 * party, but may not initiate a transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmParticipateDontInitiate
	 * SecuritiesOrderExecutionInstruction.mmParticipateDontInitiate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcpDontInit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipateDontInitiate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order that may participate in a transaction initiated by another party, but may not initiate a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParticipateDontInitiate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmParticipateDontInitiate;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "PtcpDontInit";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipateDontInitiate";
			definition = "An order that may participate in a transaction initiated by another party, but may not initiate a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator percentOfVolume;
	/**
	 * Indicates that the Sender does not want all of the volume on the floor.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmPercentOfVolume
	 * SecuritiesOrderExecutionInstruction.mmPercentOfVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctOfVol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentOfVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the Sender does not want all of the volume on the floor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentOfVolume = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmPercentOfVolume;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "PctOfVol";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentOfVolume";
			definition = "Indicates that the Sender does not want all of the volume on the floor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator scale;
	/**
	 * An order to buy (or sell) a financial instrument which specifies the
	 * total amount to be bought (or sold) and the amount to be bought (or sold)
	 * at specified price variations.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmScale
	 * SecuritiesOrderExecutionInstruction.mmScale}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmScale = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmScale;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Scale";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scale";
			definition = "An order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected StayOnSideType1Code stayOnSide;
	/**
	 * Specifies the order limit based on the offer/bid at the time of the order
	 * submission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StayOnSideType1Code
	 * StayOnSideType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmStayOnSide
	 * SecuritiesOrderExecutionInstruction.mmStayOnSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StayOnSd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StayOnSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the order limit based on the offer/bid at the time of the order submission."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStayOnSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmStayOnSide;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "StayOnSd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StayOnSide";
			definition = "Specifies the order limit based on the offer/bid at the time of the order submission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StayOnSideType1Code.mmObject();
		}
	};
	protected YesNoIndicator work;
	/**
	 * Make the order active until notified.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmWork
	 * SecuritiesOrderExecutionInstruction.mmWork}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Work"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Work"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Make the order active until notified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWork = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmWork;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Work";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Work";
			definition = "Make the order active until notified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator goAlong;
	/**
	 * Used for listed equity securities. Buy or sell at prices that randomly
	 * occur on the floor, participating in what trades the specialist and other
	 * players will allow.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmGoAlong
	 * SecuritiesOrderExecutionInstruction.mmGoAlong}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GoAlong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoAlong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for listed equity securities. Buy or sell at prices that randomly occur on the floor, participating in what\ntrades the specialist and other players will allow."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGoAlong = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmGoAlong;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "GoAlong";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoAlong";
			definition = "Used for listed equity securities. Buy or sell at prices that randomly occur on the floor, participating in what\ntrades the specialist and other players will allow.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator tryScale;
	/**
	 * Order to buy (sell) a security that specifies the total amount to be
	 * bought (sold) and the amount to be bought (sold) at successively
	 * decreasing (increasing) price intervals; often placed in order to average
	 * the price.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmTryScale
	 * SecuritiesOrderExecutionInstruction.mmTryScale}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TryScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TryScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order to buy (sell) a security that specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTryScale = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmTryScale;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "TryScale";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TryScale";
			definition = "Order to buy (sell) a security that specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator doNotReduce;
	/**
	 * Indicates whether to buy, to stop order to sell, or to stop limit order
	 * to sell that is not to be reduced in price by the amount of an ordinary
	 * cash dividend on the ex-dividend date. A "do not reduce" order applies
	 * only to ordinary cash dividends; it should be reduced for other
	 * distributions - such as when a stock goes ex stock dividend or ex rights.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmDoNotReduce
	 * SecuritiesOrderExecutionInstruction.mmDoNotReduce}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DoNotRdc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoNotReduce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date.  A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDoNotReduce = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmDoNotReduce;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "DoNotRdc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoNotReduce";
			definition = "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date.  A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator cancelOnSystemFailure;
	/**
	 * If a system failure interrupts trading or order routing, attempt to
	 * cancel this order and attempt to reinstate this order, subject to time in
	 * force limitations. Note that depending on the type and severity of the
	 * failure, this might not be possible.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCancelOnSystemFailure
	 * SecuritiesOrderExecutionInstruction.mmCancelOnSystemFailure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CclOnSysFailr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelOnSystemFailure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a system failure interrupts trading or order routing, attempt to cancel this order and attempt to reinstate this order, subject to time in force limitations. Note that depending on the type and severity of the failure, this might not be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancelOnSystemFailure = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCancelOnSystemFailure;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "CclOnSysFailr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to cancel this order and attempt to reinstate this order, subject to time in force limitations. Note that depending on the type and severity of the failure, this might not be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator cancelOnTradingHalt;
	/**
	 * If trading in this instrument is halted, cancel this order and reinstate
	 * this order when/if trading resumes, subject to time in force limitations.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCancelOnTradingHalt
	 * SecuritiesOrderExecutionInstruction.mmCancelOnTradingHalt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CclOnTradgHalt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelOnTradingHalt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If trading in this instrument is halted, cancel this order and reinstate this order when/if trading resumes, subject to time in force limitations."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancelOnTradingHalt = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCancelOnTradingHalt;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "CclOnTradgHalt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelOnTradingHalt";
			definition = "If trading in this instrument is halted, cancel this order and reinstate this order when/if trading resumes, subject to time in force limitations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator tradeAlong;
	/**
	 * Indicates whether the broker has permission to handle and place the order
	 * in the market even if the broker already has its own proprietary orders
	 * for the same financial instrument placed in the market.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmTradeAlong
	 * SecuritiesOrderExecutionInstruction.mmTradeAlong}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradAlong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAlong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the broker has permission to handle and place the order in the market even if  the broker already has its own proprietary orders for the same financial instrument placed in the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeAlong = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmTradeAlong;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "TradAlong";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAlong";
			definition = "Indicates whether the broker has permission to handle and place the order in the market even if  the broker already has its own proprietary orders for the same financial instrument placed in the market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator strictLimit;
	/**
	 * Limit order that must be traded at the exact limit price specified
	 * without any price improvement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmStrictLimit
	 * SecuritiesOrderExecutionInstruction.mmStrictLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrctLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrictLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit order that must be traded at the exact limit price specified without any price improvement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStrictLimit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmStrictLimit;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "StrctLmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrictLimit";
			definition = "Limit order that must be traded at the exact limit price specified without any price improvement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator ignorePriceValidityChecks;
	/**
	 * Disables validity checking of price fields for an order or change
	 * request.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmIgnorePriceValidityChecks
	 * SecuritiesOrderExecutionInstruction.mmIgnorePriceValidityChecks}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IgnrPricVldtyChcks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IgnorePriceValidityChecks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disables validity checking of price fields for an order or change request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIgnorePriceValidityChecks = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmIgnorePriceValidityChecks;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "IgnrPricVldtyChcks";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IgnorePriceValidityChecks";
			definition = "Disables validity checking of price fields for an order or change request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator reinstateOnSystemFailure;
	/**
	 * If a system failure interrupts trading or order routing, attempt to
	 * reinstate this order, subject to time in force limitations. Depending on
	 * the type and severity of the failure, this might not be possible.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmReinstateOnSystemFailure
	 * SecuritiesOrderExecutionInstruction.mmReinstateOnSystemFailure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinsttOnSysFailr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinstateOnSystemFailure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a system failure interrupts trading or order routing, attempt to reinstate this order, subject to time in force limitations. Depending on the type and severity of the failure, this might not be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReinstateOnSystemFailure = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmReinstateOnSystemFailure;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RinsttOnSysFailr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinstateOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to reinstate this order, subject to time in force limitations. Depending on the type and severity of the failure, this might not be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator reinstateOnTradingHalt;
	/**
	 * If trading in this instrument is halted, reinstate this order when/if
	 * trading resumes, subject to time in force limitations.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmReinstateOnTradingHalt
	 * SecuritiesOrderExecutionInstruction.mmReinstateOnTradingHalt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinsttOnTradgHalt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinstateOnTradingHalt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If trading in this instrument is halted, reinstate this order when/if trading resumes, subject to time in force limitations."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReinstateOnTradingHalt = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmReinstateOnTradingHalt;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RinsttOnTradgHalt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinstateOnTradingHalt";
			definition = "If trading in this instrument is halted, reinstate this order when/if trading resumes, subject to time in force limitations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator cancelIfNotBest;
	/**
	 * Indicates that an order should be cancelled if it is no longer the best
	 * bid if buying, or the best offer if selling.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCancelIfNotBest
	 * SecuritiesOrderExecutionInstruction.mmCancelIfNotBest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CclIfNotBest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelIfNotBest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order should be cancelled if it is no longer the best bid if buying, or the best offer if selling."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancelIfNotBest = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCancelIfNotBest;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "CclIfNotBest";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelIfNotBest";
			definition = "Indicates that an order should be cancelled if it is no longer the best bid if buying, or the best offer if selling.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator externalRoutingAllowed;
	/**
	 * Indicates that an order sent to one market may be routed by that market
	 * to other external markets, especially in cases where the order locks or
	 * crosses the market and it can be executed against another markets
	 * superior price. The absence of this instruction does not imply that an
	 * order should not be routed externally; rather, the order receivers
	 * default will apply.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmExternalRoutingAllowed
	 * SecuritiesOrderExecutionInstruction.mmExternalRoutingAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtrnlRtgAllwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalRoutingAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order sent to one market may be routed by that market to other external markets, especially in cases where the order locks or crosses the market and it can be executed against another markets superior price. The absence of this instruction does not imply that an order should not be routed externally; rather, the order receivers default will apply."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExternalRoutingAllowed = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmExternalRoutingAllowed;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "XtrnlRtgAllwd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalRoutingAllowed";
			definition = "Indicates that an order sent to one market may be routed by that market to other external markets, especially in cases where the order locks or crosses the market and it can be executed against another markets superior price. The absence of this instruction does not imply that an order should not be routed externally; rather, the order receivers default will apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator externalRoutingNotAllowed;
	/**
	 * Indicates that an order sent to one market may never be routed by that
	 * market to other external markets. Should the order lock or cross the
	 * market but be unable to execute due to price protection reasons, a market
	 * may have to take alternate action, which might include rejecting the
	 * order, depending on the markets rules.The absence of this instruction
	 * does not imply that an order should be routed externally; rather, the
	 * order receivers default will apply.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmExternalRoutingNotAllowed
	 * SecuritiesOrderExecutionInstruction.mmExternalRoutingNotAllowed}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtrnlRtgNotAllwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalRoutingNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order sent to one market may never be routed by that market to other external markets. Should the order lock or cross the market but be unable to execute due to price protection reasons, a market may have to take alternate action, which might include rejecting the order, depending on the markets rules.The absence of this instruction does not imply that an order should be routed externally; rather, the order receivers default will apply."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExternalRoutingNotAllowed = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmExternalRoutingNotAllowed;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "XtrnlRtgNotAllwd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalRoutingNotAllowed";
			definition = "Indicates that an order sent to one market may never be routed by that market to other external markets. Should the order lock or cross the market but be unable to execute due to price protection reasons, a market may have to take alternate action, which might include rejecting the order, depending on the markets rules.The absence of this instruction does not imply that an order should be routed externally; rather, the order receivers default will apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator imbalanceOnly;
	/**
	 * Indicates that the order can only hit the imbalance during a call
	 * auction. The imbalance is the remaining quantity when other buy and sell
	 * orders are matched at the auction clearing price.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmImbalanceOnly
	 * SecuritiesOrderExecutionInstruction.mmImbalanceOnly}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ImbalOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImbalanceOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmImbalanceOnly = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmImbalanceOnly;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "ImbalOnly";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImbalanceOnly";
			definition = "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator intermarketSweep;
	/**
	 * Indicates that the party sending the order has taken responsibility for
	 * price protection, and the recipient of the order should execute it, if
	 * possible, without regard to protection of other markets prices. While
	 * the term "Intermarket sweep" is specific to the United States, it may be
	 * used in other markets, where appropriate, to indicate an order that
	 * should be executed without regard to price protection.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmIntermarketSweep
	 * SecuritiesOrderExecutionInstruction.mmIntermarketSweep}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmktSweep"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermarketSweep"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the party sending the order has taken responsibility for price protection, and the recipient of the order should execute it, if possible, without regard to protection of other markets prices. While the term \"Intermarket sweep\" is specific to the United States, it may be used in other markets, where appropriate, to indicate an order that should be executed without regard to price protection."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermarketSweep = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmIntermarketSweep;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "IntrmktSweep";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermarketSweep";
			definition = "Indicates that the party sending the order has taken responsibility for price protection, and the recipient of the order should execute it, if possible, without regard to protection of other markets prices. While the term \"Intermarket sweep\" is specific to the United States, it may be used in other markets, where appropriate, to indicate an order that should be executed without regard to price protection.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator netting;
	/**
	 * Used when sending multiple orders indicating that you would be 'netting'
	 * the F/X later.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmNetting
	 * SecuritiesOrderExecutionInstruction.mmNetting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
	 * SecuritiesExecutionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Netg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when sending multiple orders indicating that you would be 'netting' the F/X later."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetting = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmNetting;
			componentContext_lazy = () -> SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Netg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			definition = "Used when sending multiple orders indicating that you would be 'netting' the F/X later.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmAllOrNone, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCallFirst,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCross, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCustomerDisplay,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmHold, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmIncrease,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmInstitutionsOnly, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmNonNegotiable,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmOverTheDay, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmParticipateDontInitiate,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmPercentOfVolume, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmScale,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmStayOnSide, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmWork,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmGoAlong, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmTryScale,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmDoNotReduce, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCancelOnSystemFailure,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCancelOnTradingHalt, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmTradeAlong,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmStrictLimit, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmIgnorePriceValidityChecks,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmReinstateOnSystemFailure, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmReinstateOnTradingHalt,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCancelIfNotBest, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmExternalRoutingAllowed,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmExternalRoutingNotAllowed, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmImbalanceOnly,
						com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmIntermarketSweep, com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmNetting);
				trace_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesExecutionInstructions1";
				definition = "Identifies the instructions for order handling.";
			}
		});
		return mmObject_lazy.get();
	}

	public AllOrNoneIndicator getAllOrNone() {
		return allOrNone;
	}

	public void setAllOrNone(AllOrNoneIndicator allOrNone) {
		this.allOrNone = allOrNone;
	}

	public YesNoIndicator getCallFirst() {
		return callFirst;
	}

	public void setCallFirst(YesNoIndicator callFirst) {
		this.callFirst = callFirst;
	}

	public YesNoIndicator getCross() {
		return cross;
	}

	public void setCross(YesNoIndicator cross) {
		this.cross = cross;
	}

	public YesNoIndicator getCustomerDisplay() {
		return customerDisplay;
	}

	public void setCustomerDisplay(YesNoIndicator customerDisplay) {
		this.customerDisplay = customerDisplay;
	}

	public YesNoIndicator getHold() {
		return hold;
	}

	public void setHold(YesNoIndicator hold) {
		this.hold = hold;
	}

	public YesNoIndicator getIncrease() {
		return increase;
	}

	public void setIncrease(YesNoIndicator increase) {
		this.increase = increase;
	}

	public YesNoIndicator getInstitutionsOnly() {
		return institutionsOnly;
	}

	public void setInstitutionsOnly(YesNoIndicator institutionsOnly) {
		this.institutionsOnly = institutionsOnly;
	}

	public YesNoIndicator getNonNegotiable() {
		return nonNegotiable;
	}

	public void setNonNegotiable(YesNoIndicator nonNegotiable) {
		this.nonNegotiable = nonNegotiable;
	}

	public YesNoIndicator getOverTheDay() {
		return overTheDay;
	}

	public void setOverTheDay(YesNoIndicator overTheDay) {
		this.overTheDay = overTheDay;
	}

	public YesNoIndicator getParticipateDontInitiate() {
		return participateDontInitiate;
	}

	public void setParticipateDontInitiate(YesNoIndicator participateDontInitiate) {
		this.participateDontInitiate = participateDontInitiate;
	}

	public YesNoIndicator getPercentOfVolume() {
		return percentOfVolume;
	}

	public void setPercentOfVolume(YesNoIndicator percentOfVolume) {
		this.percentOfVolume = percentOfVolume;
	}

	public YesNoIndicator getScale() {
		return scale;
	}

	public void setScale(YesNoIndicator scale) {
		this.scale = scale;
	}

	public StayOnSideType1Code getStayOnSide() {
		return stayOnSide;
	}

	public void setStayOnSide(StayOnSideType1Code stayOnSide) {
		this.stayOnSide = stayOnSide;
	}

	public YesNoIndicator getWork() {
		return work;
	}

	public void setWork(YesNoIndicator work) {
		this.work = work;
	}

	public YesNoIndicator getGoAlong() {
		return goAlong;
	}

	public void setGoAlong(YesNoIndicator goAlong) {
		this.goAlong = goAlong;
	}

	public YesNoIndicator getTryScale() {
		return tryScale;
	}

	public void setTryScale(YesNoIndicator tryScale) {
		this.tryScale = tryScale;
	}

	public YesNoIndicator getDoNotReduce() {
		return doNotReduce;
	}

	public void setDoNotReduce(YesNoIndicator doNotReduce) {
		this.doNotReduce = doNotReduce;
	}

	public YesNoIndicator getCancelOnSystemFailure() {
		return cancelOnSystemFailure;
	}

	public void setCancelOnSystemFailure(YesNoIndicator cancelOnSystemFailure) {
		this.cancelOnSystemFailure = cancelOnSystemFailure;
	}

	public YesNoIndicator getCancelOnTradingHalt() {
		return cancelOnTradingHalt;
	}

	public void setCancelOnTradingHalt(YesNoIndicator cancelOnTradingHalt) {
		this.cancelOnTradingHalt = cancelOnTradingHalt;
	}

	public YesNoIndicator getTradeAlong() {
		return tradeAlong;
	}

	public void setTradeAlong(YesNoIndicator tradeAlong) {
		this.tradeAlong = tradeAlong;
	}

	public YesNoIndicator getStrictLimit() {
		return strictLimit;
	}

	public void setStrictLimit(YesNoIndicator strictLimit) {
		this.strictLimit = strictLimit;
	}

	public YesNoIndicator getIgnorePriceValidityChecks() {
		return ignorePriceValidityChecks;
	}

	public void setIgnorePriceValidityChecks(YesNoIndicator ignorePriceValidityChecks) {
		this.ignorePriceValidityChecks = ignorePriceValidityChecks;
	}

	public YesNoIndicator getReinstateOnSystemFailure() {
		return reinstateOnSystemFailure;
	}

	public void setReinstateOnSystemFailure(YesNoIndicator reinstateOnSystemFailure) {
		this.reinstateOnSystemFailure = reinstateOnSystemFailure;
	}

	public YesNoIndicator getReinstateOnTradingHalt() {
		return reinstateOnTradingHalt;
	}

	public void setReinstateOnTradingHalt(YesNoIndicator reinstateOnTradingHalt) {
		this.reinstateOnTradingHalt = reinstateOnTradingHalt;
	}

	public YesNoIndicator getCancelIfNotBest() {
		return cancelIfNotBest;
	}

	public void setCancelIfNotBest(YesNoIndicator cancelIfNotBest) {
		this.cancelIfNotBest = cancelIfNotBest;
	}

	public YesNoIndicator getExternalRoutingAllowed() {
		return externalRoutingAllowed;
	}

	public void setExternalRoutingAllowed(YesNoIndicator externalRoutingAllowed) {
		this.externalRoutingAllowed = externalRoutingAllowed;
	}

	public YesNoIndicator getExternalRoutingNotAllowed() {
		return externalRoutingNotAllowed;
	}

	public void setExternalRoutingNotAllowed(YesNoIndicator externalRoutingNotAllowed) {
		this.externalRoutingNotAllowed = externalRoutingNotAllowed;
	}

	public YesNoIndicator getImbalanceOnly() {
		return imbalanceOnly;
	}

	public void setImbalanceOnly(YesNoIndicator imbalanceOnly) {
		this.imbalanceOnly = imbalanceOnly;
	}

	public YesNoIndicator getIntermarketSweep() {
		return intermarketSweep;
	}

	public void setIntermarketSweep(YesNoIndicator intermarketSweep) {
		this.intermarketSweep = intermarketSweep;
	}

	public YesNoIndicator getNetting() {
		return netting;
	}

	public void setNetting(YesNoIndicator netting) {
		this.netting = netting;
	}
}
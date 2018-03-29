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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.StayOnSideType1Code;
import com.tools20022.repository.datatype.AllOrNoneIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: 18</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesExecutionInstructions1", propOrder = {"allOrNone", "callFirst", "cross", "customerDisplay", "hold", "increase", "institutionsOnly", "nonNegotiable", "overTheDay", "participateDontInitiate", "percentOfVolume",
		"scale", "stayOnSide", "work", "goAlong", "tryScale", "doNotReduce", "cancelOnSystemFailure", "cancelOnTradingHalt", "tradeAlong", "strictLimit", "ignorePriceValidityChecks", "reinstateOnSystemFailure", "reinstateOnTradingHalt",
		"cancelIfNotBest", "externalRoutingAllowed", "externalRoutingNotAllowed", "imbalanceOnly", "intermarketSweep", "netting"})
public class SecuritiesExecutionInstructions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AllOrNn")
	protected AllOrNoneIndicator allOrNone;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<AllOrNoneIndicator>> mmAllOrNone = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<AllOrNoneIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmAllOrNone;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "AllOrNn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			definition = "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, AON orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AllOrNoneIndicator.mmObject();
		}

		@Override
		public Optional<AllOrNoneIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getAllOrNone();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<AllOrNoneIndicator> value) {
			obj.setAllOrNone(value.orElse(null));
		}
	};
	@XmlElement(name = "CallFrst")
	protected YesNoIndicator callFirst;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmCallFirst = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmCallFirst;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "CallFrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallFirst";
			definition = "Refers to the client before trading in order to catch all verbal instructions on trading strategy usually because the strategy is too complex or cannot be represented in the trading application.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getCallFirst();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setCallFirst(value.orElse(null));
		}
	};
	@XmlElement(name = "Cross")
	protected YesNoIndicator cross;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmCross = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmCross;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Cross";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cross";
			definition = "Allow crossing of an order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getCross();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setCross(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrDisp")
	protected YesNoIndicator customerDisplay;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmCustomerDisplay = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmCustomerDisplay;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "CstmrDisp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDisplay";
			definition = "Exchange or ECN required by the SEC to display limit orders in the public order book. A customer can choose not to have his limit order displayed to the public.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getCustomerDisplay();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setCustomerDisplay(value.orElse(null));
		}
	};
	@XmlElement(name = "Hld")
	protected YesNoIndicator hold;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmHold = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmHold;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Hld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hold";
			definition = "Indicates whether the firm executing the order is held to best execution requirements and may be able to make some discretionary decisions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getHold();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setHold(value.orElse(null));
		}
	};
	@XmlElement(name = "Incr")
	protected YesNoIndicator increase;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmIncrease = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmIncrease;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Incr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Increase";
			definition = "Indicates whether the order is to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getIncrease();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setIncrease(value.orElse(null));
		}
	};
	@XmlElement(name = "InstnsOnly")
	protected YesNoIndicator institutionsOnly;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmInstitutionsOnly = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmInstitutionsOnly;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "InstnsOnly";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstitutionsOnly";
			definition = "Identifies that the broker is restricted to dealing with other buy side firms.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getInstitutionsOnly();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setInstitutionsOnly(value.orElse(null));
		}
	};
	@XmlElement(name = "NonNgtbl")
	protected YesNoIndicator nonNegotiable;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmNonNegotiable = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmNonNegotiable;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "NonNgtbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonNegotiable";
			definition = "Qualifies an asset (usually a payment instrument) of which rights cannot be transferred to a party other then the original debtor and creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getNonNegotiable();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setNonNegotiable(value.orElse(null));
		}
	};
	@XmlElement(name = "OverTheDay")
	protected YesNoIndicator overTheDay;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmOverTheDay = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmOverTheDay;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "OverTheDay";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverTheDay";
			definition = "Indicates whether to execute parts of the order over the course of the day. Usually done with large block orders.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getOverTheDay();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setOverTheDay(value.orElse(null));
		}
	};
	@XmlElement(name = "PtcpDontInit")
	protected YesNoIndicator participateDontInitiate;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmParticipateDontInitiate = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmParticipateDontInitiate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "PtcpDontInit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipateDontInitiate";
			definition = "An order that may participate in a transaction initiated by another party, but may not initiate a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getParticipateDontInitiate();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setParticipateDontInitiate(value.orElse(null));
		}
	};
	@XmlElement(name = "PctOfVol")
	protected YesNoIndicator percentOfVolume;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmPercentOfVolume = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmPercentOfVolume;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "PctOfVol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentOfVolume";
			definition = "Indicates that the Sender does not want all of the volume on the floor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getPercentOfVolume();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setPercentOfVolume(value.orElse(null));
		}
	};
	@XmlElement(name = "Scale")
	protected YesNoIndicator scale;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmScale = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmScale;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Scale";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scale";
			definition = "An order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getScale();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setScale(value.orElse(null));
		}
	};
	@XmlElement(name = "StayOnSd")
	protected StayOnSideType1Code stayOnSide;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<StayOnSideType1Code>> mmStayOnSide = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<StayOnSideType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmStayOnSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "StayOnSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StayOnSide";
			definition = "Specifies the order limit based on the offer/bid at the time of the order submission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StayOnSideType1Code.mmObject();
		}

		@Override
		public Optional<StayOnSideType1Code> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getStayOnSide();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<StayOnSideType1Code> value) {
			obj.setStayOnSide(value.orElse(null));
		}
	};
	@XmlElement(name = "Work")
	protected YesNoIndicator work;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmWork = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmWork;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Work";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Work";
			definition = "Make the order active until notified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getWork();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setWork(value.orElse(null));
		}
	};
	@XmlElement(name = "GoAlong")
	protected YesNoIndicator goAlong;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmGoAlong = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmGoAlong;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "GoAlong";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoAlong";
			definition = "Used for listed equity securities. Buy or sell at prices that randomly occur on the floor, participating in what\ntrades the specialist and other players will allow.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getGoAlong();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setGoAlong(value.orElse(null));
		}
	};
	@XmlElement(name = "TryScale")
	protected YesNoIndicator tryScale;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmTryScale = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmTryScale;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "TryScale";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TryScale";
			definition = "Order to buy (sell) a security that specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getTryScale();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setTryScale(value.orElse(null));
		}
	};
	@XmlElement(name = "DoNotRdc")
	protected YesNoIndicator doNotReduce;
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
	 * "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date. A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmDoNotReduce = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmDoNotReduce;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "DoNotRdc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoNotReduce";
			definition = "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date. A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getDoNotReduce();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setDoNotReduce(value.orElse(null));
		}
	};
	@XmlElement(name = "CclOnSysFailr")
	protected YesNoIndicator cancelOnSystemFailure;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmCancelOnSystemFailure = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmCancelOnSystemFailure;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "CclOnSysFailr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to cancel this order and attempt to reinstate this order, subject to time in force limitations. Note that depending on the type and severity of the failure, this might not be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getCancelOnSystemFailure();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setCancelOnSystemFailure(value.orElse(null));
		}
	};
	@XmlElement(name = "CclOnTradgHalt")
	protected YesNoIndicator cancelOnTradingHalt;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmCancelOnTradingHalt = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmCancelOnTradingHalt;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "CclOnTradgHalt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelOnTradingHalt";
			definition = "If trading in this instrument is halted, cancel this order and reinstate this order when/if trading resumes, subject to time in force limitations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getCancelOnTradingHalt();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setCancelOnTradingHalt(value.orElse(null));
		}
	};
	@XmlElement(name = "TradAlong")
	protected YesNoIndicator tradeAlong;
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
	 * "Indicates whether the broker has permission to handle and place the order in the market even if the broker already has its own proprietary orders for the same financial instrument placed in the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmTradeAlong = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmTradeAlong;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "TradAlong";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAlong";
			definition = "Indicates whether the broker has permission to handle and place the order in the market even if the broker already has its own proprietary orders for the same financial instrument placed in the market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getTradeAlong();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setTradeAlong(value.orElse(null));
		}
	};
	@XmlElement(name = "StrctLmt")
	protected YesNoIndicator strictLimit;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmStrictLimit = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmStrictLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "StrctLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrictLimit";
			definition = "Limit order that must be traded at the exact limit price specified without any price improvement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getStrictLimit();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setStrictLimit(value.orElse(null));
		}
	};
	@XmlElement(name = "IgnrPricVldtyChcks")
	protected YesNoIndicator ignorePriceValidityChecks;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmIgnorePriceValidityChecks = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmIgnorePriceValidityChecks;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "IgnrPricVldtyChcks";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IgnorePriceValidityChecks";
			definition = "Disables validity checking of price fields for an order or change request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getIgnorePriceValidityChecks();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setIgnorePriceValidityChecks(value.orElse(null));
		}
	};
	@XmlElement(name = "RinsttOnSysFailr")
	protected YesNoIndicator reinstateOnSystemFailure;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmReinstateOnSystemFailure = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmReinstateOnSystemFailure;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RinsttOnSysFailr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinstateOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to reinstate this order, subject to time in force limitations. Depending on the type and severity of the failure, this might not be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getReinstateOnSystemFailure();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setReinstateOnSystemFailure(value.orElse(null));
		}
	};
	@XmlElement(name = "RinsttOnTradgHalt")
	protected YesNoIndicator reinstateOnTradingHalt;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmReinstateOnTradingHalt = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmReinstateOnTradingHalt;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RinsttOnTradgHalt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinstateOnTradingHalt";
			definition = "If trading in this instrument is halted, reinstate this order when/if trading resumes, subject to time in force limitations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getReinstateOnTradingHalt();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setReinstateOnTradingHalt(value.orElse(null));
		}
	};
	@XmlElement(name = "CclIfNotBest")
	protected YesNoIndicator cancelIfNotBest;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmCancelIfNotBest = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmCancelIfNotBest;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "CclIfNotBest";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelIfNotBest";
			definition = "Indicates that an order should be cancelled if it is no longer the best bid if buying, or the best offer if selling.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getCancelIfNotBest();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setCancelIfNotBest(value.orElse(null));
		}
	};
	@XmlElement(name = "XtrnlRtgAllwd")
	protected YesNoIndicator externalRoutingAllowed;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmExternalRoutingAllowed = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmExternalRoutingAllowed;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "XtrnlRtgAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalRoutingAllowed";
			definition = "Indicates that an order sent to one market may be routed by that market to other external markets, especially in cases where the order locks or crosses the market and it can be executed against another markets superior price. The absence of this instruction does not imply that an order should not be routed externally; rather, the order receivers default will apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getExternalRoutingAllowed();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setExternalRoutingAllowed(value.orElse(null));
		}
	};
	@XmlElement(name = "XtrnlRtgNotAllwd")
	protected YesNoIndicator externalRoutingNotAllowed;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmExternalRoutingNotAllowed = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmExternalRoutingNotAllowed;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "XtrnlRtgNotAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalRoutingNotAllowed";
			definition = "Indicates that an order sent to one market may never be routed by that market to other external markets. Should the order lock or cross the market but be unable to execute due to price protection reasons, a market may have to take alternate action, which might include rejecting the order, depending on the markets rules.The absence of this instruction does not imply that an order should be routed externally; rather, the order receivers default will apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getExternalRoutingNotAllowed();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setExternalRoutingNotAllowed(value.orElse(null));
		}
	};
	@XmlElement(name = "ImbalOnly")
	protected YesNoIndicator imbalanceOnly;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmImbalanceOnly = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmImbalanceOnly;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "ImbalOnly";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImbalanceOnly";
			definition = "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getImbalanceOnly();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setImbalanceOnly(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmktSweep")
	protected YesNoIndicator intermarketSweep;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmIntermarketSweep = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmIntermarketSweep;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "IntrmktSweep";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermarketSweep";
			definition = "Indicates that the party sending the order has taken responsibility for price protection, and the recipient of the order should execute it, if possible, without regard to protection of other markets prices. While the term \"Intermarket sweep\" is specific to the United States, it may be used in other markets, where appropriate, to indicate an order that should be executed without regard to price protection.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getIntermarketSweep();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setIntermarketSweep(value.orElse(null));
		}
	};
	@XmlElement(name = "Netg")
	protected YesNoIndicator netting;
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
	public static final MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>> mmNetting = new MMMessageAttribute<SecuritiesExecutionInstructions1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderExecutionInstruction.mmNetting;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Netg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			definition = "Used when sending multiple orders indicating that you would be 'netting' the F/X later.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesExecutionInstructions1 obj) {
			return obj.getNetting();
		}

		@Override
		public void setValue(SecuritiesExecutionInstructions1 obj, Optional<YesNoIndicator> value) {
			obj.setNetting(value.orElse(null));
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
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18"));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesExecutionInstructions1";
				definition = "Identifies the instructions for order handling.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AllOrNoneIndicator> getAllOrNone() {
		return allOrNone == null ? Optional.empty() : Optional.of(allOrNone);
	}

	public SecuritiesExecutionInstructions1 setAllOrNone(AllOrNoneIndicator allOrNone) {
		this.allOrNone = allOrNone;
		return this;
	}

	public Optional<YesNoIndicator> getCallFirst() {
		return callFirst == null ? Optional.empty() : Optional.of(callFirst);
	}

	public SecuritiesExecutionInstructions1 setCallFirst(YesNoIndicator callFirst) {
		this.callFirst = callFirst;
		return this;
	}

	public Optional<YesNoIndicator> getCross() {
		return cross == null ? Optional.empty() : Optional.of(cross);
	}

	public SecuritiesExecutionInstructions1 setCross(YesNoIndicator cross) {
		this.cross = cross;
		return this;
	}

	public Optional<YesNoIndicator> getCustomerDisplay() {
		return customerDisplay == null ? Optional.empty() : Optional.of(customerDisplay);
	}

	public SecuritiesExecutionInstructions1 setCustomerDisplay(YesNoIndicator customerDisplay) {
		this.customerDisplay = customerDisplay;
		return this;
	}

	public Optional<YesNoIndicator> getHold() {
		return hold == null ? Optional.empty() : Optional.of(hold);
	}

	public SecuritiesExecutionInstructions1 setHold(YesNoIndicator hold) {
		this.hold = hold;
		return this;
	}

	public Optional<YesNoIndicator> getIncrease() {
		return increase == null ? Optional.empty() : Optional.of(increase);
	}

	public SecuritiesExecutionInstructions1 setIncrease(YesNoIndicator increase) {
		this.increase = increase;
		return this;
	}

	public Optional<YesNoIndicator> getInstitutionsOnly() {
		return institutionsOnly == null ? Optional.empty() : Optional.of(institutionsOnly);
	}

	public SecuritiesExecutionInstructions1 setInstitutionsOnly(YesNoIndicator institutionsOnly) {
		this.institutionsOnly = institutionsOnly;
		return this;
	}

	public Optional<YesNoIndicator> getNonNegotiable() {
		return nonNegotiable == null ? Optional.empty() : Optional.of(nonNegotiable);
	}

	public SecuritiesExecutionInstructions1 setNonNegotiable(YesNoIndicator nonNegotiable) {
		this.nonNegotiable = nonNegotiable;
		return this;
	}

	public Optional<YesNoIndicator> getOverTheDay() {
		return overTheDay == null ? Optional.empty() : Optional.of(overTheDay);
	}

	public SecuritiesExecutionInstructions1 setOverTheDay(YesNoIndicator overTheDay) {
		this.overTheDay = overTheDay;
		return this;
	}

	public Optional<YesNoIndicator> getParticipateDontInitiate() {
		return participateDontInitiate == null ? Optional.empty() : Optional.of(participateDontInitiate);
	}

	public SecuritiesExecutionInstructions1 setParticipateDontInitiate(YesNoIndicator participateDontInitiate) {
		this.participateDontInitiate = participateDontInitiate;
		return this;
	}

	public Optional<YesNoIndicator> getPercentOfVolume() {
		return percentOfVolume == null ? Optional.empty() : Optional.of(percentOfVolume);
	}

	public SecuritiesExecutionInstructions1 setPercentOfVolume(YesNoIndicator percentOfVolume) {
		this.percentOfVolume = percentOfVolume;
		return this;
	}

	public Optional<YesNoIndicator> getScale() {
		return scale == null ? Optional.empty() : Optional.of(scale);
	}

	public SecuritiesExecutionInstructions1 setScale(YesNoIndicator scale) {
		this.scale = scale;
		return this;
	}

	public Optional<StayOnSideType1Code> getStayOnSide() {
		return stayOnSide == null ? Optional.empty() : Optional.of(stayOnSide);
	}

	public SecuritiesExecutionInstructions1 setStayOnSide(StayOnSideType1Code stayOnSide) {
		this.stayOnSide = stayOnSide;
		return this;
	}

	public Optional<YesNoIndicator> getWork() {
		return work == null ? Optional.empty() : Optional.of(work);
	}

	public SecuritiesExecutionInstructions1 setWork(YesNoIndicator work) {
		this.work = work;
		return this;
	}

	public Optional<YesNoIndicator> getGoAlong() {
		return goAlong == null ? Optional.empty() : Optional.of(goAlong);
	}

	public SecuritiesExecutionInstructions1 setGoAlong(YesNoIndicator goAlong) {
		this.goAlong = goAlong;
		return this;
	}

	public Optional<YesNoIndicator> getTryScale() {
		return tryScale == null ? Optional.empty() : Optional.of(tryScale);
	}

	public SecuritiesExecutionInstructions1 setTryScale(YesNoIndicator tryScale) {
		this.tryScale = tryScale;
		return this;
	}

	public Optional<YesNoIndicator> getDoNotReduce() {
		return doNotReduce == null ? Optional.empty() : Optional.of(doNotReduce);
	}

	public SecuritiesExecutionInstructions1 setDoNotReduce(YesNoIndicator doNotReduce) {
		this.doNotReduce = doNotReduce;
		return this;
	}

	public Optional<YesNoIndicator> getCancelOnSystemFailure() {
		return cancelOnSystemFailure == null ? Optional.empty() : Optional.of(cancelOnSystemFailure);
	}

	public SecuritiesExecutionInstructions1 setCancelOnSystemFailure(YesNoIndicator cancelOnSystemFailure) {
		this.cancelOnSystemFailure = cancelOnSystemFailure;
		return this;
	}

	public Optional<YesNoIndicator> getCancelOnTradingHalt() {
		return cancelOnTradingHalt == null ? Optional.empty() : Optional.of(cancelOnTradingHalt);
	}

	public SecuritiesExecutionInstructions1 setCancelOnTradingHalt(YesNoIndicator cancelOnTradingHalt) {
		this.cancelOnTradingHalt = cancelOnTradingHalt;
		return this;
	}

	public Optional<YesNoIndicator> getTradeAlong() {
		return tradeAlong == null ? Optional.empty() : Optional.of(tradeAlong);
	}

	public SecuritiesExecutionInstructions1 setTradeAlong(YesNoIndicator tradeAlong) {
		this.tradeAlong = tradeAlong;
		return this;
	}

	public Optional<YesNoIndicator> getStrictLimit() {
		return strictLimit == null ? Optional.empty() : Optional.of(strictLimit);
	}

	public SecuritiesExecutionInstructions1 setStrictLimit(YesNoIndicator strictLimit) {
		this.strictLimit = strictLimit;
		return this;
	}

	public Optional<YesNoIndicator> getIgnorePriceValidityChecks() {
		return ignorePriceValidityChecks == null ? Optional.empty() : Optional.of(ignorePriceValidityChecks);
	}

	public SecuritiesExecutionInstructions1 setIgnorePriceValidityChecks(YesNoIndicator ignorePriceValidityChecks) {
		this.ignorePriceValidityChecks = ignorePriceValidityChecks;
		return this;
	}

	public Optional<YesNoIndicator> getReinstateOnSystemFailure() {
		return reinstateOnSystemFailure == null ? Optional.empty() : Optional.of(reinstateOnSystemFailure);
	}

	public SecuritiesExecutionInstructions1 setReinstateOnSystemFailure(YesNoIndicator reinstateOnSystemFailure) {
		this.reinstateOnSystemFailure = reinstateOnSystemFailure;
		return this;
	}

	public Optional<YesNoIndicator> getReinstateOnTradingHalt() {
		return reinstateOnTradingHalt == null ? Optional.empty() : Optional.of(reinstateOnTradingHalt);
	}

	public SecuritiesExecutionInstructions1 setReinstateOnTradingHalt(YesNoIndicator reinstateOnTradingHalt) {
		this.reinstateOnTradingHalt = reinstateOnTradingHalt;
		return this;
	}

	public Optional<YesNoIndicator> getCancelIfNotBest() {
		return cancelIfNotBest == null ? Optional.empty() : Optional.of(cancelIfNotBest);
	}

	public SecuritiesExecutionInstructions1 setCancelIfNotBest(YesNoIndicator cancelIfNotBest) {
		this.cancelIfNotBest = cancelIfNotBest;
		return this;
	}

	public Optional<YesNoIndicator> getExternalRoutingAllowed() {
		return externalRoutingAllowed == null ? Optional.empty() : Optional.of(externalRoutingAllowed);
	}

	public SecuritiesExecutionInstructions1 setExternalRoutingAllowed(YesNoIndicator externalRoutingAllowed) {
		this.externalRoutingAllowed = externalRoutingAllowed;
		return this;
	}

	public Optional<YesNoIndicator> getExternalRoutingNotAllowed() {
		return externalRoutingNotAllowed == null ? Optional.empty() : Optional.of(externalRoutingNotAllowed);
	}

	public SecuritiesExecutionInstructions1 setExternalRoutingNotAllowed(YesNoIndicator externalRoutingNotAllowed) {
		this.externalRoutingNotAllowed = externalRoutingNotAllowed;
		return this;
	}

	public Optional<YesNoIndicator> getImbalanceOnly() {
		return imbalanceOnly == null ? Optional.empty() : Optional.of(imbalanceOnly);
	}

	public SecuritiesExecutionInstructions1 setImbalanceOnly(YesNoIndicator imbalanceOnly) {
		this.imbalanceOnly = imbalanceOnly;
		return this;
	}

	public Optional<YesNoIndicator> getIntermarketSweep() {
		return intermarketSweep == null ? Optional.empty() : Optional.of(intermarketSweep);
	}

	public SecuritiesExecutionInstructions1 setIntermarketSweep(YesNoIndicator intermarketSweep) {
		this.intermarketSweep = intermarketSweep;
		return this;
	}

	public Optional<YesNoIndicator> getNetting() {
		return netting == null ? Optional.empty() : Optional.of(netting);
	}

	public SecuritiesExecutionInstructions1 setNetting(YesNoIndicator netting) {
		this.netting = netting;
		return this;
	}
}
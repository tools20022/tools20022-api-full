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
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PegOrderInstructions1;
import com.tools20022.repository.msg.Price1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters of the transfer of a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OrderParameters1#mmTimeInForce
 * OrderParameters1.mmTimeInForce}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderParameters1#mmType
 * OrderParameters1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmExpiryDateAndTime
 * OrderParameters1.mmExpiryDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmEffectiveDateAndTime
 * OrderParameters1.mmEffectiveDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmHandlingInstruction
 * OrderParameters1.mmHandlingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmStockLocateRequiredIndicator
 * OrderParameters1.mmStockLocateRequiredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmMoneyLaunderingStatus
 * OrderParameters1.mmMoneyLaunderingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmReportingIndicator
 * OrderParameters1.mmReportingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmPriorityType
 * OrderParameters1.mmPriorityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmTradeTransactionConditionIndicator
 * OrderParameters1.mmTradeTransactionConditionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmAutoRoutingIndicator
 * OrderParameters1.mmAutoRoutingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmPriceProtectionScope
 * OrderParameters1.mmPriceProtectionScope}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderParameters1#mmStopPrice
 * OrderParameters1.mmStopPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmTargetStrategy
 * OrderParameters1.mmTargetStrategy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmComplianceIdentification
 * OrderParameters1.mmComplianceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmPreTradeAnonymityIndicator
 * OrderParameters1.mmPreTradeAnonymityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmGoodTillBooking
 * OrderParameters1.mmGoodTillBooking}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderParameters1#mmProcessCode
 * OrderParameters1.mmProcessCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmPegInstructionsDetails
 * OrderParameters1.mmPegInstructionsDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
 * SecuritiesOrderParameters}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters of the transfer of a financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintHandlingInstructionForEquityGuideline#forOrderParameters1
 * ConstraintHandlingInstructionForEquityGuideline.forOrderParameters1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTypeAndFixedIncomeGuideline#forOrderParameters1
 * ConstraintTypeAndFixedIncomeGuideline.forOrderParameters1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTimeInForceAndExpiryDateAndTimeRule#forOrderParameters1
 * ConstraintTimeInForceAndExpiryDateAndTimeRule.forOrderParameters1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStockLocateRequiredRule#forOrderParameters1
 * ConstraintStockLocateRequiredRule.forOrderParameters1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStopPrice#forOrderParameters1
 * ConstraintStopPrice.forOrderParameters1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPegOrderDetails#forOrderParameters1
 * ConstraintPegOrderDetails.forOrderParameters1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderParameters1", propOrder = {"timeInForce", "type", "expiryDateAndTime", "effectiveDateAndTime", "handlingInstruction", "stockLocateRequiredIndicator", "moneyLaunderingStatus", "reportingIndicator", "priorityType",
		"tradeTransactionConditionIndicator", "autoRoutingIndicator", "priceProtectionScope", "stopPrice", "targetStrategy", "complianceIdentification", "preTradeAnonymityIndicator", "goodTillBooking", "processCode",
		"pegInstructionsDetails"})
public class OrderParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TmInForce")
	protected ExecutionTimeLimit1Code timeInForce;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmExecutionTimeLimit
	 * SecuritiesOrderParameters.mmExecutionTimeLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmInForce"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeInForce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates from/until when an order must be executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 59</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<ExecutionTimeLimit1Code>> mmTimeInForce = new MMMessageAttribute<OrderParameters1, Optional<ExecutionTimeLimit1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmExecutionTimeLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "TmInForce";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "59"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeInForce";
			definition = "Indicates from/until when an order must be executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}

		@Override
		public Optional<ExecutionTimeLimit1Code> getValue(OrderParameters1 obj) {
			return obj.getTimeInForce();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<ExecutionTimeLimit1Code> value) {
			obj.setTimeInForce(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected OrderType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmType
	 * SecuritiesOrder.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of instruction to a broker or dealer to buy or sell a financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 40</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, OrderType1Code> mmType = new MMMessageAttribute<OrderParameters1, OrderType1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "40"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates the type of instruction to a broker or dealer to buy or sell a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderType1Code.mmObject();
		}

		@Override
		public OrderType1Code getValue(OrderParameters1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(OrderParameters1 obj, OrderType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "XpryDtAndTm")
	protected ISODateTime expiryDateAndTime;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExpiryDate
	 * SecuritiesOrder.mmOrderExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDtAndTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time on which the order is to expire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 432, FIXSynonym: 126</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<ISODateTime>> mmExpiryDateAndTime = new MMMessageAttribute<OrderParameters1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "XpryDtAndTm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "432"), new FIXSynonym(this, "126"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "Date/time on which the order is to expire.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(OrderParameters1 obj) {
			return obj.getExpiryDateAndTime();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<ISODateTime> value) {
			obj.setExpiryDateAndTime(value.orElse(null));
		}
	};
	@XmlElement(name = "FctvDtAndTm")
	protected ISODateTime effectiveDateAndTime;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderEffectiveDate
	 * SecuritiesOrder.mmOrderEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDtAndTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time on which the order is effective."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 168</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<ISODateTime>> mmEffectiveDateAndTime = new MMMessageAttribute<OrderParameters1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderEffectiveDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "FctvDtAndTm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "168"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateAndTime";
			definition = "Date/time on which the order is effective.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(OrderParameters1 obj) {
			return obj.getEffectiveDateAndTime();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<ISODateTime> value) {
			obj.setEffectiveDateAndTime(value.orElse(null));
		}
	};
	@XmlElement(name = "HdlgInstr")
	protected TradingFloorOrderHandling1Code handlingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingFloorOrderHandling1Code
	 * TradingFloorOrderHandling1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmOrderHandlingInstruction
	 * SecuritiesOrderParameters.mmOrderHandlingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HdlgInstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HandlingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies instructions for order handling on the broker trading floor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 21</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<TradingFloorOrderHandling1Code>> mmHandlingInstruction = new MMMessageAttribute<OrderParameters1, Optional<TradingFloorOrderHandling1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmOrderHandlingInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "HdlgInstr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "21"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HandlingInstruction";
			definition = "Specifies instructions for order handling on the broker trading floor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingFloorOrderHandling1Code.mmObject();
		}

		@Override
		public Optional<TradingFloorOrderHandling1Code> getValue(OrderParameters1 obj) {
			return obj.getHandlingInstruction();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<TradingFloorOrderHandling1Code> value) {
			obj.setHandlingInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "StockLctReqrdInd")
	protected YesNoIndicator stockLocateRequiredIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmStockLocateRequired
	 * SecuritiesOrderParameters.mmStockLocateRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockLctReqrdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLocateRequiredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the broker is to locate the stock in conjunction with a short sell order.\nThis information is mandatory in case of short sales. When executed, the report will then mention the securities location."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 114</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<YesNoIndicator>> mmStockLocateRequiredIndicator = new MMMessageAttribute<OrderParameters1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmStockLocateRequired;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "StockLctReqrdInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "114"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLocateRequiredIndicator";
			definition = "Indicates whether the broker is to locate the stock in conjunction with a short sell order.\nThis information is mandatory in case of short sales. When executed, the report will then mention the securities location.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(OrderParameters1 obj) {
			return obj.getStockLocateRequiredIndicator();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<YesNoIndicator> value) {
			obj.setStockLocateRequiredIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "MnyLndrgSts")
	protected MoneyLaunderingCheck1Code moneyLaunderingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code
	 * MoneyLaunderingCheck1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
	 * Party.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnyLndrgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an identity check to prevent money laundering."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 481</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<MoneyLaunderingCheck1Code>> mmMoneyLaunderingStatus = new MMMessageAttribute<OrderParameters1, Optional<MoneyLaunderingCheck1Code>>() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "481"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingStatus";
			definition = "Status of an identity check to prevent money laundering.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MoneyLaunderingCheck1Code.mmObject();
		}

		@Override
		public Optional<MoneyLaunderingCheck1Code> getValue(OrderParameters1 obj) {
			return obj.getMoneyLaunderingStatus();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<MoneyLaunderingCheck1Code> value) {
			obj.setMoneyLaunderingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "RptgInd")
	protected Reporting1Code reportingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Reporting1Code
	 * Reporting1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmReportingType
	 * SecuritiesTradeExecution.mmReportingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a trade is to be reported to a third party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: Seq C1/22A/RPOR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<Reporting1Code>> mmReportingIndicator = new MMMessageAttribute<OrderParameters1, Optional<Reporting1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmReportingType;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "RptgInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "Seq C1/22A/RPOR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingIndicator";
			definition = "Specifies that a trade is to be reported to a third party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Reporting1Code.mmObject();
		}

		@Override
		public Optional<Reporting1Code> getValue(OrderParameters1 obj) {
			return obj.getReportingIndicator();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<Reporting1Code> value) {
			obj.setReportingIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtyTp")
	protected Priority1Code priorityType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority1Code
	 * Priority1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPriorityIndicator
	 * SecuritiesOrderParameters.mmPriorityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtyTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the execution priority of the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: Seq C1/22A/PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<Priority1Code>> mmPriorityType = new MMMessageAttribute<OrderParameters1, Optional<Priority1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmPriorityIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "PrtyTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "Seq C1/22A/PRIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityType";
			definition = "Indicates the execution priority of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority1Code.mmObject();
		}

		@Override
		public Optional<Priority1Code> getValue(OrderParameters1 obj) {
			return obj.getPriorityType();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<Priority1Code> value) {
			obj.setPriorityType(value.orElse(null));
		}
	};
	@XmlElement(name = "TradTxCondInd")
	protected List<TradeTransactionCondition1Code> tradeTransactionConditionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
	 * SecuritiesTrade.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradTxCondInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionConditionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: Seq C1/22A/TTCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, List<TradeTransactionCondition1Code>> mmTradeTransactionConditionIndicator = new MMMessageAttribute<OrderParameters1, List<TradeTransactionCondition1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "TradTxCondInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "Seq C1/22A/TTCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionConditionIndicator";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			minOccurs = 0;
			simpleType_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}

		@Override
		public List<TradeTransactionCondition1Code> getValue(OrderParameters1 obj) {
			return obj.getTradeTransactionConditionIndicator();
		}

		@Override
		public void setValue(OrderParameters1 obj, List<TradeTransactionCondition1Code> value) {
			obj.setTradeTransactionConditionIndicator(value);
		}
	};
	@XmlElement(name = "AutoRtgInd")
	protected AutoRouting1Code autoRoutingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AutoRouting1Code
	 * AutoRouting1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmAutoRouting
	 * SecuritiesOrderParameters.mmAutoRouting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutoRtgInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoRoutingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an automatic routing system is involved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<AutoRouting1Code>> mmAutoRoutingIndicator = new MMMessageAttribute<OrderParameters1, Optional<AutoRouting1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmAutoRouting;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "AutoRtgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoRoutingIndicator";
			definition = "Indicates whether an automatic routing system is involved.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AutoRouting1Code.mmObject();
		}

		@Override
		public Optional<AutoRouting1Code> getValue(OrderParameters1 obj) {
			return obj.getAutoRoutingIndicator();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<AutoRouting1Code> value) {
			obj.setAutoRoutingIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PricPrtcnScp")
	protected PriceProtectionScope1Code priceProtectionScope;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope1Code
	 * PriceProtectionScope1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmScope
	 * Discretion.mmScope}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricPrtcnScp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceProtectionScope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the type of price protection the customer requires on their order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1092</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<PriceProtectionScope1Code>> mmPriceProtectionScope = new MMMessageAttribute<OrderParameters1, Optional<PriceProtectionScope1Code>>() {
		{
			businessElementTrace_lazy = () -> Discretion.mmScope;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "PricPrtcnScp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1092"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceProtectionScope";
			definition = "Defines the type of price protection the customer requires on their order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PriceProtectionScope1Code.mmObject();
		}

		@Override
		public Optional<PriceProtectionScope1Code> getValue(OrderParameters1 obj) {
			return obj.getPriceProtectionScope();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<PriceProtectionScope1Code> value) {
			obj.setPriceProtectionScope(value.orElse(null));
		}
	};
	@XmlElement(name = "StopPric")
	protected Price1 stopPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStopPrice
	 * SecuritiesOrder.mmStopPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StopPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price per unit of quantity (e.g. per share)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 99</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<Price1>> mmStopPrice = new MMMessageAttribute<OrderParameters1, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmStopPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "StopPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "99"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopPrice";
			definition = "Price per unit of quantity (e.g. per share).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(OrderParameters1 obj) {
			return obj.getStopPrice();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<Price1> value) {
			obj.setStopPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "TrgtStrtgy")
	protected Max35Text targetStrategy;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtStrtgy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetStrategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The target strategy of the order. Specifies the type of trading or algorithm strategy (code that was used to generate the order). This has to be used with the StrategyParametersGrp block to make any sense."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 847</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<Max35Text>> mmTargetStrategy = new MMMessageAttribute<OrderParameters1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "TrgtStrtgy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "847"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetStrategy";
			definition = "The target strategy of the order. Specifies the type of trading or algorithm strategy (code that was used to generate the order). This has to be used with the StrategyParametersGrp block to make any sense.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OrderParameters1 obj) {
			return obj.getTargetStrategy();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<Max35Text> value) {
			obj.setTargetStrategy(value.orElse(null));
		}
	};
	@XmlElement(name = "CmplcId")
	protected Max35Text complianceIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmComplianceIdentification
	 * SecuritiesTradeIdentification.mmComplianceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmplcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplianceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used to represent this transaction for compliance purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 376</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<Max35Text>> mmComplianceIdentification = new MMMessageAttribute<OrderParameters1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmComplianceIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "CmplcId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "376"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComplianceIdentification";
			definition = "Identification used to represent this transaction for compliance purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OrderParameters1 obj) {
			return obj.getComplianceIdentification();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<Max35Text> value) {
			obj.setComplianceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PreTradAnmtyInd")
	protected YesNoIndicator preTradeAnonymityIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreTradeAnonymity
	 * SecuritiesOrderParameters.mmPreTradeAnonymity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreTradAnmtyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreTradeAnonymityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds. Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds. Disclosure is relevant when counterparties are not normally visible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1091</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<YesNoIndicator>> mmPreTradeAnonymityIndicator = new MMMessageAttribute<OrderParameters1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmPreTradeAnonymity;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "PreTradAnmtyInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1091"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreTradeAnonymityIndicator";
			definition = "Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds. Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds. Disclosure is relevant when counterparties are not normally visible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(OrderParameters1 obj) {
			return obj.getPreTradeAnonymityIndicator();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<YesNoIndicator> value) {
			obj.setPreTradeAnonymityIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "GoodTillBookg")
	protected GoodTillBookingInstruction1Code goodTillBooking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstruction1Code
	 * GoodTillBookingInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmGoodTillBooking
	 * SecuritiesOrderParameters.mmGoodTillBooking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GoodTillBookg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodTillBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For partially good till orders, the specification of whether to book each execution, or to accumulate the executions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 427</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<GoodTillBookingInstruction1Code>> mmGoodTillBooking = new MMMessageAttribute<OrderParameters1, Optional<GoodTillBookingInstruction1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmGoodTillBooking;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "GoodTillBookg";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "427"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodTillBooking";
			definition = "For partially good till orders, the specification of whether to book each execution, or to accumulate the executions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GoodTillBookingInstruction1Code.mmObject();
		}

		@Override
		public Optional<GoodTillBookingInstruction1Code> getValue(OrderParameters1 obj) {
			return obj.getGoodTillBooking();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<GoodTillBookingInstruction1Code> value) {
			obj.setGoodTillBooking(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcCd")
	protected CommissionType8Code processCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType8Code
	 * CommissionType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmProcessCode
	 * SecuritiesOrderParameters.mmProcessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used to identify soft trades at order entry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 81</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderParameters1, Optional<CommissionType8Code>> mmProcessCode = new MMMessageAttribute<OrderParameters1, Optional<CommissionType8Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmProcessCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "PrcCd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "81"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessCode";
			definition = "Used to identify soft trades at order entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CommissionType8Code.mmObject();
		}

		@Override
		public Optional<CommissionType8Code> getValue(OrderParameters1 obj) {
			return obj.getProcessCode();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<CommissionType8Code> value) {
			obj.setProcessCode(value.orElse(null));
		}
	};
	@XmlElement(name = "PegInstrsDtls")
	protected PegOrderInstructions1 pegInstructionsDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPegInstructions
	 * SecuritiesOrderParameters.mmPegInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PegInstrsDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PegInstructionsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the peg instructions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderParameters1, Optional<PegOrderInstructions1>> mmPegInstructionsDetails = new MMMessageAssociationEnd<OrderParameters1, Optional<PegOrderInstructions1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmPegInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "PegInstrsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PegInstructionsDetails";
			definition = "Provides details about the peg instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PegOrderInstructions1.mmObject();
		}

		@Override
		public Optional<PegOrderInstructions1> getValue(OrderParameters1 obj) {
			return obj.getPegInstructionsDetails();
		}

		@Override
		public void setValue(OrderParameters1 obj, Optional<PegOrderInstructions1> value) {
			obj.setPegInstructionsDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderParameters1.mmTimeInForce, com.tools20022.repository.msg.OrderParameters1.mmType,
						com.tools20022.repository.msg.OrderParameters1.mmExpiryDateAndTime, com.tools20022.repository.msg.OrderParameters1.mmEffectiveDateAndTime, com.tools20022.repository.msg.OrderParameters1.mmHandlingInstruction,
						com.tools20022.repository.msg.OrderParameters1.mmStockLocateRequiredIndicator, com.tools20022.repository.msg.OrderParameters1.mmMoneyLaunderingStatus,
						com.tools20022.repository.msg.OrderParameters1.mmReportingIndicator, com.tools20022.repository.msg.OrderParameters1.mmPriorityType,
						com.tools20022.repository.msg.OrderParameters1.mmTradeTransactionConditionIndicator, com.tools20022.repository.msg.OrderParameters1.mmAutoRoutingIndicator,
						com.tools20022.repository.msg.OrderParameters1.mmPriceProtectionScope, com.tools20022.repository.msg.OrderParameters1.mmStopPrice, com.tools20022.repository.msg.OrderParameters1.mmTargetStrategy,
						com.tools20022.repository.msg.OrderParameters1.mmComplianceIdentification, com.tools20022.repository.msg.OrderParameters1.mmPreTradeAnonymityIndicator,
						com.tools20022.repository.msg.OrderParameters1.mmGoodTillBooking, com.tools20022.repository.msg.OrderParameters1.mmProcessCode, com.tools20022.repository.msg.OrderParameters1.mmPegInstructionsDetails);
				trace_lazy = () -> SecuritiesOrderParameters.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintHandlingInstructionForEquityGuideline.forOrderParameters1,
						com.tools20022.repository.constraints.ConstraintTypeAndFixedIncomeGuideline.forOrderParameters1, com.tools20022.repository.constraints.ConstraintTimeInForceAndExpiryDateAndTimeRule.forOrderParameters1,
						com.tools20022.repository.constraints.ConstraintStockLocateRequiredRule.forOrderParameters1, com.tools20022.repository.constraints.ConstraintStopPrice.forOrderParameters1,
						com.tools20022.repository.constraints.ConstraintPegOrderDetails.forOrderParameters1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrderParameters1";
				definition = "Parameters of the transfer of a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ExecutionTimeLimit1Code> getTimeInForce() {
		return timeInForce == null ? Optional.empty() : Optional.of(timeInForce);
	}

	public OrderParameters1 setTimeInForce(ExecutionTimeLimit1Code timeInForce) {
		this.timeInForce = timeInForce;
		return this;
	}

	public OrderType1Code getType() {
		return type;
	}

	public OrderParameters1 setType(OrderType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<ISODateTime> getExpiryDateAndTime() {
		return expiryDateAndTime == null ? Optional.empty() : Optional.of(expiryDateAndTime);
	}

	public OrderParameters1 setExpiryDateAndTime(ISODateTime expiryDateAndTime) {
		this.expiryDateAndTime = expiryDateAndTime;
		return this;
	}

	public Optional<ISODateTime> getEffectiveDateAndTime() {
		return effectiveDateAndTime == null ? Optional.empty() : Optional.of(effectiveDateAndTime);
	}

	public OrderParameters1 setEffectiveDateAndTime(ISODateTime effectiveDateAndTime) {
		this.effectiveDateAndTime = effectiveDateAndTime;
		return this;
	}

	public Optional<TradingFloorOrderHandling1Code> getHandlingInstruction() {
		return handlingInstruction == null ? Optional.empty() : Optional.of(handlingInstruction);
	}

	public OrderParameters1 setHandlingInstruction(TradingFloorOrderHandling1Code handlingInstruction) {
		this.handlingInstruction = handlingInstruction;
		return this;
	}

	public Optional<YesNoIndicator> getStockLocateRequiredIndicator() {
		return stockLocateRequiredIndicator == null ? Optional.empty() : Optional.of(stockLocateRequiredIndicator);
	}

	public OrderParameters1 setStockLocateRequiredIndicator(YesNoIndicator stockLocateRequiredIndicator) {
		this.stockLocateRequiredIndicator = stockLocateRequiredIndicator;
		return this;
	}

	public Optional<MoneyLaunderingCheck1Code> getMoneyLaunderingStatus() {
		return moneyLaunderingStatus == null ? Optional.empty() : Optional.of(moneyLaunderingStatus);
	}

	public OrderParameters1 setMoneyLaunderingStatus(MoneyLaunderingCheck1Code moneyLaunderingStatus) {
		this.moneyLaunderingStatus = moneyLaunderingStatus;
		return this;
	}

	public Optional<Reporting1Code> getReportingIndicator() {
		return reportingIndicator == null ? Optional.empty() : Optional.of(reportingIndicator);
	}

	public OrderParameters1 setReportingIndicator(Reporting1Code reportingIndicator) {
		this.reportingIndicator = reportingIndicator;
		return this;
	}

	public Optional<Priority1Code> getPriorityType() {
		return priorityType == null ? Optional.empty() : Optional.of(priorityType);
	}

	public OrderParameters1 setPriorityType(Priority1Code priorityType) {
		this.priorityType = priorityType;
		return this;
	}

	public List<TradeTransactionCondition1Code> getTradeTransactionConditionIndicator() {
		return tradeTransactionConditionIndicator == null ? tradeTransactionConditionIndicator = new ArrayList<>() : tradeTransactionConditionIndicator;
	}

	public OrderParameters1 setTradeTransactionConditionIndicator(List<TradeTransactionCondition1Code> tradeTransactionConditionIndicator) {
		this.tradeTransactionConditionIndicator = Objects.requireNonNull(tradeTransactionConditionIndicator);
		return this;
	}

	public Optional<AutoRouting1Code> getAutoRoutingIndicator() {
		return autoRoutingIndicator == null ? Optional.empty() : Optional.of(autoRoutingIndicator);
	}

	public OrderParameters1 setAutoRoutingIndicator(AutoRouting1Code autoRoutingIndicator) {
		this.autoRoutingIndicator = autoRoutingIndicator;
		return this;
	}

	public Optional<PriceProtectionScope1Code> getPriceProtectionScope() {
		return priceProtectionScope == null ? Optional.empty() : Optional.of(priceProtectionScope);
	}

	public OrderParameters1 setPriceProtectionScope(PriceProtectionScope1Code priceProtectionScope) {
		this.priceProtectionScope = priceProtectionScope;
		return this;
	}

	public Optional<Price1> getStopPrice() {
		return stopPrice == null ? Optional.empty() : Optional.of(stopPrice);
	}

	public OrderParameters1 setStopPrice(Price1 stopPrice) {
		this.stopPrice = stopPrice;
		return this;
	}

	public Optional<Max35Text> getTargetStrategy() {
		return targetStrategy == null ? Optional.empty() : Optional.of(targetStrategy);
	}

	public OrderParameters1 setTargetStrategy(Max35Text targetStrategy) {
		this.targetStrategy = targetStrategy;
		return this;
	}

	public Optional<Max35Text> getComplianceIdentification() {
		return complianceIdentification == null ? Optional.empty() : Optional.of(complianceIdentification);
	}

	public OrderParameters1 setComplianceIdentification(Max35Text complianceIdentification) {
		this.complianceIdentification = complianceIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getPreTradeAnonymityIndicator() {
		return preTradeAnonymityIndicator == null ? Optional.empty() : Optional.of(preTradeAnonymityIndicator);
	}

	public OrderParameters1 setPreTradeAnonymityIndicator(YesNoIndicator preTradeAnonymityIndicator) {
		this.preTradeAnonymityIndicator = preTradeAnonymityIndicator;
		return this;
	}

	public Optional<GoodTillBookingInstruction1Code> getGoodTillBooking() {
		return goodTillBooking == null ? Optional.empty() : Optional.of(goodTillBooking);
	}

	public OrderParameters1 setGoodTillBooking(GoodTillBookingInstruction1Code goodTillBooking) {
		this.goodTillBooking = goodTillBooking;
		return this;
	}

	public Optional<CommissionType8Code> getProcessCode() {
		return processCode == null ? Optional.empty() : Optional.of(processCode);
	}

	public OrderParameters1 setProcessCode(CommissionType8Code processCode) {
		this.processCode = processCode;
		return this;
	}

	public Optional<PegOrderInstructions1> getPegInstructionsDetails() {
		return pegInstructionsDetails == null ? Optional.empty() : Optional.of(pegInstructionsDetails);
	}

	public OrderParameters1 setPegInstructionsDetails(PegOrderInstructions1 pegInstructionsDetails) {
		this.pegInstructionsDetails = pegInstructionsDetails;
		return this;
	}
}
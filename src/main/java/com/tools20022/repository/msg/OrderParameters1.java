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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters of the transfer of a financial instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OrderParameters1", propOrder = {"timeInForce", "type", "expiryDateAndTime", "effectiveDateAndTime", "handlingInstruction", "stockLocateRequiredIndicator", "moneyLaunderingStatus", "reportingIndicator", "priorityType",
		"tradeTransactionConditionIndicator", "autoRoutingIndicator", "priceProtectionScope", "stopPrice", "targetStrategy", "complianceIdentification", "preTradeAnonymityIndicator", "goodTillBooking", "processCode",
		"pegInstructionsDetails"})
public class OrderParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ExecutionTimeLimit1Code timeInForce;
	/**
	 * Indicates from/until when an order must be executed.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeInForce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates from/until when an order must be executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTimeInForce = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmExecutionTimeLimit;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "TmInForce";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeInForce";
			definition = "Indicates from/until when an order must be executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}
	};
	protected OrderType1Code type;
	/**
	 * Indicates the type of instruction to a broker or dealer to buy or sell a
	 * financial instrument.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmType;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderType1Code.mmObject();
		}
	};
	protected ISODateTime expiryDateAndTime;
	/**
	 * Date/time on which the order is to expire.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time on which the order is to expire."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDateAndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderExpiryDate;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "XpryDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "Date/time on which the order is to expire.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime effectiveDateAndTime;
	/**
	 * Date/time on which the order is effective.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time on which the order is effective."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveDateAndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderEffectiveDate;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "FctvDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateAndTime";
			definition = "Date/time on which the order is effective.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected TradingFloorOrderHandling1Code handlingInstruction;
	/**
	 * Specifies instructions for order handling on the broker trading floor.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HandlingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies instructions for order handling on the broker trading floor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHandlingInstruction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmOrderHandlingInstruction;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "HdlgInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HandlingInstruction";
			definition = "Specifies instructions for order handling on the broker trading floor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingFloorOrderHandling1Code.mmObject();
		}
	};
	protected YesNoIndicator stockLocateRequiredIndicator;
	/**
	 * Indicates whether the broker is to locate the stock in conjunction with a
	 * short sell order. This information is mandatory in case of short sales.
	 * When executed, the report will then mention the securities location.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmStockLocateRequired
	 * SecuritiesOrderParameters.mmStockLocateRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockLctReqrdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLocateRequiredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the broker is to locate the stock in conjunction with a short sell order.\nThis information is mandatory in case of short sales. When executed, the report will then mention the securities location."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStockLocateRequiredIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmStockLocateRequired;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "StockLctReqrdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLocateRequiredIndicator";
			definition = "Indicates whether the broker is to locate the stock in conjunction with a short sell order.\nThis information is mandatory in case of short sales. When executed, the report will then mention the securities location.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected MoneyLaunderingCheck1Code moneyLaunderingStatus;
	/**
	 * Status of an identity check to prevent money laundering.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an identity check to prevent money laundering."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMoneyLaunderingStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingStatus";
			definition = "Status of an identity check to prevent money laundering.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MoneyLaunderingCheck1Code.mmObject();
		}
	};
	protected Reporting1Code reportingIndicator;
	/**
	 * Specifies that a trade is to be reported to a third party.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a trade is to be reported to a third party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportingIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmReportingType;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "RptgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingIndicator";
			definition = "Specifies that a trade is to be reported to a third party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Reporting1Code.mmObject();
		}
	};
	protected Priority1Code priorityType;
	/**
	 * Indicates the execution priority of the trade.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the execution priority of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriorityType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmPriorityIndicator;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "PrtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityType";
			definition = "Indicates the execution priority of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority1Code.mmObject();
		}
	};
	protected List<TradeTransactionCondition1Code> tradeTransactionConditionIndicator;
	/**
	 * Indicates the conditions under which the order/trade is to be/was
	 * executed.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionConditionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeTransactionConditionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "TradTxCondInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionConditionIndicator";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			minOccurs = 0;
			simpleType_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	protected AutoRouting1Code autoRoutingIndicator;
	/**
	 * Indicates whether an automatic routing system is involved.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoRoutingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an automatic routing system is involved."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAutoRoutingIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmAutoRouting;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "AutoRtgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoRoutingIndicator";
			definition = "Indicates whether an automatic routing system is involved.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AutoRouting1Code.mmObject();
		}
	};
	protected PriceProtectionScope1Code priceProtectionScope;
	/**
	 * Defines the type of price protection the customer requires on their
	 * order.
	 * <p>
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
			businessElementTrace_lazy = () -> Discretion.mmScope;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "PricPrtcnScp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceProtectionScope";
			definition = "Defines the type of price protection the customer requires on their order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PriceProtectionScope1Code.mmObject();
		}
	};
	protected Price1 stopPrice;
	/**
	 * Price per unit of quantity (e.g. per share).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price per unit of quantity (e.g. per share)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStopPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmStopPrice;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "StopPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopPrice";
			definition = "Price per unit of quantity (e.g. per share).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected Max35Text targetStrategy;
	/**
	 * The target strategy of the order. Specifies the type of trading or
	 * algorithm strategy (code that was used to generate the order). This has
	 * to be used with the StrategyParametersGrp block to make any sense.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetStrategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The target strategy of the order. Specifies the type of trading or algorithm strategy (code that was used to generate the order). This has to be used with the StrategyParametersGrp block to make any sense."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTargetStrategy = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "TrgtStrtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetStrategy";
			definition = "The target strategy of the order. Specifies the type of trading or algorithm strategy (code that was used to generate the order). This has to be used with the StrategyParametersGrp block to make any sense.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text complianceIdentification;
	/**
	 * Identification used to represent this transaction for compliance
	 * purposes.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplianceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used to represent this transaction for compliance purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmComplianceIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmComplianceIdentification;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "CmplcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComplianceIdentification";
			definition = "Identification used to represent this transaction for compliance purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected YesNoIndicator preTradeAnonymityIndicator;
	/**
	 * Allows trader to explicitly request anonymity or disclosure in pre-trade
	 * market data feeds. Anonymity is relevant in markets where counterparties
	 * are regularly disclosed in order depth feeds. Disclosure is relevant when
	 * counterparties are not normally visible.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreTradeAnonymity
	 * SecuritiesOrderParameters.mmPreTradeAnonymity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1
	 * OrderParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreTradAnmtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreTradeAnonymityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds. Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds. Disclosure is relevant when counterparties are not normally visible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreTradeAnonymityIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmPreTradeAnonymity;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "PreTradAnmtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreTradeAnonymityIndicator";
			definition = "Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds. Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds. Disclosure is relevant when counterparties are not normally visible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected GoodTillBookingInstruction1Code goodTillBooking;
	/**
	 * For partially good till orders, the specification of whether to book each
	 * execution, or to accumulate the executions.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodTillBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For partially good till orders, the specification of whether to book each execution, or to accumulate the executions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGoodTillBooking = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmGoodTillBooking;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "GoodTillBookg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodTillBooking";
			definition = "For partially good till orders, the specification of whether to book each execution, or to accumulate the executions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GoodTillBookingInstruction1Code.mmObject();
		}
	};
	protected CommissionType8Code processCode;
	/**
	 * Used to identify soft trades at order entry.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Used to identify soft trades at order entry."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmProcessCode;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "PrcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessCode";
			definition = "Used to identify soft trades at order entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CommissionType8Code.mmObject();
		}
	};
	protected PegOrderInstructions1 pegInstructionsDetails;
	/**
	 * Provides details about the peg instructions.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PegInstructionsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the peg instructions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPegInstructionsDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmPegInstructions;
			componentContext_lazy = () -> OrderParameters1.mmObject();
			isDerived = false;
			xmlTag = "PegInstrsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PegInstructionsDetails";
			definition = "Provides details about the peg instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PegOrderInstructions1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OrderParameters1.mmTimeInForce, OrderParameters1.mmType, OrderParameters1.mmExpiryDateAndTime, OrderParameters1.mmEffectiveDateAndTime, OrderParameters1.mmHandlingInstruction,
						OrderParameters1.mmStockLocateRequiredIndicator, OrderParameters1.mmMoneyLaunderingStatus, OrderParameters1.mmReportingIndicator, OrderParameters1.mmPriorityType,
						OrderParameters1.mmTradeTransactionConditionIndicator, OrderParameters1.mmAutoRoutingIndicator, OrderParameters1.mmPriceProtectionScope, OrderParameters1.mmStopPrice, OrderParameters1.mmTargetStrategy,
						OrderParameters1.mmComplianceIdentification, OrderParameters1.mmPreTradeAnonymityIndicator, OrderParameters1.mmGoodTillBooking, OrderParameters1.mmProcessCode, OrderParameters1.mmPegInstructionsDetails);
				trace_lazy = () -> SecuritiesOrderParameters.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrderParameters1";
				definition = "Parameters of the transfer of a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TmInForce")
	public ExecutionTimeLimit1Code getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(ExecutionTimeLimit1Code timeInForce) {
		this.timeInForce = timeInForce;
	}

	@XmlElement(name = "Tp", required = true)
	public OrderType1Code getType() {
		return type;
	}

	public void setType(OrderType1Code type) {
		this.type = type;
	}

	@XmlElement(name = "XpryDtAndTm")
	public ISODateTime getExpiryDateAndTime() {
		return expiryDateAndTime;
	}

	public void setExpiryDateAndTime(ISODateTime expiryDateAndTime) {
		this.expiryDateAndTime = expiryDateAndTime;
	}

	@XmlElement(name = "FctvDtAndTm")
	public ISODateTime getEffectiveDateAndTime() {
		return effectiveDateAndTime;
	}

	public void setEffectiveDateAndTime(ISODateTime effectiveDateAndTime) {
		this.effectiveDateAndTime = effectiveDateAndTime;
	}

	@XmlElement(name = "HdlgInstr")
	public TradingFloorOrderHandling1Code getHandlingInstruction() {
		return handlingInstruction;
	}

	public void setHandlingInstruction(TradingFloorOrderHandling1Code handlingInstruction) {
		this.handlingInstruction = handlingInstruction;
	}

	@XmlElement(name = "StockLctReqrdInd")
	public YesNoIndicator getStockLocateRequiredIndicator() {
		return stockLocateRequiredIndicator;
	}

	public void setStockLocateRequiredIndicator(YesNoIndicator stockLocateRequiredIndicator) {
		this.stockLocateRequiredIndicator = stockLocateRequiredIndicator;
	}

	@XmlElement(name = "MnyLndrgSts")
	public MoneyLaunderingCheck1Code getMoneyLaunderingStatus() {
		return moneyLaunderingStatus;
	}

	public void setMoneyLaunderingStatus(MoneyLaunderingCheck1Code moneyLaunderingStatus) {
		this.moneyLaunderingStatus = moneyLaunderingStatus;
	}

	@XmlElement(name = "RptgInd")
	public Reporting1Code getReportingIndicator() {
		return reportingIndicator;
	}

	public void setReportingIndicator(Reporting1Code reportingIndicator) {
		this.reportingIndicator = reportingIndicator;
	}

	@XmlElement(name = "PrtyTp")
	public Priority1Code getPriorityType() {
		return priorityType;
	}

	public void setPriorityType(Priority1Code priorityType) {
		this.priorityType = priorityType;
	}

	@XmlElement(name = "TradTxCondInd")
	public List<TradeTransactionCondition1Code> getTradeTransactionConditionIndicator() {
		return tradeTransactionConditionIndicator;
	}

	public void setTradeTransactionConditionIndicator(List<TradeTransactionCondition1Code> tradeTransactionConditionIndicator) {
		this.tradeTransactionConditionIndicator = tradeTransactionConditionIndicator;
	}

	@XmlElement(name = "AutoRtgInd")
	public AutoRouting1Code getAutoRoutingIndicator() {
		return autoRoutingIndicator;
	}

	public void setAutoRoutingIndicator(AutoRouting1Code autoRoutingIndicator) {
		this.autoRoutingIndicator = autoRoutingIndicator;
	}

	@XmlElement(name = "PricPrtcnScp")
	public PriceProtectionScope1Code getPriceProtectionScope() {
		return priceProtectionScope;
	}

	public void setPriceProtectionScope(PriceProtectionScope1Code priceProtectionScope) {
		this.priceProtectionScope = priceProtectionScope;
	}

	@XmlElement(name = "StopPric")
	public Price1 getStopPrice() {
		return stopPrice;
	}

	public void setStopPrice(com.tools20022.repository.msg.Price1 stopPrice) {
		this.stopPrice = stopPrice;
	}

	@XmlElement(name = "TrgtStrtgy")
	public Max35Text getTargetStrategy() {
		return targetStrategy;
	}

	public void setTargetStrategy(Max35Text targetStrategy) {
		this.targetStrategy = targetStrategy;
	}

	@XmlElement(name = "CmplcId")
	public Max35Text getComplianceIdentification() {
		return complianceIdentification;
	}

	public void setComplianceIdentification(Max35Text complianceIdentification) {
		this.complianceIdentification = complianceIdentification;
	}

	@XmlElement(name = "PreTradAnmtyInd")
	public YesNoIndicator getPreTradeAnonymityIndicator() {
		return preTradeAnonymityIndicator;
	}

	public void setPreTradeAnonymityIndicator(YesNoIndicator preTradeAnonymityIndicator) {
		this.preTradeAnonymityIndicator = preTradeAnonymityIndicator;
	}

	@XmlElement(name = "GoodTillBookg")
	public GoodTillBookingInstruction1Code getGoodTillBooking() {
		return goodTillBooking;
	}

	public void setGoodTillBooking(GoodTillBookingInstruction1Code goodTillBooking) {
		this.goodTillBooking = goodTillBooking;
	}

	@XmlElement(name = "PrcCd")
	public CommissionType8Code getProcessCode() {
		return processCode;
	}

	public void setProcessCode(CommissionType8Code processCode) {
		this.processCode = processCode;
	}

	@XmlElement(name = "PegInstrsDtls")
	public PegOrderInstructions1 getPegInstructionsDetails() {
		return pegInstructionsDetails;
	}

	public void setPegInstructionsDetails(com.tools20022.repository.msg.PegOrderInstructions1 pegInstructionsDetails) {
		this.pegInstructionsDetails = pegInstructionsDetails;
	}
}
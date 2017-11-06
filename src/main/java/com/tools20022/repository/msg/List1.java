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
import com.tools20022.repository.codeset.BidType1Code;
import com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.ListTrading;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides the details for negotiating and trading a large number of securities
 * contained in or comprising a portfolio.
 * 
 * One example is index arbitrage, which consists in the purchase or sale of a
 * basket of stocks in conjunction with the sale or purchase of a derivative
 * product (for example index futures) to profit from price differences between
 * the basket and the derivative product.
 * 
 * Other examples include liquidation of EFP (Exchange for Physical) stock
 * positions, portfolio realignment and portfolio liquidation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.List1#mmListIdentification
 * List1.mmListIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List1#mmNumberOfListOrders
 * List1.mmNumberOfListOrders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.List1#mmTotalNumberOfListOrders
 * List1.mmTotalNumberOfListOrders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.List1#mmImmediateExecutionIndicator
 * List1.mmImmediateExecutionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List1#mmExecutionInstruction
 * List1.mmExecutionInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.List1#mmProgressReportIndicator
 * List1.mmProgressReportIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List1#mmProgressPeriodInterval
 * List1.mmProgressPeriodInterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.List1#mmRealTimeExecutionReportIndicator
 * List1.mmRealTimeExecutionReportIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List1#mmBidType
 * List1.mmBidType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List1#mmMoneyLaunderingStatus
 * List1.mmMoneyLaunderingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.List1#mmAllowableOneSidednessPercent
 * List1.mmAllowableOneSidednessPercent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.List1#mmAllowableOneSidednessValue
 * List1.mmAllowableOneSidednessValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.List1#mmOrderDetails
 * List1.mmOrderDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ListTrading
 * ListTrading}</li>
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
 * "List1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation."
 * </li>
 * </ul>
 */
public class List1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text listIdentification;
	/**
	 * Unique identifier for a list, as assigned by the trading party. The
	 * identifier must be unique within a single trading day.
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListIdentification
	 * ListTrading.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ListTrading.mmListIdentification;
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "ListId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Number numberOfListOrders;
	/**
	 * Identifies the number of orders in this message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfListOrdrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfListOrders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the number of orders in this message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfListOrders = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "NbOfListOrdrs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfListOrders";
			definition = "Identifies the number of orders in this message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number totalNumberOfListOrders;
	/**
	 * Identifies the total number of orders across all ListOrder messages with
	 * the same ListIdentification. It should be the sum of all
	 * NumberOfListOrders in each ListOrder message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfListOrdrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfListOrders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the total number of orders across all ListOrder messages with the same ListIdentification. It should be the sum of all NumberOfListOrders in each ListOrder message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfListOrders = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfListOrdrs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfListOrders";
			definition = "Identifies the total number of orders across all ListOrder messages with the same ListIdentification. It should be the sum of all NumberOfListOrders in each ListOrder message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected YesNoIndicator immediateExecutionIndicator;
	/**
	 * Indicates whether the list order should be immediately executed or not.
	 * Yes means immediate No means wait for a ListExecution or phone call
	 * before proceeding with execution of the list order.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ImdtExctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImmediateExecutionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the list order should be immediately executed or not.\nYes means immediate\nNo means wait for a ListExecution or phone call before proceeding with execution of the list order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmImmediateExecutionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "ImdtExctnInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateExecutionIndicator";
			definition = "Indicates whether the list order should be immediately executed or not.\nYes means immediate\nNo means wait for a ListExecution or phone call before proceeding with execution of the list order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max140Text executionInstruction;
	/**
	 * Additional list handling or execution instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional list handling or execution instructions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutionInstruction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "ExctnInstr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionInstruction";
			definition = "Additional list handling or execution instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected YesNoIndicator progressReportIndicator;
	/**
	 * Indicates the request to receive a report on the progress of the order or
	 * not. Yes means to receive periodical ListStatus No means no request to
	 * receive periodical ListStatus, they will be requested by a StatusRequest.
	 * However, a ListStatus with status 'done' could be sent in an unsolicited
	 * fashion.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrgrsRptInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgressReportIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the request to receive a report on the progress of the order or not.\nYes means to receive periodical ListStatus\nNo means no request to receive periodical ListStatus, they will be requested by a StatusRequest. However, a ListStatus with status 'done' could be sent in an unsolicited fashion."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProgressReportIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "PrgrsRptInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressReportIndicator";
			definition = "Indicates the request to receive a report on the progress of the order or not.\nYes means to receive periodical ListStatus\nNo means no request to receive periodical ListStatus, they will be requested by a StatusRequest. However, a ListStatus with status 'done' could be sent in an unsolicited fashion.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISOTime progressPeriodInterval;
	/**
	 * Identifies the interval period in minutes between each ListStatus you
	 * wish to receive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrgrsPrdIntrvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgressPeriodInterval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the interval period in minutes between each ListStatus you wish to receive."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProgressPeriodInterval = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "PrgrsPrdIntrvl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressPeriodInterval";
			definition = "Identifies the interval period in minutes between each ListStatus you wish to receive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	protected YesNoIndicator realTimeExecutionReportIndicator;
	/**
	 * Identifies the request to receive a real time execution report.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RealTmExctnRptInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealTimeExecutionReportIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the request to receive a real time execution report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRealTimeExecutionReportIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "RealTmExctnRptInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealTimeExecutionReportIndicator";
			definition = "Identifies the request to receive a real time execution report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected BidType1Code bidType;
	/**
	 * Indicates if the list order is related to a "Non disclosed"or "Disclosed"
	 * bid or to no bid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.BidType1Code
	 * BidType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmBidType
	 * ListTrading.mmBidType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the list order is related to a \"Non disclosed\"or \"Disclosed\" bid or to no bid."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ListTrading.mmBidType;
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "BidTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidType";
			definition = "Indicates if the list order is related to a \"Non disclosed\"or \"Disclosed\" bid or to no bid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BidType1Code.mmObject();
		}
	};
	protected OldMoneyLaunderingCheck1Code moneyLaunderingStatus;
	/**
	 * Provides the status of an identity check to prevent money laundering.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code
	 * OldMoneyLaunderingCheck1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
	 * Party.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
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
	 * definition} =
	 * "Provides the status of an identity check to prevent money laundering."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMoneyLaunderingStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingStatus";
			definition = "Provides the status of an identity check to prevent money laundering.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OldMoneyLaunderingCheck1Code.mmObject();
		}
	};
	protected PercentageRate allowableOneSidednessPercent;
	/**
	 * The maximum percentage that execution of one side of a program trade can
	 * exceed execution of the other.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwblOneSddnsPct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowableOneSidednessPercent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The maximum percentage that execution of one side of a program trade can exceed execution of the other."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllowableOneSidednessPercent = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "AllwblOneSddnsPct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowableOneSidednessPercent";
			definition = "The maximum percentage that execution of one side of a program trade can exceed execution of the other.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount allowableOneSidednessValue;
	/**
	 * The maximum amount (expressed in currency) that execution of one side of
	 * a program trade can exceed execution of the other.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwblOneSddnsVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowableOneSidednessValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The maximum amount (expressed in currency) that execution of one side of a program trade can exceed execution of the other."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllowableOneSidednessValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "AllwblOneSddnsVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowableOneSidednessValue";
			definition = "The maximum amount (expressed in currency) that execution of one side of a program trade can exceed execution of the other.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Order6> orderDetails;
	/**
	 * The intention to transfer an ownership of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Order6 Order6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmSecuritiesListOrder
	 * ListTrading.mmSecuritiesListOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The intention to transfer an ownership of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ListTrading.mmSecuritiesListOrder;
			componentContext_lazy = () -> List1.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetails";
			definition = "The intention to transfer an ownership of a financial instrument.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Order6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.List1.mmListIdentification, com.tools20022.repository.msg.List1.mmNumberOfListOrders, com.tools20022.repository.msg.List1.mmTotalNumberOfListOrders,
						com.tools20022.repository.msg.List1.mmImmediateExecutionIndicator, com.tools20022.repository.msg.List1.mmExecutionInstruction, com.tools20022.repository.msg.List1.mmProgressReportIndicator,
						com.tools20022.repository.msg.List1.mmProgressPeriodInterval, com.tools20022.repository.msg.List1.mmRealTimeExecutionReportIndicator, com.tools20022.repository.msg.List1.mmBidType,
						com.tools20022.repository.msg.List1.mmMoneyLaunderingStatus, com.tools20022.repository.msg.List1.mmAllowableOneSidednessPercent, com.tools20022.repository.msg.List1.mmAllowableOneSidednessValue,
						com.tools20022.repository.msg.List1.mmOrderDetails);
				trace_lazy = () -> ListTrading.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "List1";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getListIdentification() {
		return listIdentification;
	}

	public void setListIdentification(Max35Text listIdentification) {
		this.listIdentification = listIdentification;
	}

	public Number getNumberOfListOrders() {
		return numberOfListOrders;
	}

	public void setNumberOfListOrders(Number numberOfListOrders) {
		this.numberOfListOrders = numberOfListOrders;
	}

	public Number getTotalNumberOfListOrders() {
		return totalNumberOfListOrders;
	}

	public void setTotalNumberOfListOrders(Number totalNumberOfListOrders) {
		this.totalNumberOfListOrders = totalNumberOfListOrders;
	}

	public YesNoIndicator getImmediateExecutionIndicator() {
		return immediateExecutionIndicator;
	}

	public void setImmediateExecutionIndicator(YesNoIndicator immediateExecutionIndicator) {
		this.immediateExecutionIndicator = immediateExecutionIndicator;
	}

	public Max140Text getExecutionInstruction() {
		return executionInstruction;
	}

	public void setExecutionInstruction(Max140Text executionInstruction) {
		this.executionInstruction = executionInstruction;
	}

	public YesNoIndicator getProgressReportIndicator() {
		return progressReportIndicator;
	}

	public void setProgressReportIndicator(YesNoIndicator progressReportIndicator) {
		this.progressReportIndicator = progressReportIndicator;
	}

	public ISOTime getProgressPeriodInterval() {
		return progressPeriodInterval;
	}

	public void setProgressPeriodInterval(ISOTime progressPeriodInterval) {
		this.progressPeriodInterval = progressPeriodInterval;
	}

	public YesNoIndicator getRealTimeExecutionReportIndicator() {
		return realTimeExecutionReportIndicator;
	}

	public void setRealTimeExecutionReportIndicator(YesNoIndicator realTimeExecutionReportIndicator) {
		this.realTimeExecutionReportIndicator = realTimeExecutionReportIndicator;
	}

	public BidType1Code getBidType() {
		return bidType;
	}

	public void setBidType(BidType1Code bidType) {
		this.bidType = bidType;
	}

	public OldMoneyLaunderingCheck1Code getMoneyLaunderingStatus() {
		return moneyLaunderingStatus;
	}

	public void setMoneyLaunderingStatus(OldMoneyLaunderingCheck1Code moneyLaunderingStatus) {
		this.moneyLaunderingStatus = moneyLaunderingStatus;
	}

	public PercentageRate getAllowableOneSidednessPercent() {
		return allowableOneSidednessPercent;
	}

	public void setAllowableOneSidednessPercent(PercentageRate allowableOneSidednessPercent) {
		this.allowableOneSidednessPercent = allowableOneSidednessPercent;
	}

	public ActiveCurrencyAndAmount getAllowableOneSidednessValue() {
		return allowableOneSidednessValue;
	}

	public void setAllowableOneSidednessValue(ActiveCurrencyAndAmount allowableOneSidednessValue) {
		this.allowableOneSidednessValue = allowableOneSidednessValue;
	}

	public List<Order6> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<com.tools20022.repository.msg.Order6> orderDetails) {
		this.orderDetails = orderDetails;
	}
}
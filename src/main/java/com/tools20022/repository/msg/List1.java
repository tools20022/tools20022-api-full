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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.BidType1Code;
import com.tools20022.repository.codeset.OldMoneyLaunderingCheck1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Order6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintProgressReportAndPeriodIntervalRule#forList1
 * ConstraintProgressReportAndPeriodIntervalRule.forList1}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "List1", propOrder = {"listIdentification", "numberOfListOrders", "totalNumberOfListOrders", "immediateExecutionIndicator", "executionInstruction", "progressReportIndicator", "progressPeriodInterval",
		"realTimeExecutionReportIndicator", "bidType", "moneyLaunderingStatus", "allowableOneSidednessPercent", "allowableOneSidednessValue", "orderDetails"})
public class List1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ListId", required = true)
	protected Max35Text listIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListIdentification
	 * ListTrading.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 66</li>
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
	public static final MMMessageAttribute<List1, Max35Text> mmListIdentification = new MMMessageAttribute<List1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmListIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "ListId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "66"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListIdentification";
			definition = "Unique identifier for a list, as assigned by the trading party. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(List1 obj) {
			return obj.getListIdentification();
		}

		@Override
		public void setValue(List1 obj, Max35Text value) {
			obj.setListIdentification(value);
		}
	};
	@XmlElement(name = "NbOfListOrdrs", required = true)
	protected Number numberOfListOrders;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 73</li>
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
	public static final MMMessageAttribute<List1, Number> mmNumberOfListOrders = new MMMessageAttribute<List1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "NbOfListOrdrs";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "73"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfListOrders";
			definition = "Identifies the number of orders in this message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(List1 obj) {
			return obj.getNumberOfListOrders();
		}

		@Override
		public void setValue(List1 obj, Number value) {
			obj.setNumberOfListOrders(value);
		}
	};
	@XmlElement(name = "TtlNbOfListOrdrs", required = true)
	protected Number totalNumberOfListOrders;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 68</li>
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
	public static final MMMessageAttribute<List1, Number> mmTotalNumberOfListOrders = new MMMessageAttribute<List1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfListOrdrs";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "68"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfListOrders";
			definition = "Identifies the total number of orders across all ListOrder messages with the same ListIdentification. It should be the sum of all NumberOfListOrders in each ListOrder message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(List1 obj) {
			return obj.getTotalNumberOfListOrders();
		}

		@Override
		public void setValue(List1 obj, Number value) {
			obj.setTotalNumberOfListOrders(value);
		}
	};
	@XmlElement(name = "ImdtExctnInd")
	protected YesNoIndicator immediateExecutionIndicator;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ImdtExctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 433</li>
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
	public static final MMMessageAttribute<List1, Optional<YesNoIndicator>> mmImmediateExecutionIndicator = new MMMessageAttribute<List1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "ImdtExctnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "433"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateExecutionIndicator";
			definition = "Indicates whether the list order should be immediately executed or not.\nYes means immediate\nNo means wait for a ListExecution or phone call before proceeding with execution of the list order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(List1 obj) {
			return obj.getImmediateExecutionIndicator();
		}

		@Override
		public void setValue(List1 obj, Optional<YesNoIndicator> value) {
			obj.setImmediateExecutionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctnInstr")
	protected Max140Text executionInstruction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 69</li>
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
	public static final MMMessageAttribute<List1, Optional<Max140Text>> mmExecutionInstruction = new MMMessageAttribute<List1, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "ExctnInstr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "69"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionInstruction";
			definition = "Additional list handling or execution instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(List1 obj) {
			return obj.getExecutionInstruction();
		}

		@Override
		public void setValue(List1 obj, Optional<Max140Text> value) {
			obj.setExecutionInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "PrgrsRptInd")
	protected YesNoIndicator progressReportIndicator;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrgrsRptInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 414</li>
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
	public static final MMMessageAttribute<List1, Optional<YesNoIndicator>> mmProgressReportIndicator = new MMMessageAttribute<List1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "PrgrsRptInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "414"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressReportIndicator";
			definition = "Indicates the request to receive a report on the progress of the order or not.\nYes means to receive periodical ListStatus\nNo means no request to receive periodical ListStatus, they will be requested by a StatusRequest. However, a ListStatus with status 'done' could be sent in an unsolicited fashion.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(List1 obj) {
			return obj.getProgressReportIndicator();
		}

		@Override
		public void setValue(List1 obj, Optional<YesNoIndicator> value) {
			obj.setProgressReportIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PrgrsPrdIntrvl")
	protected ISOTime progressPeriodInterval;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 415</li>
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
	public static final MMMessageAttribute<List1, Optional<ISOTime>> mmProgressPeriodInterval = new MMMessageAttribute<List1, Optional<ISOTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "PrgrsPrdIntrvl";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "415"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressPeriodInterval";
			definition = "Identifies the interval period in minutes between each ListStatus you wish to receive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public Optional<ISOTime> getValue(List1 obj) {
			return obj.getProgressPeriodInterval();
		}

		@Override
		public void setValue(List1 obj, Optional<ISOTime> value) {
			obj.setProgressPeriodInterval(value.orElse(null));
		}
	};
	@XmlElement(name = "RealTmExctnRptInd")
	protected YesNoIndicator realTimeExecutionReportIndicator;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.List1
	 * List1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RealTmExctnRptInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 414</li>
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
	public static final MMMessageAttribute<List1, Optional<YesNoIndicator>> mmRealTimeExecutionReportIndicator = new MMMessageAttribute<List1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "RealTmExctnRptInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "414"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealTimeExecutionReportIndicator";
			definition = "Identifies the request to receive a real time execution report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(List1 obj) {
			return obj.getRealTimeExecutionReportIndicator();
		}

		@Override
		public void setValue(List1 obj, Optional<YesNoIndicator> value) {
			obj.setRealTimeExecutionReportIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "BidTp")
	protected BidType1Code bidType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<List1, Optional<BidType1Code>> mmBidType = new MMMessageAttribute<List1, Optional<BidType1Code>>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmBidType;
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "BidTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidType";
			definition = "Indicates if the list order is related to a \"Non disclosed\"or \"Disclosed\" bid or to no bid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BidType1Code.mmObject();
		}

		@Override
		public Optional<BidType1Code> getValue(List1 obj) {
			return obj.getBidType();
		}

		@Override
		public void setValue(List1 obj, Optional<BidType1Code> value) {
			obj.setBidType(value.orElse(null));
		}
	};
	@XmlElement(name = "MnyLndrgSts")
	protected OldMoneyLaunderingCheck1Code moneyLaunderingStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<List1, Optional<OldMoneyLaunderingCheck1Code>> mmMoneyLaunderingStatus = new MMMessageAttribute<List1, Optional<OldMoneyLaunderingCheck1Code>>() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingStatus";
			definition = "Provides the status of an identity check to prevent money laundering.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OldMoneyLaunderingCheck1Code.mmObject();
		}

		@Override
		public Optional<OldMoneyLaunderingCheck1Code> getValue(List1 obj) {
			return obj.getMoneyLaunderingStatus();
		}

		@Override
		public void setValue(List1 obj, Optional<OldMoneyLaunderingCheck1Code> value) {
			obj.setMoneyLaunderingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "AllwblOneSddnsPct", required = true)
	protected PercentageRate allowableOneSidednessPercent;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<List1, PercentageRate> mmAllowableOneSidednessPercent = new MMMessageAttribute<List1, PercentageRate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "AllwblOneSddnsPct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowableOneSidednessPercent";
			definition = "The maximum percentage that execution of one side of a program trade can exceed execution of the other.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(List1 obj) {
			return obj.getAllowableOneSidednessPercent();
		}

		@Override
		public void setValue(List1 obj, PercentageRate value) {
			obj.setAllowableOneSidednessPercent(value);
		}
	};
	@XmlElement(name = "AllwblOneSddnsVal", required = true)
	protected ActiveCurrencyAndAmount allowableOneSidednessValue;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<List1, ActiveCurrencyAndAmount> mmAllowableOneSidednessValue = new MMMessageAttribute<List1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "AllwblOneSddnsVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowableOneSidednessValue";
			definition = "The maximum amount (expressed in currency) that execution of one side of a program trade can exceed execution of the other.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(List1 obj) {
			return obj.getAllowableOneSidednessValue();
		}

		@Override
		public void setValue(List1 obj, ActiveCurrencyAndAmount value) {
			obj.setAllowableOneSidednessValue(value);
		}
	};
	@XmlElement(name = "OrdrDtls", required = true)
	protected List<Order6> orderDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<List1, List<Order6>> mmOrderDetails = new MMMessageAssociationEnd<List1, List<Order6>>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmSecuritiesListOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.List1.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetails";
			definition = "The intention to transfer an ownership of a financial instrument.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Order6.mmObject();
		}

		@Override
		public List<Order6> getValue(List1 obj) {
			return obj.getOrderDetails();
		}

		@Override
		public void setValue(List1 obj, List<Order6> value) {
			obj.setOrderDetails(value);
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
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProgressReportAndPeriodIntervalRule.forList1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "List1";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getListIdentification() {
		return listIdentification;
	}

	public List1 setListIdentification(Max35Text listIdentification) {
		this.listIdentification = Objects.requireNonNull(listIdentification);
		return this;
	}

	public Number getNumberOfListOrders() {
		return numberOfListOrders;
	}

	public List1 setNumberOfListOrders(Number numberOfListOrders) {
		this.numberOfListOrders = Objects.requireNonNull(numberOfListOrders);
		return this;
	}

	public Number getTotalNumberOfListOrders() {
		return totalNumberOfListOrders;
	}

	public List1 setTotalNumberOfListOrders(Number totalNumberOfListOrders) {
		this.totalNumberOfListOrders = Objects.requireNonNull(totalNumberOfListOrders);
		return this;
	}

	public Optional<YesNoIndicator> getImmediateExecutionIndicator() {
		return immediateExecutionIndicator == null ? Optional.empty() : Optional.of(immediateExecutionIndicator);
	}

	public List1 setImmediateExecutionIndicator(YesNoIndicator immediateExecutionIndicator) {
		this.immediateExecutionIndicator = immediateExecutionIndicator;
		return this;
	}

	public Optional<Max140Text> getExecutionInstruction() {
		return executionInstruction == null ? Optional.empty() : Optional.of(executionInstruction);
	}

	public List1 setExecutionInstruction(Max140Text executionInstruction) {
		this.executionInstruction = executionInstruction;
		return this;
	}

	public Optional<YesNoIndicator> getProgressReportIndicator() {
		return progressReportIndicator == null ? Optional.empty() : Optional.of(progressReportIndicator);
	}

	public List1 setProgressReportIndicator(YesNoIndicator progressReportIndicator) {
		this.progressReportIndicator = progressReportIndicator;
		return this;
	}

	public Optional<ISOTime> getProgressPeriodInterval() {
		return progressPeriodInterval == null ? Optional.empty() : Optional.of(progressPeriodInterval);
	}

	public List1 setProgressPeriodInterval(ISOTime progressPeriodInterval) {
		this.progressPeriodInterval = progressPeriodInterval;
		return this;
	}

	public Optional<YesNoIndicator> getRealTimeExecutionReportIndicator() {
		return realTimeExecutionReportIndicator == null ? Optional.empty() : Optional.of(realTimeExecutionReportIndicator);
	}

	public List1 setRealTimeExecutionReportIndicator(YesNoIndicator realTimeExecutionReportIndicator) {
		this.realTimeExecutionReportIndicator = realTimeExecutionReportIndicator;
		return this;
	}

	public Optional<BidType1Code> getBidType() {
		return bidType == null ? Optional.empty() : Optional.of(bidType);
	}

	public List1 setBidType(BidType1Code bidType) {
		this.bidType = bidType;
		return this;
	}

	public Optional<OldMoneyLaunderingCheck1Code> getMoneyLaunderingStatus() {
		return moneyLaunderingStatus == null ? Optional.empty() : Optional.of(moneyLaunderingStatus);
	}

	public List1 setMoneyLaunderingStatus(OldMoneyLaunderingCheck1Code moneyLaunderingStatus) {
		this.moneyLaunderingStatus = moneyLaunderingStatus;
		return this;
	}

	public PercentageRate getAllowableOneSidednessPercent() {
		return allowableOneSidednessPercent;
	}

	public List1 setAllowableOneSidednessPercent(PercentageRate allowableOneSidednessPercent) {
		this.allowableOneSidednessPercent = Objects.requireNonNull(allowableOneSidednessPercent);
		return this;
	}

	public ActiveCurrencyAndAmount getAllowableOneSidednessValue() {
		return allowableOneSidednessValue;
	}

	public List1 setAllowableOneSidednessValue(ActiveCurrencyAndAmount allowableOneSidednessValue) {
		this.allowableOneSidednessValue = Objects.requireNonNull(allowableOneSidednessValue);
		return this;
	}

	public List<Order6> getOrderDetails() {
		return orderDetails == null ? orderDetails = new ArrayList<>() : orderDetails;
	}

	public List1 setOrderDetails(List<Order6> orderDetails) {
		this.orderDetails = Objects.requireNonNull(orderDetails);
		return this;
	}
}
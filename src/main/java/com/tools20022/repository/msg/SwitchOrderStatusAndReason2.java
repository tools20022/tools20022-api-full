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
import com.tools20022.repository.choice.OrderStatus4Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExpectedExecutionDetails2;
import com.tools20022.repository.msg.FundOrderData6;
import com.tools20022.repository.msg.PartyIdentification113;
import com.tools20022.repository.msg.SwitchLegReferences2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status report of the individual orders of a bulk or multiple order that was
 * previously received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmMasterReference
 * SwitchOrderStatusAndReason2.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmOrderReference
 * SwitchOrderStatusAndReason2.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmClientReference
 * SwitchOrderStatusAndReason2.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmDealReference
 * SwitchOrderStatusAndReason2.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmCancellationReference
 * SwitchOrderStatusAndReason2.mmCancellationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmOrderStatus
 * SwitchOrderStatusAndReason2.mmOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmLegInformation
 * SwitchOrderStatusAndReason2.mmLegInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmStatusInitiator
 * SwitchOrderStatusAndReason2.mmStatusInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmOrderData
 * SwitchOrderStatusAndReason2.mmOrderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmNewDetails
 * SwitchOrderStatusAndReason2.mmNewDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SwitchOrder
 * SwitchOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchOrderStatusAndReason2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of the individual orders of a bulk or multiple order that was previously received."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
 * SwitchOrderStatusAndReason1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchOrderStatusAndReason2", propOrder = {"masterReference", "orderReference", "clientReference", "dealReference", "cancellationReference", "orderStatus", "legInformation", "statusInitiator", "orderData", "newDetails"})
public class SwitchOrderStatusAndReason2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a set of orders or trades in order to link them together."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmMasterReference
	 * SwitchOrderStatusAndReason1.mmMasterReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchOrderStatusAndReason2, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<SwitchOrderStatusAndReason2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			previousVersion_lazy = () -> SwitchOrderStatusAndReason1.mmMasterReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SwitchOrderStatusAndReason2 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(SwitchOrderStatusAndReason2 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrRef", required = true)
	protected Max35Text orderReference;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for the order, as assigned by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmOrderReference
	 * SwitchOrderStatusAndReason1.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchOrderStatusAndReason2, Max35Text> mmOrderReference = new MMMessageAttribute<SwitchOrderStatusAndReason2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for the order, as assigned by the instructing party.";
			previousVersion_lazy = () -> SwitchOrderStatusAndReason1.mmOrderReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SwitchOrderStatusAndReason2 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(SwitchOrderStatusAndReason2 obj, Max35Text value) {
			obj.setOrderReference(value);
		}
	};
	@XmlElement(name = "ClntRef")
	protected Max35Text clientReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of the order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmClientReference
	 * SwitchOrderStatusAndReason1.mmClientReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchOrderStatusAndReason2, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<SwitchOrderStatusAndReason2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of the order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			previousVersion_lazy = () -> SwitchOrderStatusAndReason1.mmClientReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SwitchOrderStatusAndReason2 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(SwitchOrderStatusAndReason2 obj, Optional<Max35Text> value) {
			obj.setClientReference(value.orElse(null));
		}
	};
	@XmlElement(name = "DealRef")
	protected Max35Text dealReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmDealIdentification
	 * InvestmentFundOrderExecution.mmDealIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for the order execution, as assigned by the confirming party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmDealReference
	 * SwitchOrderStatusAndReason1.mmDealReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchOrderStatusAndReason2, Optional<Max35Text>> mmDealReference = new MMMessageAttribute<SwitchOrderStatusAndReason2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmDealIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for the order execution, as assigned by the confirming party.";
			previousVersion_lazy = () -> SwitchOrderStatusAndReason1.mmDealReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SwitchOrderStatusAndReason2 obj) {
			return obj.getDealReference();
		}

		@Override
		public void setValue(SwitchOrderStatusAndReason2 obj, Optional<Max35Text> value) {
			obj.setDealReference(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRef")
	protected Max35Text cancellationReference;
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for the order cancellation, as assigned by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmCancellationReference
	 * SwitchOrderStatusAndReason1.mmCancellationReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchOrderStatusAndReason2, Optional<Max35Text>> mmCancellationReference = new MMMessageAttribute<SwitchOrderStatusAndReason2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "CxlRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReference";
			definition = "Unique and unambiguous identifier for the order cancellation, as assigned by the instructing party.";
			previousVersion_lazy = () -> SwitchOrderStatusAndReason1.mmCancellationReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SwitchOrderStatusAndReason2 obj) {
			return obj.getCancellationReference();
		}

		@Override
		public void setValue(SwitchOrderStatusAndReason2 obj, Optional<Max35Text> value) {
			obj.setCancellationReference(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrSts", required = true)
	protected OrderStatus4Choice orderStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OrderStatus4Choice
	 * OrderStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmOrderStatus
	 * SecuritiesOrderStatus.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the switch order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchOrderStatusAndReason2, OrderStatus4Choice> mmOrderStatus = new MMMessageAssociationEnd<SwitchOrderStatusAndReason2, OrderStatus4Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmOrderStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "OrdrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderStatus";
			definition = "Status of the switch order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrderStatus4Choice.mmObject();
		}

		@Override
		public OrderStatus4Choice getValue(SwitchOrderStatusAndReason2 obj) {
			return obj.getOrderStatus();
		}

		@Override
		public void setValue(SwitchOrderStatusAndReason2 obj, OrderStatus4Choice value) {
			obj.setOrderStatus(value);
		}
	};
	@XmlElement(name = "LegInf")
	protected List<SwitchLegReferences2> legInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SwitchLegReferences2
	 * SwitchLegReferences2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about a switch leg that is rejected or repaired."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmLegInformation
	 * SwitchOrderStatusAndReason1.mmLegInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchOrderStatusAndReason2, List<SwitchLegReferences2>> mmLegInformation = new MMMessageAssociationEnd<SwitchOrderStatusAndReason2, List<SwitchLegReferences2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "LegInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegInformation";
			definition = "Information about a switch leg that is rejected or repaired.";
			previousVersion_lazy = () -> SwitchOrderStatusAndReason1.mmLegInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SwitchLegReferences2.mmObject();
		}

		@Override
		public List<SwitchLegReferences2> getValue(SwitchOrderStatusAndReason2 obj) {
			return obj.getLegInformation();
		}

		@Override
		public void setValue(SwitchOrderStatusAndReason2 obj, List<SwitchLegReferences2> value) {
			obj.setLegInformation(value);
		}
	};
	@XmlElement(name = "StsInitr")
	protected PartyIdentification113 statusInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that initiates the status of the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmStatusInitiator
	 * SwitchOrderStatusAndReason1.mmStatusInitiator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchOrderStatusAndReason2, Optional<PartyIdentification113>> mmStatusInitiator = new MMMessageAssociationEnd<SwitchOrderStatusAndReason2, Optional<PartyIdentification113>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status of the order.";
			previousVersion_lazy = () -> SwitchOrderStatusAndReason1.mmStatusInitiator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(SwitchOrderStatusAndReason2 obj) {
			return obj.getStatusInitiator();
		}

		@Override
		public void setValue(SwitchOrderStatusAndReason2 obj, Optional<PartyIdentification113> value) {
			obj.setStatusInitiator(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrData")
	protected FundOrderData6 orderData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundOrderData6
	 * FundOrderData6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmOrderData
	 * SwitchOrderStatusAndReason1.mmOrderData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchOrderStatusAndReason2, Optional<FundOrderData6>> mmOrderData = new MMMessageAssociationEnd<SwitchOrderStatusAndReason2, Optional<FundOrderData6>>() {
		{
			businessComponentTrace_lazy = () -> SwitchOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "OrdrData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderData";
			definition = "Order data.";
			previousVersion_lazy = () -> SwitchOrderStatusAndReason1.mmOrderData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundOrderData6.mmObject();
		}

		@Override
		public Optional<FundOrderData6> getValue(SwitchOrderStatusAndReason2 obj) {
			return obj.getOrderData();
		}

		@Override
		public void setValue(SwitchOrderStatusAndReason2 obj, Optional<FundOrderData6> value) {
			obj.setOrderData(value.orElse(null));
		}
	};
	@XmlElement(name = "NewDtls")
	protected ExpectedExecutionDetails2 newDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2
	 * ExpectedExecutionDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
	 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2
	 * SwitchOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expected execution information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmNewDetails
	 * SwitchOrderStatusAndReason1.mmNewDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchOrderStatusAndReason2, Optional<ExpectedExecutionDetails2>> mmNewDetails = new MMMessageAssociationEnd<SwitchOrderStatusAndReason2, Optional<ExpectedExecutionDetails2>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmInvestmentFundOrderExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "NewDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDetails";
			definition = "Expected execution information.";
			previousVersion_lazy = () -> SwitchOrderStatusAndReason1.mmNewDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExpectedExecutionDetails2.mmObject();
		}

		@Override
		public Optional<ExpectedExecutionDetails2> getValue(SwitchOrderStatusAndReason2 obj) {
			return obj.getNewDetails();
		}

		@Override
		public void setValue(SwitchOrderStatusAndReason2 obj, Optional<ExpectedExecutionDetails2> value) {
			obj.setNewDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmMasterReference, com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmOrderReference,
						com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmClientReference, com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmDealReference,
						com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmCancellationReference, com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmOrderStatus,
						com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmLegInformation, com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmStatusInitiator,
						com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmOrderData, com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmNewDetails);
				trace_lazy = () -> SwitchOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchOrderStatusAndReason2";
				definition = "Status report of the individual orders of a bulk or multiple order that was previously received.";
				previousVersion_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public SwitchOrderStatusAndReason2 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public SwitchOrderStatusAndReason2 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public SwitchOrderStatusAndReason2 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<Max35Text> getDealReference() {
		return dealReference == null ? Optional.empty() : Optional.of(dealReference);
	}

	public SwitchOrderStatusAndReason2 setDealReference(Max35Text dealReference) {
		this.dealReference = dealReference;
		return this;
	}

	public Optional<Max35Text> getCancellationReference() {
		return cancellationReference == null ? Optional.empty() : Optional.of(cancellationReference);
	}

	public SwitchOrderStatusAndReason2 setCancellationReference(Max35Text cancellationReference) {
		this.cancellationReference = cancellationReference;
		return this;
	}

	public OrderStatus4Choice getOrderStatus() {
		return orderStatus;
	}

	public SwitchOrderStatusAndReason2 setOrderStatus(OrderStatus4Choice orderStatus) {
		this.orderStatus = Objects.requireNonNull(orderStatus);
		return this;
	}

	public List<SwitchLegReferences2> getLegInformation() {
		return legInformation == null ? legInformation = new ArrayList<>() : legInformation;
	}

	public SwitchOrderStatusAndReason2 setLegInformation(List<SwitchLegReferences2> legInformation) {
		this.legInformation = Objects.requireNonNull(legInformation);
		return this;
	}

	public Optional<PartyIdentification113> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public SwitchOrderStatusAndReason2 setStatusInitiator(PartyIdentification113 statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}

	public Optional<FundOrderData6> getOrderData() {
		return orderData == null ? Optional.empty() : Optional.of(orderData);
	}

	public SwitchOrderStatusAndReason2 setOrderData(FundOrderData6 orderData) {
		this.orderData = orderData;
		return this;
	}

	public Optional<ExpectedExecutionDetails2> getNewDetails() {
		return newDetails == null ? Optional.empty() : Optional.of(newDetails);
	}

	public SwitchOrderStatusAndReason2 setNewDetails(ExpectedExecutionDetails2 newDetails) {
		this.newDetails = newDetails;
		return this;
	}
}
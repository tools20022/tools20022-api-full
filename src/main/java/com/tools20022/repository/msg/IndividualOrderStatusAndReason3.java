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
import com.tools20022.repository.choice.OrderStatus1Choice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmMasterReference
 * IndividualOrderStatusAndReason3.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmOrderReference
 * IndividualOrderStatusAndReason3.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmClientReference
 * IndividualOrderStatusAndReason3.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmDealReference
 * IndividualOrderStatusAndReason3.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmCancellationReference
 * IndividualOrderStatusAndReason3.mmCancellationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmStatusDetails
 * IndividualOrderStatusAndReason3.mmStatusDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmOrderData
 * IndividualOrderStatusAndReason3.mmOrderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmNewDetails
 * IndividualOrderStatusAndReason3.mmNewDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3#mmStatusInitiator
 * IndividualOrderStatusAndReason3.mmStatusInitiator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
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
 * "IndividualOrderStatusAndReason3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of the individual orders of a bulk or multiple order that was previously received."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualOrderStatusAndReason3", propOrder = {"masterReference", "orderReference", "clientReference", "dealReference", "cancellationReference", "statusDetails", "orderData", "newDetails", "statusInitiator"})
public class IndividualOrderStatusAndReason3 {

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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3
	 * IndividualOrderStatusAndReason3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3
	 * IndividualOrderStatusAndReason3}</li>
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
	 * "Unique and unambiguous identifier for an order, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for an order, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3
	 * IndividualOrderStatusAndReason3}</li>
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
	 * "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3
	 * IndividualOrderStatusAndReason3}</li>
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
	 * "Unique and unambiguous identifier for an order execution, as assigned by the executing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by the executing party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3
	 * IndividualOrderStatusAndReason3}</li>
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
	 * "Unique and unambiguous identifier for an order cancellation, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "CxlRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReference";
			definition = "Unique and unambiguous identifier for an order cancellation, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "StsDtls", required = true)
	protected OrderStatus1Choice statusDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OrderStatus1Choice
	 * OrderStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3
	 * IndividualOrderStatusAndReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice of status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrderStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "StsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDetails";
			definition = "Choice of status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrderStatus1Choice.mmObject();
		}
	};
	@XmlElement(name = "OrdrData")
	protected FundOrderData3 orderData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundOrderData3
	 * FundOrderData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
	 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3
	 * IndividualOrderStatusAndReason3}</li>
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
	 * definition} = "Data from the original order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderData = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmInvestmentFundOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "OrdrData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderData";
			definition = "Data from the original order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundOrderData3.mmObject();
		}
	};
	@XmlElement(name = "NewDtls")
	protected ExpectedExecutionDetails3 newDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
	 * ExpectedExecutionDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
	 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3
	 * IndividualOrderStatusAndReason3}</li>
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
	 * definition} = "Information that has been added to the original order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmInvestmentFundOrderExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "NewDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDetails";
			definition = "Information that has been added to the original order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails3.mmObject();
		}
	};
	@XmlElement(name = "StsInitr")
	protected PartyIdentification2Choice statusInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason3
	 * IndividualOrderStatusAndReason3}</li>
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
	 * definition} = "Party that initiates the status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusInitiator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmMasterReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmOrderReference,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmClientReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmDealReference,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmCancellationReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmStatusDetails,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmOrderData, com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmNewDetails,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason3.mmStatusInitiator);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IndividualOrderStatusAndReason3";
				definition = "Status report of the individual orders of a bulk or multiple order that was previously received.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public IndividualOrderStatusAndReason3 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public IndividualOrderStatusAndReason3 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public IndividualOrderStatusAndReason3 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<Max35Text> getDealReference() {
		return dealReference == null ? Optional.empty() : Optional.of(dealReference);
	}

	public IndividualOrderStatusAndReason3 setDealReference(Max35Text dealReference) {
		this.dealReference = dealReference;
		return this;
	}

	public Optional<Max35Text> getCancellationReference() {
		return cancellationReference == null ? Optional.empty() : Optional.of(cancellationReference);
	}

	public IndividualOrderStatusAndReason3 setCancellationReference(Max35Text cancellationReference) {
		this.cancellationReference = cancellationReference;
		return this;
	}

	public OrderStatus1Choice getStatusDetails() {
		return statusDetails;
	}

	public IndividualOrderStatusAndReason3 setStatusDetails(OrderStatus1Choice statusDetails) {
		this.statusDetails = Objects.requireNonNull(statusDetails);
		return this;
	}

	public Optional<FundOrderData3> getOrderData() {
		return orderData == null ? Optional.empty() : Optional.of(orderData);
	}

	public IndividualOrderStatusAndReason3 setOrderData(com.tools20022.repository.msg.FundOrderData3 orderData) {
		this.orderData = orderData;
		return this;
	}

	public Optional<ExpectedExecutionDetails3> getNewDetails() {
		return newDetails == null ? Optional.empty() : Optional.of(newDetails);
	}

	public IndividualOrderStatusAndReason3 setNewDetails(com.tools20022.repository.msg.ExpectedExecutionDetails3 newDetails) {
		this.newDetails = newDetails;
		return this;
	}

	public Optional<PartyIdentification2Choice> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public IndividualOrderStatusAndReason3 setStatusInitiator(PartyIdentification2Choice statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}
}
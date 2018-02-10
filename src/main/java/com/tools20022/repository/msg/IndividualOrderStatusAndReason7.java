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
import com.tools20022.repository.choice.OrderStatus5Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmMasterReference
 * IndividualOrderStatusAndReason7.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmOrderReference
 * IndividualOrderStatusAndReason7.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmClientReference
 * IndividualOrderStatusAndReason7.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmDealReference
 * IndividualOrderStatusAndReason7.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmCancellationReference
 * IndividualOrderStatusAndReason7.mmCancellationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmOrderStatus
 * IndividualOrderStatusAndReason7.mmOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmRepairedFee
 * IndividualOrderStatusAndReason7.mmRepairedFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmStatusInitiator
 * IndividualOrderStatusAndReason7.mmStatusInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmOrderData
 * IndividualOrderStatusAndReason7.mmOrderData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmNewDetails
 * IndividualOrderStatusAndReason7.mmNewDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7#mmGatingOrHoldBackDetails
 * IndividualOrderStatusAndReason7.mmGatingOrHoldBackDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndividualOrderStatusAndReason7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of the individual orders of a bulk or multiple order that was previously received."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2
 * IndividualOrderStatusAndReason2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualOrderStatusAndReason7", propOrder = {"masterReference", "orderReference", "clientReference", "dealReference", "cancellationReference", "orderStatus", "repairedFee", "statusInitiator", "orderData", "newDetails",
		"gatingOrHoldBackDetails"})
public class IndividualOrderStatusAndReason7 {

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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmMasterReference
	 * IndividualOrderStatusAndReason2.mmMasterReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			previousVersion_lazy = () -> IndividualOrderStatusAndReason2.mmMasterReference;
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmOrderReference
	 * IndividualOrderStatusAndReason2.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for the order, as assigned by the instructing party.";
			previousVersion_lazy = () -> IndividualOrderStatusAndReason2.mmOrderReference;
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmClientReference
	 * IndividualOrderStatusAndReason2.mmClientReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of the order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			previousVersion_lazy = () -> IndividualOrderStatusAndReason2.mmClientReference;
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmDealReference
	 * IndividualOrderStatusAndReason2.mmDealReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for the order execution, as assigned by the confirming party.";
			previousVersion_lazy = () -> IndividualOrderStatusAndReason2.mmDealReference;
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmCancellationReference
	 * IndividualOrderStatusAndReason2.mmCancellationReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "CxlRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReference";
			definition = "Unique and unambiguous identifier for the order cancellation, as assigned by the instructing party.";
			previousVersion_lazy = () -> IndividualOrderStatusAndReason2.mmCancellationReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrdrSts", required = true)
	protected OrderStatus5Choice orderStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OrderStatus5Choice
	 * OrderStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmOrderStatus
	 * SecuritiesOrderStatus.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
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
	 * definition} = "Status of the individual order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmOrderStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "OrdrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderStatus";
			definition = "Status of the individual order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrderStatus5Choice.mmObject();
		}
	};
	@XmlElement(name = "RprdFee")
	protected List<com.tools20022.repository.msg.Fee3> repairedFee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Fee3 Fee3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements from the original individual order that have been repaired so that the order can be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepairedFee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "RprdFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedFee";
			definition = "Elements from the original individual order that have been repaired so that the order can be accepted.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Fee3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusInitiator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status of the order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification113.mmObject();
		}
	};
	@XmlElement(name = "OrdrData")
	protected FundOrderData5 orderData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundOrderData5
	 * FundOrderData5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmInvestmentFundOrder
	 * SecuritiesOrderStatus.mmInvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmOrderData
	 * IndividualOrderStatusAndReason2.mmOrderData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderData = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmInvestmentFundOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "OrdrData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderData";
			definition = "Order data.";
			previousVersion_lazy = () -> IndividualOrderStatusAndReason2.mmOrderData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundOrderData5.mmObject();
		}
	};
	@XmlElement(name = "NewDtls")
	protected ExpectedExecutionDetails4 newDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4
	 * ExpectedExecutionDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
	 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2#mmNewDetails
	 * IndividualOrderStatusAndReason2.mmNewDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmInvestmentFundOrderExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "NewDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewDetails";
			definition = "Expected execution information.";
			previousVersion_lazy = () -> IndividualOrderStatusAndReason2.mmNewDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExpectedExecutionDetails4.mmObject();
		}
	};
	@XmlElement(name = "GtgOrHldBckDtls")
	protected HoldBackInformation3 gatingOrHoldBackDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.HoldBackInformation3
	 * HoldBackInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason7
	 * IndividualOrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GtgOrHldBckDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GatingOrHoldBackDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about gating and hold back of redemption proceeds."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGatingOrHoldBackDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmObject();
			isDerived = false;
			xmlTag = "GtgOrHldBckDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GatingOrHoldBackDetails";
			definition = "Information about gating and hold back of redemption proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.HoldBackInformation3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmMasterReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmOrderReference,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmClientReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmDealReference,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmCancellationReference, com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmOrderStatus,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmRepairedFee, com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmStatusInitiator,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmOrderData, com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmNewDetails,
						com.tools20022.repository.msg.IndividualOrderStatusAndReason7.mmGatingOrHoldBackDetails);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndividualOrderStatusAndReason7";
				definition = "Status report of the individual orders of a bulk or multiple order that was previously received.";
				previousVersion_lazy = () -> IndividualOrderStatusAndReason2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public IndividualOrderStatusAndReason7 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public IndividualOrderStatusAndReason7 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public IndividualOrderStatusAndReason7 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<Max35Text> getDealReference() {
		return dealReference == null ? Optional.empty() : Optional.of(dealReference);
	}

	public IndividualOrderStatusAndReason7 setDealReference(Max35Text dealReference) {
		this.dealReference = dealReference;
		return this;
	}

	public Optional<Max35Text> getCancellationReference() {
		return cancellationReference == null ? Optional.empty() : Optional.of(cancellationReference);
	}

	public IndividualOrderStatusAndReason7 setCancellationReference(Max35Text cancellationReference) {
		this.cancellationReference = cancellationReference;
		return this;
	}

	public OrderStatus5Choice getOrderStatus() {
		return orderStatus;
	}

	public IndividualOrderStatusAndReason7 setOrderStatus(OrderStatus5Choice orderStatus) {
		this.orderStatus = Objects.requireNonNull(orderStatus);
		return this;
	}

	public List<Fee3> getRepairedFee() {
		return repairedFee == null ? repairedFee = new ArrayList<>() : repairedFee;
	}

	public IndividualOrderStatusAndReason7 setRepairedFee(List<com.tools20022.repository.msg.Fee3> repairedFee) {
		this.repairedFee = Objects.requireNonNull(repairedFee);
		return this;
	}

	public Optional<PartyIdentification113> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public IndividualOrderStatusAndReason7 setStatusInitiator(com.tools20022.repository.msg.PartyIdentification113 statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}

	public Optional<FundOrderData5> getOrderData() {
		return orderData == null ? Optional.empty() : Optional.of(orderData);
	}

	public IndividualOrderStatusAndReason7 setOrderData(com.tools20022.repository.msg.FundOrderData5 orderData) {
		this.orderData = orderData;
		return this;
	}

	public Optional<ExpectedExecutionDetails4> getNewDetails() {
		return newDetails == null ? Optional.empty() : Optional.of(newDetails);
	}

	public IndividualOrderStatusAndReason7 setNewDetails(com.tools20022.repository.msg.ExpectedExecutionDetails4 newDetails) {
		this.newDetails = newDetails;
		return this;
	}

	public Optional<HoldBackInformation3> getGatingOrHoldBackDetails() {
		return gatingOrHoldBackDetails == null ? Optional.empty() : Optional.of(gatingOrHoldBackDetails);
	}

	public IndividualOrderStatusAndReason7 setGatingOrHoldBackDetails(com.tools20022.repository.msg.HoldBackInformation3 gatingOrHoldBackDetails) {
		this.gatingOrHoldBackDetails = gatingOrHoldBackDetails;
		return this;
	}
}
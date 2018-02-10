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
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.codeset.Side1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.SecuritiesOrderParameters;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
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
 * Provides details related to each single order being part of the list order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmClientOrderIdentification
 * OrderStatus3.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmSecondaryClientOrderIdentification
 * OrderStatus3.mmSecondaryClientOrderIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus3#mmSide
 * OrderStatus3.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmWorkingIndicator
 * OrderStatus3.mmWorkingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmRemainingQuantity
 * OrderStatus3.mmRemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmCumulativeQuantity
 * OrderStatus3.mmCumulativeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmCancelledQuantity
 * OrderStatus3.mmCancelledQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatus3#mmAveragePrice
 * OrderStatus3.mmAveragePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatus3#mmSingleOrderStatusDetails
 * OrderStatus3.mmSingleOrderStatusDetails}</li>
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
 * "OrderStatus3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details related to each single order being part of the list order."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderStatus3", propOrder = {"clientOrderIdentification", "secondaryClientOrderIdentification", "side", "workingIndicator", "remainingQuantity", "cumulativeQuantity", "cancelledQuantity", "averagePrice",
		"singleOrderStatusDetails"})
public class OrderStatus3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClntOrdrId", required = true)
	protected Max35Text clientOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3 OrderStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 11</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus3.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "11"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ScndryClntOrdrId")
	protected Max35Text secondaryClientOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3 OrderStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 526</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name or number assigned by an entity to enable recognition of that entity, eg, account identifier."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondaryClientOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus3.mmObject();
			isDerived = false;
			xmlTag = "ScndryClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "526"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryClientOrderIdentification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, eg, account identifier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Sd", required = true)
	protected Side1Code side;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side1Code
	 * Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3 OrderStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coded list to specify the side of the order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus3.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Side1Code.mmObject();
		}
	};
	@XmlElement(name = "WorkgInd", required = true)
	protected YesNoIndicator workingIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmWorkingIndicator
	 * SecuritiesOrderParameters.mmWorkingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3 OrderStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WorkgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 636</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WorkingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the order is currently being worked. For open outcry markets this indicates that the order is being worked in the crowd.  For electronic markets it indicates that the order has transitioned from a contingent order to a market order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWorkingIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmWorkingIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus3.mmObject();
			isDerived = false;
			xmlTag = "WorkgInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "636"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkingIndicator";
			definition = "Indicates if the order is currently being worked. For open outcry markets this indicates that the order is being worked in the crowd.  For electronic markets it indicates that the order has transitioned from a contingent order to a market order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "RmngQty", required = true)
	protected FinancialInstrumentQuantityChoice remainingQuantity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmRemainingQuantity
	 * SecuritiesOrderStatus.mmRemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3 OrderStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 151</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity opened for further execution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemainingQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmRemainingQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus3.mmObject();
			isDerived = false;
			xmlTag = "RmngQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "151"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingQuantity";
			definition = "Quantity opened for further execution.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "CmltvQty", required = true)
	protected FinancialInstrumentQuantityChoice cumulativeQuantity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCumulativeQuantity
	 * SecuritiesOrderStatus.mmCumulativeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3 OrderStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmltvQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 14</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumulativeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument to be ordered."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCumulativeQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmCumulativeQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus3.mmObject();
			isDerived = false;
			xmlTag = "CmltvQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "14"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumulativeQuantity";
			definition = "Quantity of financial instrument to be ordered.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "CancQty")
	protected FinancialInstrumentQuantityChoice cancelledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3 OrderStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CancQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 84</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity cancelled for this order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancelledQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus3.mmObject();
			isDerived = false;
			xmlTag = "CancQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "84"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledQuantity";
			definition = "Total quantity cancelled for this order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "AvrgPric")
	protected Price1 averagePrice;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
	 * SecuritiesOrder.mmOrderPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3 OrderStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 6</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated average price of all fills on this order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAveragePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus3.mmObject();
			isDerived = false;
			xmlTag = "AvrgPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "6"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePrice";
			definition = "Calculated average price of all fills on this order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	@XmlElement(name = "SnglOrdrStsDtls", required = true)
	protected OrderStatusAndReason5 singleOrderStatusDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderStatusAndReason5
	 * OrderStatusAndReason5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatus3 OrderStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnglOrdrStsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleOrderStatusDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSingleOrderStatusDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrderStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatus3.mmObject();
			isDerived = false;
			xmlTag = "SnglOrdrStsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleOrderStatusDetails";
			definition = "Status of the order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatus3.mmClientOrderIdentification, com.tools20022.repository.msg.OrderStatus3.mmSecondaryClientOrderIdentification,
						com.tools20022.repository.msg.OrderStatus3.mmSide, com.tools20022.repository.msg.OrderStatus3.mmWorkingIndicator, com.tools20022.repository.msg.OrderStatus3.mmRemainingQuantity,
						com.tools20022.repository.msg.OrderStatus3.mmCumulativeQuantity, com.tools20022.repository.msg.OrderStatus3.mmCancelledQuantity, com.tools20022.repository.msg.OrderStatus3.mmAveragePrice,
						com.tools20022.repository.msg.OrderStatus3.mmSingleOrderStatusDetails);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrderStatus3";
				definition = "Provides details related to each single order being part of the list order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getClientOrderIdentification() {
		return clientOrderIdentification;
	}

	public OrderStatus3 setClientOrderIdentification(Max35Text clientOrderIdentification) {
		this.clientOrderIdentification = Objects.requireNonNull(clientOrderIdentification);
		return this;
	}

	public Optional<Max35Text> getSecondaryClientOrderIdentification() {
		return secondaryClientOrderIdentification == null ? Optional.empty() : Optional.of(secondaryClientOrderIdentification);
	}

	public OrderStatus3 setSecondaryClientOrderIdentification(Max35Text secondaryClientOrderIdentification) {
		this.secondaryClientOrderIdentification = secondaryClientOrderIdentification;
		return this;
	}

	public Side1Code getSide() {
		return side;
	}

	public OrderStatus3 setSide(Side1Code side) {
		this.side = Objects.requireNonNull(side);
		return this;
	}

	public YesNoIndicator getWorkingIndicator() {
		return workingIndicator;
	}

	public OrderStatus3 setWorkingIndicator(YesNoIndicator workingIndicator) {
		this.workingIndicator = Objects.requireNonNull(workingIndicator);
		return this;
	}

	public FinancialInstrumentQuantityChoice getRemainingQuantity() {
		return remainingQuantity;
	}

	public OrderStatus3 setRemainingQuantity(FinancialInstrumentQuantityChoice remainingQuantity) {
		this.remainingQuantity = Objects.requireNonNull(remainingQuantity);
		return this;
	}

	public FinancialInstrumentQuantityChoice getCumulativeQuantity() {
		return cumulativeQuantity;
	}

	public OrderStatus3 setCumulativeQuantity(FinancialInstrumentQuantityChoice cumulativeQuantity) {
		this.cumulativeQuantity = Objects.requireNonNull(cumulativeQuantity);
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getCancelledQuantity() {
		return cancelledQuantity == null ? Optional.empty() : Optional.of(cancelledQuantity);
	}

	public OrderStatus3 setCancelledQuantity(FinancialInstrumentQuantityChoice cancelledQuantity) {
		this.cancelledQuantity = cancelledQuantity;
		return this;
	}

	public Optional<Price1> getAveragePrice() {
		return averagePrice == null ? Optional.empty() : Optional.of(averagePrice);
	}

	public OrderStatus3 setAveragePrice(com.tools20022.repository.msg.Price1 averagePrice) {
		this.averagePrice = averagePrice;
		return this;
	}

	public OrderStatusAndReason5 getSingleOrderStatusDetails() {
		return singleOrderStatusDetails;
	}

	public OrderStatus3 setSingleOrderStatusDetails(com.tools20022.repository.msg.OrderStatusAndReason5 singleOrderStatusDetails) {
		this.singleOrderStatusDetails = Objects.requireNonNull(singleOrderStatusDetails);
		return this;
	}
}
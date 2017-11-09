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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Side1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides identifications related to the order processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#mmOrderIdentification
 * OrderIdentification3.mmOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#mmClientOrderIdentification
 * OrderIdentification3.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#mmSecondaryClientOrderIdentification
 * OrderIdentification3.mmSecondaryClientOrderIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderIdentification3#mmSide
 * OrderIdentification3.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderIdentification3#mmClientOrderLinkIdentification
 * OrderIdentification3.mmClientOrderLinkIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
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
 * "OrderIdentification3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides identifications related to the order processing."</li>
 * </ul>
 */
public class OrderIdentification3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text orderIdentification;
	/**
	 * Information related to an identification, eg, party identification or
	 * account identification.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3
	 * OrderIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to an identification, eg, party identification or account identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> OrderIdentification3.mmObject();
			isDerived = false;
			xmlTag = "OrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderIdentification";
			definition = "Information related to an identification, eg, party identification or account identification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientOrderIdentification;
	/**
	 * Unique identifier for the order as assigned by the buyside. Uniqueness
	 * must be guaranteed within a single trading day. Firms, particularly those
	 * that electronically submit multi-day orders, trade globally or throughout
	 * market close periods, should ensure uniqueness across days, for example
	 * by embedding a date within the ClientOrderIdentification element.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3
	 * OrderIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for the order as assigned by the buyside. Uniqueness must be guaranteed within a single trading day. Firms, particularly those  that  electronically submit multi-day orders, trade globally or throughout market close periods, should ensure  uniqueness across days, for example by embedding a date within the ClientOrderIdentification element."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> OrderIdentification3.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buyside. Uniqueness must be guaranteed within a single trading day. Firms, particularly those  that  electronically submit multi-day orders, trade globally or throughout market close periods, should ensure  uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text secondaryClientOrderIdentification;
	/**
	 * Assigned by the party that originates the order. Can be used to provide
	 * the ClientOrderIdentification used by an exchange or executing system.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3
	 * OrderIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assigned by the party that  originates the order. Can be used to provide the ClientOrderIdentification used by an exchange or executing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondaryClientOrderIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> OrderIdentification3.mmObject();
			isDerived = false;
			xmlTag = "ScndryClntOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryClientOrderIdentification";
			definition = "Assigned by the party that  originates the order. Can be used to provide the ClientOrderIdentification used by an exchange or executing system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Side1Code side;
	/**
	 * Coded list to specify the side of the order.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3
	 * OrderIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
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
			componentContext_lazy = () -> OrderIdentification3.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Side1Code.mmObject();
		}
	};
	protected Max35Text clientOrderLinkIdentification;
	/**
	 * Permits order originators to tie together groups of orders in which
	 * trades resulting from orders are associated for a specific purpose, for
	 * example the calculation of average execution price for a customer or to
	 * associate lists submitted to a broker as waves of a larger program trade.
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
	 * {@linkplain com.tools20022.repository.msg.OrderIdentification3
	 * OrderIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrLkId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderLinkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Permits order originators to tie together groups of orders in which trades resulting from orders are associated for a specific purpose, for example the calculation of average execution price for a customer or to associate lists submitted to a broker as waves of a larger program trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientOrderLinkIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OrderIdentification3.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrLkId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderLinkIdentification";
			definition = "Permits order originators to tie together groups of orders in which trades resulting from orders are associated for a specific purpose, for example the calculation of average execution price for a customer or to associate lists submitted to a broker as waves of a larger program trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OrderIdentification3.mmOrderIdentification, OrderIdentification3.mmClientOrderIdentification, OrderIdentification3.mmSecondaryClientOrderIdentification, OrderIdentification3.mmSide,
						OrderIdentification3.mmClientOrderLinkIdentification);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrderIdentification3";
				definition = "Provides identifications related to the order processing.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOrderIdentification() {
		return orderIdentification;
	}

	public void setOrderIdentification(Max35Text orderIdentification) {
		this.orderIdentification = orderIdentification;
	}

	public Max35Text getClientOrderIdentification() {
		return clientOrderIdentification;
	}

	public void setClientOrderIdentification(Max35Text clientOrderIdentification) {
		this.clientOrderIdentification = clientOrderIdentification;
	}

	public Max35Text getSecondaryClientOrderIdentification() {
		return secondaryClientOrderIdentification;
	}

	public void setSecondaryClientOrderIdentification(Max35Text secondaryClientOrderIdentification) {
		this.secondaryClientOrderIdentification = secondaryClientOrderIdentification;
	}

	public Side1Code getSide() {
		return side;
	}

	public void setSide(Side1Code side) {
		this.side = side;
	}

	public Max35Text getClientOrderLinkIdentification() {
		return clientOrderLinkIdentification;
	}

	public void setClientOrderLinkIdentification(Max35Text clientOrderLinkIdentification) {
		this.clientOrderLinkIdentification = clientOrderLinkIdentification;
	}
}
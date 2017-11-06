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
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional references linked to the order status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmOrderMassStatusRequestIdentification
 * Reference15.mmOrderMassStatusRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmOrderStatusRequestIdentification
 * Reference15.mmOrderStatusRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmOrderIdentification
 * Reference15.mmOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmHostCrossIdentification
 * Reference15.mmHostCrossIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmCrossOrderIdentification
 * Reference15.mmCrossOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmOriginalCrossOrderIdentification
 * Reference15.mmOriginalCrossOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmClientOrderIdentification
 * Reference15.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmSecondaryOrderIdentification
 * Reference15.mmSecondaryOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference15#mmSecondaryClientOrderIdentification
 * Reference15.mmSecondaryClientOrderIdentification}</li>
 * </ul>
 * </li>
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
 * "Reference15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additional references linked to the order status."</li>
 * </ul>
 */
public class Reference15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text orderMassStatusRequestIdentification;
	/**
	 * Identification assigned by issuer of Mass Status Request to uniquely
	 * identify the request.
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrMassStsReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderMassStatusRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by issuer of Mass Status Request to uniquely identify the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderMassStatusRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference15.mmObject();
			isDerived = false;
			xmlTag = "OrdrMassStsReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderMassStatusRequestIdentification";
			definition = "Identification assigned by issuer of Mass Status Request to uniquely identify the request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text orderStatusRequestIdentification;
	/**
	 * Identification assigned by issuer of Order Status Request to uniquely
	 * identify the request.
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrStsReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderStatusRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by issuer of Order Status Request to uniquely identify the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderStatusRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference15.mmObject();
			isDerived = false;
			xmlTag = "OrdrStsReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderStatusRequestIdentification";
			definition = "Identification assigned by issuer of Order Status Request to uniquely identify the request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text orderIdentification;
	/**
	 * Unique identifier for Order as assigned by sell-side.
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
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
	 * definition} = "Unique identifier for Order as assigned by sell-side."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference15.mmObject();
			isDerived = false;
			xmlTag = "OrdrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderIdentification";
			definition = "Unique identifier for Order as assigned by sell-side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text hostCrossIdentification;
	/**
	 * Host assigned entity identification that can be used to reference all
	 * components of a cross; sides + strategy + legs. The HostCrossID will be
	 * used to link together components of the Cross Order. For example, each
	 * individual Notice of Execution associated with the order will carry
	 * HostCrossID in order to tie back to the original cross order.
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstCrossId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostCrossIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Host assigned entity identification that can be used to reference all components of a cross; sides + strategy + legs. The HostCrossID will be used to link together components of the Cross Order. For example, each individual Notice of Execution associated with the order will carry HostCrossID in order to tie back to the original cross order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostCrossIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference15.mmObject();
			isDerived = false;
			xmlTag = "HstCrossId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCrossIdentification";
			definition = "Host assigned entity identification that can be used to reference all components of a cross; sides + strategy + legs. The HostCrossID will be used to link together components of the Cross Order. For example, each individual Notice of Execution associated with the order will carry HostCrossID in order to tie back to the original cross order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text crossOrderIdentification;
	/**
	 * Identifier for a cross order. Must be unique during a given trading day.
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrossOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for a cross order. Must be unique during a given trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCrossOrderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference15.mmObject();
			isDerived = false;
			xmlTag = "CrossOrdrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossOrderIdentification";
			definition = "Identifier for a cross order. Must be unique during a given trading day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalCrossOrderIdentification;
	/**
	 * Cross Identification of the previous cross order (not the initial cross
	 * order of the day) as assigned by the institution, used to identify the
	 * previous cross order in Cross Order Modification Request and Cross Order
	 * Cancellation Request.
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCrossOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCrossOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cross Identification of the previous cross order (not the initial cross order of the day) as assigned by the institution, used to identify the previous cross order in Cross Order Modification Request and Cross Order Cancellation Request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalCrossOrderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCrossOrdrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCrossOrderIdentification";
			definition = "Cross Identification of the previous cross order (not the initial cross order of the day) as assigned by the institution, used to identify the previous cross order in Cross Order Modification Request and Cross Order Cancellation Request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientOrderIdentification;
	/**
	 * Unique identifier for Order as assigned by the buy-side.
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
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
	 * definition} = "Unique identifier for Order as assigned by the buy-side."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientOrderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference15.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for Order as assigned by the buy-side.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text secondaryOrderIdentification;
	/**
	 * Identifier assigned by the party which accepts the order.
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier assigned by the party which accepts the order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondaryOrderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference15.mmObject();
			isDerived = false;
			xmlTag = "ScndryOrdrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOrderIdentification";
			definition = "Identifier assigned by the party which accepts the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text secondaryClientOrderIdentification;
	/**
	 * Identifier assigned by the party which originates the order.
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
	 * {@linkplain com.tools20022.repository.msg.Reference15 Reference15}</li>
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
	 * "Identifier assigned by the party which originates the order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondaryClientOrderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference15.mmObject();
			isDerived = false;
			xmlTag = "ScndryClntOrdrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryClientOrderIdentification";
			definition = "Identifier assigned by the party which originates the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Reference15.mmOrderMassStatusRequestIdentification, com.tools20022.repository.msg.Reference15.mmOrderStatusRequestIdentification,
						com.tools20022.repository.msg.Reference15.mmOrderIdentification, com.tools20022.repository.msg.Reference15.mmHostCrossIdentification, com.tools20022.repository.msg.Reference15.mmCrossOrderIdentification,
						com.tools20022.repository.msg.Reference15.mmOriginalCrossOrderIdentification, com.tools20022.repository.msg.Reference15.mmClientOrderIdentification,
						com.tools20022.repository.msg.Reference15.mmSecondaryOrderIdentification, com.tools20022.repository.msg.Reference15.mmSecondaryClientOrderIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reference15";
				definition = "Additional references linked to the order status.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOrderMassStatusRequestIdentification() {
		return orderMassStatusRequestIdentification;
	}

	public void setOrderMassStatusRequestIdentification(Max35Text orderMassStatusRequestIdentification) {
		this.orderMassStatusRequestIdentification = orderMassStatusRequestIdentification;
	}

	public Max35Text getOrderStatusRequestIdentification() {
		return orderStatusRequestIdentification;
	}

	public void setOrderStatusRequestIdentification(Max35Text orderStatusRequestIdentification) {
		this.orderStatusRequestIdentification = orderStatusRequestIdentification;
	}

	public Max35Text getOrderIdentification() {
		return orderIdentification;
	}

	public void setOrderIdentification(Max35Text orderIdentification) {
		this.orderIdentification = orderIdentification;
	}

	public Max35Text getHostCrossIdentification() {
		return hostCrossIdentification;
	}

	public void setHostCrossIdentification(Max35Text hostCrossIdentification) {
		this.hostCrossIdentification = hostCrossIdentification;
	}

	public Max35Text getCrossOrderIdentification() {
		return crossOrderIdentification;
	}

	public void setCrossOrderIdentification(Max35Text crossOrderIdentification) {
		this.crossOrderIdentification = crossOrderIdentification;
	}

	public Max35Text getOriginalCrossOrderIdentification() {
		return originalCrossOrderIdentification;
	}

	public void setOriginalCrossOrderIdentification(Max35Text originalCrossOrderIdentification) {
		this.originalCrossOrderIdentification = originalCrossOrderIdentification;
	}

	public Max35Text getClientOrderIdentification() {
		return clientOrderIdentification;
	}

	public void setClientOrderIdentification(Max35Text clientOrderIdentification) {
		this.clientOrderIdentification = clientOrderIdentification;
	}

	public Max35Text getSecondaryOrderIdentification() {
		return secondaryOrderIdentification;
	}

	public void setSecondaryOrderIdentification(Max35Text secondaryOrderIdentification) {
		this.secondaryOrderIdentification = secondaryOrderIdentification;
	}

	public Max35Text getSecondaryClientOrderIdentification() {
		return secondaryClientOrderIdentification;
	}

	public void setSecondaryClientOrderIdentification(Max35Text secondaryClientOrderIdentification) {
		this.secondaryClientOrderIdentification = secondaryClientOrderIdentification;
	}
}
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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional references linked to the cross order modification request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference14#mmOriginalCrossOrderIdentification
 * Reference14.mmOriginalCrossOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference14#mmHostCrossIdentification
 * Reference14.mmHostCrossIdentification}</li>
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
 * "Reference14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional references linked to the cross order modification request."</li>
 * </ul>
 */
public class Reference14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text originalCrossOrderIdentification;
	/**
	 * Cross Identification of the previous cross order (not the initial cross
	 * order of the day) as assigned by the institution, used to identify the
	 * previous cross order in CrossOrderModificationRequest.
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
	 * {@linkplain com.tools20022.repository.msg.Reference14 Reference14}</li>
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
	 * "Cross Identification of the previous cross order (not the initial cross order of the day) as assigned by the institution, used to identify the previous cross order in CrossOrderModificationRequest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalCrossOrderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference14.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCrossOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCrossOrderIdentification";
			definition = "Cross Identification of the previous cross order (not the initial cross order of the day) as assigned by the institution, used to identify the previous cross order in CrossOrderModificationRequest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text hostCrossIdentification;
	/**
	 * Host assigned entity identification that can be used to reference all
	 * components of a cross; sides + strategy + legs. Used as the primary key
	 * with which to refer to the cross order for modification. The HostCrossId
	 * will also be used to link together components of the Cross Order. For
	 * example, each individual Notice of Execution associated with the order
	 * will carry HostCrossID in order to tie back to the original cross order.
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
	 * {@linkplain com.tools20022.repository.msg.Reference14 Reference14}</li>
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
	 * "Host assigned entity identification that can be used to reference all components of a cross; sides + strategy + legs. Used as the primary key with which to refer to the cross order for modification. The HostCrossId will also be used to link together components of the Cross Order. For example, each individual Notice of Execution associated with the order will carry HostCrossID in order to tie back to the original cross order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostCrossIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference14.mmObject();
			isDerived = false;
			xmlTag = "HstCrossId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCrossIdentification";
			definition = "Host assigned entity identification that can be used to reference all components of a cross; sides + strategy + legs. Used as the primary key with which to refer to the cross order for modification. The HostCrossId will also be used to link together components of the Cross Order. For example, each individual Notice of Execution associated with the order will carry HostCrossID in order to tie back to the original cross order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Reference14.mmOriginalCrossOrderIdentification, Reference14.mmHostCrossIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reference14";
				definition = "Additional references linked to the cross order modification request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalCrossOrderIdentification() {
		return originalCrossOrderIdentification;
	}

	public void setOriginalCrossOrderIdentification(Max35Text originalCrossOrderIdentification) {
		this.originalCrossOrderIdentification = originalCrossOrderIdentification;
	}

	public Max35Text getHostCrossIdentification() {
		return hostCrossIdentification;
	}

	public void setHostCrossIdentification(Max35Text hostCrossIdentification) {
		this.hostCrossIdentification = hostCrossIdentification;
	}
}
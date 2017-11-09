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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional references linked to the order modification request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference10#mmOriginalClientOrderIdentification
 * Reference10.mmOriginalClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference10#mmOriginalOrderModificationTime
 * Reference10.mmOriginalOrderModificationTime}</li>
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
 * "Reference10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional references linked to the order modification request."</li>
 * </ul>
 */
public class Reference10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text originalClientOrderIdentification;
	/**
	 * Client order identification of the previous non-rejected order (not the
	 * initial order of the day) when cancelling or replacing an order.
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
	 * {@linkplain com.tools20022.repository.msg.Reference10 Reference10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Client order identification of the previous non-rejected order (not the initial order of the day) when cancelling or replacing an order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalClientOrderIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlClntOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalClientOrderIdentification";
			definition = "Client order identification of the previous non-rejected order (not the initial order of the day) when cancelling or replacing an order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime originalOrderModificationTime;
	/**
	 * TransactionTime of the last state change that occurred to the original
	 * order. The original order modification time is provided as an optional
	 * field in the order modification request to identify that the state of the
	 * order has not changed since the request was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Reference10 Reference10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlOrdrModTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalOrderModificationTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransactionTime of the last state change that occurred to the original order. The original order modification time is provided as an optional field in the order modification request to identify that the state of the order has not changed since the request was issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalOrderModificationTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference10.mmObject();
			isDerived = false;
			xmlTag = "OrgnlOrdrModTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderModificationTime";
			definition = "TransactionTime of the last state change that occurred to the original order. The original order modification time is provided as an optional field in the order modification request to identify that the state of the order has not changed since the request was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Reference10.mmOriginalClientOrderIdentification, Reference10.mmOriginalOrderModificationTime);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reference10";
				definition = "Additional references linked to the order modification request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalClientOrderIdentification() {
		return originalClientOrderIdentification;
	}

	public void setOriginalClientOrderIdentification(Max35Text originalClientOrderIdentification) {
		this.originalClientOrderIdentification = originalClientOrderIdentification;
	}

	public ISODateTime getOriginalOrderModificationTime() {
		return originalOrderModificationTime;
	}

	public void setOriginalOrderModificationTime(ISODateTime originalOrderModificationTime) {
		this.originalOrderModificationTime = originalOrderModificationTime;
	}
}
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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the references of the underlying trade leg(s) and/or the reference
 * to the related NetPosition report message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference19#mmTradeLegNotificationIdentification
 * Reference19.mmTradeLegNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reference19#mmNetPositionIdentification
 * Reference19.mmNetPositionIdentification}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reference19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the references of the underlying trade leg(s) and/or the reference to the related NetPosition report message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Reference19", propOrder = {"tradeLegNotificationIdentification", "netPositionIdentification"})
public class Reference19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Max35Text> tradeLegNotificationIdentification;
	/**
	 * Reference allocated by the central counterparty - central counterpatry
	 * trade leg reference identification that uniquely identifies the trade.
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
	 * {@linkplain com.tools20022.repository.msg.Reference19 Reference19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradLegNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLegNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference allocated by the central counterparty - central counterpatry trade leg reference identification that uniquely identifies the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeLegNotificationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference19.mmObject();
			isDerived = false;
			xmlTag = "TradLegNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeLegNotificationIdentification";
			definition = "Reference allocated by the central counterparty - central counterpatry trade leg reference identification that uniquely identifies the trade.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text netPositionIdentification;
	/**
	 * After netting, reference that is common to a net transaction to settle
	 * and all its underlying trades
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
	 * {@linkplain com.tools20022.repository.msg.Reference19 Reference19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetPosId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPositionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "After netting, reference that is common to a net transaction to settle and all its underlying trades"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetPositionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference19.mmObject();
			isDerived = false;
			xmlTag = "NetPosId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPositionIdentification";
			definition = "After netting, reference that is common to a net transaction to settle and all its underlying trades";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Reference19.mmTradeLegNotificationIdentification, Reference19.mmNetPositionIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reference19";
				definition = "Provides the references of the underlying trade leg(s) and/or the reference to the related NetPosition report message.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TradLegNtfctnId")
	public List<Max35Text> getTradeLegNotificationIdentification() {
		return tradeLegNotificationIdentification;
	}

	public void setTradeLegNotificationIdentification(List<Max35Text> tradeLegNotificationIdentification) {
		this.tradeLegNotificationIdentification = tradeLegNotificationIdentification;
	}

	@XmlElement(name = "NetPosId")
	public Max35Text getNetPositionIdentification() {
		return netPositionIdentification;
	}

	public void setNetPositionIdentification(Max35Text netPositionIdentification) {
		this.netPositionIdentification = netPositionIdentification;
	}
}
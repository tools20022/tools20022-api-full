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
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max50Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Query of a trade party based on the identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery4#mmLEI
 * TradePartyIdentificationQuery4.mmLEI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery4#mmAnyBIC
 * TradePartyIdentificationQuery4.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery4#mmClientIdentification
 * TradePartyIdentificationQuery4.mmClientIdentification}</li>
 * </ul>
 * </li>
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
 * "TradePartyIdentificationQuery4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Query of a trade party based on the identification."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradePartyIdentificationQuery4", propOrder = {"lEI", "anyBIC", "clientIdentification"})
public class TradePartyIdentificationQuery4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LEI")
	protected List<LEIIdentifier> lEI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery4
	 * TradePartyIdentificationQuery4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal entity identifier code used to recognise the counterparty of the reporting agent for the reported transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradePartyIdentificationQuery4, List<LEIIdentifier>> mmLEI = new MMMessageAttribute<TradePartyIdentificationQuery4, List<LEIIdentifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentificationQuery4.mmObject();
			isDerived = false;
			xmlTag = "LEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LEI";
			definition = "Legal entity identifier code used to recognise the counterparty of the reporting agent for the reported transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public List<LEIIdentifier> getValue(TradePartyIdentificationQuery4 obj) {
			return obj.getLEI();
		}

		@Override
		public void setValue(TradePartyIdentificationQuery4 obj, List<LEIIdentifier> value) {
			obj.setLEI(value);
		}
	};
	@XmlElement(name = "AnyBIC")
	protected List<AnyBICIdentifier> anyBIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery4
	 * TradePartyIdentificationQuery4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business identifier code used to identify the trade party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradePartyIdentificationQuery4, List<AnyBICIdentifier>> mmAnyBIC = new MMMessageAttribute<TradePartyIdentificationQuery4, List<AnyBICIdentifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentificationQuery4.mmObject();
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Business identifier code used to identify the trade party.";
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public List<AnyBICIdentifier> getValue(TradePartyIdentificationQuery4 obj) {
			return obj.getAnyBIC();
		}

		@Override
		public void setValue(TradePartyIdentificationQuery4 obj, List<AnyBICIdentifier> value) {
			obj.setAnyBIC(value);
		}
	};
	@XmlElement(name = "ClntId")
	protected List<Max50Text> clientIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max50Text
	 * Max50Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentificationQuery4
	 * TradePartyIdentificationQuery4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the client counterparty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradePartyIdentificationQuery4, List<Max50Text>> mmClientIdentification = new MMMessageAttribute<TradePartyIdentificationQuery4, List<Max50Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentificationQuery4.mmObject();
			isDerived = false;
			xmlTag = "ClntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientIdentification";
			definition = "Unique and unambiguous identification of the client counterparty.";
			minOccurs = 0;
			simpleType_lazy = () -> Max50Text.mmObject();
		}

		@Override
		public List<Max50Text> getValue(TradePartyIdentificationQuery4 obj) {
			return obj.getClientIdentification();
		}

		@Override
		public void setValue(TradePartyIdentificationQuery4 obj, List<Max50Text> value) {
			obj.setClientIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradePartyIdentificationQuery4.mmLEI, com.tools20022.repository.msg.TradePartyIdentificationQuery4.mmAnyBIC,
						com.tools20022.repository.msg.TradePartyIdentificationQuery4.mmClientIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradePartyIdentificationQuery4";
				definition = "Query of a trade party based on the identification.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<LEIIdentifier> getLEI() {
		return lEI == null ? lEI = new ArrayList<>() : lEI;
	}

	public TradePartyIdentificationQuery4 setLEI(List<LEIIdentifier> lEI) {
		this.lEI = Objects.requireNonNull(lEI);
		return this;
	}

	public List<AnyBICIdentifier> getAnyBIC() {
		return anyBIC == null ? anyBIC = new ArrayList<>() : anyBIC;
	}

	public TradePartyIdentificationQuery4 setAnyBIC(List<AnyBICIdentifier> anyBIC) {
		this.anyBIC = Objects.requireNonNull(anyBIC);
		return this;
	}

	public List<Max50Text> getClientIdentification() {
		return clientIdentification == null ? clientIdentification = new ArrayList<>() : clientIdentification;
	}

	public TradePartyIdentificationQuery4 setClientIdentification(List<Max50Text> clientIdentification) {
		this.clientIdentification = Objects.requireNonNull(clientIdentification);
		return this;
	}
}
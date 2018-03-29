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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
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
 * Provides original client order identification and order modification time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CrossOrderCancel1#mmOriginalClientOrderIdentification
 * CrossOrderCancel1.mmOriginalClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CrossOrderCancel1#mmOriginalOrderModificationTime
 * CrossOrderCancel1.mmOriginalOrderModificationTime}</li>
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
 * "CrossOrderCancel1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides original client order identification and order modification time."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CrossOrderCancel1", propOrder = {"originalClientOrderIdentification", "originalOrderModificationTime"})
public class CrossOrderCancel1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlClntOrdrId", required = true)
	protected Max35Text originalClientOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CrossOrderCancel1
	 * CrossOrderCancel1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlClntOrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 41</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Client Order identification of the previous order (NOT the initial order of the day) as assigned by the institution, used to identify the previous order in cancel requests."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CrossOrderCancel1, Max35Text> mmOriginalClientOrderIdentification = new MMMessageAttribute<CrossOrderCancel1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CrossOrderCancel1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "41"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalClientOrderIdentification";
			definition = "Client Order identification of the previous order (NOT the initial order of the day) as assigned by the institution, used to identify the previous order in cancel requests.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CrossOrderCancel1 obj) {
			return obj.getOriginalClientOrderIdentification();
		}

		@Override
		public void setValue(CrossOrderCancel1 obj, Max35Text value) {
			obj.setOriginalClientOrderIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlOrdrModTm")
	protected ISODateTime originalOrderModificationTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CrossOrderCancel1
	 * CrossOrderCancel1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlOrdrModTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 586</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalOrderModificationTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the most recent (or current) CreationDateTime reported for the order. The original order modification time is provided as an optional field on Order Cancel Request to identify that the state of the order has not changed since the request was issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CrossOrderCancel1, Optional<ISODateTime>> mmOriginalOrderModificationTime = new MMMessageAttribute<CrossOrderCancel1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CrossOrderCancel1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlOrdrModTm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "586"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderModificationTime";
			definition = "Indicates the most recent (or current) CreationDateTime reported for the order. The original order modification time is provided as an optional field on Order Cancel Request to identify that the state of the order has not changed since the request was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CrossOrderCancel1 obj) {
			return obj.getOriginalOrderModificationTime();
		}

		@Override
		public void setValue(CrossOrderCancel1 obj, Optional<ISODateTime> value) {
			obj.setOriginalOrderModificationTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CrossOrderCancel1.mmOriginalClientOrderIdentification, com.tools20022.repository.msg.CrossOrderCancel1.mmOriginalOrderModificationTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CrossOrderCancel1";
				definition = "Provides original client order identification and order modification time.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalClientOrderIdentification() {
		return originalClientOrderIdentification;
	}

	public CrossOrderCancel1 setOriginalClientOrderIdentification(Max35Text originalClientOrderIdentification) {
		this.originalClientOrderIdentification = Objects.requireNonNull(originalClientOrderIdentification);
		return this;
	}

	public Optional<ISODateTime> getOriginalOrderModificationTime() {
		return originalOrderModificationTime == null ? Optional.empty() : Optional.of(originalOrderModificationTime);
	}

	public CrossOrderCancel1 setOriginalOrderModificationTime(ISODateTime originalOrderModificationTime) {
		this.originalOrderModificationTime = originalOrderModificationTime;
		return this;
	}
}
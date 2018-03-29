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
import com.tools20022.repository.codeset.ExchangePolicy1Code;
import com.tools20022.repository.codeset.PartyType5Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
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
 * Element containing all information needed to identify who triggered the
 * request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggerInformation1#mmTriggerSource
 * TriggerInformation1.mmTriggerSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggerInformation1#mmSourceIdentification
 * TriggerInformation1.mmSourceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggerInformation1#mmTriggerType
 * TriggerInformation1.mmTriggerType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggerInformation1#mmAdditionalInformation
 * TriggerInformation1.mmAdditionalInformation}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TriggerInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Element containing all information needed to identify who triggered the request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TriggerInformation1", propOrder = {"triggerSource", "sourceIdentification", "triggerType", "additionalInformation"})
public class TriggerInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrggrSrc", required = true)
	protected PartyType5Code triggerSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyType5Code
	 * PartyType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggerInformation1
	 * TriggerInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrggrSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TriggerSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actor who trigger the request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TriggerInformation1, PartyType5Code> mmTriggerSource = new MMMessageAttribute<TriggerInformation1, PartyType5Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TriggerInformation1.mmObject();
			isDerived = false;
			xmlTag = "TrggrSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TriggerSource";
			definition = "Actor who trigger the request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyType5Code.mmObject();
		}

		@Override
		public PartyType5Code getValue(TriggerInformation1 obj) {
			return obj.getTriggerSource();
		}

		@Override
		public void setValue(TriggerInformation1 obj, PartyType5Code value) {
			obj.setTriggerSource(value);
		}
	};
	@XmlElement(name = "SrcId", required = true)
	protected Max35Text sourceIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.TriggerInformation1
	 * TriggerInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the trigger source."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TriggerInformation1, Max35Text> mmSourceIdentification = new MMMessageAttribute<TriggerInformation1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TriggerInformation1.mmObject();
			isDerived = false;
			xmlTag = "SrcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceIdentification";
			definition = "Identification of the trigger source.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TriggerInformation1 obj) {
			return obj.getSourceIdentification();
		}

		@Override
		public void setValue(TriggerInformation1 obj, Max35Text value) {
			obj.setSourceIdentification(value);
		}
	};
	@XmlElement(name = "TrggrTp", required = true)
	protected ExchangePolicy1Code triggerType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicy1Code
	 * ExchangePolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggerInformation1
	 * TriggerInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrggrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TriggerType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of the call."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TriggerInformation1, ExchangePolicy1Code> mmTriggerType = new MMMessageAttribute<TriggerInformation1, ExchangePolicy1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TriggerInformation1.mmObject();
			isDerived = false;
			xmlTag = "TrggrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TriggerType";
			definition = "Identification of the type of the call.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangePolicy1Code.mmObject();
		}

		@Override
		public ExchangePolicy1Code getValue(TriggerInformation1 obj) {
			return obj.getTriggerType();
		}

		@Override
		public void setValue(TriggerInformation1 obj, ExchangePolicy1Code value) {
			obj.setTriggerType(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max70Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TriggerInformation1
	 * TriggerInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TriggerInformation1, Optional<Max70Text>> mmAdditionalInformation = new MMMessageAttribute<TriggerInformation1, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TriggerInformation1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(TriggerInformation1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(TriggerInformation1 obj, Optional<Max70Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TriggerInformation1.mmTriggerSource, com.tools20022.repository.msg.TriggerInformation1.mmSourceIdentification,
						com.tools20022.repository.msg.TriggerInformation1.mmTriggerType, com.tools20022.repository.msg.TriggerInformation1.mmAdditionalInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TriggerInformation1";
				definition = "Element containing all information needed to identify who triggered the request.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyType5Code getTriggerSource() {
		return triggerSource;
	}

	public TriggerInformation1 setTriggerSource(PartyType5Code triggerSource) {
		this.triggerSource = Objects.requireNonNull(triggerSource);
		return this;
	}

	public Max35Text getSourceIdentification() {
		return sourceIdentification;
	}

	public TriggerInformation1 setSourceIdentification(Max35Text sourceIdentification) {
		this.sourceIdentification = Objects.requireNonNull(sourceIdentification);
		return this;
	}

	public ExchangePolicy1Code getTriggerType() {
		return triggerType;
	}

	public TriggerInformation1 setTriggerType(ExchangePolicy1Code triggerType) {
		this.triggerType = Objects.requireNonNull(triggerType);
		return this;
	}

	public Optional<Max70Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public TriggerInformation1 setAdditionalInformation(Max70Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}
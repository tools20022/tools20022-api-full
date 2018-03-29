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
import com.tools20022.repository.codeset.ExoticOptionStyle1Code;
import com.tools20022.repository.codeset.OptionStyle5Code;
import com.tools20022.repository.codeset.OptionType1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Option;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OptionEvent2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Derivative instrument that gives the buyer the right but not the obligation
 * to purchase a set of quantity of a financial instrument at a future date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Option14#mmExpirationStyle
 * Option14.mmExpirationStyle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option14#mmOptionStyle
 * Option14.mmOptionStyle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option14#mmOptionType
 * Option14.mmOptionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option14#mmBarrierIndicator
 * Option14.mmBarrierIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option14#mmEventType
 * Option14.mmEventType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
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
 * "Option14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Derivative instrument that gives the buyer the right but not the obligation to purchase a set of quantity of a financial instrument at a future date."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Option14", propOrder = {"expirationStyle", "optionStyle", "optionType", "barrierIndicator", "eventType"})
public class Option14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XprtnStyle", required = true)
	protected List<OptionStyle5Code> expirationStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyle5Code
	 * OptionStyle5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
	 * Option.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option14
	 * Option14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XprtnStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpirationStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expiration style of the option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option14, List<OptionStyle5Code>> mmExpirationStyle = new MMMessageAttribute<Option14, List<OptionStyle5Code>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option14.mmObject();
			isDerived = false;
			xmlTag = "XprtnStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpirationStyle";
			definition = "Expiration style of the option.";
			maxOccurs = 4;
			minOccurs = 1;
			simpleType_lazy = () -> OptionStyle5Code.mmObject();
		}

		@Override
		public List<OptionStyle5Code> getValue(Option14 obj) {
			return obj.getExpirationStyle();
		}

		@Override
		public void setValue(Option14 obj, List<OptionStyle5Code> value) {
			obj.setExpirationStyle(value);
		}
	};
	@XmlElement(name = "OptnStyle")
	protected ExoticOptionStyle1Code optionStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyle1Code
	 * ExoticOptionStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
	 * Option.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option14
	 * Option14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how the option can be exercised."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option14, Optional<ExoticOptionStyle1Code>> mmOptionStyle = new MMMessageAttribute<Option14, Optional<ExoticOptionStyle1Code>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option14.mmObject();
			isDerived = false;
			xmlTag = "OptnStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how the option can be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExoticOptionStyle1Code.mmObject();
		}

		@Override
		public Optional<ExoticOptionStyle1Code> getValue(Option14 obj) {
			return obj.getOptionStyle();
		}

		@Override
		public void setValue(Option14 obj, Optional<ExoticOptionStyle1Code> value) {
			obj.setOptionStyle(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnTp")
	protected OptionType1Code optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionType1Code
	 * OptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionType
	 * Option.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option14
	 * Option14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the option is a call or a put."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option14, Optional<OptionType1Code>> mmOptionType = new MMMessageAttribute<Option14, Optional<OptionType1Code>>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option14.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies whether the option is a call or a put.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OptionType1Code.mmObject();
		}

		@Override
		public Optional<OptionType1Code> getValue(Option14 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(Option14 obj, Optional<OptionType1Code> value) {
			obj.setOptionType(value.orElse(null));
		}
	};
	@XmlElement(name = "BrrrInd")
	protected YesNoIndicator barrierIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option14
	 * Option14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BarrierIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the option has a barrier."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option14, Optional<YesNoIndicator>> mmBarrierIndicator = new MMMessageAttribute<Option14, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option14.mmObject();
			isDerived = false;
			xmlTag = "BrrrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BarrierIndicator";
			definition = "Indicates whether the option has a barrier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Option14 obj) {
			return obj.getBarrierIndicator();
		}

		@Override
		public void setValue(Option14 obj, Optional<YesNoIndicator> value) {
			obj.setBarrierIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtTp")
	protected OptionEvent2 eventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OptionEvent2
	 * OptionEvent2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option14
	 * Option14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the event in the life of the option."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Option14, Optional<OptionEvent2>> mmEventType = new MMMessageAssociationEnd<Option14, Optional<OptionEvent2>>() {
		{
			businessComponentTrace_lazy = () -> Option.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Option14.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "Specifies the event in the life of the option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionEvent2.mmObject();
		}

		@Override
		public Optional<OptionEvent2> getValue(Option14 obj) {
			return obj.getEventType();
		}

		@Override
		public void setValue(Option14 obj, Optional<OptionEvent2> value) {
			obj.setEventType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option14.mmExpirationStyle, com.tools20022.repository.msg.Option14.mmOptionStyle, com.tools20022.repository.msg.Option14.mmOptionType,
						com.tools20022.repository.msg.Option14.mmBarrierIndicator, com.tools20022.repository.msg.Option14.mmEventType);
				trace_lazy = () -> Option.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Option14";
				definition = "Derivative instrument that gives the buyer the right but not the obligation to purchase a set of quantity of a financial instrument at a future date.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<OptionStyle5Code> getExpirationStyle() {
		return expirationStyle == null ? expirationStyle = new ArrayList<>() : expirationStyle;
	}

	public Option14 setExpirationStyle(List<OptionStyle5Code> expirationStyle) {
		this.expirationStyle = Objects.requireNonNull(expirationStyle);
		return this;
	}

	public Optional<ExoticOptionStyle1Code> getOptionStyle() {
		return optionStyle == null ? Optional.empty() : Optional.of(optionStyle);
	}

	public Option14 setOptionStyle(ExoticOptionStyle1Code optionStyle) {
		this.optionStyle = optionStyle;
		return this;
	}

	public Optional<OptionType1Code> getOptionType() {
		return optionType == null ? Optional.empty() : Optional.of(optionType);
	}

	public Option14 setOptionType(OptionType1Code optionType) {
		this.optionType = optionType;
		return this;
	}

	public Optional<YesNoIndicator> getBarrierIndicator() {
		return barrierIndicator == null ? Optional.empty() : Optional.of(barrierIndicator);
	}

	public Option14 setBarrierIndicator(YesNoIndicator barrierIndicator) {
		this.barrierIndicator = barrierIndicator;
		return this;
	}

	public Optional<OptionEvent2> getEventType() {
		return eventType == null ? Optional.empty() : Optional.of(eventType);
	}

	public Option14 setEventType(OptionEvent2 eventType) {
		this.eventType = eventType;
		return this;
	}
}
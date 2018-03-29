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
import com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SidePocket;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information that identifies a side pocket in investment fund orders.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SidePocketInformation1#mmSidePocketInclusionIndicator
 * SidePocketInformation1.mmSidePocketInclusionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SidePocketInformation1#mmSidePocketIdentification
 * SidePocketInformation1.mmSidePocketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SidePocketInformation1#mmSidePocketQuantity
 * SidePocketInformation1.mmSidePocketQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SidePocket SidePocket}</li>
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
 * "SidePocketInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information that identifies a side pocket in investment fund orders."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SidePocketInformation1", propOrder = {"sidePocketInclusionIndicator", "sidePocketIdentification", "sidePocketQuantity"})
public class SidePocketInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SdPcktInclsnInd")
	protected YesNoIndicator sidePocketInclusionIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SidePocket#mmSidePocketInclusionIndicator
	 * SidePocket.mmSidePocketInclusionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SidePocketInformation1
	 * SidePocketInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdPcktInclsnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketInclusionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor wants to participate in the optional side pocket."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SidePocketInformation1, Optional<YesNoIndicator>> mmSidePocketInclusionIndicator = new MMMessageAttribute<SidePocketInformation1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SidePocket.mmSidePocketInclusionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SidePocketInformation1.mmObject();
			isDerived = false;
			xmlTag = "SdPcktInclsnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketInclusionIndicator";
			definition = "Indicates whether the investor wants to participate in the optional side pocket.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SidePocketInformation1 obj) {
			return obj.getSidePocketInclusionIndicator();
		}

		@Override
		public void setValue(SidePocketInformation1 obj, Optional<YesNoIndicator> value) {
			obj.setSidePocketInclusionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "SdPcktId")
	protected Max35Text sidePocketIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SidePocket#mmSidePocketIdentification
	 * SidePocket.mmSidePocketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SidePocketInformation1
	 * SidePocketInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdPcktId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the side pocket."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SidePocketInformation1, Optional<Max35Text>> mmSidePocketIdentification = new MMMessageAttribute<SidePocketInformation1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SidePocket.mmSidePocketIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SidePocketInformation1.mmObject();
			isDerived = false;
			xmlTag = "SdPcktId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketIdentification";
			definition = "Identification of the side pocket.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SidePocketInformation1 obj) {
			return obj.getSidePocketIdentification();
		}

		@Override
		public void setValue(SidePocketInformation1 obj, Optional<Max35Text> value) {
			obj.setSidePocketIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SdPcktQty")
	protected SidePocketUnitsOrAmountOrRate1Choice sidePocketQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice
	 * SidePocketUnitsOrAmountOrRate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SidePocket#mmSidePocketQuantity
	 * SidePocket.mmSidePocketQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SidePocketInformation1
	 * SidePocketInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdPcktQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of the side pocket."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SidePocketInformation1, Optional<SidePocketUnitsOrAmountOrRate1Choice>> mmSidePocketQuantity = new MMMessageAssociationEnd<SidePocketInformation1, Optional<SidePocketUnitsOrAmountOrRate1Choice>>() {
		{
			businessElementTrace_lazy = () -> SidePocket.mmSidePocketQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SidePocketInformation1.mmObject();
			isDerived = false;
			xmlTag = "SdPcktQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketQuantity";
			definition = "Quantity of the side pocket.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SidePocketUnitsOrAmountOrRate1Choice.mmObject();
		}

		@Override
		public Optional<SidePocketUnitsOrAmountOrRate1Choice> getValue(SidePocketInformation1 obj) {
			return obj.getSidePocketQuantity();
		}

		@Override
		public void setValue(SidePocketInformation1 obj, Optional<SidePocketUnitsOrAmountOrRate1Choice> value) {
			obj.setSidePocketQuantity(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SidePocketInformation1.mmSidePocketInclusionIndicator, com.tools20022.repository.msg.SidePocketInformation1.mmSidePocketIdentification,
						com.tools20022.repository.msg.SidePocketInformation1.mmSidePocketQuantity);
				trace_lazy = () -> SidePocket.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SidePocketInformation1";
				definition = "Information that identifies a side pocket in investment fund orders.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getSidePocketInclusionIndicator() {
		return sidePocketInclusionIndicator == null ? Optional.empty() : Optional.of(sidePocketInclusionIndicator);
	}

	public SidePocketInformation1 setSidePocketInclusionIndicator(YesNoIndicator sidePocketInclusionIndicator) {
		this.sidePocketInclusionIndicator = sidePocketInclusionIndicator;
		return this;
	}

	public Optional<Max35Text> getSidePocketIdentification() {
		return sidePocketIdentification == null ? Optional.empty() : Optional.of(sidePocketIdentification);
	}

	public SidePocketInformation1 setSidePocketIdentification(Max35Text sidePocketIdentification) {
		this.sidePocketIdentification = sidePocketIdentification;
		return this;
	}

	public Optional<SidePocketUnitsOrAmountOrRate1Choice> getSidePocketQuantity() {
		return sidePocketQuantity == null ? Optional.empty() : Optional.of(sidePocketQuantity);
	}

	public SidePocketInformation1 setSidePocketQuantity(SidePocketUnitsOrAmountOrRate1Choice sidePocketQuantity) {
		this.sidePocketQuantity = sidePocketQuantity;
		return this;
	}
}
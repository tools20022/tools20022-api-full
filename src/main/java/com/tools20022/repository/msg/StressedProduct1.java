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
import com.tools20022.repository.choice.StressSize1Choice;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification172;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Financial instrument stressed under a stress test scenario.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StressedProduct1#mmIdentification
 * StressedProduct1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StressedProduct1#mmMaximumStressSize
 * StressedProduct1.mmMaximumStressSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StressedProduct1#mmMinimumStressSize
 * StressedProduct1.mmMinimumStressSize}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
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
 * "StressedProduct1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Financial instrument stressed under a stress test scenario."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.GenericIdentification172
 * GenericIdentification172}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StressedProduct1", propOrder = {"identification", "maximumStressSize", "minimumStressSize"})
public class StressedProduct1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected GenericIdentification172 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification172
	 * GenericIdentification172}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StressedProduct1
	 * StressedProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification172#mmIdentification
	 * GenericIdentification172.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StressedProduct1, GenericIdentification172> mmIdentification = new MMMessageAttribute<StressedProduct1, GenericIdentification172>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StressedProduct1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identifier of the product.";
			previousVersion_lazy = () -> GenericIdentification172.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification172.mmObject();
		}

		@Override
		public GenericIdentification172 getValue(StressedProduct1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(StressedProduct1 obj, GenericIdentification172 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "MaxStrssSz", required = true)
	protected StressSize1Choice maximumStressSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.StressSize1Choice
	 * StressSize1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StressedProduct1
	 * StressedProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxStrssSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumStressSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum move across the curve for the stressed product.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StressedProduct1, StressSize1Choice> mmMaximumStressSize = new MMMessageAssociationEnd<StressedProduct1, StressSize1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StressedProduct1.mmObject();
			isDerived = false;
			xmlTag = "MaxStrssSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumStressSize";
			definition = "Maximum move across the curve for the stressed product.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> StressSize1Choice.mmObject();
		}

		@Override
		public StressSize1Choice getValue(StressedProduct1 obj) {
			return obj.getMaximumStressSize();
		}

		@Override
		public void setValue(StressedProduct1 obj, StressSize1Choice value) {
			obj.setMaximumStressSize(value);
		}
	};
	@XmlElement(name = "MinStrssSz", required = true)
	protected StressSize1Choice minimumStressSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.StressSize1Choice
	 * StressSize1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StressedProduct1
	 * StressedProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinStrssSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumStressSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum move across the curve for the stressed product.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StressedProduct1, StressSize1Choice> mmMinimumStressSize = new MMMessageAssociationEnd<StressedProduct1, StressSize1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StressedProduct1.mmObject();
			isDerived = false;
			xmlTag = "MinStrssSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumStressSize";
			definition = "Minimum move across the curve for the stressed product.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> StressSize1Choice.mmObject();
		}

		@Override
		public StressSize1Choice getValue(StressedProduct1 obj) {
			return obj.getMinimumStressSize();
		}

		@Override
		public void setValue(StressedProduct1 obj, StressSize1Choice value) {
			obj.setMinimumStressSize(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StressedProduct1.mmIdentification, com.tools20022.repository.msg.StressedProduct1.mmMaximumStressSize,
						com.tools20022.repository.msg.StressedProduct1.mmMinimumStressSize);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StressedProduct1";
				definition = "Financial instrument stressed under a stress test scenario.";
				previousVersion_lazy = () -> GenericIdentification172.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification172 getIdentification() {
		return identification;
	}

	public StressedProduct1 setIdentification(GenericIdentification172 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public StressSize1Choice getMaximumStressSize() {
		return maximumStressSize;
	}

	public StressedProduct1 setMaximumStressSize(StressSize1Choice maximumStressSize) {
		this.maximumStressSize = Objects.requireNonNull(maximumStressSize);
		return this;
	}

	public StressSize1Choice getMinimumStressSize() {
		return minimumStressSize;
	}

	public StressedProduct1 setMinimumStressSize(StressSize1Choice minimumStressSize) {
		this.minimumStressSize = Objects.requireNonNull(minimumStressSize);
		return this;
	}
}
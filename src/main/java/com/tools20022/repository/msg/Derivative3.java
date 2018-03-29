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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AssetClassification;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.Option;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DerivativeClassification1;
import com.tools20022.repository.msg.DerivativeUnderlyingLeg1;
import com.tools20022.repository.msg.Option14;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Financial instrument where the value of the instrument derives from another
 * financial instrument, benchmark or index.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Derivative3#mmDerivativeClassification
 * Derivative3.mmDerivativeClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Derivative3#mmDerivativeUnderlyingLeg
 * Derivative3.mmDerivativeUnderlyingLeg}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Derivative3#mmOptionAttributes
 * Derivative3.mmOptionAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "Derivative3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instrument where the value of the instrument derives from another financial instrument, benchmark or index."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Derivative3", propOrder = {"derivativeClassification", "derivativeUnderlyingLeg", "optionAttributes"})
public class Derivative3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DerivClssfctn", required = true)
	protected DerivativeClassification1 derivativeClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeClassification1
	 * DerivativeClassification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Derivative3 Derivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hierarchy of classification of a derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Derivative3, DerivativeClassification1> mmDerivativeClassification = new MMMessageAssociationEnd<Derivative3, DerivativeClassification1>() {
		{
			businessComponentTrace_lazy = () -> AssetClassification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Derivative3.mmObject();
			isDerived = false;
			xmlTag = "DerivClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeClassification";
			definition = "Hierarchy of classification of a derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DerivativeClassification1.mmObject();
		}

		@Override
		public DerivativeClassification1 getValue(Derivative3 obj) {
			return obj.getDerivativeClassification();
		}

		@Override
		public void setValue(Derivative3 obj, DerivativeClassification1 value) {
			obj.setDerivativeClassification(value);
		}
	};
	@XmlElement(name = "DerivUndrlygLeg", required = true)
	protected List<DerivativeUnderlyingLeg1> derivativeUnderlyingLeg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeUnderlyingLeg1
	 * DerivativeUnderlyingLeg1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Derivative3 Derivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivUndrlygLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeUnderlyingLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Derivative3, List<DerivativeUnderlyingLeg1>> mmDerivativeUnderlyingLeg = new MMMessageAssociationEnd<Derivative3, List<DerivativeUnderlyingLeg1>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.Derivative3.mmObject();
			isDerived = false;
			xmlTag = "DerivUndrlygLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeUnderlyingLeg";
			definition = "\r\n";
			maxOccurs = 2;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DerivativeUnderlyingLeg1.mmObject();
		}

		@Override
		public List<DerivativeUnderlyingLeg1> getValue(Derivative3 obj) {
			return obj.getDerivativeUnderlyingLeg();
		}

		@Override
		public void setValue(Derivative3 obj, List<DerivativeUnderlyingLeg1> value) {
			obj.setDerivativeUnderlyingLeg(value);
		}
	};
	@XmlElement(name = "OptnAttrbts")
	protected Option14 optionAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Option14 Option14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Derivative3 Derivative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option specific attributes.\r\n\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Derivative3, Optional<Option14>> mmOptionAttributes = new MMMessageAssociationEnd<Derivative3, Optional<Option14>>() {
		{
			businessComponentTrace_lazy = () -> Option.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Derivative3.mmObject();
			isDerived = false;
			xmlTag = "OptnAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAttributes";
			definition = "Option specific attributes.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Option14.mmObject();
		}

		@Override
		public Optional<Option14> getValue(Derivative3 obj) {
			return obj.getOptionAttributes();
		}

		@Override
		public void setValue(Derivative3 obj, Optional<Option14> value) {
			obj.setOptionAttributes(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Derivative3.mmDerivativeClassification, com.tools20022.repository.msg.Derivative3.mmDerivativeUnderlyingLeg,
						com.tools20022.repository.msg.Derivative3.mmOptionAttributes);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Derivative3";
				definition = "Financial instrument where the value of the instrument derives from another financial instrument, benchmark or index.";
			}
		});
		return mmObject_lazy.get();
	}

	public DerivativeClassification1 getDerivativeClassification() {
		return derivativeClassification;
	}

	public Derivative3 setDerivativeClassification(DerivativeClassification1 derivativeClassification) {
		this.derivativeClassification = Objects.requireNonNull(derivativeClassification);
		return this;
	}

	public List<DerivativeUnderlyingLeg1> getDerivativeUnderlyingLeg() {
		return derivativeUnderlyingLeg == null ? derivativeUnderlyingLeg = new ArrayList<>() : derivativeUnderlyingLeg;
	}

	public Derivative3 setDerivativeUnderlyingLeg(List<DerivativeUnderlyingLeg1> derivativeUnderlyingLeg) {
		this.derivativeUnderlyingLeg = Objects.requireNonNull(derivativeUnderlyingLeg);
		return this;
	}

	public Optional<Option14> getOptionAttributes() {
		return optionAttributes == null ? Optional.empty() : Optional.of(optionAttributes);
	}

	public Derivative3 setOptionAttributes(Option14 optionAttributes) {
		this.optionAttributes = optionAttributes;
		return this;
	}
}
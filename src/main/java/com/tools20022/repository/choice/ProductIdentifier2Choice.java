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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.ProductIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification4;
import com.tools20022.repository.msg.ProductIdentifier2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies a product in coded form or free text.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductIdentifier2Choice#mmStructuredProductIdentifier
 * ProductIdentifier2Choice.mmStructuredProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductIdentifier2Choice#mmOtherProductIdentifier
 * ProductIdentifier2Choice.mmOtherProductIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProductIdentification
 * ProductIdentification}</li>
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
 * "ProductIdentifier2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies a product in coded form or free text."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProductIdentifier2Choice", propOrder = {"structuredProductIdentifier", "otherProductIdentifier"})
public class ProductIdentifier2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StrdPdctIdr", required = true)
	protected ProductIdentifier2 structuredProductIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProductIdentifier2
	 * ProductIdentifier2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification
	 * ProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProductIdentifier2Choice
	 * ProductIdentifier2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrdPdctIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredProductIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of product identifier."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProductIdentifier2Choice, ProductIdentifier2> mmStructuredProductIdentifier = new MMMessageAssociationEnd<ProductIdentifier2Choice, ProductIdentifier2>() {
		{
			businessComponentTrace_lazy = () -> ProductIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProductIdentifier2Choice.mmObject();
			isDerived = false;
			xmlTag = "StrdPdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredProductIdentifier";
			definition = "Specifies the type of product identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProductIdentifier2.mmObject();
		}

		@Override
		public ProductIdentifier2 getValue(ProductIdentifier2Choice obj) {
			return obj.getStructuredProductIdentifier();
		}

		@Override
		public void setValue(ProductIdentifier2Choice obj, ProductIdentifier2 value) {
			obj.setStructuredProductIdentifier(value);
		}
	};
	@XmlElement(name = "OthrPdctIdr", required = true)
	protected GenericIdentification4 otherProductIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification4
	 * GenericIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification
	 * ProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProductIdentifier2Choice
	 * ProductIdentifier2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPdctIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProductIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of product identifier not present in the code list."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProductIdentifier2Choice, GenericIdentification4> mmOtherProductIdentifier = new MMMessageAssociationEnd<ProductIdentifier2Choice, GenericIdentification4>() {
		{
			businessComponentTrace_lazy = () -> ProductIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProductIdentifier2Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrPdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProductIdentifier";
			definition = "Specifies the type of product identifier not present in the code list.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification4.mmObject();
		}

		@Override
		public GenericIdentification4 getValue(ProductIdentifier2Choice obj) {
			return obj.getOtherProductIdentifier();
		}

		@Override
		public void setValue(ProductIdentifier2Choice obj, GenericIdentification4 value) {
			obj.setOtherProductIdentifier(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProductIdentifier2Choice.mmStructuredProductIdentifier, com.tools20022.repository.choice.ProductIdentifier2Choice.mmOtherProductIdentifier);
				trace_lazy = () -> ProductIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductIdentifier2Choice";
				definition = "Identifies a product in coded form or free text.";
			}
		});
		return mmObject_lazy.get();
	}

	public ProductIdentifier2 getStructuredProductIdentifier() {
		return structuredProductIdentifier;
	}

	public ProductIdentifier2Choice setStructuredProductIdentifier(ProductIdentifier2 structuredProductIdentifier) {
		this.structuredProductIdentifier = Objects.requireNonNull(structuredProductIdentifier);
		return this;
	}

	public GenericIdentification4 getOtherProductIdentifier() {
		return otherProductIdentifier;
	}

	public ProductIdentifier2Choice setOtherProductIdentifier(GenericIdentification4 otherProductIdentifier) {
		this.otherProductIdentifier = Objects.requireNonNull(otherProductIdentifier);
		return this;
	}
}
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
import com.tools20022.repository.codeset.AssetClassProductType3Code;
import com.tools20022.repository.codeset.AssetClassSubProductType29Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity sub-product attributes of an environmental derivative of
 * type carbon related.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1#mmBaseProduct
 * EnvironmentalCommodityCarbonRelated1.mmBaseProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1#mmSubProduct
 * EnvironmentalCommodityCarbonRelated1.mmSubProduct}</li>
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
 * "EnvironmentalCommodityCarbonRelated1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity sub-product attributes of an environmental derivative of type carbon related."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EnvironmentalCommodityCarbonRelated1", propOrder = {"baseProduct", "subProduct"})
public class EnvironmentalCommodityCarbonRelated1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BasePdct", required = true)
	protected AssetClassProductType3Code baseProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType3Code
	 * AssetClassProductType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1
	 * EnvironmentalCommodityCarbonRelated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BasePdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Base product for the underlying asset class as specified in the classification of commodities derivatives table."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnvironmentalCommodityCarbonRelated1, AssetClassProductType3Code> mmBaseProduct = new MMMessageAttribute<EnvironmentalCommodityCarbonRelated1, AssetClassProductType3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1.mmObject();
			isDerived = false;
			xmlTag = "BasePdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseProduct";
			definition = "Base product for the underlying asset class as specified in the classification of commodities derivatives table.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassProductType3Code.mmObject();
		}

		@Override
		public AssetClassProductType3Code getValue(EnvironmentalCommodityCarbonRelated1 obj) {
			return obj.getBaseProduct();
		}

		@Override
		public void setValue(EnvironmentalCommodityCarbonRelated1 obj, AssetClassProductType3Code value) {
			obj.setBaseProduct(value);
		}
	};
	@XmlElement(name = "SubPdct", required = true)
	protected AssetClassSubProductType29Code subProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType29Code
	 * AssetClassSubProductType29Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1
	 * EnvironmentalCommodityCarbonRelated1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub-product for the underlying asset class."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnvironmentalCommodityCarbonRelated1, AssetClassSubProductType29Code> mmSubProduct = new MMMessageAttribute<EnvironmentalCommodityCarbonRelated1, AssetClassSubProductType29Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1.mmObject();
			isDerived = false;
			xmlTag = "SubPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubProduct";
			definition = "Sub-product for the underlying asset class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductType29Code.mmObject();
		}

		@Override
		public AssetClassSubProductType29Code getValue(EnvironmentalCommodityCarbonRelated1 obj) {
			return obj.getSubProduct();
		}

		@Override
		public void setValue(EnvironmentalCommodityCarbonRelated1 obj, AssetClassSubProductType29Code value) {
			obj.setSubProduct(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1.mmBaseProduct, com.tools20022.repository.msg.EnvironmentalCommodityCarbonRelated1.mmSubProduct);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EnvironmentalCommodityCarbonRelated1";
				definition = "Defines commodity sub-product attributes of an environmental derivative of type carbon related.";
			}
		});
		return mmObject_lazy.get();
	}

	public AssetClassProductType3Code getBaseProduct() {
		return baseProduct;
	}

	public EnvironmentalCommodityCarbonRelated1 setBaseProduct(AssetClassProductType3Code baseProduct) {
		this.baseProduct = Objects.requireNonNull(baseProduct);
		return this;
	}

	public AssetClassSubProductType29Code getSubProduct() {
		return subProduct;
	}

	public EnvironmentalCommodityCarbonRelated1 setSubProduct(AssetClassSubProductType29Code subProduct) {
		this.subProduct = Objects.requireNonNull(subProduct);
		return this;
	}
}
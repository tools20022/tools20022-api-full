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
import com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code;
import com.tools20022.repository.codeset.AssetClassProductType7Code;
import com.tools20022.repository.codeset.AssetClassSubProductType16Code;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity sub-product attributes of a metal derivative of type
 * precious.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1#mmBaseProduct
 * MetalCommodityPrecious1.mmBaseProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1#mmSubProduct
 * MetalCommodityPrecious1.mmSubProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1#mmAdditionalSubProduct
 * MetalCommodityPrecious1.mmAdditionalSubProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
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
 * "MetalCommodityPrecious1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity sub-product attributes of a metal derivative of type precious."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MetalCommodityPrecious1", propOrder = {"baseProduct", "subProduct", "additionalSubProduct"})
public class MetalCommodityPrecious1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BasePdct", required = true)
	protected AssetClassProductType7Code baseProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType7Code
	 * AssetClassProductType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1
	 * MetalCommodityPrecious1}</li>
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
	public static final MMMessageAttribute<MetalCommodityPrecious1, AssetClassProductType7Code> mmBaseProduct = new MMMessageAttribute<MetalCommodityPrecious1, AssetClassProductType7Code>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.MetalCommodityPrecious1.mmObject();
			isDerived = false;
			xmlTag = "BasePdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseProduct";
			definition = "Base product for the underlying asset class as specified in the classification of commodities derivatives table.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassProductType7Code.mmObject();
		}

		@Override
		public AssetClassProductType7Code getValue(MetalCommodityPrecious1 obj) {
			return obj.getBaseProduct();
		}

		@Override
		public void setValue(MetalCommodityPrecious1 obj, AssetClassProductType7Code value) {
			obj.setBaseProduct(value);
		}
	};
	@XmlElement(name = "SubPdct", required = true)
	protected AssetClassSubProductType16Code subProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType16Code
	 * AssetClassSubProductType16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1
	 * MetalCommodityPrecious1}</li>
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
	public static final MMMessageAttribute<MetalCommodityPrecious1, AssetClassSubProductType16Code> mmSubProduct = new MMMessageAttribute<MetalCommodityPrecious1, AssetClassSubProductType16Code>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.MetalCommodityPrecious1.mmObject();
			isDerived = false;
			xmlTag = "SubPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubProduct";
			definition = "Sub-product for the underlying asset class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductType16Code.mmObject();
		}

		@Override
		public AssetClassSubProductType16Code getValue(MetalCommodityPrecious1 obj) {
			return obj.getSubProduct();
		}

		@Override
		public void setValue(MetalCommodityPrecious1 obj, AssetClassSubProductType16Code value) {
			obj.setSubProduct(value);
		}
	};
	@XmlElement(name = "AddtlSubPdct", required = true)
	protected AssetClassDetailedSubProductType11Code additionalSubProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code
	 * AssetClassDetailedSubProductType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1
	 * MetalCommodityPrecious1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSubPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalSubProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further subproduct type related to instruments that have a non-financial instrument or commodity as underlying."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MetalCommodityPrecious1, AssetClassDetailedSubProductType11Code> mmAdditionalSubProduct = new MMMessageAttribute<MetalCommodityPrecious1, AssetClassDetailedSubProductType11Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MetalCommodityPrecious1.mmObject();
			isDerived = false;
			xmlTag = "AddtlSubPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalSubProduct";
			definition = "Further subproduct type related to instruments that have a non-financial instrument or commodity as underlying.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassDetailedSubProductType11Code.mmObject();
		}

		@Override
		public AssetClassDetailedSubProductType11Code getValue(MetalCommodityPrecious1 obj) {
			return obj.getAdditionalSubProduct();
		}

		@Override
		public void setValue(MetalCommodityPrecious1 obj, AssetClassDetailedSubProductType11Code value) {
			obj.setAdditionalSubProduct(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MetalCommodityPrecious1.mmBaseProduct, com.tools20022.repository.msg.MetalCommodityPrecious1.mmSubProduct,
						com.tools20022.repository.msg.MetalCommodityPrecious1.mmAdditionalSubProduct);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MetalCommodityPrecious1";
				definition = "Defines commodity sub-product attributes of a metal derivative of type precious.";
			}
		});
		return mmObject_lazy.get();
	}

	public AssetClassProductType7Code getBaseProduct() {
		return baseProduct;
	}

	public MetalCommodityPrecious1 setBaseProduct(AssetClassProductType7Code baseProduct) {
		this.baseProduct = Objects.requireNonNull(baseProduct);
		return this;
	}

	public AssetClassSubProductType16Code getSubProduct() {
		return subProduct;
	}

	public MetalCommodityPrecious1 setSubProduct(AssetClassSubProductType16Code subProduct) {
		this.subProduct = Objects.requireNonNull(subProduct);
		return this;
	}

	public AssetClassDetailedSubProductType11Code getAdditionalSubProduct() {
		return additionalSubProduct;
	}

	public MetalCommodityPrecious1 setAdditionalSubProduct(AssetClassDetailedSubProductType11Code additionalSubProduct) {
		this.additionalSubProduct = Objects.requireNonNull(additionalSubProduct);
		return this;
	}
}
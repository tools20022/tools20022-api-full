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
import com.tools20022.repository.codeset.AssetClassProductType6Code;
import com.tools20022.repository.codeset.AssetClassSubProductType33Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity sub-product attributes of an industrial product derivative
 * of type construction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndustrialProductCommodityConstruction1#mmBaseProduct
 * IndustrialProductCommodityConstruction1.mmBaseProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndustrialProductCommodityConstruction1#mmSubProduct
 * IndustrialProductCommodityConstruction1.mmSubProduct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndustrialProductCommodityConstruction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity sub-product attributes of an industrial product derivative of type construction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IndustrialProductCommodityConstruction1", propOrder = {"baseProduct", "subProduct"})
public class IndustrialProductCommodityConstruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AssetClassProductType6Code baseProduct;
	/**
	 * Base product for the underlying asset class as specified in the
	 * classification of commodities derivatives table.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType6Code
	 * AssetClassProductType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndustrialProductCommodityConstruction1
	 * IndustrialProductCommodityConstruction1}</li>
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
	public static final MMMessageAttribute mmBaseProduct = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IndustrialProductCommodityConstruction1.mmObject();
			isDerived = false;
			xmlTag = "BasePdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseProduct";
			definition = "Base product for the underlying asset class as specified in the classification of commodities derivatives table.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassProductType6Code.mmObject();
		}
	};
	protected AssetClassSubProductType33Code subProduct;
	/**
	 * Sub-product for the underlying asset class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType33Code
	 * AssetClassSubProductType33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndustrialProductCommodityConstruction1
	 * IndustrialProductCommodityConstruction1}</li>
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
	public static final MMMessageAttribute mmSubProduct = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IndustrialProductCommodityConstruction1.mmObject();
			isDerived = false;
			xmlTag = "SubPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubProduct";
			definition = "Sub-product for the underlying asset class.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClassSubProductType33Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IndustrialProductCommodityConstruction1.mmBaseProduct, IndustrialProductCommodityConstruction1.mmSubProduct);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndustrialProductCommodityConstruction1";
				definition = "Defines commodity sub-product attributes of an industrial product derivative of type construction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BasePdct", required = true)
	public AssetClassProductType6Code getBaseProduct() {
		return baseProduct;
	}

	public void setBaseProduct(AssetClassProductType6Code baseProduct) {
		this.baseProduct = baseProduct;
	}

	@XmlElement(name = "SubPdct")
	public AssetClassSubProductType33Code getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(AssetClassSubProductType33Code subProduct) {
		this.subProduct = subProduct;
	}
}
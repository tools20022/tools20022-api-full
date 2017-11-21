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
import com.tools20022.repository.codeset.AssetClassProductType11Code;
import com.tools20022.repository.codeset.AssetClassSubProductType47Code;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity sub-product attributes of an other c10 of type deliverable.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityDeliverable2#mmBaseProduct
 * OtherC10CommodityDeliverable2.mmBaseProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityDeliverable2#mmSubProduct
 * OtherC10CommodityDeliverable2.mmSubProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
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
 * "OtherC10CommodityDeliverable2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity sub-product attributes of an other c10 of type deliverable."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OtherC10CommodityDeliverable2", propOrder = {"baseProduct", "subProduct"})
public class OtherC10CommodityDeliverable2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AssetClassProductType11Code baseProduct;
	/**
	 * Base product for the underlying asset class as specified in the
	 * classification of commodities derivatives table.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType11Code
	 * AssetClassProductType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityDeliverable2
	 * OtherC10CommodityDeliverable2}</li>
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
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> OtherC10CommodityDeliverable2.mmObject();
			isDerived = false;
			xmlTag = "BasePdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseProduct";
			definition = "Base product for the underlying asset class as specified in the classification of commodities derivatives table.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassProductType11Code.mmObject();
		}
	};
	protected AssetClassSubProductType47Code subProduct;
	/**
	 * Sub-product for the underlying asset class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType47Code
	 * AssetClassSubProductType47Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityDeliverable2
	 * OtherC10CommodityDeliverable2}</li>
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
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> OtherC10CommodityDeliverable2.mmObject();
			isDerived = false;
			xmlTag = "SubPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubProduct";
			definition = "Sub-product for the underlying asset class.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClassSubProductType47Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OtherC10CommodityDeliverable2.mmBaseProduct, OtherC10CommodityDeliverable2.mmSubProduct);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherC10CommodityDeliverable2";
				definition = "Defines commodity sub-product attributes of an other c10 of type deliverable.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BasePdct", required = true)
	public AssetClassProductType11Code getBaseProduct() {
		return baseProduct;
	}

	public void setBaseProduct(AssetClassProductType11Code baseProduct) {
		this.baseProduct = baseProduct;
	}

	@XmlElement(name = "SubPdct")
	public AssetClassSubProductType47Code getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(AssetClassSubProductType47Code subProduct) {
		this.subProduct = subProduct;
	}
}
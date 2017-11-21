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
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MetalCommodityNonPrecious1;
import com.tools20022.repository.msg.MetalCommodityPrecious1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity attributes of a derivative where the type is metal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityMetal1Choice#mmNonPrecious
 * AssetClassCommodityMetal1Choice.mmNonPrecious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityMetal1Choice#mmPrecious
 * AssetClassCommodityMetal1Choice.mmPrecious}</li>
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
 * "AssetClassCommodityMetal1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is metal."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AssetClassCommodityMetal1Choice", propOrder = {"nonPrecious", "precious"})
public class AssetClassCommodityMetal1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected MetalCommodityNonPrecious1 nonPrecious;
	/**
	 * Non-precious metal commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityNonPrecious1
	 * MetalCommodityNonPrecious1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityMetal1Choice
	 * AssetClassCommodityMetal1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonPrcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonPrecious"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non-precious metal commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonPrecious = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityMetal1Choice.mmObject();
			isDerived = false;
			xmlTag = "NonPrcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonPrecious";
			definition = "Non-precious metal commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MetalCommodityNonPrecious1.mmObject();
		}
	};
	protected MetalCommodityPrecious1 precious;
	/**
	 * Precious metal commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MetalCommodityPrecious1
	 * MetalCommodityPrecious1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityMetal1Choice
	 * AssetClassCommodityMetal1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Precious"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Precious metal commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrecious = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityMetal1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Precious";
			definition = "Precious metal commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MetalCommodityPrecious1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AssetClassCommodityMetal1Choice.mmNonPrecious, AssetClassCommodityMetal1Choice.mmPrecious);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityMetal1Choice";
				definition = "Defines commodity attributes of a derivative where the type is metal.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NonPrcs", required = true)
	public MetalCommodityNonPrecious1 getNonPrecious() {
		return nonPrecious;
	}

	public void setNonPrecious(MetalCommodityNonPrecious1 nonPrecious) {
		this.nonPrecious = nonPrecious;
	}

	@XmlElement(name = "Prcs", required = true)
	public MetalCommodityPrecious1 getPrecious() {
		return precious;
	}

	public void setPrecious(MetalCommodityPrecious1 precious) {
		this.precious = precious;
	}
}
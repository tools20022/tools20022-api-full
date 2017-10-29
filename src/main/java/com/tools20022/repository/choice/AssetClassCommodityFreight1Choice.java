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
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.msg.FreightCommodityContainerShip1;
import com.tools20022.repository.msg.FreightCommodityDry1;
import com.tools20022.repository.msg.FreightCommodityWet1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines commodity attributes of a derivative where the type is freight.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#Dry
 * AssetClassCommodityFreight1Choice.Dry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#Wet
 * AssetClassCommodityFreight1Choice.Wet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice#ContainerShip
 * AssetClassCommodityFreight1Choice.ContainerShip}</li>
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
 * "AssetClassCommodityFreight1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is freight."</li>
 * </ul>
 */
public class AssetClassCommodityFreight1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dry freight commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FreightCommodityDry1
	 * FreightCommodityDry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice
	 * AssetClassCommodityFreight1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dry freight commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Dry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityFreight1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Dry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dry";
			definition = "Dry freight commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FreightCommodityDry1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Wet freight commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FreightCommodityWet1
	 * FreightCommodityWet1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice
	 * AssetClassCommodityFreight1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wet freight commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Wet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityFreight1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Wet";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wet";
			definition = "Wet freight commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FreightCommodityWet1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Container ship freight commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FreightCommodityContainerShip1
	 * FreightCommodityContainerShip1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFreight1Choice
	 * AssetClassCommodityFreight1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntnrShip"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContainerShip"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Container ship freight commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ContainerShip = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityFreight1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "CntnrShip";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContainerShip";
			definition = "Container ship freight commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FreightCommodityContainerShip1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.Dry, com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.Wet,
						com.tools20022.repository.choice.AssetClassCommodityFreight1Choice.ContainerShip);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityFreight1Choice";
				definition = "Defines commodity attributes of a derivative where the type is freight.";
			}
		});
		return mmObject_lazy.get();
	}
}
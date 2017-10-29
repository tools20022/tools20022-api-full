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
import com.tools20022.repository.msg.PaperCommodityContainerBoard1;
import com.tools20022.repository.msg.PaperCommodityNewsprint1;
import com.tools20022.repository.msg.PaperCommodityPulp1;
import com.tools20022.repository.msg.PaperCommodityRecoveredPaper1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines commodity attributes of a derivative where the type is paper.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#ContainerBoard
 * AssetClassCommodityPaper1Choice.ContainerBoard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#Newsprint
 * AssetClassCommodityPaper1Choice.Newsprint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#Pulp
 * AssetClassCommodityPaper1Choice.Pulp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#RecoveredPaper
 * AssetClassCommodityPaper1Choice.RecoveredPaper}</li>
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
 * "AssetClassCommodityPaper1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is paper."</li>
 * </ul>
 */
public class AssetClassCommodityPaper1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Container board commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityContainerBoard1
	 * PaperCommodityContainerBoard1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice
	 * AssetClassCommodityPaper1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntnrBrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContainerBoard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Container board commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ContainerBoard = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityPaper1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "CntnrBrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContainerBoard";
			definition = "Container board commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaperCommodityContainerBoard1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Newsprint commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityNewsprint1
	 * PaperCommodityNewsprint1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice
	 * AssetClassCommodityPaper1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nwsprnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Newsprint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Newsprint commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Newsprint = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityPaper1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Nwsprnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Newsprint";
			definition = "Newsprint commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaperCommodityNewsprint1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Pulp commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaperCommodityPulp1
	 * PaperCommodityPulp1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice
	 * AssetClassCommodityPaper1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pulp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pulp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pulp commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Pulp = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityPaper1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "Pulp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pulp";
			definition = "Pulp commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaperCommodityPulp1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Recovered paper commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityRecoveredPaper1
	 * PaperCommodityRecoveredPaper1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#SubProduct
	 * Commodity.SubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice
	 * AssetClassCommodityPaper1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrdPpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecoveredPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Recovered paper commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RecoveredPaper = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AssetClassCommodityPaper1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commodity.SubProduct;
			isDerived = false;
			xmlTag = "RcvrdPpr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecoveredPaper";
			definition = "Recovered paper commodity derivative.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PaperCommodityRecoveredPaper1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.ContainerBoard, com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.Newsprint,
						com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.Pulp, com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.RecoveredPaper);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityPaper1Choice";
				definition = "Defines commodity attributes of a derivative where the type is paper.";
			}
		});
		return mmObject_lazy.get();
	}
}
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
import com.tools20022.repository.msg.OtherC10CommodityDeliverable2;
import com.tools20022.repository.msg.OtherC10CommodityNonDeliverable2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity attributes of a derivative where the type is other C10.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice#mmDeliverable
 * AssetClassCommodityOtherC102Choice.mmDeliverable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice#mmNonDeliverable
 * AssetClassCommodityOtherC102Choice.mmNonDeliverable}</li>
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
 * "AssetClassCommodityOtherC102Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is other C10."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AssetClassCommodityOtherC102Choice", propOrder = {"deliverable", "nonDeliverable"})
public class AssetClassCommodityOtherC102Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected OtherC10CommodityDeliverable2 deliverable;
	/**
	 * Other C10 deliverable commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityDeliverable2
	 * OtherC10CommodityDeliverable2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice
	 * AssetClassCommodityOtherC102Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dlvrbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other C10 deliverable commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliverable = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityOtherC102Choice.mmObject();
			isDerived = false;
			xmlTag = "Dlvrbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deliverable";
			definition = "Other C10 deliverable commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OtherC10CommodityDeliverable2.mmObject();
		}
	};
	protected OtherC10CommodityNonDeliverable2 nonDeliverable;
	/**
	 * Other C10 non-deliverable commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OtherC10CommodityNonDeliverable2
	 * OtherC10CommodityNonDeliverable2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityOtherC102Choice
	 * AssetClassCommodityOtherC102Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonDlvrbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDeliverable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other C10 non-deliverable commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonDeliverable = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityOtherC102Choice.mmObject();
			isDerived = false;
			xmlTag = "NonDlvrbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDeliverable";
			definition = "Other C10 non-deliverable commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OtherC10CommodityNonDeliverable2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AssetClassCommodityOtherC102Choice.mmDeliverable, AssetClassCommodityOtherC102Choice.mmNonDeliverable);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityOtherC102Choice";
				definition = "Defines commodity attributes of a derivative where the type is other C10.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Dlvrbl", required = true)
	public OtherC10CommodityDeliverable2 getDeliverable() {
		return deliverable;
	}

	public void setDeliverable(OtherC10CommodityDeliverable2 deliverable) {
		this.deliverable = deliverable;
	}

	@XmlElement(name = "NonDlvrbl", required = true)
	public OtherC10CommodityNonDeliverable2 getNonDeliverable() {
		return nonDeliverable;
	}

	public void setNonDeliverable(OtherC10CommodityNonDeliverable2 nonDeliverable) {
		this.nonDeliverable = nonDeliverable;
	}
}
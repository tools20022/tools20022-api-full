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
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity attributes of a derivative where the type is fertilizer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmAmmonia
 * AssetClassCommodityFertilizer1Choice.mmAmmonia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmDiammoniumPhosphate
 * AssetClassCommodityFertilizer1Choice.mmDiammoniumPhosphate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmPotash
 * AssetClassCommodityFertilizer1Choice.mmPotash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmSulphur
 * AssetClassCommodityFertilizer1Choice.mmSulphur}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmUrea
 * AssetClassCommodityFertilizer1Choice.mmUrea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice#mmUreaAndAmmoniumNitrate
 * AssetClassCommodityFertilizer1Choice.mmUreaAndAmmoniumNitrate}</li>
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
 * "AssetClassCommodityFertilizer1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is fertilizer."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AssetClassCommodityFertilizer1Choice", propOrder = {"ammonia", "diammoniumPhosphate", "potash", "sulphur", "urea", "ureaAndAmmoniumNitrate"})
public class AssetClassCommodityFertilizer1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected FertilizerCommodityAmmonia1 ammonia;
	/**
	 * Ammonia fertilizer commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityAmmonia1
	 * FertilizerCommodityAmmonia1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice
	 * AssetClassCommodityFertilizer1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ammn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ammonia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ammonia fertilizer commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmmonia = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> AssetClassCommodityFertilizer1Choice.mmObject();
			isDerived = false;
			xmlTag = "Ammn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ammonia";
			definition = "Ammonia fertilizer commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FertilizerCommodityAmmonia1.mmObject();
		}
	};
	protected FertilizerCommodityDiammoniumPhosphate1 diammoniumPhosphate;
	/**
	 * Diammonium phosphate fertilizer commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityDiammoniumPhosphate1
	 * FertilizerCommodityDiammoniumPhosphate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice
	 * AssetClassCommodityFertilizer1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmmnmPhspht"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiammoniumPhosphate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Diammonium phosphate fertilizer commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDiammoniumPhosphate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityFertilizer1Choice.mmObject();
			isDerived = false;
			xmlTag = "DmmnmPhspht";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiammoniumPhosphate";
			definition = "Diammonium phosphate fertilizer commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FertilizerCommodityDiammoniumPhosphate1.mmObject();
		}
	};
	protected FertilizerCommodityPotash1 potash;
	/**
	 * Potash fertilizer commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityPotash1
	 * FertilizerCommodityPotash1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice
	 * AssetClassCommodityFertilizer1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ptsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Potash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Potash fertilizer commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPotash = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityFertilizer1Choice.mmObject();
			isDerived = false;
			xmlTag = "Ptsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Potash";
			definition = "Potash fertilizer commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FertilizerCommodityPotash1.mmObject();
		}
	};
	protected FertilizerCommoditySulphur1 sulphur;
	/**
	 * Sulphur fertilizer commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommoditySulphur1
	 * FertilizerCommoditySulphur1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice
	 * AssetClassCommodityFertilizer1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Slphr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sulphur"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sulphur fertilizer commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSulphur = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityFertilizer1Choice.mmObject();
			isDerived = false;
			xmlTag = "Slphr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sulphur";
			definition = "Sulphur fertilizer commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FertilizerCommoditySulphur1.mmObject();
		}
	};
	protected FertilizerCommodityUrea1 urea;
	/**
	 * Urea fertilizer commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUrea1
	 * FertilizerCommodityUrea1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice
	 * AssetClassCommodityFertilizer1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Urea"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Urea"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Urea fertilizer commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUrea = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityFertilizer1Choice.mmObject();
			isDerived = false;
			xmlTag = "Urea";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Urea";
			definition = "Urea fertilizer commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FertilizerCommodityUrea1.mmObject();
		}
	};
	protected FertilizerCommodityUreaAndAmmoniumNitrate1 ureaAndAmmoniumNitrate;
	/**
	 * Urea and ammonium nitrate fertilizer commodity derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1
	 * FertilizerCommodityUreaAndAmmoniumNitrate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice
	 * AssetClassCommodityFertilizer1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UreaAndAmmnmNtrt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UreaAndAmmoniumNitrate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urea and ammonium nitrate fertilizer commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUreaAndAmmoniumNitrate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> AssetClassCommodityFertilizer1Choice.mmObject();
			isDerived = false;
			xmlTag = "UreaAndAmmnmNtrt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UreaAndAmmoniumNitrate";
			definition = "Urea and ammonium nitrate fertilizer commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FertilizerCommodityUreaAndAmmoniumNitrate1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AssetClassCommodityFertilizer1Choice.mmAmmonia, AssetClassCommodityFertilizer1Choice.mmDiammoniumPhosphate, AssetClassCommodityFertilizer1Choice.mmPotash,
						AssetClassCommodityFertilizer1Choice.mmSulphur, AssetClassCommodityFertilizer1Choice.mmUrea, AssetClassCommodityFertilizer1Choice.mmUreaAndAmmoniumNitrate);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityFertilizer1Choice";
				definition = "Defines commodity attributes of a derivative where the type is fertilizer.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ammn", required = true)
	public FertilizerCommodityAmmonia1 getAmmonia() {
		return ammonia;
	}

	public void setAmmonia(FertilizerCommodityAmmonia1 ammonia) {
		this.ammonia = ammonia;
	}

	@XmlElement(name = "DmmnmPhspht", required = true)
	public FertilizerCommodityDiammoniumPhosphate1 getDiammoniumPhosphate() {
		return diammoniumPhosphate;
	}

	public void setDiammoniumPhosphate(FertilizerCommodityDiammoniumPhosphate1 diammoniumPhosphate) {
		this.diammoniumPhosphate = diammoniumPhosphate;
	}

	@XmlElement(name = "Ptsh", required = true)
	public FertilizerCommodityPotash1 getPotash() {
		return potash;
	}

	public void setPotash(FertilizerCommodityPotash1 potash) {
		this.potash = potash;
	}

	@XmlElement(name = "Slphr", required = true)
	public FertilizerCommoditySulphur1 getSulphur() {
		return sulphur;
	}

	public void setSulphur(FertilizerCommoditySulphur1 sulphur) {
		this.sulphur = sulphur;
	}

	@XmlElement(name = "Urea", required = true)
	public FertilizerCommodityUrea1 getUrea() {
		return urea;
	}

	public void setUrea(FertilizerCommodityUrea1 urea) {
		this.urea = urea;
	}

	@XmlElement(name = "UreaAndAmmnmNtrt", required = true)
	public FertilizerCommodityUreaAndAmmoniumNitrate1 getUreaAndAmmoniumNitrate() {
		return ureaAndAmmoniumNitrate;
	}

	public void setUreaAndAmmoniumNitrate(FertilizerCommodityUreaAndAmmoniumNitrate1 ureaAndAmmoniumNitrate) {
		this.ureaAndAmmoniumNitrate = ureaAndAmmoniumNitrate;
	}
}
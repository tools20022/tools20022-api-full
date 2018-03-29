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
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AssetClassCommodityFertilizer1Choice", propOrder = {"ammonia", "diammoniumPhosphate", "potash", "sulphur", "urea", "ureaAndAmmoniumNitrate"})
public class AssetClassCommodityFertilizer1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ammn", required = true)
	protected FertilizerCommodityAmmonia1 ammonia;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommodityAmmonia1> mmAmmonia = new MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommodityAmmonia1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmObject();
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

		@Override
		public FertilizerCommodityAmmonia1 getValue(AssetClassCommodityFertilizer1Choice obj) {
			return obj.getAmmonia();
		}

		@Override
		public void setValue(AssetClassCommodityFertilizer1Choice obj, FertilizerCommodityAmmonia1 value) {
			obj.setAmmonia(value);
		}
	};
	@XmlElement(name = "DmmnmPhspht", required = true)
	protected FertilizerCommodityDiammoniumPhosphate1 diammoniumPhosphate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommodityDiammoniumPhosphate1> mmDiammoniumPhosphate = new MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommodityDiammoniumPhosphate1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmObject();
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

		@Override
		public FertilizerCommodityDiammoniumPhosphate1 getValue(AssetClassCommodityFertilizer1Choice obj) {
			return obj.getDiammoniumPhosphate();
		}

		@Override
		public void setValue(AssetClassCommodityFertilizer1Choice obj, FertilizerCommodityDiammoniumPhosphate1 value) {
			obj.setDiammoniumPhosphate(value);
		}
	};
	@XmlElement(name = "Ptsh", required = true)
	protected FertilizerCommodityPotash1 potash;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommodityPotash1> mmPotash = new MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommodityPotash1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmObject();
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

		@Override
		public FertilizerCommodityPotash1 getValue(AssetClassCommodityFertilizer1Choice obj) {
			return obj.getPotash();
		}

		@Override
		public void setValue(AssetClassCommodityFertilizer1Choice obj, FertilizerCommodityPotash1 value) {
			obj.setPotash(value);
		}
	};
	@XmlElement(name = "Slphr", required = true)
	protected FertilizerCommoditySulphur1 sulphur;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommoditySulphur1> mmSulphur = new MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommoditySulphur1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmObject();
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

		@Override
		public FertilizerCommoditySulphur1 getValue(AssetClassCommodityFertilizer1Choice obj) {
			return obj.getSulphur();
		}

		@Override
		public void setValue(AssetClassCommodityFertilizer1Choice obj, FertilizerCommoditySulphur1 value) {
			obj.setSulphur(value);
		}
	};
	@XmlElement(name = "Urea", required = true)
	protected FertilizerCommodityUrea1 urea;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommodityUrea1> mmUrea = new MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommodityUrea1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmObject();
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

		@Override
		public FertilizerCommodityUrea1 getValue(AssetClassCommodityFertilizer1Choice obj) {
			return obj.getUrea();
		}

		@Override
		public void setValue(AssetClassCommodityFertilizer1Choice obj, FertilizerCommodityUrea1 value) {
			obj.setUrea(value);
		}
	};
	@XmlElement(name = "UreaAndAmmnmNtrt", required = true)
	protected FertilizerCommodityUreaAndAmmoniumNitrate1 ureaAndAmmoniumNitrate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommodityUreaAndAmmoniumNitrate1> mmUreaAndAmmoniumNitrate = new MMMessageAssociationEnd<AssetClassCommodityFertilizer1Choice, FertilizerCommodityUreaAndAmmoniumNitrate1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmObject();
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

		@Override
		public FertilizerCommodityUreaAndAmmoniumNitrate1 getValue(AssetClassCommodityFertilizer1Choice obj) {
			return obj.getUreaAndAmmoniumNitrate();
		}

		@Override
		public void setValue(AssetClassCommodityFertilizer1Choice obj, FertilizerCommodityUreaAndAmmoniumNitrate1 value) {
			obj.setUreaAndAmmoniumNitrate(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmAmmonia, com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmDiammoniumPhosphate,
						com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmPotash, com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmSulphur,
						com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmUrea, com.tools20022.repository.choice.AssetClassCommodityFertilizer1Choice.mmUreaAndAmmoniumNitrate);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityFertilizer1Choice";
				definition = "Defines commodity attributes of a derivative where the type is fertilizer.";
			}
		});
		return mmObject_lazy.get();
	}

	public FertilizerCommodityAmmonia1 getAmmonia() {
		return ammonia;
	}

	public AssetClassCommodityFertilizer1Choice setAmmonia(FertilizerCommodityAmmonia1 ammonia) {
		this.ammonia = Objects.requireNonNull(ammonia);
		return this;
	}

	public FertilizerCommodityDiammoniumPhosphate1 getDiammoniumPhosphate() {
		return diammoniumPhosphate;
	}

	public AssetClassCommodityFertilizer1Choice setDiammoniumPhosphate(FertilizerCommodityDiammoniumPhosphate1 diammoniumPhosphate) {
		this.diammoniumPhosphate = Objects.requireNonNull(diammoniumPhosphate);
		return this;
	}

	public FertilizerCommodityPotash1 getPotash() {
		return potash;
	}

	public AssetClassCommodityFertilizer1Choice setPotash(FertilizerCommodityPotash1 potash) {
		this.potash = Objects.requireNonNull(potash);
		return this;
	}

	public FertilizerCommoditySulphur1 getSulphur() {
		return sulphur;
	}

	public AssetClassCommodityFertilizer1Choice setSulphur(FertilizerCommoditySulphur1 sulphur) {
		this.sulphur = Objects.requireNonNull(sulphur);
		return this;
	}

	public FertilizerCommodityUrea1 getUrea() {
		return urea;
	}

	public AssetClassCommodityFertilizer1Choice setUrea(FertilizerCommodityUrea1 urea) {
		this.urea = Objects.requireNonNull(urea);
		return this;
	}

	public FertilizerCommodityUreaAndAmmoniumNitrate1 getUreaAndAmmoniumNitrate() {
		return ureaAndAmmoniumNitrate;
	}

	public AssetClassCommodityFertilizer1Choice setUreaAndAmmoniumNitrate(FertilizerCommodityUreaAndAmmoniumNitrate1 ureaAndAmmoniumNitrate) {
		this.ureaAndAmmoniumNitrate = Objects.requireNonNull(ureaAndAmmoniumNitrate);
		return this;
	}
}